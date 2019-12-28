# RolesApi

All URIs are relative to *https://api.dev.blackironsoftware.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRole**](RolesApi.md#createRole) | **POST** /cells/{cellId}/roles | Create a role
[**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /cells/{cellId}/roles/{roleId} | Deletes a role and dissociates all users from the role.
[**getRole**](RolesApi.md#getRole) | **GET** /cells/{cellId}/roles/{roleId} | Retrieve a role
[**listRoles**](RolesApi.md#listRoles) | **GET** /cells/{cellId}/roles | Retrieves a list of roles



## createRole

> Role createRole(cellId, createRoleInput)

Create a role

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        CreateRoleInput createRoleInput = new CreateRoleInput(); // CreateRoleInput | Role resource
        try {
            Role result = apiInstance.createRole(cellId, createRoleInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#createRole");
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
 **createRoleInput** | [**CreateRoleInput**](CreateRoleInput.md)| Role resource |

### Return type

[**Role**](Role.md)

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


## deleteRole

> deleteRole(cellId, roleId)

Deletes a role and dissociates all users from the role.

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        String roleId = "roleId_example"; // String | Role ID
        try {
            apiInstance.deleteRole(cellId, roleId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#deleteRole");
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
 **roleId** | **String**| Role ID |

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


## getRole

> Role getRole(cellId, roleId)

Retrieve a role

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        String roleId = "roleId_example"; // String | Role ID
        try {
            Role result = apiInstance.getRole(cellId, roleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getRole");
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
 **roleId** | **String**| Role ID |

### Return type

[**Role**](Role.md)

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


## listRoles

> Roles listRoles(cellId)

Retrieves a list of roles

### Example

```java
// Import classes:
import com.blackironsoftware.ApiClient;
import com.blackironsoftware.ApiException;
import com.blackironsoftware.Configuration;
import com.blackironsoftware.models.*;
import com.blackironsoftware.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.blackironsoftware.com");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String cellId = "cellId_example"; // String | Cell ID
        try {
            Roles result = apiInstance.listRoles(cellId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#listRoles");
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

[**Roles**](Roles.md)

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

