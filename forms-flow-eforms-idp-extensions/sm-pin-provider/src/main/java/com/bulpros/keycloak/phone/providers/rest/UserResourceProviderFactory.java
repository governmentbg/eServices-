package com.bulpros.keycloak.phone.providers.rest;

import org.jboss.logging.Logger;
import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.services.resource.RealmResourceProvider;
import org.keycloak.services.resource.RealmResourceProviderFactory;

public class UserResourceProviderFactory implements RealmResourceProviderFactory {

    private static final Logger logger = Logger.getLogger(UserResourceProviderFactory.class);

    @Override
    public String getId() {
        return "user";
    }

    @Override
    public RealmResourceProvider create(KeycloakSession session) {
        return new UserResourceProvider(session);
    }

    @Override
    public void init(Config.Scope config) {
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
    }

    @Override
    public void close() {
    }
}
