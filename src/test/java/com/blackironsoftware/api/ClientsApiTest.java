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

import com.blackironsoftware.api.models.Client;
import com.blackironsoftware.api.models.Clients;
import com.blackironsoftware.api.models.CreateClientInput;
import com.blackironsoftware.api.models.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientsApi
 */
@Ignore
public class ClientsApiTest {

    private final ClientsApi api = new ClientsApi();

    
    /**
     * Create a client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClientTest() {
        String cellId = null;
        CreateClientInput createClientInput = null;
        Client response = api.createClient(cellId, createClientInput);

        // TODO: test validations
    }
    
    /**
     * Deletes a client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClientTest() {
        String cellId = null;
        String clientId = null;
        api.deleteClient(cellId, clientId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClientTest() {
        String cellId = null;
        String clientId = null;
        Client response = api.getClient(cellId, clientId);

        // TODO: test validations
    }
    
    /**
     * Retrieves a list of clients
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listClientsTest() {
        String cellId = null;
        Clients response = api.listClients(cellId);

        // TODO: test validations
    }
    
    /**
     * Update a client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateClientTest() {
        String cellId = null;
        String clientId = null;
        Client client = null;
        Client response = api.updateClient(cellId, clientId, client);

        // TODO: test validations
    }
    
}
