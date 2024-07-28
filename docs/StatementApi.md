# StatementApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiV1StatementMonthlyUserid**](StatementApi.md#getApiV1StatementMonthlyUserid) | **GET** /api/v1/statement/monthly/{userId} |  |



## getApiV1StatementMonthlyUserid

> List&lt;MonthlyStatementMetadata&gt; getApiV1StatementMonthlyUserid(userId)



Returns list of links to monthly statement documents

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.StatementApi;

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

        StatementApi apiInstance = new StatementApi(defaultClient);
        UUID userId = UUID.fromString("e63b255b-8ece-458b-ba26-d8e77188857a"); // UUID | 
        try {
            List<MonthlyStatementMetadata> result = apiInstance.getApiV1StatementMonthlyUserid(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatementApi#getApiV1StatementMonthlyUserid");
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

[**List&lt;MonthlyStatementMetadata&gt;**](MonthlyStatementMetadata.md)

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

