# UserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiV1UserUserid**](UserApi.md#getApiV1UserUserid) | **GET** /api/v1/user/{userId} |  |
| [**postApiV1User**](UserApi.md#postApiV1User) | **POST** /api/v1/user |  |



## getApiV1UserUserid

> User getApiV1UserUserid(userId)



Returns user that has zero or more accounts

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: httpAuth
        HttpBearerAuth httpAuth = (HttpBearerAuth) defaultClient.getAuthentication("httpAuth");
        httpAuth.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        UUID userId = UUID.fromString("e63b255b-8ece-458b-ba26-d8e77188857a"); // UUID | 
        try {
            User result = apiInstance.getApiV1UserUserid(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#getApiV1UserUserid");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **UUID**|  | |

### Return type

[**User**](User.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [httpAuth](../README.md#httpAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Invalid value for: path parameter userId |  -  |


## postApiV1User

> User postApiV1User(userDetails)



Create new user

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.UserApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: httpAuth
        HttpBearerAuth httpAuth = (HttpBearerAuth) defaultClient.getAuthentication("httpAuth");
        httpAuth.setBearerToken("BEARER TOKEN");

        UserApi apiInstance = new UserApi(defaultClient);
        UserDetails userDetails = new UserDetails(); // UserDetails | 
        try {
            User result = apiInstance.postApiV1User(userDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#postApiV1User");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userDetails** | [**UserDetails**](UserDetails.md)|  | |

### Return type

[**User**](User.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [httpAuth](../README.md#httpAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Invalid value for: body |  -  |

