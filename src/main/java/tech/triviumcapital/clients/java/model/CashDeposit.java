/*
 * trivium-cash
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.3
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
 * CashDeposit
 */
@JsonPropertyOrder({
  CashDeposit.JSON_PROPERTY_TRANSACTION_ID,
  CashDeposit.JSON_PROPERTY_PRODUCT_ID,
  CashDeposit.JSON_PROPERTY_QUANTITY,
  CashDeposit.JSON_PROPERTY_CURRENCY_CODE,
  CashDeposit.JSON_PROPERTY_RECEIVED_AT,
  CashDeposit.JSON_PROPERTY_STATUS,
  CashDeposit.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CashDeposit implements UserTransaction {
  public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
  private UUID transactionId;

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private UUID productId;

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

  public CashDeposit() {
  }

  /**
   * Constructor with all args parameters
   */
  public CashDeposit(@JsonProperty(JSON_PROPERTY_TRANSACTION_ID) UUID transactionId, @JsonProperty(JSON_PROPERTY_PRODUCT_ID) UUID productId, @JsonProperty(JSON_PROPERTY_QUANTITY) BigDecimal quantity, @JsonProperty(JSON_PROPERTY_CURRENCY_CODE) String currencyCode, @JsonProperty(JSON_PROPERTY_RECEIVED_AT) OffsetDateTime receivedAt, @JsonProperty(JSON_PROPERTY_STATUS) TransactionStatus status, @JsonProperty(JSON_PROPERTY_TYPE) String type) {
    this.transactionId = transactionId;
    this.productId = productId;
    this.quantity = quantity;
    this.currencyCode = currencyCode;
    this.receivedAt = receivedAt;
    this.status = status;
    this.type = type;
  }

  public CashDeposit transactionId(UUID transactionId) {
    
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

  public CashDeposit productId(UUID productId) {
    
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductId(UUID productId) {
    this.productId = productId;
  }

  public CashDeposit quantity(BigDecimal quantity) {
    
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

  public CashDeposit currencyCode(String currencyCode) {
    
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

  public CashDeposit receivedAt(OffsetDateTime receivedAt) {
    
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

  public CashDeposit status(TransactionStatus status) {
    
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

  public CashDeposit type(String type) {
    
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
    CashDeposit cashDeposit = (CashDeposit) o;
    return Objects.equals(this.transactionId, cashDeposit.transactionId) &&
        Objects.equals(this.productId, cashDeposit.productId) &&
        Objects.equals(this.quantity, cashDeposit.quantity) &&
        Objects.equals(this.currencyCode, cashDeposit.currencyCode) &&
        Objects.equals(this.receivedAt, cashDeposit.receivedAt) &&
        Objects.equals(this.status, cashDeposit.status) &&
        Objects.equals(this.type, cashDeposit.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, productId, quantity, currencyCode, receivedAt, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashDeposit {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

    private CashDeposit instance;

    public Builder() {
      this(new CashDeposit());
    }

    protected Builder(CashDeposit instance) {
      this.instance = instance;
    }

    public CashDeposit.Builder transactionId(UUID transactionId) {
      this.instance.transactionId = transactionId;
      return this;
    }
    public CashDeposit.Builder productId(UUID productId) {
      this.instance.productId = productId;
      return this;
    }
    public CashDeposit.Builder quantity(BigDecimal quantity) {
      this.instance.quantity = quantity;
      return this;
    }
    public CashDeposit.Builder currencyCode(String currencyCode) {
      this.instance.currencyCode = currencyCode;
      return this;
    }
    public CashDeposit.Builder receivedAt(OffsetDateTime receivedAt) {
      this.instance.receivedAt = receivedAt;
      return this;
    }
    public CashDeposit.Builder status(TransactionStatus status) {
      this.instance.status = status;
      return this;
    }
    public CashDeposit.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    /**
    * returns a built CashDeposit instance.
    *
    * The builder is not reusable.
    */
    public CashDeposit build() {
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
  public static CashDeposit.Builder builder() {
    return new CashDeposit.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public CashDeposit.Builder toBuilder() {
    return new CashDeposit.Builder()
      .transactionId(getTransactionId())
      .productId(getProductId())
      .quantity(getQuantity())
      .currencyCode(getCurrencyCode())
      .receivedAt(getReceivedAt())
      .status(getStatus())
      .type(getType());
  }


}

