package com.blackironsoftware.api;

import com.blackironsoftware.ApiClient;

import com.blackironsoftware.api.models.AuthenticateInput;
import com.blackironsoftware.api.models.AuthenticateOutput;
import com.blackironsoftware.api.models.CreateIdentityInput;
import com.blackironsoftware.api.models.Error;
import com.blackironsoftware.api.models.Identities;
import com.blackironsoftware.api.models.Identity;

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
@Component("com.blackironsoftware.api.IdentitiesApi")
public class IdentitiesApi {
    private ApiClient apiClient;

    public IdentitiesApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>200</b> - Everything worked as expected.
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param authenticateInput  (optional)
     * @return AuthenticateOutput
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AuthenticateOutput authenticate(String cellId, AuthenticateInput authenticateInput) throws RestClientException {
        return authenticateWithHttpInfo(cellId, authenticateInput).getBody();
    }

    /**
     * Authenticates an identity
     * 
     * <p><b>200</b> - Everything worked as expected.
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param authenticateInput  (optional)
     * @return ResponseEntity&lt;AuthenticateOutput&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthenticateOutput> authenticateWithHttpInfo(String cellId, AuthenticateInput authenticateInput) throws RestClientException {
        Object postBody = authenticateInput;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling authenticate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        String path = apiClient.expandPath("/cells/{cellId}/identities.authenticate", uriVariables);

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

        ParameterizedTypeReference<AuthenticateOutput> returnType = new ParameterizedTypeReference<AuthenticateOutput>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create an identity
     * 
     * <p><b>201</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param createIdentityInput  (optional)
     * @return Identity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Identity createIdentity(String cellId, CreateIdentityInput createIdentityInput) throws RestClientException {
        return createIdentityWithHttpInfo(cellId, createIdentityInput).getBody();
    }

    /**
     * Create an identity
     * 
     * <p><b>201</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param createIdentityInput  (optional)
     * @return ResponseEntity&lt;Identity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Identity> createIdentityWithHttpInfo(String cellId, CreateIdentityInput createIdentityInput) throws RestClientException {
        Object postBody = createIdentityInput;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling createIdentity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        String path = apiClient.expandPath("/cells/{cellId}/identities", uriVariables);

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

        ParameterizedTypeReference<Identity> returnType = new ParameterizedTypeReference<Identity>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes an identity
     * 
     * <p><b>204</b> - xxx
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param identityId Identity ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteIdentity(String cellId, String identityId) throws RestClientException {
        deleteIdentityWithHttpInfo(cellId, identityId);
    }

    /**
     * Deletes an identity
     * 
     * <p><b>204</b> - xxx
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param identityId Identity ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteIdentityWithHttpInfo(String cellId, String identityId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling deleteIdentity");
        }
        
        // verify the required parameter 'identityId' is set
        if (identityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identityId' when calling deleteIdentity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        uriVariables.put("identityId", identityId);
        String path = apiClient.expandPath("/cells/{cellId}/identities/{identityId}", uriVariables);

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
     * Retrieve an idenity
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param identityId Identity ID (required)
     * @return Identity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Identity getIdentity(String cellId, String identityId) throws RestClientException {
        return getIdentityWithHttpInfo(cellId, identityId).getBody();
    }

    /**
     * Retrieve an idenity
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param identityId Identity ID (required)
     * @return ResponseEntity&lt;Identity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Identity> getIdentityWithHttpInfo(String cellId, String identityId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling getIdentity");
        }
        
        // verify the required parameter 'identityId' is set
        if (identityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identityId' when calling getIdentity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        uriVariables.put("identityId", identityId);
        String path = apiClient.expandPath("/cells/{cellId}/identities/{identityId}", uriVariables);

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

        ParameterizedTypeReference<Identity> returnType = new ParameterizedTypeReference<Identity>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Returns a list of identities
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @return Identities
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Identities listIdentities(String cellId) throws RestClientException {
        return listIdentitiesWithHttpInfo(cellId).getBody();
    }

    /**
     * Returns a list of identities
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @return ResponseEntity&lt;Identities&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Identities> listIdentitiesWithHttpInfo(String cellId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling listIdentities");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        String path = apiClient.expandPath("/cells/{cellId}/identities", uriVariables);

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

        ParameterizedTypeReference<Identities> returnType = new ParameterizedTypeReference<Identities>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update an identity
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param identityId Identity ID (required)
     * @param identity  (optional)
     * @return Identity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Identity updateIdentity(String cellId, String identityId, Identity identity) throws RestClientException {
        return updateIdentityWithHttpInfo(cellId, identityId, identity).getBody();
    }

    /**
     * Update an identity
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param identityId Identity ID (required)
     * @param identity  (optional)
     * @return ResponseEntity&lt;Identity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Identity> updateIdentityWithHttpInfo(String cellId, String identityId, Identity identity) throws RestClientException {
        Object postBody = identity;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling updateIdentity");
        }
        
        // verify the required parameter 'identityId' is set
        if (identityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identityId' when calling updateIdentity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        uriVariables.put("identityId", identityId);
        String path = apiClient.expandPath("/cells/{cellId}/identities/{identityId}", uriVariables);

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

        ParameterizedTypeReference<Identity> returnType = new ParameterizedTypeReference<Identity>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
