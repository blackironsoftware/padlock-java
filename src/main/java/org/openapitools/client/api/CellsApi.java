package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Cell;
import org.openapitools.client.model.Cells;
import org.openapitools.client.model.CreateCellInput;
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
public class CellsApi {
    private ApiClient apiClient;

    public CellsApi() {
        this(new ApiClient());
    }

    @Autowired
    public CellsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a cell
     * 
     * <p><b>201</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param createCellInput The createCellInput parameter
     * @return Cell
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Cell> createCell(CreateCellInput createCellInput) throws RestClientException {
        Object postBody = createCellInput;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Cell> returnType = new ParameterizedTypeReference<Cell>() {};
        return apiClient.invokeAPI("/cells", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a cell
     * 
     * <p><b>204</b> - xxx
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteCell(String cellId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling deleteCell");
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
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/cells/{cellId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve a cell
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID
     * @return Cell
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Cell> getCell(String cellId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling getCell");
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
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Cell> returnType = new ParameterizedTypeReference<Cell>() {};
        return apiClient.invokeAPI("/cells/{cellId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a list of cells
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param pageSize The number of items to return
     * @param pageToken The page token that controls what page of items to return
     * @return Cells
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Cells> listCells(Integer pageSize, String pageToken) throws RestClientException {
        Object postBody = null;
        
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_token", pageToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Cells> returnType = new ParameterizedTypeReference<Cells>() {};
        return apiClient.invokeAPI("/cells", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a cell
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID
     * @param cell The cell parameter
     * @return Cell
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Cell> updateCell(String cellId, Cell cell) throws RestClientException {
        Object postBody = cell;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling updateCell");
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

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Cell> returnType = new ParameterizedTypeReference<Cell>() {};
        return apiClient.invokeAPI("/cells/{cellId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
