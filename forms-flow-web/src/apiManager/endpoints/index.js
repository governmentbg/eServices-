/* eslint-disable max-len */
import {
  WEB_BASE_URL,
  MT_ADMIN_BASE_URL,
  MT_ADMIN_BASE_URL_VERSION,
  BPM_BASE_URL_EXT,
  CUSTOM_SUBMISSION_URL,
  DOCUMENT_SERVICE_URL,
} from "./config";

import { AppConfig } from "../../config";

const API = {
  GET_DASHBOARDS: `${WEB_BASE_URL}/dashboards`,
  METRICS_SUBMISSIONS: `${WEB_BASE_URL}/metrics`,
  APPLICATION_START: `${WEB_BASE_URL}/application/create`,
  PUBLIC_APPLICATION_START: `${WEB_BASE_URL}/public/application/create`,
  PUBLIC_APPLICATION_STATUS: `${WEB_BASE_URL}/public/form`,
  PROCESS_STATE: `${WEB_BASE_URL}/process/<process_key>/task/<task_key>/state`,
  GET_APPLICATION: `${WEB_BASE_URL}/application/<application_id>`,
  UPDATE_APPLICATION_STATUS: `${WEB_BASE_URL}/application/<application_id>`,
  DELETE_APPLICATION: `${WEB_BASE_URL}/application/<application_id>`,
  GET_APPLICATION_HISTORY_API: `${WEB_BASE_URL}/application/<application_id>/history`,
  GET_ALL_APPLICATIONS_FROM_FORM_ID: `${WEB_BASE_URL}/application/formid`,
  GET_ALL_APPLICATIONS_COUNT_BY_FORM_ID: `${WEB_BASE_URL}/application/formid/<form id>/count`,
  GET_ALL_APPLICATIONS: `${WEB_BASE_URL}/application`,
  GET_ALL_APPLICATIONS_STATUS: `${WEB_BASE_URL}/application/status/list`,
  GET_PROCESS_DEFINITION: `${BPM_BASE_URL_EXT}/v1/process-definition/key/<process_key>`,
  PROCESSES_XML: `${BPM_BASE_URL_EXT}/v1/process-definition/key/<process_key>/xml`,
  DMN_XML: `${BPM_BASE_URL_EXT}/v1/decision-definition/key/<process_key>/xml`,
  PROCESS_ACTIVITIES: `${BPM_BASE_URL_EXT}/v1/process-instance/<process_instance_id>/activity-instances`,
  FORM: `${WEB_BASE_URL}/form`,
  FORM_DESIGN: `${WEB_BASE_URL}/form/form-design`,
  FORM_HISTORY: `${WEB_BASE_URL}/form/form-history`,
  LANG_UPDATE: `${WEB_BASE_URL}/user/locale`,
  FORM_PROCESSES: `${WEB_BASE_URL}/form/formid`,
  GET_BPM_TASKS: `${BPM_BASE_URL_EXT}/v1/task`,
  GET_BPM_TASK_DETAIL: `${BPM_BASE_URL_EXT}/v1/task/<task_id>`,
  GET_BPM_TASK_VARIABLES: `${BPM_BASE_URL_EXT}/v1/task/<task_id>/variables`,
  CLAIM_BPM_TASK: `${BPM_BASE_URL_EXT}/v1/task/<task_id>/claim`,
  UNCLAIM_BPM_TASK: `${BPM_BASE_URL_EXT}/v1/task/<task_id>/unclaim`,
  GET_BPM_PROCESS_LIST: `${BPM_BASE_URL_EXT}/v1/process-definition`,
  GET_DMN_PROCESS_LIST: `${BPM_BASE_URL_EXT}/v1/decision-definition`,
  GET_API_USER_LIST: `${WEB_BASE_URL}/user`,
  GET_BPM_FILTERS: `${BPM_BASE_URL_EXT}/v1/filter`,
  GET_BPM_TASK_LIST_WITH_FILTER: `${BPM_BASE_URL_EXT}/v1/filter/<filter_id>/list`,
  GET_BPM_TASK_LIST_COUNT_WITH_FILTER: `${BPM_BASE_URL_EXT}/v1/filter/<filter_id>/count`,
  BPM_GROUP: `${BPM_BASE_URL_EXT}/v1/task/<task_id>/identity-links`,
  DELETE_BPM_GROUP: `${BPM_BASE_URL_EXT}/v1/task/<task_id>/identity-links/delete`,
  BPM_FORM_SUBMIT: `${BPM_BASE_URL_EXT}/v1/task/<task_id>/submit-form`,
  GET_BPM_FORM_LIST: `${WEB_BASE_URL}/form`,
  UPDATE_ASSIGNEE_BPM_TASK: `${BPM_BASE_URL_EXT}/v1/task/<task_id>/assignee`,
  GET_FORM_BY_ALIAS: `${AppConfig.projectUrl}/<form_path>`,
  GET_FORM_BY_ID: `${AppConfig.projectUrl}/form`,
  GET_FAQS: `${WEB_BASE_URL}/faq`,
  GET_FAQ: `${WEB_BASE_URL}/faq/<faq_id>`,

  GET_GROUPS: `${WEB_BASE_URL}/groups`,
  GET_FORM_COUNT: `${WEB_BASE_URL}/form/<mapper id>/application/count`,
  UNPUBLISH_FORMS: `${WEB_BASE_URL}/form/<mapper id>`,
  DEPLOY_BPM: `${BPM_BASE_URL_EXT}/v1/deployment/create`,
  GET_TENANT_DATA: `${MT_ADMIN_BASE_URL}/${MT_ADMIN_BASE_URL_VERSION}/tenant`,
  EXPORT_FORM_PDF: `${DOCUMENT_SERVICE_URL}/form/<form_id>/submission/<submission_id>/export/pdf`,
  CUSTOM_SUBMISSION: `${CUSTOM_SUBMISSION_URL}/form/<form_id>/submission`,
  PUBLIC_CUSTOM_SUBMISSION: `${CUSTOM_SUBMISSION_URL}/public/form/<form_id>/submission`,
  UPDATE_SUBMISSION_DATA: `${AppConfig.projectUrl}/form/<form_id>/submission/<submission_id>`,
  DELETE_SUBMISSION: `${AppConfig.projectUrl}/form/<form_id>/submission/<submission_id>`,
  DRAFT_BASE: `${WEB_BASE_URL}/draft`,
  DRAFT_PUBLIC_CREATE: `${WEB_BASE_URL}/draft/public/create`,
  DRAFT_UPDATE: `${WEB_BASE_URL}/draft/<draft_id>`,
  DRAFT_UPDATE_PUBLIC: `${WEB_BASE_URL}/draft/public/<draft_id>`,
  DRAFT_APPLICATION_CREATE: `${WEB_BASE_URL}/draft/<draft_id>/submit`,
  DRAFT_APPLICATION_CREATE_PUBLIC: `${WEB_BASE_URL}/draft/public/<draft_id>/submit`,
  FORMIO_ROLES: `${WEB_BASE_URL}/formio/roles`,
  DASHBOARD_AUTHORIZATION: `${WEB_BASE_URL}/authorizations/dashboard`,
  USER_DASHBOARDS: `${WEB_BASE_URL}/authorizations/users/dashboard`,
  GET_PAGE_BLOCKS: `${WEB_BASE_URL}/page-blocks`,
  GET_BLOCK: `${WEB_BASE_URL}/page-blocks/<block_id>`,
  GET_LANGUAGE_TRANSLATIONS: `${WEB_BASE_URL}/translations/languages/<language>`,
  GET_LANGUAGES: `${WEB_BASE_URL}/translations/languages`,
  GET_REGIX_DATA: `${WEB_BASE_URL}/regix`,
  GENERATE_PDF: `${WEB_BASE_URL}/draft/<draftId>/export/pdf`,
  EVROTRUST_SIGN: `${WEB_BASE_URL}/eurotrust/sign`,
  EVROTRUST_STATUS: `${WEB_BASE_URL}/eurotrust/document/<transactionId>/status/`,
  KEP_DATA: `${WEB_BASE_URL}/signature/document/data`,
  KEP_SIGN: `${WEB_BASE_URL}/signature/document/sign`,
  GET_SERVICES: `${WEB_BASE_URL}/services`,
  GET_TAX_DATA: `${WEB_BASE_URL}/agentws`,
  APPLICATION_CHECK_PERMISSIONS: `${WEB_BASE_URL}/application/permitted`,
  GET_FORM_SUBMISSIONS_BY_PATH: `${AppConfig.projectUrl}/<form_path>/submission`,
  GET_FORM_SUBMISSION_BY_FORM_PATH: `${AppConfig.projectUrl}/<form_path>/submission/<submission_id>`,
  BPM_SENT_MESSAGE: `${BPM_BASE_URL_EXT}/v1/message`,
  APPLICATION_EVENT_UPDATE: `${WEB_BASE_URL}/application/<application_id>/resubmit`,
  DESIGNER_LIST: `${WEB_BASE_URL}/authorizations/designer`,
  USER_ROLES: `${WEB_BASE_URL}/roles`,
  CLIENT_LIST: `${WEB_BASE_URL}/authorizations/form`,
  APPLICATION_LIST: `${WEB_BASE_URL}/authorizations/application`,
  HANDLE_AUTHORIZATION_FOR_DESIGNER: `${WEB_BASE_URL}/authorizations/resource/<resource_id>`,
  APPLICATION_WITHDRAW: `${WEB_BASE_URL}/application/<application_id>/withdraw/<role>`,
};

export default API;