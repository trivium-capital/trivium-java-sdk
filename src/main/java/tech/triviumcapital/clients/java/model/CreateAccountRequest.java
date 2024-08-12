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
import java.util.UUID;
import tech.triviumcapital.clients.java.model.AccountType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateAccountRequest
 */
@JsonPropertyOrder({
  CreateAccountRequest.JSON_PROPERTY_USER_ID,
  CreateAccountRequest.JSON_PROPERTY_ACCOUNT_TYPE,
  CreateAccountRequest.JSON_PROPERTY_CURRENCY_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CreateAccountRequest {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private UUID userId;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private AccountType accountType;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public CreateAccountRequest() {
  }

  /**
   * Constructor with all args parameters
   */
  public CreateAccountRequest(@JsonProperty(JSON_PROPERTY_USER_ID) UUID userId, @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE) AccountType accountType, @JsonProperty(JSON_PROPERTY_CURRENCY_CODE) String currencyCode) {
    this.userId = userId;
    this.accountType = accountType;
    this.currencyCode = currencyCode;
  }

  public CreateAccountRequest userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public CreateAccountRequest accountType(AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountType getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  public CreateAccountRequest currencyCode(String currencyCode) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountRequest createAccountRequest = (CreateAccountRequest) o;
    return Objects.equals(this.userId, createAccountRequest.userId) &&
        Objects.equals(this.accountType, createAccountRequest.accountType) &&
        Objects.equals(this.currencyCode, createAccountRequest.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, accountType, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

    private CreateAccountRequest instance;

    public Builder() {
      this(new CreateAccountRequest());
    }

    protected Builder(CreateAccountRequest instance) {
      this.instance = instance;
    }

    public CreateAccountRequest.Builder userId(UUID userId) {
      this.instance.userId = userId;
      return this;
    }
    public CreateAccountRequest.Builder accountType(AccountType accountType) {
      this.instance.accountType = accountType;
      return this;
    }
    public CreateAccountRequest.Builder currencyCode(String currencyCode) {
      this.instance.currencyCode = currencyCode;
      return this;
    }


    /**
    * returns a built CreateAccountRequest instance.
    *
    * The builder is not reusable.
    */
    public CreateAccountRequest build() {
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
  public static CreateAccountRequest.Builder builder() {
    return new CreateAccountRequest.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public CreateAccountRequest.Builder toBuilder() {
    return new CreateAccountRequest.Builder()
      .userId(getUserId())
      .accountType(getAccountType())
      .currencyCode(getCurrencyCode());
  }


}

