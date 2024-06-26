# base image
FROM node:14.17.0-alpine as build-stage

# set working directory
WORKDIR /forms-flow-web/app

ARG NODE_ENV
ARG REACT_APP_ENV
ARG DISABLE_ESLINT_PLUGIN=true
ARG REACT_APP_API_SERVER_URL
ARG REACT_APP_API_PROJECT_URL
ARG REACT_APP_KEYCLOAK_CLIENT
ARG REACT_APP_WEB_BASE_URL
ARG REACT_APP_BPM_URL
ARG REACT_APP_WEBSOCKET_ENCRYPT_KEY
ARG REACT_APP_KEYCLOAK_URL_REALM
ARG REACT_APP_KEYCLOAK_URL
ARG REACT_APP_APPLICATION_NAME
ARG REACT_APP_USER_ACCESS_PERMISSIONS
ARG REACT_APP_WEB_BASE_CUSTOM_URL
ARG REACT_APP_MULTI_TENANCY_ENABLED
ARG REACT_APP_TENANT_ID
ARG REACT_APP_MT_ADMIN_BASE_URL
ARG REACT_APP_MT_ADMIN_BASE_URL_VERSION
ARG REACT_APP_CUSTOM_SUBMISSION_URL
ARG REACT_APP_CUSTOM_SUBMISSION_ENABLED
ARG REACT_APP_DRAFT_ENABLED
ARG REACT_APP_DRAFT_POLLING_RATE
ARG REACT_APP_DRAFT_FEEDBACK_ENABLED
ARG REACT_APP_DRAFT_SAVE_ON_EXIT_ENABLED
ARG REACT_APP_DRAFT_CREATE_ON_INIT_ENABLED
ARG REACT_APP_CHECK_APPLICATION_PERMISSIONS_ENABLED
ARG REACT_APP_FORM_ALERTS_ENABLED
ARG REACT_APP_MOBILE_SECTIONS_ENABLED
ARG REACT_APP_DRAFT_DELETE_CTA_ENABLED
ARG REACT_APP_TASK_LIST_DISABLE_FILTER
ARG REACT_APP_TRANSLATE_BPMN_MODELER
ARG REACT_APP_TRANSLATE_FORM_BUILDER
ARG REACT_APP_MY_SERVICES_LOCAL_TAXES_ENABLED
ARG REACT_APP_SM_NEW_DESIGN_ENABLED
ARG REACT_APP_CHECK_ASSURANCE_LEVEL_ENABLED
ARG REACT_APP_EPAYMENT_REDIRECT_URL
ARG REACT_APP_EPAYMENT_ACCESS_CODE_LOGIN_URL
ARG REACT_APP_CURRENT_ADDRESS_FORM_PATH
ARG REACT_APP_PERMANENT_ADDRESS_FORM_PATH
ARG REACT_APP_FORM_PREFILLED_DATA_INPUT_NAME
ARG REACT_APP_EXPORT_PDF_ENABLED
ARG REACT_APP_DOCUMENT_SERVICE_URL
ARG REACT_APP_OPENTELEMETRY_SERVICE
ARG REACT_APP_PUBLIC_WORKFLOW_ENABLED
ARG REACT_APP_SHOW_AUTO_FULFILLMENT_CHECKBOX

ENV NODE_ENV ${NODE_ENV}
ENV REACT_APP_ENV ${REACT_APP_ENV}
ENV REACT_APP_API_SERVER_URL ${REACT_APP_API_SERVER_URL}
ENV REACT_APP_API_PROJECT_URL ${REACT_APP_API_PROJECT_URL}
ENV REACT_APP_KEYCLOAK_CLIENT ${REACT_APP_KEYCLOAK_CLIENT}
ENV REACT_APP_WEB_BASE_URL ${REACT_APP_WEB_BASE_URL}
ENV REACT_APP_BPM_URL ${REACT_APP_BPM_URL}
ENV REACT_APP_WEBSOCKET_ENCRYPT_KEY ${REACT_APP_WEBSOCKET_ENCRYPT_KEY}
ENV REACT_APP_KEYCLOAK_URL_REALM ${REACT_APP_KEYCLOAK_URL_REALM}
ENV REACT_APP_KEYCLOAK_URL ${REACT_APP_KEYCLOAK_URL}
ENV REACT_APP_APPLICATION_NAME ${REACT_APP_APPLICATION_NAME}
ENV REACT_APP_USER_ACCESS_PERMISSIONS ${REACT_APP_USER_ACCESS_PERMISSIONS}
ENV REACT_APP_WEB_BASE_CUSTOM_URL ${REACT_APP_WEB_BASE_CUSTOM_URL}
ENV REACT_APP_CUSTOM_SUBMISSION_URL ${REACT_APP_CUSTOM_SUBMISSION_URL}
ENV REACT_APP_MULTI_TENANCY_ENABLED ${REACT_APP_MULTI_TENANCY_ENABLED}
ENV REACT_APP_TENANT_ID ${REACT_APP_TENANT_ID}
ENV REACT_APP_MT_ADMIN_BASE_URL ${REACT_APP_MT_ADMIN_BASE_URL}
ENV REACT_APP_MT_ADMIN_BASE_URL_VERSION ${REACT_APP_MT_ADMIN_BASE_URL_VERSION}
ENV REACT_APP_CUSTOM_SUBMISSION_ENABLED ${REACT_APP_CUSTOM_SUBMISSION_ENABLED}
ENV REACT_APP_DRAFT_ENABLED: ${REACT_APP_DRAFT_ENABLED}
ENV REACT_APP_DRAFT_POLLING_RATE: ${REACT_APP_DRAFT_POLLING_RATE}
ENV REACT_APP_DRAFT_FEEDBACK_ENABLED: ${REACT_APP_DRAFT_FEEDBACK_ENABLED}
ENV REACT_APP_DRAFT_SAVE_ON_EXIT_ENABLED: ${REACT_APP_DRAFT_SAVE_ON_EXIT_ENABLED}
ENV REACT_APP_DRAFT_CREATE_ON_INIT_ENABLED: ${REACT_APP_DRAFT_CREATE_ON_INIT_ENABLED}
ENV REACT_APP_CHECK_APPLICATION_PERMISSIONS_ENABLED: ${REACT_APP_CHECK_APPLICATION_PERMISSIONS_ENABLED}
ENV REACT_APP_FORM_ALERTS_ENABLED: ${REACT_APP_FORM_ALERTS_ENABLED}
ENV REACT_APP_MOBILE_SECTIONS_ENABLED: ${REACT_APP_MOBILE_SECTIONS_ENABLED}
ENV REACT_APP_DRAFT_DELETE_CTA_ENABLED: ${REACT_APP_DRAFT_DELETE_CTA_ENABLED}
ENV REACT_APP_TASK_LIST_DISABLE_FILTER: ${REACT_APP_TASK_LIST_DISABLE_FILTER}
ENV REACT_APP_TRANSLATE_BPMN_MODELER: ${REACT_APP_TRANSLATE_BPMN_MODELER}
ENV REACT_APP_TRANSLATE_FORM_BUILDER: ${REACT_APP_TRANSLATE_FORM_BUILDER}
ENV REACT_APP_MY_SERVICES_LOCAL_TAXES_ENABLED: ${REACT_APP_MY_SERVICES_LOCAL_TAXES_ENABLED}
ENV REACT_APP_SM_NEW_DESIGN_ENABLED: ${REACT_APP_SM_NEW_DESIGN_ENABLED}
ENV REACT_APP_CHECK_ASSURANCE_LEVEL_ENABLED: ${REACT_APP_CHECK_ASSURANCE_LEVEL_ENABLED}
ENV REACT_APP_EPAYMENT_REDIRECT_URL: ${REACT_APP_EPAYMENT_REDIRECT_URL}
ENV REACT_APP_EPAYMENT_ACCESS_CODE_LOGIN_URL: ${REACT_APP_EPAYMENT_ACCESS_CODE_LOGIN_URL}
ENV REACT_APP_CURRENT_ADDRESS_FORM_PATH: ${REACT_APP_CURRENT_ADDRESS_FORM_PATH}
ENV REACT_APP_PERMANENT_ADDRESS_FORM_PATH: ${REACT_APP_PERMANENT_ADDRESS_FORM_PATH}
ENV REACT_APP_FORM_PREFILLED_DATA_INPUT_NAME: ${REACT_APP_FORM_PREFILLED_DATA_INPUT_NAME}
ENV REACT_APP_EXPORT_PDF_ENABLED: ${REACT_APP_EXPORT_PDF_ENABLED}
ENV REACT_APP_DOCUMENT_SERVICE_URL: ${REACT_APP_DOCUMENT_SERVICE_URL}
ENV REACT_APP_OPENTELEMETRY_SERVICE: ${REACT_APP_OPENTELEMETRY_SERVICE}
ENV REACT_APP_PUBLIC_WORKFLOW_ENABLED: ${REACT_APP_PUBLIC_WORKFLOW_ENABLED}
ENV DISABLE_ESLINT_PLUGIN: ${DISABLE_ESLINT_PLUGIN}
ENV REACT_APP_SHOW_AUTO_FULFILLMENT_CHECKBOX: ${REACT_APP_SHOW_AUTO_FULFILLMENT_CHECKBOX}

# add `/app/node_modules/.bin` to $PATH
ENV PATH /forms-flow-web/app/node_modules/.bin:$PATH

RUN apk update && apk upgrade && \
    apk add --no-cache bash git openssh dos2unix

# install and cache app dependencies

COPY package-lock.json /forms-flow-web/app/package-lock.json
COPY package.json /forms-flow-web/app/package.json

RUN npm install --unsafe-perm --production
#RUN npm install react-scripts@3.0.1 -g --silent
COPY . /forms-flow-web/app/
RUN npm run build

RUN dos2unix ./infra/env-vars/env.sh

FROM nginx:1.22 as production-stage
RUN mkdir /app
COPY --from=build-stage /forms-flow-web/app/build /usr/share/nginx/html
COPY nginx.conf /etc/nginx/nginx.conf

WORKDIR /usr/share/nginx/html
COPY --from=build-stage /forms-flow-web/app/infra/env-vars/* ./

RUN chmod +x env.sh

EXPOSE 8080:8080
CMD ["/bin/sh", "-c", "/usr/share/nginx/html/env.sh && nginx -g \"daemon off;\""]
