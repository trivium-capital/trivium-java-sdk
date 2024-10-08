# trivium-java-sdk

trivium-cash

- API version: 0.2.6

- Generator version: 7.8.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml

<dependency>
    <groupId>tech.triviumcapital.clients</groupId>
    <artifactId>trivium-java-sdk</artifactId>
    <version>0.2.6</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "tech.triviumcapital.clients:trivium-java-sdk:0.2.6"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/trivium-java-sdk-0.2.6.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import tech.triviumcapital.clients.java.*;
import tech.triviumcapital.clients.java.auth.*;
import tech.triviumcapital.clients.java.model.*;
import tech.triviumcapital.clients.java.api.CashApi;

public class CashApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://staging.api.triviumcapital.tech");

        // Configure API key authorization: apiKeyAuth
        defaultClient.setApiKey("<YOUR API KEY>");

        // Configure HTTP bearer authorization: httpAuth
        defaultClient.setBearerToken("<YOUR API SECRET>");

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

## Documentation for API Endpoints

All URIs are relative to *https://staging.api.triviumcapital.tech*

| Class             | Method                                                                                                           | HTTP request                                         | Description |
|-------------------|------------------------------------------------------------------------------------------------------------------|------------------------------------------------------|-------------|
| *CashApi*         | [**getApiV1CashAccountAccountid**](docs/CashApi.md#getApiV1CashAccountAccountid)                                 | **GET** /api/v1/cash/account/{accountId}             |             |
| *CashApi*         | [**getApiV1CashAccountUserUserid**](docs/CashApi.md#getApiV1CashAccountUserUserid)                               | **GET** /api/v1/cash/account/user/{userId}           |             |
| *CashApi*         | [**getApiV1CashBalanceUserid**](docs/CashApi.md#getApiV1CashBalanceUserid)                                       | **GET** /api/v1/cash/balance/{userId}                |             |
| *CashApi*         | [**getApiV1CashRates**](docs/CashApi.md#getApiV1CashRates)                                                       | **GET** /api/v1/cash/rates                           |             |
| *CashApi*         | [**getApiV1CashTransactionsAccountid**](docs/CashApi.md#getApiV1CashTransactionsAccountid)                       | **GET** /api/v1/cash/transactions/{accountId}        |             |
| *CashApi*         | [**getApiV1CashTransactionsRedemptionInfo**](docs/CashApi.md#getApiV1CashTransactionsRedemptionInfo)             | **GET** /api/v1/cash/transactions/redemption/info    |             |
| *CashApi*         | [**postApiV1CashAccount**](docs/CashApi.md#postApiV1CashAccount)                                                 | **POST** /api/v1/cash/account                        |             |
| *CashApi*         | [**postApiV1CashEvents**](docs/CashApi.md#postApiV1CashEvents)                                                   | **POST** /api/v1/cash/events                         |             |
| *CashApi*         | [**postApiV1CashRequestDepositAccountid**](docs/CashApi.md#postApiV1CashRequestDepositAccountid)                 | **POST** /api/v1/cash/request/deposit/{accountId}    |             |
| *CashApi*         | [**postApiV1CashRequestRedemptionAccountid**](docs/CashApi.md#postApiV1CashRequestRedemptionAccountid)           | **POST** /api/v1/cash/request/redemption/{accountId} |             |
| *CashApi*         | [**putApiV1CashCallback**](docs/CashApi.md#putApiV1CashCallback)                                                 | **PUT** /api/v1/cash/callback                        |             |
| *FixedDepositApi* | [**getApiV1FixeddepositPlacementPlacementid**](docs/FixedDepositApi.md#getApiV1FixeddepositPlacementPlacementid) | **GET** /api/v1/fixedDeposit/placement/{placementId} |             |
| *FixedDepositApi* | [**getApiV1FixeddepositUserUserid**](docs/FixedDepositApi.md#getApiV1FixeddepositUserUserid)                     | **GET** /api/v1/fixedDeposit/user/{userId}           |             |
| *FixedDepositApi* | [**putApiV1FixeddepositPlacementPlacementid**](docs/FixedDepositApi.md#putApiV1FixeddepositPlacementPlacementid) | **PUT** /api/v1/fixedDeposit/placement/{placementId} |             |
| *StatementApi*    | [**getApiV1StatementMonthlyUserid**](docs/StatementApi.md#getApiV1StatementMonthlyUserid)                        | **GET** /api/v1/statement/monthly/{userId}           |             |
| *TransactionsApi* | [**getApiV1TransactionsUserid**](docs/TransactionsApi.md#getApiV1TransactionsUserid)                             | **GET** /api/v1/transactions/{userId}                |             |
| *UserApi*         | [**getApiV1UserUserid**](docs/UserApi.md#getApiV1UserUserid)                                                     | **GET** /api/v1/user/{userId}                        |             |
| *UserApi*         | [**postApiV1User**](docs/UserApi.md#postApiV1User)                                                               | **POST** /api/v1/user                                |             |
| *UserApi*         | [**postApiV1UserEvents**](docs/UserApi.md#postApiV1UserEvents)                                                   | **POST** /api/v1/user/events                         |             |
| *UserApi*         | [**postApiV1UserUseridDocuments**](docs/UserApi.md#postApiV1UserUseridDocuments)                                 | **POST** /api/v1/user/{userId}/documents             |             |

## Documentation for Models

- [Account](docs/Account.md)
- [AccountStatus](docs/AccountStatus.md)
- [AccountType](docs/AccountType.md)
- [BadRequest](docs/BadRequest.md)
- [Balance](docs/Balance.md)
- [Balances](docs/Balances.md)
- [CashAccountActivated](docs/CashAccountActivated.md)
- [CashCallbackEvent](docs/CashCallbackEvent.md)
- [CashDeposit](docs/CashDeposit.md)
- [CashInboundCallbackEvent](docs/CashInboundCallbackEvent.md)
- [CashRedemption](docs/CashRedemption.md)
- [CompanyDetails](docs/CompanyDetails.md)
- [CreateAccountRequest](docs/CreateAccountRequest.md)
- [CreateOnboardingDocumentRequest](docs/CreateOnboardingDocumentRequest.md)
- [CreateOnboardingDocumentResponse](docs/CreateOnboardingDocumentResponse.md)
- [Deposit](docs/Deposit.md)
- [DepositInstructions](docs/DepositInstructions.md)
- [DepositRequest](docs/DepositRequest.md)
- [DepositResponse](docs/DepositResponse.md)
- [DepositSettled](docs/DepositSettled.md)
- [EarningsToDate](docs/EarningsToDate.md)
- [Fast](docs/Fast.md)
- [FastParticipant](docs/FastParticipant.md)
- [FixedDepositPlacement](docs/FixedDepositPlacement.md)
- [FixedDepositRedemption](docs/FixedDepositRedemption.md)
- [FixedDepositTransfer](docs/FixedDepositTransfer.md)
- [IndividualDetails](docs/IndividualDetails.md)
- [InternationalTransfer](docs/InternationalTransfer.md)
- [LocalTransfer](docs/LocalTransfer.md)
- [LockedFixedDeposit](docs/LockedFixedDeposit.md)
- [MonthlyStatementMetadata](docs/MonthlyStatementMetadata.md)
- [NotFound](docs/NotFound.md)
- [OnboardingDocumentType](docs/OnboardingDocumentType.md)
- [PaginationResultUserTransaction](docs/PaginationResultUserTransaction.md)
- [PendingFixedDeposit](docs/PendingFixedDeposit.md)
- [ProcessFixedDepositPlacementRequest](docs/ProcessFixedDepositPlacementRequest.md)
- [ProcessingFixedDeposit](docs/ProcessingFixedDeposit.md)
- [ProviderDetails](docs/ProviderDetails.md)
- [Rates](docs/Rates.md)
- [RedeemedFixedDeposit](docs/RedeemedFixedDeposit.md)
- [Redemption](docs/Redemption.md)
- [RedemptionInfo](docs/RedemptionInfo.md)
- [RedemptionReconciled](docs/RedemptionReconciled.md)
- [RedemptionRequest](docs/RedemptionRequest.md)
- [RedemptionResponse](docs/RedemptionResponse.md)
- [RedemptionSettled](docs/RedemptionSettled.md)
- [SubscribeCallbackRequest](docs/SubscribeCallbackRequest.md)
- [SubscribeCallbackRequestWithSignature](docs/SubscribeCallbackRequestWithSignature.md)
- [SubscribeCallbackResponse](docs/SubscribeCallbackResponse.md)
- [SubscribeCallbackResponsePublicKey](docs/SubscribeCallbackResponsePublicKey.md)
- [Swift](docs/Swift.md)
- [Transaction](docs/Transaction.md)
- [TransactionStatus](docs/TransactionStatus.md)
- [Transactions](docs/Transactions.md)
- [Transfer](docs/Transfer.md)
- [TransferDetails](docs/TransferDetails.md)
- [Unauthorized](docs/Unauthorized.md)
- [User](docs/User.md)
- [UserActivated](docs/UserActivated.md)
- [UserCallbackEvent](docs/UserCallbackEvent.md)
- [UserDetails](docs/UserDetails.md)
- [UserStatus](docs/UserStatus.md)
- [UserTransaction](docs/UserTransaction.md)

<a id="documentation-for-authorization"></a>

## Documentation for Authorization

Authentication schemes defined for the API:
<a id="apiKeyAuth"></a>

### apiKeyAuth

- **Type**: API key
- **API key parameter name**: X-Api-Key
- **Location**: HTTP header

<a id="httpAuth"></a>

### httpAuth

- **Type**: HTTP Bearer Token authentication

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential
issues.

## Author



