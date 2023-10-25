package com.bulpros.integrations.camel.routes.regix.GRAO;

import com.bulpros.integrations.exceptions.EFormsIntegrationsErrorHandler;
import com.bulpros.integrations.regix.model.GRAO.MaritalStatusSpouseChildrenSearch.MaritalStatusSpouseChildrenResponseType;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MaritalStatusSpouseChildrenSearchRoute extends RouteBuilder {

    public void configure() {
        onException(Exception.class)
                .handled(true)
                .bean(EFormsIntegrationsErrorHandler.class);

        restConfiguration().component("servlet")
                .clientRequestValidation(true)
                .bindingMode(RestBindingMode.json)
                .enableCORS(true)
                .corsHeaderProperty("Access-Control-Allow-Origin", "*");
        rest("/regix/grao/marital-status-spouse-children-search")
                .get()
                .param().name("egn").type(RestParamType.query)
                .description("Physical person EGN number")
                .dataType("string").required(true).endParam()
                .outType(MaritalStatusSpouseChildrenResponseType.class)
                .route().routeGroup("REGIX").routeId("RegixGraoMartialStatusSpouseChildSearch")
                .to("bean:regixGraoService?method=maritalStatusSpouseChildrenSearch(${header.egn})");
    }
}
