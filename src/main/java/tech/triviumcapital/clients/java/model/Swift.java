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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Swift
 */
@JsonPropertyOrder({
  Swift.JSON_PROPERTY_ACCOUNT_NUMBER,
  Swift.JSON_PROPERTY_ACCOUNT_HOLDER_NAME,
  Swift.JSON_PROPERTY_ACCOUNT_HOLDER_ADDRESS,
  Swift.JSON_PROPERTY_BANK_NAME,
  Swift.JSON_PROPERTY_BANK_ADDRESS,
  Swift.JSON_PROPERTY_SWIFT_CODE,
  Swift.JSON_PROPERTY_REFERENCE,
  Swift.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Swift implements InternationalTransfer, TransferDetails {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_NAME = "accountHolderName";
  private String accountHolderName;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_ADDRESS = "accountHolderAddress";
  private String accountHolderAddress;

  public static final String JSON_PROPERTY_BANK_NAME = "bankName";
  private String bankName;

  public static final String JSON_PROPERTY_BANK_ADDRESS = "bankAddress";
  private String bankAddress;

  public static final String JSON_PROPERTY_SWIFT_CODE = "swiftCode";
  private String swiftCode;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public Swift() {
  }

  /**
   * Constructor with all args parameters
   */
  public Swift(@JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER) String accountNumber, @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_NAME) String accountHolderName, @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ADDRESS) String accountHolderAddress, @JsonProperty(JSON_PROPERTY_BANK_NAME) String bankName, @JsonProperty(JSON_PROPERTY_BANK_ADDRESS) String bankAddress, @JsonProperty(JSON_PROPERTY_SWIFT_CODE) String swiftCode, @JsonProperty(JSON_PROPERTY_REFERENCE) String reference, @JsonProperty(JSON_PROPERTY_TYPE) String type) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.accountHolderAddress = accountHolderAddress;
    this.bankName = bankName;
    this.bankAddress = bankAddress;
    this.swiftCode = swiftCode;
    this.reference = reference;
    this.type = type;
  }

  public Swift accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Swift accountHolderName(String accountHolderName) {
    
    this.accountHolderName = accountHolderName;
    return this;
  }

  /**
   * Get accountHolderName
   * @return accountHolderName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountHolderName() {
    return accountHolderName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  public Swift accountHolderAddress(String accountHolderAddress) {
    
    this.accountHolderAddress = accountHolderAddress;
    return this;
  }

  /**
   * Get accountHolderAddress
   * @return accountHolderAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderAddress() {
    return accountHolderAddress;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderAddress(String accountHolderAddress) {
    this.accountHolderAddress = accountHolderAddress;
  }

  public Swift bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBankName() {
    return bankName;
  }


  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public Swift bankAddress(String bankAddress) {
    
    this.bankAddress = bankAddress;
    return this;
  }

  /**
   * Get bankAddress
   * @return bankAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankAddress() {
    return bankAddress;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAddress(String bankAddress) {
    this.bankAddress = bankAddress;
  }

  public Swift swiftCode(String swiftCode) {
    
    this.swiftCode = swiftCode;
    return this;
  }

  /**
   * Get swiftCode
   * @return swiftCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SWIFT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSwiftCode() {
    return swiftCode;
  }


  @JsonProperty(JSON_PROPERTY_SWIFT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSwiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
  }

  public Swift reference(String reference) {
    
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  public Swift type(String type) {
    
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
    Swift swift = (Swift) o;
    return Objects.equals(this.accountNumber, swift.accountNumber) &&
        Objects.equals(this.accountHolderName, swift.accountHolderName) &&
        Objects.equals(this.accountHolderAddress, swift.accountHolderAddress) &&
        Objects.equals(this.bankName, swift.bankName) &&
        Objects.equals(this.bankAddress, swift.bankAddress) &&
        Objects.equals(this.swiftCode, swift.swiftCode) &&
        Objects.equals(this.reference, swift.reference) &&
        Objects.equals(this.type, swift.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountHolderName, accountHolderAddress, bankName, bankAddress, swiftCode, reference, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Swift {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    accountHolderAddress: ").append(toIndentedString(accountHolderAddress)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankAddress: ").append(toIndentedString(bankAddress)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

    private Swift instance;

    public Builder() {
      this(new Swift());
    }

    protected Builder(Swift instance) {
      this.instance = instance;
    }

    public Swift.Builder accountNumber(String accountNumber) {
      this.instance.accountNumber = accountNumber;
      return this;
    }
    public Swift.Builder accountHolderName(String accountHolderName) {
      this.instance.accountHolderName = accountHolderName;
      return this;
    }
    public Swift.Builder accountHolderAddress(String accountHolderAddress) {
      this.instance.accountHolderAddress = accountHolderAddress;
      return this;
    }
    public Swift.Builder bankName(String bankName) {
      this.instance.bankName = bankName;
      return this;
    }
    public Swift.Builder bankAddress(String bankAddress) {
      this.instance.bankAddress = bankAddress;
      return this;
    }
    public Swift.Builder swiftCode(String swiftCode) {
      this.instance.swiftCode = swiftCode;
      return this;
    }
    public Swift.Builder reference(String reference) {
      this.instance.reference = reference;
      return this;
    }
    public Swift.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    /**
    * returns a built Swift instance.
    *
    * The builder is not reusable.
    */
    public Swift build() {
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
  public static Swift.Builder builder() {
    return new Swift.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Swift.Builder toBuilder() {
    return new Swift.Builder()
      .accountNumber(getAccountNumber())
      .accountHolderName(getAccountHolderName())
      .accountHolderAddress(getAccountHolderAddress())
      .bankName(getBankName())
      .bankAddress(getBankAddress())
      .swiftCode(getSwiftCode())
      .reference(getReference())
      .type(getType());
  }


}

