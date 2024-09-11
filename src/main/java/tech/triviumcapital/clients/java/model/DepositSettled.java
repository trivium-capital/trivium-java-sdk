/*
 * trivium-cash
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.5
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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DepositSettled
 */
@JsonPropertyOrder({
  DepositSettled.JSON_PROPERTY_TRANSACTION_ID,
  DepositSettled.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class DepositSettled implements CashCallbackEvent {
  public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
  private UUID transactionId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public DepositSettled() {
  }

  /**
   * Constructor with all args parameters
   */
  public DepositSettled(@JsonProperty(JSON_PROPERTY_TRANSACTION_ID) UUID transactionId, @JsonProperty(JSON_PROPERTY_TYPE) String type) {
    this.transactionId = transactionId;
    this.type = type;
  }

  public DepositSettled transactionId(UUID transactionId) {
    
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

  public DepositSettled type(String type) {
    
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
    DepositSettled depositSettled = (DepositSettled) o;
    return Objects.equals(this.transactionId, depositSettled.transactionId) &&
        Objects.equals(this.type, depositSettled.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSettled {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

    private DepositSettled instance;

    public Builder() {
      this(new DepositSettled());
    }

    protected Builder(DepositSettled instance) {
      this.instance = instance;
    }

    public DepositSettled.Builder transactionId(UUID transactionId) {
      this.instance.transactionId = transactionId;
      return this;
    }
    public DepositSettled.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    /**
    * returns a built DepositSettled instance.
    *
    * The builder is not reusable.
    */
    public DepositSettled build() {
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
  public static DepositSettled.Builder builder() {
    return new DepositSettled.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public DepositSettled.Builder toBuilder() {
    return new DepositSettled.Builder()
      .transactionId(getTransactionId())
      .type(getType());
  }


}

