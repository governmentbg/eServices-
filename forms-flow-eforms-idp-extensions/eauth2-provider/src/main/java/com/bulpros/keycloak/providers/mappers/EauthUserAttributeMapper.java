/*******************************************************************************
 * Copyright (c) 2022 Digitall Nature Bulgaria
 *
 * This program and the accompanying materials
 * are made available under the terms of the Apache License 2.0
 * which accompanies this distribution, and is available at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *    Stefan Tabakov
 *    Nedka Taskova
 *    Stanimir Stoyanov
 *    Pavel Koev
 *    Igor Radomirov
 *******************************************************************************/
package com.bulpros.keycloak.providers.mappers;

import org.keycloak.broker.saml.mappers.UserAttributeMapper;

import com.bulpros.keycloak.providers.EAuthIdentityProviderFactory;

public class EauthUserAttributeMapper extends UserAttributeMapper {
    private static final String MAPPER_ID = "euath2-user-attribute-mapper";

    @Override
    public String[] getCompatibleProviders() {
        return EAuthIdentityProviderFactory.COMPATIBLE_PROVIDERS;
    }

    @Override
    public String getId() {
        return MAPPER_ID;
    }
}
