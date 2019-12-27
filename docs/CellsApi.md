# CellsApi

All URIs are relative to *https://api.dev.blackironsoftware.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCell**](CellsApi.md#createCell) | **POST** /cells | Create a cell
[**deleteCell**](CellsApi.md#deleteCell) | **DELETE** /cells/{cellId} | Deletes a cell
[**getCell**](CellsApi.md#getCell) | **GET** /cells/{cellId} | Retrieve a cell
[**listCells**](CellsApi.md#listCells) | **GET** /cells | Retrieves a list of cells
[**updateCell**](CellsApi.md#updateCell) | **PUT** /cells/{cellId} | Update a cell


<a name="createCell"></a>
# **createCell**
> Cell createCell(createCellInput)

Create a cell

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CellsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dev.blackironsoftware.com");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    CellsApi apiInstance = new CellsApi(defaultClient);
    CreateCellInput createCellInput = new CreateCellInput(); // CreateCellInput | 
    try {
      Cell result = apiInstance.createCell(createCellInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CellsApi#createCell");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCellInput** | [**CreateCellInput**](CreateCellInput.md)|  | [optional]

### Return type

[**Cell**](Cell.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Everything worked as expected |  -  |
**400** | The request was unacceptable, often due to missing a required parameter. |  -  |
**401** | Unauthorized  No valid API key provided. |  -  |
**403** | The API key doesn&#39;t have permissions to perform the request. |  -  |
**500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |

<a name="deleteCell"></a>
# **deleteCell**
> deleteCell(cellId)

Deletes a cell

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CellsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dev.blackironsoftware.com");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    CellsApi apiInstance = new CellsApi(defaultClient);
    String cellId = "cellId_example"; // String | Cell ID
    try {
      apiInstance.deleteCell(cellId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CellsApi#deleteCell");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cellId** | **String**| Cell ID |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | xxx |  -  |
**401** | Unauthorized  No valid API key provided. |  -  |
**403** | The API key doesn&#39;t have permissions to perform the request. |  -  |
**404** | The requested resource doesn&#39;t exist. |  -  |
**500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |

<a name="getCell"></a>
# **getCell**
> Cell getCell(cellId)

Retrieve a cell

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CellsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dev.blackironsoftware.com");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    CellsApi apiInstance = new CellsApi(defaultClient);
    String cellId = "cellId_example"; // String | Cell ID
    try {
      Cell result = apiInstance.getCell(cellId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CellsApi#getCell");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cellId** | **String**| Cell ID |

### Return type

[**Cell**](Cell.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Everything worked as expected |  -  |
**401** | Unauthorized  No valid API key provided. |  -  |
**403** | The API key doesn&#39;t have permissions to perform the request. |  -  |
**404** | The requested resource doesn&#39;t exist. |  -  |
**500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |

<a name="listCells"></a>
# **listCells**
> Cells listCells(pageSize, pageToken)

Retrieves a list of cells

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CellsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dev.blackironsoftware.com");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    CellsApi apiInstance = new CellsApi(defaultClient);
    Integer pageSize = 56; // Integer | The number of items to return
    String pageToken = "pageToken_example"; // String | The page token that controls what page of items to return
    try {
      Cells result = apiInstance.listCells(pageSize, pageToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CellsApi#listCells");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of items to return | [optional]
 **pageToken** | **String**| The page token that controls what page of items to return | [optional]

### Return type

[**Cells**](Cells.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Everything worked as expected |  -  |
**401** | Unauthorized  No valid API key provided. |  -  |
**403** | The API key doesn&#39;t have permissions to perform the request. |  -  |
**500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |

<a name="updateCell"></a>
# **updateCell**
> Cell updateCell(cellId, cell)

Update a cell

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CellsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dev.blackironsoftware.com");
    
    // Configure API key authorization: bearerAuth
    ApiKeyAuth bearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //bearerAuth.setApiKeyPrefix("Token");

    CellsApi apiInstance = new CellsApi(defaultClient);
    String cellId = "cellId_example"; // String | Cell ID
    Cell cell = new Cell(); // Cell | 
    try {
      Cell result = apiInstance.updateCell(cellId, cell);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CellsApi#updateCell");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cellId** | **String**| Cell ID |
 **cell** | [**Cell**](Cell.md)|  | [optional]

### Return type

[**Cell**](Cell.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Everything worked as expected |  -  |
**400** | The request was unacceptable, often due to missing a required parameter. |  -  |
**401** | Unauthorized  No valid API key provided. |  -  |
**403** | The API key doesn&#39;t have permissions to perform the request. |  -  |
**404** | The requested resource doesn&#39;t exist. |  -  |
**500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |

