/*
 * Cell Block
 * The Black Iron Software Platform is a multi-tenant SaaS coupled with an OAuth compliant authentication service that helps jump start SaaS software development.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@blackironsoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.blackironsoftware.api;

import com.blackironsoftware.api.models.AuthenticateInput;
import com.blackironsoftware.api.models.AuthenticateOutput;
import com.blackironsoftware.api.models.CreateIdentityInput;
import com.blackironsoftware.api.models.Error;
import com.blackironsoftware.api.models.Identities;
import com.blackironsoftware.api.models.Identity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IdentitiesApi
 */
@Ignore
public class IdentitiesApiTest {

    private final IdentitiesApi api = new IdentitiesApi();

    
    /**
     * Authenticates an identity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authenticateTest() {
        String cellId = null;
        AuthenticateInput authenticateInput = null;
        AuthenticateOutput response = api.authenticate(cellId, authenticateInput);

        // TODO: test validations
    }
    
    /**
     * Create an identity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIdentityTest() {
        String cellId = null;
        CreateIdentityInput createIdentityInput = null;
        Identity response = api.createIdentity(cellId, createIdentityInput);

        // TODO: test validations
    }
    
    /**
     * Deletes an identity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIdentityTest() {
        String cellId = null;
        String identityId = null;
        api.deleteIdentity(cellId, identityId);

        // TODO: test validations
    }
    
    /**
     * Retrieve an idenity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityTest() {
        String cellId = null;
        String identityId = null;
        Identity response = api.getIdentity(cellId, identityId);

        // TODO: test validations
    }
    
    /**
     * Returns a list of identities
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIdentitiesTest() {
        String cellId = null;
        Identities response = api.listIdentities(cellId);

        // TODO: test validations
    }
    
    /**
     * Update an identity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIdentityTest() {
        String cellId = null;
        String identityId = null;
        Identity identity = null;
        Identity response = api.updateIdentity(cellId, identityId, identity);

        // TODO: test validations
    }
    
}
