# ClientsApi

All URIs are relative to *https://api.dev.blackironsoftware.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClient**](ClientsApi.md#createClient) | **POST** /cells/{cellId}/clients | Create a client
[**deleteClient**](ClientsApi.md#deleteClient) | **DELETE** /cells/{cellId}/clients/{clientId} | Deletes a client
[**getClient**](ClientsApi.md#getClient) | **GET** /cells/{cellId}/clients/{clientId} | Retrieve a client
[**listClients**](ClientsApi.md#listClients) | **GET** /cells/{cellId}/clients | Retrieves a list of clients
[**updateClient**](ClientsApi.md#updateClient) | **PUT** /cells/{cellId}/clients/{clientId} | Update a client



## createClient

> Client createClient(cellId, createClientInput)

Create a client

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        CreateClientInput createClientInput = new CreateClientInput(); // CreateClientInput | 
        try {
            Client result = apiInstance.createClient(cellId, createClientInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#createClient");
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
 **createClientInput** | [**CreateClientInput**](CreateClientInput.md)|  | [optional]

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Everything worked as expected |  -  |
| **400** | The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized  No valid API key provided. |  -  |
| **403** | The API key doesn&#39;t have permissions to perform the request. |  -  |
| **500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |


## deleteClient

> deleteClient(cellId, clientId)

Deletes a client

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        String clientId = "clientId_example"; // String | Client ID
        try {
            apiInstance.deleteClient(cellId, clientId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#deleteClient");
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
 **clientId** | **String**| Client ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | xxx |  -  |
| **401** | Unauthorized  No valid API key provided. |  -  |
| **403** | The API key doesn&#39;t have permissions to perform the request. |  -  |
| **404** | The requested resource doesn&#39;t exist. |  -  |
| **500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |


## getClient

> Client getClient(cellId, clientId)

Retrieve a client

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        String clientId = "clientId_example"; // String | Client ID
        try {
            Client result = apiInstance.getClient(cellId, clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#getClient");
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
 **clientId** | **String**| Client ID |

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Everything worked as expected |  -  |
| **401** | Unauthorized  No valid API key provided. |  -  |
| **403** | The API key doesn&#39;t have permissions to perform the request. |  -  |
| **404** | The requested resource doesn&#39;t exist. |  -  |
| **500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |


## listClients

> Clients listClients(cellId)

Retrieves a list of clients

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        try {
            Clients result = apiInstance.listClients(cellId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#listClients");
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

[**Clients**](Clients.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Everything worked as expected |  -  |
| **401** | Unauthorized  No valid API key provided. |  -  |
| **403** | The API key doesn&#39;t have permissions to perform the request. |  -  |
| **500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |


## updateClient

> Client updateClient(cellId, clientId, client)

Update a client

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        String clientId = "clientId_example"; // String | Client ID
        Client client = new Client(); // Client | Client resource
        try {
            Client result = apiInstance.updateClient(cellId, clientId, client);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#updateClient");
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
 **clientId** | **String**| Client ID |
 **client** | [**Client**](Client.md)| Client resource |

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Everything worked as expected |  -  |
| **400** | The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized  No valid API key provided. |  -  |
| **403** | The API key doesn&#39;t have permissions to perform the request. |  -  |
| **404** | The requested resource doesn&#39;t exist. |  -  |
| **500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |

