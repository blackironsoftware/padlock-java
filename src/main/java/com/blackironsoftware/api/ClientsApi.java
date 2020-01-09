package com.blackironsoftware.api;

import com.blackironsoftware.ApiClient;

import com.blackironsoftware.api.models.Client;
import com.blackironsoftware.api.models.Clients;
import com.blackironsoftware.api.models.CreateClientInput;
import com.blackironsoftware.api.models.Error;

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
@Component("com.blackironsoftware.api.ClientsApi")
public class ClientsApi {
    private ApiClient apiClient;

    public ClientsApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * <p><b>201</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param createClientInput  (optional)
     * @return Client
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Client createClient(String cellId, CreateClientInput createClientInput) throws RestClientException {
        return createClientWithHttpInfo(cellId, createClientInput).getBody();
    }

    /**
     * Create a client
     * 
     * <p><b>201</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param createClientInput  (optional)
     * @return ResponseEntity&lt;Client&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Client> createClientWithHttpInfo(String cellId, CreateClientInput createClientInput) throws RestClientException {
        Object postBody = createClientInput;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling createClient");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        String path = apiClient.expandPath("/cells/{cellId}/clients", uriVariables);

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

        ParameterizedTypeReference<Client> returnType = new ParameterizedTypeReference<Client>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a client
     * 
     * <p><b>204</b> - xxx
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param clientId Client ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteClient(String cellId, String clientId) throws RestClientException {
        deleteClientWithHttpInfo(cellId, clientId);
    }

    /**
     * Deletes a client
     * 
     * <p><b>204</b> - xxx
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param clientId Client ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteClientWithHttpInfo(String cellId, String clientId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling deleteClient");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling deleteClient");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        uriVariables.put("clientId", clientId);
        String path = apiClient.expandPath("/cells/{cellId}/clients/{clientId}", uriVariables);

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
     * Retrieve a client
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param clientId Client ID (required)
     * @return Client
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Client getClient(String cellId, String clientId) throws RestClientException {
        return getClientWithHttpInfo(cellId, clientId).getBody();
    }

    /**
     * Retrieve a client
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param clientId Client ID (required)
     * @return ResponseEntity&lt;Client&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Client> getClientWithHttpInfo(String cellId, String clientId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling getClient");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling getClient");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        uriVariables.put("clientId", clientId);
        String path = apiClient.expandPath("/cells/{cellId}/clients/{clientId}", uriVariables);

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

        ParameterizedTypeReference<Client> returnType = new ParameterizedTypeReference<Client>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a list of clients
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @return Clients
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Clients listClients(String cellId) throws RestClientException {
        return listClientsWithHttpInfo(cellId).getBody();
    }

    /**
     * Retrieves a list of clients
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @return ResponseEntity&lt;Clients&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Clients> listClientsWithHttpInfo(String cellId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling listClients");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        String path = apiClient.expandPath("/cells/{cellId}/clients", uriVariables);

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

        ParameterizedTypeReference<Clients> returnType = new ParameterizedTypeReference<Clients>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a client
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param clientId Client ID (required)
     * @param client Client resource (required)
     * @return Client
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Client updateClient(String cellId, String clientId, Client client) throws RestClientException {
        return updateClientWithHttpInfo(cellId, clientId, client).getBody();
    }

    /**
     * Update a client
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @param clientId Client ID (required)
     * @param client Client resource (required)
     * @return ResponseEntity&lt;Client&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Client> updateClientWithHttpInfo(String cellId, String clientId, Client client) throws RestClientException {
        Object postBody = client;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling updateClient");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling updateClient");
        }
        
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'client' when calling updateClient");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        uriVariables.put("clientId", clientId);
        String path = apiClient.expandPath("/cells/{cellId}/clients/{clientId}", uriVariables);

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

        ParameterizedTypeReference<Client> returnType = new ParameterizedTypeReference<Client>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
