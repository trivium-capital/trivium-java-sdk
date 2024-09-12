# FixedDepositApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiV1FixeddepositPlacementPlacementid**](FixedDepositApi.md#getApiV1FixeddepositPlacementPlacementid) | **GET** /api/v1/fixedDeposit/placement/{placementId} |  |
| [**getApiV1FixeddepositUserUserid**](FixedDepositApi.md#getApiV1FixeddepositUserUserid) | **GET** /api/v1/fixedDeposit/user/{userId} |  |
| [**putApiV1FixeddepositPlacementPlacementid**](FixedDepositApi.md#putApiV1FixeddepositPlacementPlacementid) | **PUT** /api/v1/fixedDeposit/placement/{placementId} |  |



## getApiV1FixeddepositPlacementPlacementid

> FixedDepositPlacement getApiV1FixeddepositPlacementPlacementid(placementId)



Get fixed deposit placement

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.FixedDepositApi;

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

        FixedDepositApi apiInstance = new FixedDepositApi(defaultClient);
        UUID placementId = UUID.fromString("f5d15e38-c21b-4295-95fc-87233edf7069"); // UUID | 
        try {
            FixedDepositPlacement result = apiInstance.getApiV1FixeddepositPlacementPlacementid(placementId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FixedDepositApi#getApiV1FixeddepositPlacementPlacementid");
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
| **placementId** | **UUID**|  | |

### Return type

[**FixedDepositPlacement**](FixedDepositPlacement.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [httpAuth](../README.md#httpAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Invalid value, Invalid value for: path parameter placementId |  -  |


## getApiV1FixeddepositUserUserid

> List&lt;FixedDepositPlacement&gt; getApiV1FixeddepositUserUserid(userId)



Get fixed deposit placement

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.FixedDepositApi;

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

        FixedDepositApi apiInstance = new FixedDepositApi(defaultClient);
        UUID userId = UUID.fromString("e63b255b-8ece-458b-ba26-d8e77188857a"); // UUID | 
        try {
            List<FixedDepositPlacement> result = apiInstance.getApiV1FixeddepositUserUserid(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FixedDepositApi#getApiV1FixeddepositUserUserid");
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

[**List&lt;FixedDepositPlacement&gt;**](FixedDepositPlacement.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [httpAuth](../README.md#httpAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Invalid value, Invalid value for: path parameter userId |  -  |


## putApiV1FixeddepositPlacementPlacementid

> putApiV1FixeddepositPlacementPlacementid(placementId, processFixedDepositPlacementRequest)



Start processing fixed deposit placement

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.FixedDepositApi;

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

        FixedDepositApi apiInstance = new FixedDepositApi(defaultClient);
        UUID placementId = UUID.fromString("f5d15e38-c21b-4295-95fc-87233edf7069"); // UUID | 
        ProcessFixedDepositPlacementRequest processFixedDepositPlacementRequest = new ProcessFixedDepositPlacementRequest(); // ProcessFixedDepositPlacementRequest | 
        try {
            apiInstance.putApiV1FixeddepositPlacementPlacementid(placementId, processFixedDepositPlacementRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FixedDepositApi#putApiV1FixeddepositPlacementPlacementid");
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
| **placementId** | **UUID**|  | |
| **processFixedDepositPlacementRequest** | [**ProcessFixedDepositPlacementRequest**](ProcessFixedDepositPlacementRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [httpAuth](../README.md#httpAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Invalid value, Invalid value for: path parameter placementId, Invalid value for: body |  -  |

