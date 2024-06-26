import React, { useCallback, useEffect, useState } from "react";
import { Row, Tab, Tabs, Container } from "react-bootstrap";
import TaskHeader from "./TaskHeader";
import {
  reloadTaskFormSubmission,
  setBPMTaskDetailLoader,
  setSelectedTaskID,
} from "../../../actions/bpmTaskActions";
import {
  fetchServiceTaskList,
  fetchProcessDefinitionList,
  getBPMGroups,
  getBPMTaskDetail,
  onBPMTaskFormSubmit,
} from "../../../apiManager/services/bpmTaskServices";
import { useDispatch, useSelector } from "react-redux";
import Loading from "../../../containers/Loading";
import ProcessDiagram from "../../BPMN/ProcessDiagramHook";
import {
  getFormIdSubmissionIdFromURL,
  getFormUrlWithFormIdSubmissionId,
  getProcessDataObjectFromList,
} from "../../../apiManager/services/formatterService";
import History from "../../Application/ApplicationHistory";
import FormEdit from "../../Form/Item/Submission/Item/Edit";
import FormView from "../../Form/Item/Submission/Item/View";
import LoadingOverlay from "react-loading-overlay";
import { getForm, getSubmission, Formio, resetSubmission } from "react-formio";
import { CUSTOM_EVENT_TYPE } from "../constants/customEventTypes";
import { getTaskSubmitFormReq } from "../../../apiManager/services/bpmServices";
import { useParams } from "react-router-dom";
import { push } from "connected-react-router";
import {
  resetFormData,
  setFormSubmissionLoading,
} from "../../../actions/formActions";
import { useTranslation } from "react-i18next";
import {
  CUSTOM_SUBMISSION_URL,
  CUSTOM_SUBMISSION_ENABLE,
  MULTITENANCY_ENABLED,
  TASK_PAGE_NEW_DESIGN_ENABLED,
  TASK_DETAILS_HISTORY_TAB_ENABLED,
  TASK_DETAILS_DIAGRAM_TAB_ENABLED,
} from "../../../constants/constants";
import { getCustomSubmission } from "../../../apiManager/services/FormServices";
import { getFormioRoleIds } from "../../../apiManager/services/userservices";
import { bpmActionError } from "../../../actions/bpmTaskActions";
import { setCustomSubmission } from "../../../actions/checkListActions";
const ServiceFlowTaskDetails = React.memo(() => {
  const { t } = useTranslation();
  const { taskId } = useParams();
  const bpmTaskId = useSelector((state) => state.bpmTasks.taskId);
  const task = useSelector((state) => state.bpmTasks.taskDetail);
  const processList = useSelector((state) => state.bpmTasks.processList);
  const isTaskLoading = useSelector(
    (state) => state.bpmTasks.isTaskDetailLoading
  );
  const isTaskUpdating = useSelector(
    (state) => state.bpmTasks.isTaskDetailUpdating
  );
  const reqData = useSelector((state) => state.bpmTasks.listReqParams);
  const taskFormSubmissionReload = useSelector(
    (state) => state.bpmTasks.taskFormSubmissionReload
  );
  const dispatch = useDispatch();
  const currentUser = useSelector(
    (state) => state.user?.userDetail?.preferred_username || ""
  );
  const selectedFilter = useSelector((state) => state.bpmTasks.selectedFilter);
  const firstResult = useSelector((state) => state.bpmTasks.firstResult);
  const [processKey, setProcessKey] = useState("");
  const [processTenant, setProcessTenant] = useState(null);
  const [processInstanceId, setProcessInstanceId] = useState("");
  const tenantKey = useSelector((state) => state.tenants?.tenantId);
  const redirectUrl = MULTITENANCY_ENABLED ? `/tenant/${tenantKey}/` : "/";
  const error = useSelector((state) => state.bpmTasks.error);
  const [submissionLoading, setSubmissionLoading] = useState(false);

  useEffect(() => {
    if (taskId) {
      dispatch(setSelectedTaskID(taskId));
    }
  }, [taskId, dispatch]);

  useEffect(() => {
    if (bpmTaskId) {
      dispatch(setBPMTaskDetailLoader(true));
      dispatch(getBPMTaskDetail(bpmTaskId));
      dispatch(getBPMGroups(bpmTaskId));
      TASK_PAGE_NEW_DESIGN_ENABLED && dispatch(fetchProcessDefinitionList());
    }
    return () => {
      Formio.clearCache();
    };
  }, [bpmTaskId, dispatch]);

  useEffect(() => {
    if (error) {
      dispatch(push("/404"));
    }
    return () => {
      dispatch(bpmActionError(""));
    };
  }, [error, dispatch]);
  useEffect(() => {
    if (processList.length && task?.processDefinitionId) {
      const pKey = getProcessDataObjectFromList(
        processList,
        task?.processDefinitionId
      );
      setProcessKey(pKey["key"]);
      setProcessTenant(pKey["tenantId"]);
    }
  }, [processList, task?.processDefinitionId]);

  useEffect(() => {
    if (task?.processInstanceId) {
      setProcessInstanceId(task?.processInstanceId);
    }
  }, [task?.processInstanceId]);

  const getFormSubmissionData = useCallback(
    (formUrl) => {
      const { formId, submissionId } = getFormIdSubmissionIdFromURL(formUrl);
      Formio.clearCache();
      dispatch(resetFormData("form"));
      function fetchForm() {
        setSubmissionLoading(true);
        dispatch(
          getForm("form", formId, (err) => {
            if (!err) {
              if (CUSTOM_SUBMISSION_URL && CUSTOM_SUBMISSION_ENABLE) {
                dispatch(setCustomSubmission({}));
                dispatch(getCustomSubmission(submissionId, formId));
              } else {
                dispatch(resetSubmission("submission"));
                dispatch(getSubmission("submission", submissionId, formId));
              }
              dispatch(setFormSubmissionLoading(false));
            } else {
              if (err === "Bad Token" || err === "Token Expired") {
                dispatch(resetFormData("form"));
                dispatch(
                  getFormioRoleIds((err) => {
                    if (!err) {
                      fetchForm();
                    } else {
                      dispatch(setFormSubmissionLoading(false));
                    }
                  })
                );
              } else {
                dispatch(setFormSubmissionLoading(false));
              }
            }
            setSubmissionLoading(false);
          })
        );
      }
      fetchForm();
    },
    [dispatch]
  );

  useEffect(() => {
    if ((task?.taskFormUrl || task?.formUrl) && taskId === bpmTaskId) {
      getFormSubmissionData(task?.taskFormUrl || task?.formUrl);
    }
  }, [task?.taskFormUrl, task?.formUrl, dispatch, getFormSubmissionData]);

  useEffect(() => {
    if ((task?.taskFormUrl || task?.formUrl) && taskFormSubmissionReload) {
      dispatch(setFormSubmissionLoading(false));
      getFormSubmissionData(task?.formUrl);
      dispatch(reloadTaskFormSubmission(false));
    }
  }, [
    task?.taskFormUrl,
    task?.formUrl,
    taskFormSubmissionReload,
    dispatch,
    getFormSubmissionData,
  ]);

  const reloadTasks = (shouldShowNextAvailableTask) => {
    dispatch(setBPMTaskDetailLoader(true));
    !shouldShowNextAvailableTask && dispatch(setSelectedTaskID(null)); // unSelect the Task Selected
    dispatch(
      fetchServiceTaskList(
        selectedFilter.id,
        firstResult,
        reqData,
        null,
        (err, data) => {
          let url = `${redirectUrl}task/`;
          if (shouldShowNextAvailableTask && data) {
            const nextTask = data.find(
              (e) => e.processInstanceId === processInstanceId
            );
            if (nextTask?.id) {
              url += nextTask.id;
              dispatch(setSelectedTaskID(nextTask?.id));
            }
          }

          dispatch(push(url));
        }
      )
    ); //Refreshes the Tasks
  };

  const reloadCurrentTask = () => {
    if (selectedFilter && task?.id) {
      dispatch(setBPMTaskDetailLoader(true));
      dispatch(
        getBPMTaskDetail(task.id, (err, taskDetail) => {
          if (!err) {
            dispatch(setFormSubmissionLoading(true));
            getFormSubmissionData(
              taskDetail?.taskFormUrl || taskDetail?.formUrl
            );
          }
        })
      ); // Refresh the Task Selected
      dispatch(getBPMGroups(task.id));
      dispatch(fetchServiceTaskList(selectedFilter.id, firstResult, reqData)); //Refreshes the Tasks
    }
  };

  const onCustomEventCallBack = (customEvent) => {
    switch (customEvent.type) {
      case CUSTOM_EVENT_TYPE.RELOAD_TASKS:
        reloadTasks();
        break;
      case CUSTOM_EVENT_TYPE.RELOAD_CURRENT_TASK:
        reloadCurrentTask();
        break;
      case CUSTOM_EVENT_TYPE.ACTION_COMPLETE:
        onFormSubmitCallback(customEvent);
        break;
      default:
        return;
    }
  };

  const onFormSubmitCallback = (customEvent) => {
    const { actionType = "", checkForNextTask = true } = customEvent;
    if (bpmTaskId) {
      dispatch(setBPMTaskDetailLoader(true));
      const { formId, submissionId } = getFormIdSubmissionIdFromURL(
        task?.formUrl
      );
      const formUrl = getFormUrlWithFormIdSubmissionId(formId, submissionId);
      const origin = `${window.location.origin}${redirectUrl}`;
      const webFormUrl = `${origin}form/${formId}/submission/${submissionId}`;
      dispatch(
        onBPMTaskFormSubmit(
          bpmTaskId,
          getTaskSubmitFormReq(
            formUrl,
            task?.applicationId,
            actionType,
            webFormUrl
          ),
          (err) => {
            if (!err) {
              reloadTasks(checkForNextTask);
            } else {
              dispatch(setBPMTaskDetailLoader(false));
            }
          }
        )
      );
    } else {
      reloadCurrentTask();
    }
  };
  const ServiceTaskDetailsComponent = () => (
    <div className="service-task-details">
      <LoadingOverlay active={isTaskUpdating} spinner text={t("Loading...")}>
        <TaskHeader />
        <Tabs defaultActiveKey="form" id="service-task-details" mountOnEnter>
          <Tab eventKey="form" title={t("Form")}>
            <LoadingOverlay
              active={task?.assignee !== currentUser}
              styles={{
                overlay: (base) => ({
                  ...base,
                  background: "rgba(0, 0, 0, 0.2)",
                  cursor: "not-allowed !important",
                }),
              }}
            >
              {task?.assignee === currentUser ? (
                <FormEdit
                  onFormSubmit={onFormSubmitCallback}
                  onCustomEvent={onCustomEventCallBack}
                />
              ) : (
                <FormView showPrintButton={false} />
              )}
            </LoadingOverlay>
          </Tab>
          {TASK_DETAILS_HISTORY_TAB_ENABLED && (
            <Tab eventKey="history" title={t("History")}>
              <History applicationId={task?.applicationId} />
            </Tab>
          )}
          {TASK_DETAILS_DIAGRAM_TAB_ENABLED && (
            <Tab eventKey="diagram" title={t("Diagram")}>
              <div>
                <ProcessDiagram
                  processKey={processKey}
                  processInstanceId={processInstanceId}
                  tenant={processTenant}
                  // markers={processActivityList}
                />
              </div>
            </Tab>
          )}
        </Tabs>
      </LoadingOverlay>
    </div>
  );

  if (!bpmTaskId) {
    return (
      <Row className="not-selected mt-2 ml-1 " style={{ color: "#757575" }}>
        <i className="fa fa-info-circle mr-2 mt-1" />
        {t("Select a task in the list.")}
      </Row>
    );
  } else if (isTaskLoading || taskId !== bpmTaskId || submissionLoading) {
    return (
      <div className="service-task-details">
        <Loading />
      </div>
    );
  } else {
    /*TODO split render*/
    return TASK_PAGE_NEW_DESIGN_ENABLED ? (
      <Container fluid id="main">
        <ServiceTaskDetailsComponent />
      </Container>
    ) : (
      <ServiceTaskDetailsComponent />
    );
  }
});

export default ServiceFlowTaskDetails;
