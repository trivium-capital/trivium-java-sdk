# CashApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiV1CashAccountAccountid**](CashApi.md#getApiV1CashAccountAccountid) | **GET** /api/v1/cash/account/{accountId} |  |
| [**getApiV1CashAccountUserUserid**](CashApi.md#getApiV1CashAccountUserUserid) | **GET** /api/v1/cash/account/user/{userId} |  |
| [**getApiV1CashBalanceUserid**](CashApi.md#getApiV1CashBalanceUserid) | **GET** /api/v1/cash/balance/{userId} |  |
| [**getApiV1CashRates**](CashApi.md#getApiV1CashRates) | **GET** /api/v1/cash/rates |  |
| [**getApiV1CashTransactionsAccountid**](CashApi.md#getApiV1CashTransactionsAccountid) | **GET** /api/v1/cash/transactions/{accountId} |  |
| [**getApiV1CashTransactionsRedemptionInfo**](CashApi.md#getApiV1CashTransactionsRedemptionInfo) | **GET** /api/v1/cash/transactions/redemption/info |  |
| [**postApiV1CashAccount**](CashApi.md#postApiV1CashAccount) | **POST** /api/v1/cash/account |  |
| [**postApiV1CashRequestDepositAccountid**](CashApi.md#postApiV1CashRequestDepositAccountid) | **POST** /api/v1/cash/request/deposit/{accountId} |  |
| [**postApiV1CashRequestRedemptionAccountid**](CashApi.md#postApiV1CashRequestRedemptionAccountid) | **POST** /api/v1/cash/request/redemption/{accountId} |  |



## getApiV1CashAccountAccountid

> Account getApiV1CashAccountAccountid(accountId)



### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.CashApi;

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

        CashApi apiInstance = new CashApi(defaultClient);
        UUID accountId = UUID.fromString("40117016-ac89-4690-9986-01102be1ac9b"); // UUID | 
        try {
            Account result = apiInstance.getApiV1CashAccountAccountid(accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashApi#getApiV1CashAccountAccountid");
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
| **accountId** | **UUID**|  | |

### Return type

[**Account**](Account.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [httpAuth](../README.md#httpAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Invalid value for: path parameter accountId |  -  |


## getApiV1CashAccountUserUserid

> List&lt;Account&gt; getApiV1CashAccountUserUserid(userId)



Returns cash accounts for given user id

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.CashApi;

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

        CashApi apiInstance = new CashApi(defaultClient);
        UUID userId = UUID.fromString("e63b255b-8ece-458b-ba26-d8e77188857a"); // UUID | 
        try {
            List<Account> result = apiInstance.getApiV1CashAccountUserUserid(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashApi#getApiV1CashAccountUserUserid");
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

[**List&lt;Account&gt;**](Account.md)

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


## getApiV1CashBalanceUserid

> Balances getApiV1CashBalanceUserid(userId)



Returns balance according to currency

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.CashApi;

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

        CashApi apiInstance = new CashApi(defaultClient);
        UUID userId = UUID.fromString("e63b255b-8ece-458b-ba26-d8e77188857a"); // UUID | 
        try {
            Balances result = apiInstance.getApiV1CashBalanceUserid(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashApi#getApiV1CashBalanceUserid");
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

[**Balances**](Balances.md)

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


## getApiV1CashRates

> Rates getApiV1CashRates()



Returns rates according to currency in decimal format. Multiply by 100 for percentage points.

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.CashApi;

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

        CashApi apiInstance = new CashApi(defaultClient);
        try {
            Rates result = apiInstance.getApiV1CashRates();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashApi#getApiV1CashRates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Rates**](Rates.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [httpAuth](../README.md#httpAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## getApiV1CashTransactionsAccountid

> Transactions getApiV1CashTransactionsAccountid(accountId, limit, offset, paginate)



Get list of deposit and transaction requests

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.CashApi;

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

        CashApi apiInstance = new CashApi(defaultClient);
        UUID accountId = UUID.fromString("e63b255b-8ece-458b-ba26-d8e77188857a"); // UUID | 
        Integer limit = 56; // Integer | 
        Integer offset = 56; // Integer | 
        Boolean paginate = true; // Boolean | 
        try {
            Transactions result = apiInstance.getApiV1CashTransactionsAccountid(accountId, limit, offset, paginate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashApi#getApiV1CashTransactionsAccountid");
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
| **accountId** | **UUID**|  | |
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **paginate** | **Boolean**|  | [optional] |

### Return type

[**Transactions**](Transactions.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [httpAuth](../README.md#httpAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Invalid value for: path parameter accountId, Invalid value for: query parameter limit, Invalid value for: query parameter offset, Invalid value for: query parameter paginate |  -  |


## getApiV1CashTransactionsRedemptionInfo

> RedemptionInfo getApiV1CashTransactionsRedemptionInfo()



Get redemption information

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.CashApi;

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

        CashApi apiInstance = new CashApi(defaultClient);
        try {
            RedemptionInfo result = apiInstance.getApiV1CashTransactionsRedemptionInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashApi#getApiV1CashTransactionsRedemptionInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**RedemptionInfo**](RedemptionInfo.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth), [httpAuth](../README.md#httpAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postApiV1CashAccount

> Account postApiV1CashAccount(createAccountRequest)



Create cash account

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.CashApi;

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

        CashApi apiInstance = new CashApi(defaultClient);
        CreateAccountRequest createAccountRequest = new CreateAccountRequest(); // CreateAccountRequest | Create account for this userId
        try {
            Account result = apiInstance.postApiV1CashAccount(createAccountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashApi#postApiV1CashAccount");
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
| **createAccountRequest** | [**CreateAccountRequest**](CreateAccountRequest.md)| Create account for this userId | |

### Return type

[**Account**](Account.md)

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


## postApiV1CashRequestDepositAccountid

> postApiV1CashRequestDepositAccountid(accountId, depositRequest)



Create deposit request

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.CashApi;

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

        CashApi apiInstance = new CashApi(defaultClient);
        UUID accountId = UUID.fromString("40117016-ac89-4690-9986-01102be1ac9b"); // UUID | 
        DepositRequest depositRequest = new DepositRequest(); // DepositRequest | 
        try {
            apiInstance.postApiV1CashRequestDepositAccountid(accountId, depositRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashApi#postApiV1CashRequestDepositAccountid");
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
| **accountId** | **UUID**|  | |
| **depositRequest** | [**DepositRequest**](DepositRequest.md)|  | |

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
| **400** | Invalid value for: path parameter accountId, Invalid value for: body |  -  |


## postApiV1CashRequestRedemptionAccountid

> postApiV1CashRequestRedemptionAccountid(accountId, redemptionRequest)



Create redemption request

### Example

```java
// Import classes:
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.models.*;
import tech.triviumcapital.clients.java.api.CashApi;

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

        CashApi apiInstance = new CashApi(defaultClient);
        UUID accountId = UUID.fromString("40117016-ac89-4690-9986-01102be1ac9b"); // UUID | 
        RedemptionRequest redemptionRequest = new RedemptionRequest(); // RedemptionRequest | 
        try {
            apiInstance.postApiV1CashRequestRedemptionAccountid(accountId, redemptionRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashApi#postApiV1CashRequestRedemptionAccountid");
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
| **accountId** | **UUID**|  | |
| **redemptionRequest** | [**RedemptionRequest**](RedemptionRequest.md)|  | |

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
| **400** | Invalid value for: path parameter accountId, Invalid value for: body |  -  |

