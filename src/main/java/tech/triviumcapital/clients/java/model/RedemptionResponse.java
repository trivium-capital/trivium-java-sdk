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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RedemptionResponse
 */
@JsonPropertyOrder({
  RedemptionResponse.JSON_PROPERTY_TRANSACTION_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class RedemptionResponse {
  public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
  private UUID transactionId;

  public RedemptionResponse() {
  }

  /**
   * Constructor with all args parameters
   */
  public RedemptionResponse(@JsonProperty(JSON_PROPERTY_TRANSACTION_ID) UUID transactionId) {
    this.transactionId = transactionId;
  }

  public RedemptionResponse transactionId(UUID transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getTransactionId() {
    return transactionId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionResponse redemptionResponse = (RedemptionResponse) o;
    return Objects.equals(this.transactionId, redemptionResponse.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionResponse {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

    private RedemptionResponse instance;

    public Builder() {
      this(new RedemptionResponse());
    }

    protected Builder(RedemptionResponse instance) {
      this.instance = instance;
    }

    public RedemptionResponse.Builder transactionId(UUID transactionId) {
      this.instance.transactionId = transactionId;
      return this;
    }


    /**
    * returns a built RedemptionResponse instance.
    *
    * The builder is not reusable.
    */
    public RedemptionResponse build() {
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
  public static RedemptionResponse.Builder builder() {
    return new RedemptionResponse.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public RedemptionResponse.Builder toBuilder() {
    return new RedemptionResponse.Builder()
      .transactionId(getTransactionId());
  }


}

