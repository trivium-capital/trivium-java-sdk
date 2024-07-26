/*
 * trivium-cash
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
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
import tech.triviumcapital.clients.java.model.Transfer;
import tech.triviumcapital.clients.java.model.TransferDetails;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DepositRequest
 */
@JsonPropertyOrder({
  DepositRequest.JSON_PROPERTY_QUANTITY,
  DepositRequest.JSON_PROPERTY_CURRENCY_CODE,
  DepositRequest.JSON_PROPERTY_TRANSFER_DETAILS,
  DepositRequest.JSON_PROPERTY_TRANSFER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-26T10:02:28.662121+08:00[Asia/Singapore]", comments = "Generator version: 7.7.0")
public class DepositRequest {
  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_TRANSFER_DETAILS = "transferDetails";
  private TransferDetails transferDetails;

  public static final String JSON_PROPERTY_TRANSFER = "transfer";
  private Transfer transfer;

  public DepositRequest() {
  }

  /**
   * Constructor with all args parameters
   */
  public DepositRequest(@JsonProperty(JSON_PROPERTY_QUANTITY) BigDecimal quantity, @JsonProperty(JSON_PROPERTY_CURRENCY_CODE) String currencyCode, @JsonProperty(JSON_PROPERTY_TRANSFER_DETAILS) TransferDetails transferDetails, @JsonProperty(JSON_PROPERTY_TRANSFER) Transfer transfer) {
    this.quantity = quantity;
    this.currencyCode = currencyCode;
    this.transferDetails = transferDetails;
    this.transfer = transfer;
  }

  public DepositRequest quantity(BigDecimal quantity) {
    
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

  public DepositRequest currencyCode(String currencyCode) {
    
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

  public DepositRequest transferDetails(TransferDetails transferDetails) {
    
    this.transferDetails = transferDetails;
    return this;
  }

  /**
   * Get transferDetails
   * @return transferDetails
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSFER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransferDetails getTransferDetails() {
    return transferDetails;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferDetails(TransferDetails transferDetails) {
    this.transferDetails = transferDetails;
  }

  public DepositRequest transfer(Transfer transfer) {
    
    this.transfer = transfer;
    return this;
  }

  /**
   * Get transfer
   * @return transfer
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Transfer getTransfer() {
    return transfer;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransfer(Transfer transfer) {
    this.transfer = transfer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositRequest depositRequest = (DepositRequest) o;
    return Objects.equals(this.quantity, depositRequest.quantity) &&
        Objects.equals(this.currencyCode, depositRequest.currencyCode) &&
        Objects.equals(this.transferDetails, depositRequest.transferDetails) &&
        Objects.equals(this.transfer, depositRequest.transfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, currencyCode, transferDetails, transfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositRequest {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    transferDetails: ").append(toIndentedString(transferDetails)).append("\n");
    sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
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

    private DepositRequest instance;

    public Builder() {
      this(new DepositRequest());
    }

    protected Builder(DepositRequest instance) {
      this.instance = instance;
    }

    public DepositRequest.Builder quantity(BigDecimal quantity) {
      this.instance.quantity = quantity;
      return this;
    }
    public DepositRequest.Builder currencyCode(String currencyCode) {
      this.instance.currencyCode = currencyCode;
      return this;
    }
    public DepositRequest.Builder transferDetails(TransferDetails transferDetails) {
      this.instance.transferDetails = transferDetails;
      return this;
    }
    public DepositRequest.Builder transfer(Transfer transfer) {
      this.instance.transfer = transfer;
      return this;
    }


    /**
    * returns a built DepositRequest instance.
    *
    * The builder is not reusable.
    */
    public DepositRequest build() {
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
  public static DepositRequest.Builder builder() {
    return new DepositRequest.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public DepositRequest.Builder toBuilder() {
    return new DepositRequest.Builder()
      .quantity(getQuantity())
      .currencyCode(getCurrencyCode())
      .transferDetails(getTransferDetails())
      .transfer(getTransfer());
  }


}

