package com.blackironsoftware.api;

import com.blackironsoftware.ApiException;
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.Pair;

import javax.ws.rs.core.GenericType;

import com.blackironsoftware.api.models.CreateRoleInput;
import com.blackironsoftware.api.models.Error;
import com.blackironsoftware.api.models.Role;
import com.blackironsoftware.api.models.Roles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-31T19:47:25.902986-05:00[America/New_York]")
public class RolesApi {
  private ApiClient apiClient;

  public RolesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RolesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a role
   * 
   * @param cellId Cell ID (required)
   * @param createRoleInput Role resource (required)
   * @return a {@code Role}
   * @throws ApiException if fails to make API call
   */
  public Role createRole(String cellId, CreateRoleInput createRoleInput) throws ApiException {
    Object localVarPostBody = createRoleInput;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling createRole");
    }
    
    // verify the required parameter 'createRoleInput' is set
    if (createRoleInput == null) {
      throw new ApiException(400, "Missing the required parameter 'createRoleInput' when calling createRole");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/roles".replaceAll("\\{format\\}","json")
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

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes a role and dissociates all users from the role.
   * 
   * @param cellId Cell ID (required)
   * @param roleId Role ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRole(String cellId, String roleId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling deleteRole");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling deleteRole");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/roles/{roleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cellId" + "\\}", apiClient.escapeString(cellId.toString()))
      .replaceAll("\\{" + "roleId" + "\\}", apiClient.escapeString(roleId.toString()));

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
   * Retrieve a role
   * 
   * @param cellId Cell ID (required)
   * @param roleId Role ID (required)
   * @return a {@code Role}
   * @throws ApiException if fails to make API call
   */
  public Role getRole(String cellId, String roleId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling getRole");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling getRole");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/roles/{roleId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cellId" + "\\}", apiClient.escapeString(cellId.toString()))
      .replaceAll("\\{" + "roleId" + "\\}", apiClient.escapeString(roleId.toString()));

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

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieves a list of roles
   * 
   * @param cellId Cell ID (required)
   * @return a {@code Roles}
   * @throws ApiException if fails to make API call
   */
  public Roles listRoles(String cellId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling listRoles");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}/roles".replaceAll("\\{format\\}","json")
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

    GenericType<Roles> localVarReturnType = new GenericType<Roles>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
