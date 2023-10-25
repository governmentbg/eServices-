package com.bulpros.keycloak.phone.authentication.authenticators.directgrant;

import com.bulpros.common.OptionalUtils;
import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.AuthenticationFlowError;
import org.keycloak.authentication.Authenticator;
import org.keycloak.events.Errors;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.representations.idm.OAuth2ErrorRepresentation;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

public abstract class BaseDirectGrantAuthenticator implements Authenticator {

    public Response errorResponse(int status, String error, String errorDescription) {
        OAuth2ErrorRepresentation errorRep = new OAuth2ErrorRepresentation(error, errorDescription);
        return Response.status(status).entity(errorRep).type(MediaType.APPLICATION_JSON_TYPE).build();
    }

    protected String getPinNumber(AuthenticationFlowContext context){
        return context.getHttpRequest().getDecodedFormParameters().getFirst("pin");
    }

    protected String getEgn(AuthenticationFlowContext context){
        return context.getHttpRequest().getDecodedFormParameters().getFirst("egn");
    }

    protected String getPhoneNumber(AuthenticationFlowContext context){
        return context.getHttpRequest().getDecodedFormParameters().getFirst("phoneNumber");
    }

    protected String getEmail(AuthenticationFlowContext context){
        return context.getHttpRequest().getDecodedFormParameters().getFirst("email");
    }

    protected String getAuthenticationCode(AuthenticationFlowContext context){
        return context.getHttpRequest().getDecodedFormParameters().getFirst("code");
    }

    protected String getFcm(AuthenticationFlowContext context){
        return context.getHttpRequest().getDecodedFormParameters().getFirst("fcm");
    }

    protected void invalidCredentials(AuthenticationFlowContext context,AuthenticationFlowError error){
        context.getEvent().error(Errors.INVALID_USER_CREDENTIALS);
        Response challenge = errorResponse(Response.Status.UNAUTHORIZED.getStatusCode(), "invalid_grant", "Invalid user credentials");
        context.failure(error, challenge);
    }

    protected void invalidCredentials(AuthenticationFlowContext context, UserModel user){
        context.getEvent().user(user);
        invalidCredentials(context,AuthenticationFlowError.INVALID_CREDENTIALS);
    }

    protected void invalidCredentials(AuthenticationFlowContext context){
        invalidCredentials(context,AuthenticationFlowError.INVALID_USER);
    }

    protected void invalidCredentials(AuthenticationFlowContext context, Response.Status status,  String errorMessage, String errorDescription){
        Response challenge = errorResponse(status.getStatusCode(), errorMessage, errorDescription);
        context.failure(AuthenticationFlowError.INVALID_CREDENTIALS, challenge);
    }

    @Override
    public void close() {}

    @Override
    public boolean configuredFor(KeycloakSession session, RealmModel realm, UserModel user) {
        return true;
    }

    @Override
    public void action(AuthenticationFlowContext context) {
        authenticate(context);
    }
}
