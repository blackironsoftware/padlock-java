package com.blackironsoftware.api;

import com.blackironsoftware.ApiClient;

import com.blackironsoftware.api.models.Cell;
import com.blackironsoftware.api.models.Cells;
import com.blackironsoftware.api.models.CreateCellInput;
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
@Component("com.blackironsoftware.api.CellsApi")
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
     * @param createCellInput  (optional)
     * @return Cell
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Cell createCell(CreateCellInput createCellInput) throws RestClientException {
        return createCellWithHttpInfo(createCellInput).getBody();
    }

    /**
     * Create a cell
     * 
     * <p><b>201</b> - Everything worked as expected
     * <p><b>400</b> - The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param createCellInput  (optional)
     * @return ResponseEntity&lt;Cell&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Cell> createCellWithHttpInfo(CreateCellInput createCellInput) throws RestClientException {
        Object postBody = createCellInput;
        
        String path = apiClient.expandPath("/cells", Collections.<String, Object>emptyMap());

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

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Cell> returnType = new ParameterizedTypeReference<Cell>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a cell
     * 
     * <p><b>204</b> - xxx
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCell(String cellId) throws RestClientException {
        deleteCellWithHttpInfo(cellId);
    }

    /**
     * Deletes a cell
     * 
     * <p><b>204</b> - xxx
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCellWithHttpInfo(String cellId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling deleteCell");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        String path = apiClient.expandPath("/cells/{cellId}", uriVariables);

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

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve a cell
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @return Cell
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Cell getCell(String cellId) throws RestClientException {
        return getCellWithHttpInfo(cellId).getBody();
    }

    /**
     * Retrieve a cell
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>404</b> - The requested resource doesn&#39;t exist.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param cellId Cell ID (required)
     * @return ResponseEntity&lt;Cell&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Cell> getCellWithHttpInfo(String cellId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling getCell");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        String path = apiClient.expandPath("/cells/{cellId}", uriVariables);

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

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Cell> returnType = new ParameterizedTypeReference<Cell>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieves a list of cells
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param pageSize The number of items to return (optional)
     * @param pageToken The page token that controls what page of items to return (optional)
     * @return Cells
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Cells listCells(Integer pageSize, String pageToken) throws RestClientException {
        return listCellsWithHttpInfo(pageSize, pageToken).getBody();
    }

    /**
     * Retrieves a list of cells
     * 
     * <p><b>200</b> - Everything worked as expected
     * <p><b>401</b> - Unauthorized  No valid API key provided.
     * <p><b>403</b> - The API key doesn&#39;t have permissions to perform the request.
     * <p><b>500</b> - Something went wrong on Black Iron Software&#39;s end. (These are rare.)
     * @param pageSize The number of items to return (optional)
     * @param pageToken The page token that controls what page of items to return (optional)
     * @return ResponseEntity&lt;Cells&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Cells> listCellsWithHttpInfo(Integer pageSize, String pageToken) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/cells", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

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
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
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
     * @param cellId Cell ID (required)
     * @param cell  (optional)
     * @return Cell
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Cell updateCell(String cellId, Cell cell) throws RestClientException {
        return updateCellWithHttpInfo(cellId, cell).getBody();
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
     * @param cellId Cell ID (required)
     * @param cell  (optional)
     * @return ResponseEntity&lt;Cell&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Cell> updateCellWithHttpInfo(String cellId, Cell cell) throws RestClientException {
        Object postBody = cell;
        
        // verify the required parameter 'cellId' is set
        if (cellId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cellId' when calling updateCell");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cellId", cellId);
        String path = apiClient.expandPath("/cells/{cellId}", uriVariables);

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

        String[] authNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Cell> returnType = new ParameterizedTypeReference<Cell>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
