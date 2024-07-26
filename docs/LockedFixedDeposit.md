

# LockedFixedDeposit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**placementId** | **UUID** |  |  |
|**investedQuantity** | **BigDecimal** |  |  |
|**currentValue** | **BigDecimal** |  |  |
|**currencyCode** | **String** |  |  |
|**providerDetails** | [**ProviderDetails**](ProviderDetails.md) |  |  |
|**term** | **String** | Serialized as P{period}, e.g. 2 weeks &#x3D; P14D, 3 months &#x3D; P3M, 1 year &#x3D; P1Y |  |
|**redemptionDate** | **LocalDate** |  |  |
|**returnAtMaturity** | **BigDecimal** |  |  |
|**lockedRate** | **BigDecimal** |  |  |
|**type** | **String** |  |  |


## Implemented Interfaces

* FixedDepositPlacement


