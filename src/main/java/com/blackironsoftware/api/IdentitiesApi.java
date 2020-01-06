package com.blackironsoftware.api;

import com.blackironsoftware.ApiException;
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.Pair;

import javax.ws.rs.core.GenericType;

import com.blackironsoftware.api.models.AuthenticateInput;
import com.blackironsoftware.api.models.AuthenticateOutput;
import com.blackironsoftware.api.models.CreateIdentityInput;
import com.blackironsoftware.api.models.Error;
import com.blackironsoftware.api.models.Identities;
import com.blackironsoftware.api.models.Identity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T18:39:58.739242-05:00[America/New_York]")
public class IdentitiesApi {
  private ApiClient apiClient;

  public IdentitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IdentitiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Authenticates an identity
   * 
   * @param cellId Cell ID (required)
   * @param authenticateInput  (optional)
   * @return a {@code AuthenticateOutput}
   * @throws ApiException if fails to make API call
   */
  public AuthenticateOutput authenticate(String cellId, AuthenticateInput authenticateInput) throws ApiException {
    Object localVarPostBody = authenticateInput;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling authenticate");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/identities.authenticate".replaceAll("\\{format\\}","json")
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

    GenericType<AuthenticateOutput> localVarReturnType = new GenericType<AuthenticateOutput>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create an identity
   * 
   * @param cellId Cell ID (required)
   * @param createIdentityInput  (optional)
   * @return a {@code Identity}
   * @throws ApiException if fails to make API call
   */
  public Identity createIdentity(String cellId, CreateIdentityInput createIdentityInput) throws ApiException {
    Object localVarPostBody = createIdentityInput;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling createIdentity");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/identities".replaceAll("\\{format\\}","json")
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

    GenericType<Identity> localVarReturnType = new GenericType<Identity>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes an identity
   * 
   * @param cellId Cell ID (required)
   * @param identityId Identity ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIdentity(String cellId, String identityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling deleteIdentity");
    }
    
    // verify the required parameter 'identityId' is set
    if (identityId == null) {
      throw new ApiException(400, "Missing the required parameter 'identityId' when calling deleteIdentity");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/identities/{identityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cellId" + "\\}", apiClient.escapeString(cellId.toString()))
      .replaceAll("\\{" + "identityId" + "\\}", apiClient.escapeString(identityId.toString()));

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
   * Retrieve an idenity
   * 
   * @param cellId Cell ID (required)
   * @param identityId Identity ID (required)
   * @return a {@code Identity}
   * @throws ApiException if fails to make API call
   */
  public Identity getIdentity(String cellId, String identityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling getIdentity");
    }
    
    // verify the required parameter 'identityId' is set
    if (identityId == null) {
      throw new ApiException(400, "Missing the required parameter 'identityId' when calling getIdentity");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/identities/{identityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cellId" + "\\}", apiClient.escapeString(cellId.toString()))
      .replaceAll("\\{" + "identityId" + "\\}", apiClient.escapeString(identityId.toString()));

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

    GenericType<Identity> localVarReturnType = new GenericType<Identity>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of identities
   * 
   * @param cellId Cell ID (required)
   * @return a {@code Identities}
   * @throws ApiException if fails to make API call
   */
  public Identities listIdentities(String cellId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling listIdentities");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/identities".replaceAll("\\{format\\}","json")
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

    GenericType<Identities> localVarReturnType = new GenericType<Identities>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an identity
   * 
   * @param cellId Cell ID (required)
   * @param identityId Identity ID (required)
   * @param identity  (optional)
   * @return a {@code Identity}
   * @throws ApiException if fails to make API call
   */
  public Identity updateIdentity(String cellId, String identityId, Identity identity) throws ApiException {
    Object localVarPostBody = identity;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling updateIdentity");
    }
    
    // verify the required parameter 'identityId' is set
    if (identityId == null) {
      throw new ApiException(400, "Missing the required parameter 'identityId' when calling updateIdentity");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/identities/{identityId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cellId" + "\\}", apiClient.escapeString(cellId.toString()))
      .replaceAll("\\{" + "identityId" + "\\}", apiClient.escapeString(identityId.toString()));

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

    GenericType<Identity> localVarReturnType = new GenericType<Identity>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
