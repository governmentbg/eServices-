import React, { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import { useLocation } from "react-router-dom";
import { push } from "connected-react-router";
import { NavDropdown } from "react-bootstrap";
import { useTranslation } from "react-i18next";

import ServiceFlowFilterListDropDown from "../components/ServiceFlow/filter/ServiceTaskFilterListDropDown";
import createURLPathMatchExp from "../helper/regExp/pathMatch";
import { fetchFilterList } from "../apiManager/services/bpmTaskServices";
import { useGetBaseUrl } from "../customHooks";

function TaskHead() {
  const { t } = useTranslation();
  const dispatch = useDispatch();
  const selectedFilter = useSelector(
    (state) => state.bpmTasks.selectedFilter?.name
  );
  const itemCount = useSelector((state) => state.bpmTasks.tasksCount);
  const isTaskListLoading = useSelector(
    (state) => state.bpmTasks.isTaskListLoading
  );
  const count = isTaskListLoading ? "" : itemCount ? `(${itemCount})` : "(0)";
  const location = useLocation();
  const { pathname } = location;
  const baseUrl = useGetBaseUrl();
  const goToTask = () => {
    dispatch(push(`${baseUrl}task`));
  };

  useEffect(() => {
    dispatch(fetchFilterList());
    //eslint-disable-next-line react-hooks/exhaustive-deps
  }, [itemCount]);

  return (
    <div className="header-container">
      <div className="main-header">
        <div className="head-item padding-right-60">
          <h3 className="application-head">
            <span className="application-text mr-5">
              <NavDropdown
                className={`main-nav nav-item taskDropdown  ${
                  pathname.match(createURLPathMatchExp("task", baseUrl))
                    ? "active-tab-dropdown"
                    : ""
                }`}
                title={
                  <>
                    <i className="fa fa-list fa-lg fa-fw " />
                    {`${
                      selectedFilter ? t(selectedFilter) : t("Tasks")
                    } ${" "}`}
                    {count}
                  </>
                }
                onClick={goToTask}
              >
                <ServiceFlowFilterListDropDown />
              </NavDropdown>
            </span>
          </h3>
        </div>
      </div>
      <hr className="head-rule" />
    </div>
  );
}

export default TaskHead;
