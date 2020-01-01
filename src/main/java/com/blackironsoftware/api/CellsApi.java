package com.blackironsoftware.api;

import com.blackironsoftware.ApiException;
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.Pair;

import javax.ws.rs.core.GenericType;

import com.blackironsoftware.api.models.Cell;
import com.blackironsoftware.api.models.Cells;
import com.blackironsoftware.api.models.CreateCellInput;
import com.blackironsoftware.api.models.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-31T20:34:17.327395-05:00[America/New_York]")
public class CellsApi {
  private ApiClient apiClient;

  public CellsApi() {
    this(Configuration.getDefaultApiClient());
  }

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
   * @param createCellInput  (optional)
   * @return a {@code Cell}
   * @throws ApiException if fails to make API call
   */
  public Cell createCell(CreateCellInput createCellInput) throws ApiException {
    Object localVarPostBody = createCellInput;
    
    // create path and map variables
    String localVarPath = "/cells".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Cell> localVarReturnType = new GenericType<Cell>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes a cell
   * 
   * @param cellId Cell ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCell(String cellId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling deleteCell");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "bearerAuth" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieve a cell
   * 
   * @param cellId Cell ID (required)
   * @return a {@code Cell}
   * @throws ApiException if fails to make API call
   */
  public Cell getCell(String cellId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling getCell");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Cell> localVarReturnType = new GenericType<Cell>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieves a list of cells
   * 
   * @param pageSize The number of items to return (optional)
   * @param pageToken The page token that controls what page of items to return (optional)
   * @return a {@code Cells}
   * @throws ApiException if fails to make API call
   */
  public Cells listCells(Integer pageSize, String pageToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/cells".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_token", pageToken));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Cells> localVarReturnType = new GenericType<Cells>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a cell
   * 
   * @param cellId Cell ID (required)
   * @param cell  (optional)
   * @return a {@code Cell}
   * @throws ApiException if fails to make API call
   */
  public Cell updateCell(String cellId, Cell cell) throws ApiException {
    Object localVarPostBody = cell;
    
    // verify the required parameter 'cellId' is set
    if (cellId == null) {
      throw new ApiException(400, "Missing the required parameter 'cellId' when calling updateCell");
    }
    
    // create path and map variables
    String localVarPath = "/cells/{cellId}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Cell> localVarReturnType = new GenericType<Cell>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
