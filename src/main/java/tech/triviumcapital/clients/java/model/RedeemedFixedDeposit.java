/*
 * trivium-cash
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package tech.triviumcapital.clients.java.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;
import tech.triviumcapital.clients.java.model.ProviderDetails;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RedeemedFixedDeposit
 */
@JsonPropertyOrder({
  RedeemedFixedDeposit.JSON_PROPERTY_PLACEMENT_ID,
  RedeemedFixedDeposit.JSON_PROPERTY_INVESTED_QUANTITY,
  RedeemedFixedDeposit.JSON_PROPERTY_REDEEMED_VALUE,
  RedeemedFixedDeposit.JSON_PROPERTY_CURRENCY_CODE,
  RedeemedFixedDeposit.JSON_PROPERTY_PROVIDER_DETAILS,
  RedeemedFixedDeposit.JSON_PROPERTY_TERM,
  RedeemedFixedDeposit.JSON_PROPERTY_REDEMPTION_DATE,
  RedeemedFixedDeposit.JSON_PROPERTY_RETURN_AT_MATURITY,
  RedeemedFixedDeposit.JSON_PROPERTY_LOCKED_RATE,
  RedeemedFixedDeposit.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class RedeemedFixedDeposit implements FixedDepositPlacement {
  public static final String JSON_PROPERTY_PLACEMENT_ID = "placementId";
  private UUID placementId;

  public static final String JSON_PROPERTY_INVESTED_QUANTITY = "investedQuantity";
  private BigDecimal investedQuantity;

  public static final String JSON_PROPERTY_REDEEMED_VALUE = "redeemedValue";
  private BigDecimal redeemedValue;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_PROVIDER_DETAILS = "providerDetails";
  private ProviderDetails providerDetails;

  public static final String JSON_PROPERTY_TERM = "term";
  private String term;

  public static final String JSON_PROPERTY_REDEMPTION_DATE = "redemptionDate";
  private LocalDate redemptionDate;

  public static final String JSON_PROPERTY_RETURN_AT_MATURITY = "returnAtMaturity";
  private BigDecimal returnAtMaturity;

  public static final String JSON_PROPERTY_LOCKED_RATE = "lockedRate";
  private BigDecimal lockedRate;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public RedeemedFixedDeposit() {
  }

  /**
   * Constructor with all args parameters
   */
  public RedeemedFixedDeposit(@JsonProperty(JSON_PROPERTY_PLACEMENT_ID) UUID placementId, @JsonProperty(JSON_PROPERTY_INVESTED_QUANTITY) BigDecimal investedQuantity, @JsonProperty(JSON_PROPERTY_REDEEMED_VALUE) BigDecimal redeemedValue, @JsonProperty(JSON_PROPERTY_CURRENCY_CODE) String currencyCode, @JsonProperty(JSON_PROPERTY_PROVIDER_DETAILS) ProviderDetails providerDetails, @JsonProperty(JSON_PROPERTY_TERM) String term, @JsonProperty(JSON_PROPERTY_REDEMPTION_DATE) LocalDate redemptionDate, @JsonProperty(JSON_PROPERTY_RETURN_AT_MATURITY) BigDecimal returnAtMaturity, @JsonProperty(JSON_PROPERTY_LOCKED_RATE) BigDecimal lockedRate, @JsonProperty(JSON_PROPERTY_TYPE) String type) {
    this.placementId = placementId;
    this.investedQuantity = investedQuantity;
    this.redeemedValue = redeemedValue;
    this.currencyCode = currencyCode;
    this.providerDetails = providerDetails;
    this.term = term;
    this.redemptionDate = redemptionDate;
    this.returnAtMaturity = returnAtMaturity;
    this.lockedRate = lockedRate;
    this.type = type;
  }

  public RedeemedFixedDeposit placementId(UUID placementId) {
    
    this.placementId = placementId;
    return this;
  }

  /**
   * Get placementId
   * @return placementId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLACEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getPlacementId() {
    return placementId;
  }


  @JsonProperty(JSON_PROPERTY_PLACEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlacementId(UUID placementId) {
    this.placementId = placementId;
  }

  public RedeemedFixedDeposit investedQuantity(BigDecimal investedQuantity) {
    
    this.investedQuantity = investedQuantity;
    return this;
  }

  /**
   * Get investedQuantity
   * @return investedQuantity
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVESTED_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getInvestedQuantity() {
    return investedQuantity;
  }


  @JsonProperty(JSON_PROPERTY_INVESTED_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvestedQuantity(BigDecimal investedQuantity) {
    this.investedQuantity = investedQuantity;
  }

  public RedeemedFixedDeposit redeemedValue(BigDecimal redeemedValue) {
    
    this.redeemedValue = redeemedValue;
    return this;
  }

  /**
   * Get redeemedValue
   * @return redeemedValue
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REDEEMED_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getRedeemedValue() {
    return redeemedValue;
  }


  @JsonProperty(JSON_PROPERTY_REDEEMED_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedeemedValue(BigDecimal redeemedValue) {
    this.redeemedValue = redeemedValue;
  }

  public RedeemedFixedDeposit currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public RedeemedFixedDeposit providerDetails(ProviderDetails providerDetails) {
    
    this.providerDetails = providerDetails;
    return this;
  }

  /**
   * Get providerDetails
   * @return providerDetails
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProviderDetails getProviderDetails() {
    return providerDetails;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderDetails(ProviderDetails providerDetails) {
    this.providerDetails = providerDetails;
  }

  public RedeemedFixedDeposit term(String term) {
    
    this.term = term;
    return this;
  }

  /**
   * Serialized as P{period}, e.g. 2 weeks &#x3D; P14D, 3 months &#x3D; P3M, 1 year &#x3D; P1Y
   * @return term
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TERM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTerm() {
    return term;
  }


  @JsonProperty(JSON_PROPERTY_TERM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTerm(String term) {
    this.term = term;
  }

  public RedeemedFixedDeposit redemptionDate(LocalDate redemptionDate) {
    
    this.redemptionDate = redemptionDate;
    return this;
  }

  /**
   * Get redemptionDate
   * @return redemptionDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REDEMPTION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getRedemptionDate() {
    return redemptionDate;
  }


  @JsonProperty(JSON_PROPERTY_REDEMPTION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedemptionDate(LocalDate redemptionDate) {
    this.redemptionDate = redemptionDate;
  }

  public RedeemedFixedDeposit returnAtMaturity(BigDecimal returnAtMaturity) {
    
    this.returnAtMaturity = returnAtMaturity;
    return this;
  }

  /**
   * Get returnAtMaturity
   * @return returnAtMaturity
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RETURN_AT_MATURITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getReturnAtMaturity() {
    return returnAtMaturity;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_AT_MATURITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReturnAtMaturity(BigDecimal returnAtMaturity) {
    this.returnAtMaturity = returnAtMaturity;
  }

  public RedeemedFixedDeposit lockedRate(BigDecimal lockedRate) {
    
    this.lockedRate = lockedRate;
    return this;
  }

  /**
   * Get lockedRate
   * @return lockedRate
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCKED_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getLockedRate() {
    return lockedRate;
  }


  @JsonProperty(JSON_PROPERTY_LOCKED_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLockedRate(BigDecimal lockedRate) {
    this.lockedRate = lockedRate;
  }

  public RedeemedFixedDeposit type(String type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedeemedFixedDeposit redeemedFixedDeposit = (RedeemedFixedDeposit) o;
    return Objects.equals(this.placementId, redeemedFixedDeposit.placementId) &&
        Objects.equals(this.investedQuantity, redeemedFixedDeposit.investedQuantity) &&
        Objects.equals(this.redeemedValue, redeemedFixedDeposit.redeemedValue) &&
        Objects.equals(this.currencyCode, redeemedFixedDeposit.currencyCode) &&
        Objects.equals(this.providerDetails, redeemedFixedDeposit.providerDetails) &&
        Objects.equals(this.term, redeemedFixedDeposit.term) &&
        Objects.equals(this.redemptionDate, redeemedFixedDeposit.redemptionDate) &&
        Objects.equals(this.returnAtMaturity, redeemedFixedDeposit.returnAtMaturity) &&
        Objects.equals(this.lockedRate, redeemedFixedDeposit.lockedRate) &&
        Objects.equals(this.type, redeemedFixedDeposit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementId, investedQuantity, redeemedValue, currencyCode, providerDetails, term, redemptionDate, returnAtMaturity, lockedRate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedeemedFixedDeposit {\n");
    sb.append("    placementId: ").append(toIndentedString(placementId)).append("\n");
    sb.append("    investedQuantity: ").append(toIndentedString(investedQuantity)).append("\n");
    sb.append("    redeemedValue: ").append(toIndentedString(redeemedValue)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    providerDetails: ").append(toIndentedString(providerDetails)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    redemptionDate: ").append(toIndentedString(redemptionDate)).append("\n");
    sb.append("    returnAtMaturity: ").append(toIndentedString(returnAtMaturity)).append("\n");
    sb.append("    lockedRate: ").append(toIndentedString(lockedRate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Builder {

    private RedeemedFixedDeposit instance;

    public Builder() {
      this(new RedeemedFixedDeposit());
    }

    protected Builder(RedeemedFixedDeposit instance) {
      this.instance = instance;
    }

    public RedeemedFixedDeposit.Builder placementId(UUID placementId) {
      this.instance.placementId = placementId;
      return this;
    }
    public RedeemedFixedDeposit.Builder investedQuantity(BigDecimal investedQuantity) {
      this.instance.investedQuantity = investedQuantity;
      return this;
    }
    public RedeemedFixedDeposit.Builder redeemedValue(BigDecimal redeemedValue) {
      this.instance.redeemedValue = redeemedValue;
      return this;
    }
    public RedeemedFixedDeposit.Builder currencyCode(String currencyCode) {
      this.instance.currencyCode = currencyCode;
      return this;
    }
    public RedeemedFixedDeposit.Builder providerDetails(ProviderDetails providerDetails) {
      this.instance.providerDetails = providerDetails;
      return this;
    }
    public RedeemedFixedDeposit.Builder term(String term) {
      this.instance.term = term;
      return this;
    }
    public RedeemedFixedDeposit.Builder redemptionDate(LocalDate redemptionDate) {
      this.instance.redemptionDate = redemptionDate;
      return this;
    }
    public RedeemedFixedDeposit.Builder returnAtMaturity(BigDecimal returnAtMaturity) {
      this.instance.returnAtMaturity = returnAtMaturity;
      return this;
    }
    public RedeemedFixedDeposit.Builder lockedRate(BigDecimal lockedRate) {
      this.instance.lockedRate = lockedRate;
      return this;
    }
    public RedeemedFixedDeposit.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    /**
    * returns a built RedeemedFixedDeposit instance.
    *
    * The builder is not reusable.
    */
    public RedeemedFixedDeposit build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static RedeemedFixedDeposit.Builder builder() {
    return new RedeemedFixedDeposit.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public RedeemedFixedDeposit.Builder toBuilder() {
    return new RedeemedFixedDeposit.Builder()
      .placementId(getPlacementId())
      .investedQuantity(getInvestedQuantity())
      .redeemedValue(getRedeemedValue())
      .currencyCode(getCurrencyCode())
      .providerDetails(getProviderDetails())
      .term(getTerm())
      .redemptionDate(getRedemptionDate())
      .returnAtMaturity(getReturnAtMaturity())
      .lockedRate(getLockedRate())
      .type(getType());
  }


}

