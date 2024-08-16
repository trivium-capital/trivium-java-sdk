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
import java.util.UUID;
import tech.triviumcapital.clients.java.model.DepositInstructions;
import tech.triviumcapital.clients.java.model.ProviderDetails;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PendingFixedDeposit
 */
@JsonPropertyOrder({
  PendingFixedDeposit.JSON_PROPERTY_PLACEMENT_ID,
  PendingFixedDeposit.JSON_PROPERTY_CURRENCY_CODE,
  PendingFixedDeposit.JSON_PROPERTY_PROVIDER_DETAILS,
  PendingFixedDeposit.JSON_PROPERTY_TERM,
  PendingFixedDeposit.JSON_PROPERTY_DEPOSIT_INSTRUCTIONS,
  PendingFixedDeposit.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class PendingFixedDeposit implements FixedDepositPlacement {
  public static final String JSON_PROPERTY_PLACEMENT_ID = "placementId";
  private UUID placementId;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_PROVIDER_DETAILS = "providerDetails";
  private ProviderDetails providerDetails;

  public static final String JSON_PROPERTY_TERM = "term";
  private String term;

  public static final String JSON_PROPERTY_DEPOSIT_INSTRUCTIONS = "depositInstructions";
  private DepositInstructions depositInstructions;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public PendingFixedDeposit() {
  }

  /**
   * Constructor with all args parameters
   */
  public PendingFixedDeposit(@JsonProperty(JSON_PROPERTY_PLACEMENT_ID) UUID placementId, @JsonProperty(JSON_PROPERTY_CURRENCY_CODE) String currencyCode, @JsonProperty(JSON_PROPERTY_PROVIDER_DETAILS) ProviderDetails providerDetails, @JsonProperty(JSON_PROPERTY_TERM) String term, @JsonProperty(JSON_PROPERTY_DEPOSIT_INSTRUCTIONS) DepositInstructions depositInstructions, @JsonProperty(JSON_PROPERTY_TYPE) String type) {
    this.placementId = placementId;
    this.currencyCode = currencyCode;
    this.providerDetails = providerDetails;
    this.term = term;
    this.depositInstructions = depositInstructions;
    this.type = type;
  }

  public PendingFixedDeposit placementId(UUID placementId) {
    
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

  public PendingFixedDeposit currencyCode(String currencyCode) {
    
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

  public PendingFixedDeposit providerDetails(ProviderDetails providerDetails) {
    
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

  public PendingFixedDeposit term(String term) {
    
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

  public PendingFixedDeposit depositInstructions(DepositInstructions depositInstructions) {
    
    this.depositInstructions = depositInstructions;
    return this;
  }

  /**
   * Get depositInstructions
   * @return depositInstructions
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEPOSIT_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DepositInstructions getDepositInstructions() {
    return depositInstructions;
  }


  @JsonProperty(JSON_PROPERTY_DEPOSIT_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDepositInstructions(DepositInstructions depositInstructions) {
    this.depositInstructions = depositInstructions;
  }

  public PendingFixedDeposit type(String type) {
    
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
    PendingFixedDeposit pendingFixedDeposit = (PendingFixedDeposit) o;
    return Objects.equals(this.placementId, pendingFixedDeposit.placementId) &&
        Objects.equals(this.currencyCode, pendingFixedDeposit.currencyCode) &&
        Objects.equals(this.providerDetails, pendingFixedDeposit.providerDetails) &&
        Objects.equals(this.term, pendingFixedDeposit.term) &&
        Objects.equals(this.depositInstructions, pendingFixedDeposit.depositInstructions) &&
        Objects.equals(this.type, pendingFixedDeposit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementId, currencyCode, providerDetails, term, depositInstructions, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingFixedDeposit {\n");
    sb.append("    placementId: ").append(toIndentedString(placementId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    providerDetails: ").append(toIndentedString(providerDetails)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    depositInstructions: ").append(toIndentedString(depositInstructions)).append("\n");
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

    private PendingFixedDeposit instance;

    public Builder() {
      this(new PendingFixedDeposit());
    }

    protected Builder(PendingFixedDeposit instance) {
      this.instance = instance;
    }

    public PendingFixedDeposit.Builder placementId(UUID placementId) {
      this.instance.placementId = placementId;
      return this;
    }
    public PendingFixedDeposit.Builder currencyCode(String currencyCode) {
      this.instance.currencyCode = currencyCode;
      return this;
    }
    public PendingFixedDeposit.Builder providerDetails(ProviderDetails providerDetails) {
      this.instance.providerDetails = providerDetails;
      return this;
    }
    public PendingFixedDeposit.Builder term(String term) {
      this.instance.term = term;
      return this;
    }
    public PendingFixedDeposit.Builder depositInstructions(DepositInstructions depositInstructions) {
      this.instance.depositInstructions = depositInstructions;
      return this;
    }
    public PendingFixedDeposit.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    /**
    * returns a built PendingFixedDeposit instance.
    *
    * The builder is not reusable.
    */
    public PendingFixedDeposit build() {
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
  public static PendingFixedDeposit.Builder builder() {
    return new PendingFixedDeposit.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public PendingFixedDeposit.Builder toBuilder() {
    return new PendingFixedDeposit.Builder()
      .placementId(getPlacementId())
      .currencyCode(getCurrencyCode())
      .providerDetails(getProviderDetails())
      .term(getTerm())
      .depositInstructions(getDepositInstructions())
      .type(getType());
  }


}

