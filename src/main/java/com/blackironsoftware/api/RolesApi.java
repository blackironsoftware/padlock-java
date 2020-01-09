package com.blackironsoftware.api;

import com.blackironsoftware.ApiClient;

import com.blackironsoftware.api.models.CreateRoleInput;
import com.blackironsoftware.api.models.Error;
import com.blackironsoftware.api.models.Role;
import com.blackironsoftware.api.models.Roles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T17:34:25.627035-05:00[America/New_York]")
@Component("com.blackironsoftware.api.RolesApi")
public class RolesApi {
    private ApiClient apiClient;

    public RolesApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>201</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param createRoleInput Role resource (required)
     * @return Role
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Role createRole(String cellId, CreateRoleInput createRoleInput) throws RestClientException {
        return createRoleWithHttpInfo(cellId, createRoleInput).getBody();
    }

    /**
     * Create a role
     * 
     * <p><b>201</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param createRoleInput Role resource (required)
     * @return ResponseEntity&lt;Role&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Role> createRoleWithHttpInfo(String cellId, CreateRoleInput createRoleInput) throws RestClientException {
        Object postBody = createRoleInput;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling createRole");
        }
        
        // verify the required parameter 'createRoleInput' is set
        if (createRoleInput == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createRoleInput' when calling createRole");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        String path = apiClient.expandPath("/cells/{cellId}/roles", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Role> returnType = new ParameterizedTypeReference<Role>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a role and dissociates all users from the role.
     * 
     * <p><b>204</b> - xxx
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param roleId Role ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteRole(String cellId, String roleId) throws RestClientException {
        deleteRoleWithHttpInfo(cellId, roleId);
    }

    /**
     * Deletes a role and dissociates all users from the role.
     * 
     * <p><b>204</b> - xxx
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param roleId Role ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteRoleWithHttpInfo(String cellId, String roleId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling deleteRole");
        }
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roleId' when calling deleteRole");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        uriVariables.put("roleId", roleId);
        String path = apiClient.expandPath("/cells/{cellId}/roles/{roleId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve a role
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param roleId Role ID (required)
     * @return Role
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Role getRole(String cellId, String roleId) throws RestClientException {
        return getRoleWithHttpInfo(cellId, roleId).getBody();
    }

    /**
     * Retrieve a role
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param roleId Role ID (required)
     * @return ResponseEntity&lt;Role&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Role> getRoleWithHttpInfo(String cellId, String roleId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling getRole");
        }
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roleId' when calling getRole");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        uriVariables.put("roleId", roleId);
        String path = apiClient.expandPath("/cells/{cellId}/roles/{roleId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Role> returnType = new ParameterizedTypeReference<Role>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a list of roles
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @return Roles
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Roles listRoles(String cellId) throws RestClientException {
        return listRolesWithHttpInfo(cellId).getBody();
    }

    /**
     * Retrieves a list of roles
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @return ResponseEntity&lt;Roles&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Roles> listRolesWithHttpInfo(String cellId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling listRoles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        String path = apiClient.expandPath("/cells/{cellId}/roles", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Roles> returnType = new ParameterizedTypeReference<Roles>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
