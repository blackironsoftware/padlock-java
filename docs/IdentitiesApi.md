# IdentitiesApi

All URIs are relative to *https://api.dev.blackironsoftware.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](IdentitiesApi.md#authenticate) | **POST** /cells/{cellId}/identities.authenticate | Authenticates an identity



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

