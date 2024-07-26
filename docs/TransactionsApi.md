# TransactionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiV1TransactionsUserid**](TransactionsApi.md#getApiV1TransactionsUserid) | **GET** /api/v1/transactions/{userId} |  |



## getApiV1TransactionsUserid

> PaginationResultUserTransaction getApiV1TransactionsUserid(userId, limit, offset)



Get list of transactions for all products for user

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.TransactionsApi;

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

        TransactionsApi apiInstance = new TransactionsApi(defaultClient);
        UUID userId = UUID.fromString("e63b255b-8ece-458b-ba26-d8e77188857a"); // UUID | 
        Integer limit = 56; // Integer | 
        Integer offset = 56; // Integer | 
        try {
            PaginationResultUserTransaction result = apiInstance.getApiV1TransactionsUserid(userId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionsApi#getApiV1TransactionsUserid");
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
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

[**PaginationResultUserTransaction**](PaginationResultUserTransaction.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [httpAuth](../README.md#httpAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Invalid value for: path parameter userId, Invalid value for: query parameter limit, Invalid value for: query parameter offset |  -  |

