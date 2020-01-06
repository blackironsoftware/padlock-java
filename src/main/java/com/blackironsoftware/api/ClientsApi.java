package com.blackironsoftware.api;

import com.blackironsoftware.ApiException;
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.Pair;

import javax.ws.rs.core.GenericType;

import com.blackironsoftware.api.models.Client;
import com.blackironsoftware.api.models.Clients;
import com.blackironsoftware.api.models.CreateClientInput;
import com.blackironsoftware.api.models.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T18:26:00.849569-05:00[America/New_York]")
public class ClientsApi {
  private ApiClient apiClient;

  public ClientsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ClientsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a client
   * 
   * @param cellId Cell ID (required)
   * @param createClientInput  (optional)
   * @return a {@code Client}
   * @throws ApiException if fails to make API call
   */
  public Client createClient(String cellId, CreateClientInput createClientInput) throws ApiException {
    Object localVarPostBody = createClientInput;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling createClient");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/clients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cellId" + "\\}", apiClient.escapeString(cellId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Client> localVarReturnType = new GenericType<Client>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes a client
   * 
   * @param cellId Cell ID (required)
   * @param clientId Client ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteClient(String cellId, String clientId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling deleteClient");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling deleteClient");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/clients/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cellId" + "\\}", apiClient.escapeString(cellId.toString()))
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieve a client
   * 
   * @param cellId Cell ID (required)
   * @param clientId Client ID (required)
   * @return a {@code Client}
   * @throws ApiException if fails to make API call
   */
  public Client getClient(String cellId, String clientId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling getClient");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling getClient");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/clients/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cellId" + "\\}", apiClient.escapeString(cellId.toString()))
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Client> localVarReturnType = new GenericType<Client>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieves a list of clients
   * 
   * @param cellId Cell ID (required)
   * @return a {@code Clients}
   * @throws ApiException if fails to make API call
   */
  public Clients listClients(String cellId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling listClients");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/clients".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cellId" + "\\}", apiClient.escapeString(cellId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Clients> localVarReturnType = new GenericType<Clients>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a client
   * 
   * @param cellId Cell ID (required)
   * @param clientId Client ID (required)
   * @param client Client resource (required)
   * @return a {@code Client}
   * @throws ApiException if fails to make API call
   */
  public Client updateClient(String cellId, String clientId, Client client) throws ApiException {
    Object localVarPostBody = client;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling updateClient");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling updateClient");
    }
    
    // verify the required parameter 'client' is set
    if (client == null) {
      throw new ApiException(400, "Missing the required parameter 'client' when calling updateClient");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/clients/{clientId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cellId" + "\\}", apiClient.escapeString(cellId.toString()))
      .replaceAll("\\{" + "clientId" + "\\}", apiClient.escapeString(clientId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Client> localVarReturnType = new GenericType<Client>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
