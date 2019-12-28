package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AuthenticateInput;
import org.openapitools.client.model.AuthenticateOutput;
import org.openapitools.client.model.Error;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-27T20:17:23.389742-05:00[America/Toronto]")
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
     * @param cellId Cell ID
     * @param authenticateInput The authenticateInput parameter
     * @return AuthenticateOutput
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AuthenticateOutput> authenticate(String cellId, AuthenticateInput authenticateInput) throws RestClientException {
        Object postBody = authenticateInput;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling authenticate");
        }
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();
        pathParams.put("cellId", cellId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
        return apiClient.invokeAPI("/cells/{cellId}/identities.authenticate", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
