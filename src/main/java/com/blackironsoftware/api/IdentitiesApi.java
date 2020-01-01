package com.blackironsoftware.api;

import com.blackironsoftware.ApiException;
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.Pair;

import javax.ws.rs.core.GenericType;

import com.blackironsoftware.api.models.AuthenticateInput;
import com.blackironsoftware.api.models.AuthenticateOutput;
import com.blackironsoftware.api.models.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-31T20:34:17.327395-05:00[America/New_York]")
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
}
