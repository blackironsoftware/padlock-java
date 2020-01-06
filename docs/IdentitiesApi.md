# IdentitiesApi

All URIs are relative to *https://api.dev.blackironsoftware.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](IdentitiesApi.md#authenticate) | **POST** /cells/{cellId}/identities.authenticate | Authenticates an identity
[**createIdentity**](IdentitiesApi.md#createIdentity) | **POST** /cells/{cellId}/identities | Create an identity
[**deleteIdentity**](IdentitiesApi.md#deleteIdentity) | **DELETE** /cells/{cellId}/identities/{identityId} | Deletes an identity
[**getIdentity**](IdentitiesApi.md#getIdentity) | **GET** /cells/{cellId}/identities/{identityId} | Retrieve an idenity
[**listIdentities**](IdentitiesApi.md#listIdentities) | **GET** /cells/{cellId}/identities | Returns a list of identities
[**updateIdentity**](IdentitiesApi.md#updateIdentity) | **PUT** /cells/{cellId}/identities/{identityId} | Update an identity



## authenticate

> AuthenticateOutput authenticate(cellId, authenticateInput)

Authenticates an identity

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.IdentitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        IdentitiesApi apiInstance = new IdentitiesApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        AuthenticateInput authenticateInput = new AuthenticateInput(); // AuthenticateInput | 
        try {
            AuthenticateOutput result = apiInstance.authenticate(cellId, authenticateInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesApi#authenticate");
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
 **authenticateInput** | [**AuthenticateInput**](AuthenticateInput.md)|  | [optional]

### Return type

[**AuthenticateOutput**](AuthenticateOutput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Everything worked as expected. |  -  |
| **400** | The request was unacceptable, often due to missing a required parameter. |  -  |
| **500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |


## createIdentity

> Identity createIdentity(cellId, createIdentityInput)

Create an identity

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.IdentitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        IdentitiesApi apiInstance = new IdentitiesApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        CreateIdentityInput createIdentityInput = new CreateIdentityInput(); // CreateIdentityInput | 
        try {
            Identity result = apiInstance.createIdentity(cellId, createIdentityInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesApi#createIdentity");
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
 **createIdentityInput** | [**CreateIdentityInput**](CreateIdentityInput.md)|  | [optional]

### Return type

[**Identity**](Identity.md)

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


## deleteIdentity

> deleteIdentity(cellId, identityId)

Deletes an identity

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.IdentitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        IdentitiesApi apiInstance = new IdentitiesApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        String identityId = "identityId_example"; // String | Identity ID
        try {
            apiInstance.deleteIdentity(cellId, identityId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesApi#deleteIdentity");
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
 **identityId** | **String**| Identity ID |

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


## getIdentity

> Identity getIdentity(cellId, identityId)

Retrieve an idenity

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.IdentitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        IdentitiesApi apiInstance = new IdentitiesApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        String identityId = "identityId_example"; // String | Identity ID
        try {
            Identity result = apiInstance.getIdentity(cellId, identityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesApi#getIdentity");
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
 **identityId** | **String**| Identity ID |

### Return type

[**Identity**](Identity.md)

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


## listIdentities

> Identities listIdentities(cellId)

Returns a list of identities

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.IdentitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        IdentitiesApi apiInstance = new IdentitiesApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        try {
            Identities result = apiInstance.listIdentities(cellId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesApi#listIdentities");
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

[**Identities**](Identities.md)

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


## updateIdentity

> Identity updateIdentity(cellId, identityId, identity)

Update an identity

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.IdentitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        IdentitiesApi apiInstance = new IdentitiesApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        String identityId = "identityId_example"; // String | Identity ID
        Identity identity = new Identity(); // Identity | 
        try {
            Identity result = apiInstance.updateIdentity(cellId, identityId, identity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesApi#updateIdentity");
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
 **identityId** | **String**| Identity ID |
 **identity** | [**Identity**](Identity.md)|  | [optional]

### Return type

[**Identity**](Identity.md)

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

