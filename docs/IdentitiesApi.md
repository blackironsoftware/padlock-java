# IdentitiesApi

All URIs are relative to *https://api.dev.blackironsoftware.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](IdentitiesApi.md#authenticate) | **POST** /cells/{cellId}/identities.authenticate | Authenticates an identity


<a name="authenticate"></a>
# **authenticate**
> AuthenticateOutput authenticate(cellId, authenticateInput)

Authenticates an identity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IdentitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dev.blackironsoftware.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Everything worked as expected. |  -  |
**400** | The request was unacceptable, often due to missing a required parameter. |  -  |
**500** | Something went wrong on Black Iron Software&#39;s end. (These are rare.) |  -  |

