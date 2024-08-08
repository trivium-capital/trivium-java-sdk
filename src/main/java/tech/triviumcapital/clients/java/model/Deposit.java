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
import java.time.OffsetDateTime;
import java.util.UUID;
import tech.triviumcapital.clients.java.model.TransactionStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Deposit
 */
@JsonPropertyOrder({
  Deposit.JSON_PROPERTY_ACCOUNT_ID,
  Deposit.JSON_PROPERTY_QUANTITY,
  Deposit.JSON_PROPERTY_CURRENCY_CODE,
  Deposit.JSON_PROPERTY_RECEIVED_AT,
  Deposit.JSON_PROPERTY_STATUS,
  Deposit.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Deposit implements Transaction {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private UUID accountId;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_RECEIVED_AT = "receivedAt";
  private OffsetDateTime receivedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TransactionStatus status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public Deposit() {
  }

  /**
   * Constructor with all args parameters
   */
  public Deposit(@JsonProperty(JSON_PROPERTY_ACCOUNT_ID) UUID accountId, @JsonProperty(JSON_PROPERTY_QUANTITY) BigDecimal quantity, @JsonProperty(JSON_PROPERTY_CURRENCY_CODE) String currencyCode, @JsonProperty(JSON_PROPERTY_RECEIVED_AT) OffsetDateTime receivedAt, @JsonProperty(JSON_PROPERTY_STATUS) TransactionStatus status, @JsonProperty(JSON_PROPERTY_TYPE) String type) {
    this.accountId = accountId;
    this.quantity = quantity;
    this.currencyCode = currencyCode;
    this.receivedAt = receivedAt;
    this.status = status;
    this.type = type;
  }

  public Deposit accountId(UUID accountId) {
    
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public Deposit quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public Deposit currencyCode(String currencyCode) {
    
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

  public Deposit receivedAt(OffsetDateTime receivedAt) {
    
    this.receivedAt = receivedAt;
    return this;
  }

  /**
   * Get receivedAt
   * @return receivedAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECEIVED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReceivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
  }

  public Deposit status(TransactionStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TransactionStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(TransactionStatus status) {
    this.status = status;
  }

  public Deposit type(String type) {
    
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
    Deposit deposit = (Deposit) o;
    return Objects.equals(this.accountId, deposit.accountId) &&
        Objects.equals(this.quantity, deposit.quantity) &&
        Objects.equals(this.currencyCode, deposit.currencyCode) &&
        Objects.equals(this.receivedAt, deposit.receivedAt) &&
        Objects.equals(this.status, deposit.status) &&
        Objects.equals(this.type, deposit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, quantity, currencyCode, receivedAt, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deposit {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    private Deposit instance;

    public Builder() {
      this(new Deposit());
    }

    protected Builder(Deposit instance) {
      this.instance = instance;
    }

    public Deposit.Builder accountId(UUID accountId) {
      this.instance.accountId = accountId;
      return this;
    }
    public Deposit.Builder quantity(BigDecimal quantity) {
      this.instance.quantity = quantity;
      return this;
    }
    public Deposit.Builder currencyCode(String currencyCode) {
      this.instance.currencyCode = currencyCode;
      return this;
    }
    public Deposit.Builder receivedAt(OffsetDateTime receivedAt) {
      this.instance.receivedAt = receivedAt;
      return this;
    }
    public Deposit.Builder status(TransactionStatus status) {
      this.instance.status = status;
      return this;
    }
    public Deposit.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    /**
    * returns a built Deposit instance.
    *
    * The builder is not reusable.
    */
    public Deposit build() {
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
  public static Deposit.Builder builder() {
    return new Deposit.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Deposit.Builder toBuilder() {
    return new Deposit.Builder()
      .accountId(getAccountId())
      .quantity(getQuantity())
      .currencyCode(getCurrencyCode())
      .receivedAt(getReceivedAt())
      .status(getStatus())
      .type(getType());
  }


}

