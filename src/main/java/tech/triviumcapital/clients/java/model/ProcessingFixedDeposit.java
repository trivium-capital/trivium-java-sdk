/*
 * trivium-cash
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.4
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
import java.util.UUID;
import tech.triviumcapital.clients.java.model.ProviderDetails;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ProcessingFixedDeposit
 */
@JsonPropertyOrder({
  ProcessingFixedDeposit.JSON_PROPERTY_PLACEMENT_ID,
  ProcessingFixedDeposit.JSON_PROPERTY_INVESTED_QUANTITY,
  ProcessingFixedDeposit.JSON_PROPERTY_CURRENCY_CODE,
  ProcessingFixedDeposit.JSON_PROPERTY_PROVIDER_DETAILS,
  ProcessingFixedDeposit.JSON_PROPERTY_TERM,
  ProcessingFixedDeposit.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class ProcessingFixedDeposit implements FixedDepositPlacement {
  public static final String JSON_PROPERTY_PLACEMENT_ID = "placementId";
  private UUID placementId;

  public static final String JSON_PROPERTY_INVESTED_QUANTITY = "investedQuantity";
  private BigDecimal investedQuantity;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_PROVIDER_DETAILS = "providerDetails";
  private ProviderDetails providerDetails;

  public static final String JSON_PROPERTY_TERM = "term";
  private String term;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ProcessingFixedDeposit() {
  }

  /**
   * Constructor with all args parameters
   */
  public ProcessingFixedDeposit(@JsonProperty(JSON_PROPERTY_PLACEMENT_ID) UUID placementId, @JsonProperty(JSON_PROPERTY_INVESTED_QUANTITY) BigDecimal investedQuantity, @JsonProperty(JSON_PROPERTY_CURRENCY_CODE) String currencyCode, @JsonProperty(JSON_PROPERTY_PROVIDER_DETAILS) ProviderDetails providerDetails, @JsonProperty(JSON_PROPERTY_TERM) String term, @JsonProperty(JSON_PROPERTY_TYPE) String type) {
    this.placementId = placementId;
    this.investedQuantity = investedQuantity;
    this.currencyCode = currencyCode;
    this.providerDetails = providerDetails;
    this.term = term;
    this.type = type;
  }

  public ProcessingFixedDeposit placementId(UUID placementId) {
    
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

  public ProcessingFixedDeposit investedQuantity(BigDecimal investedQuantity) {
    
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

  public ProcessingFixedDeposit currencyCode(String currencyCode) {
    
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

  public ProcessingFixedDeposit providerDetails(ProviderDetails providerDetails) {
    
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

  public ProcessingFixedDeposit term(String term) {
    
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

  public ProcessingFixedDeposit type(String type) {
    
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
    ProcessingFixedDeposit processingFixedDeposit = (ProcessingFixedDeposit) o;
    return Objects.equals(this.placementId, processingFixedDeposit.placementId) &&
        Objects.equals(this.investedQuantity, processingFixedDeposit.investedQuantity) &&
        Objects.equals(this.currencyCode, processingFixedDeposit.currencyCode) &&
        Objects.equals(this.providerDetails, processingFixedDeposit.providerDetails) &&
        Objects.equals(this.term, processingFixedDeposit.term) &&
        Objects.equals(this.type, processingFixedDeposit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementId, investedQuantity, currencyCode, providerDetails, term, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessingFixedDeposit {\n");
    sb.append("    placementId: ").append(toIndentedString(placementId)).append("\n");
    sb.append("    investedQuantity: ").append(toIndentedString(investedQuantity)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    providerDetails: ").append(toIndentedString(providerDetails)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

    private ProcessingFixedDeposit instance;

    public Builder() {
      this(new ProcessingFixedDeposit());
    }

    protected Builder(ProcessingFixedDeposit instance) {
      this.instance = instance;
    }

    public ProcessingFixedDeposit.Builder placementId(UUID placementId) {
      this.instance.placementId = placementId;
      return this;
    }
    public ProcessingFixedDeposit.Builder investedQuantity(BigDecimal investedQuantity) {
      this.instance.investedQuantity = investedQuantity;
      return this;
    }
    public ProcessingFixedDeposit.Builder currencyCode(String currencyCode) {
      this.instance.currencyCode = currencyCode;
      return this;
    }
    public ProcessingFixedDeposit.Builder providerDetails(ProviderDetails providerDetails) {
      this.instance.providerDetails = providerDetails;
      return this;
    }
    public ProcessingFixedDeposit.Builder term(String term) {
      this.instance.term = term;
      return this;
    }
    public ProcessingFixedDeposit.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    /**
    * returns a built ProcessingFixedDeposit instance.
    *
    * The builder is not reusable.
    */
    public ProcessingFixedDeposit build() {
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
  public static ProcessingFixedDeposit.Builder builder() {
    return new ProcessingFixedDeposit.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public ProcessingFixedDeposit.Builder toBuilder() {
    return new ProcessingFixedDeposit.Builder()
      .placementId(getPlacementId())
      .investedQuantity(getInvestedQuantity())
      .currencyCode(getCurrencyCode())
      .providerDetails(getProviderDetails())
      .term(getTerm())
      .type(getType());
  }


}

