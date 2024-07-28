/*
 * trivium-cash
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.0
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
import tech.triviumcapital.clients.java.model.AccountStatus;
import tech.triviumcapital.clients.java.model.AccountType;
import tech.triviumcapital.clients.java.model.DepositInstructions;
import tech.triviumcapital.clients.java.model.EarningsToDate;
import tech.triviumcapital.clients.java.model.ProviderDetails;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Account
 */
@JsonPropertyOrder({
  Account.JSON_PROPERTY_ACCOUNT_ID,
  Account.JSON_PROPERTY_ACCOUNT_TYPE,
  Account.JSON_PROPERTY_CURRENCY_CODE,
  Account.JSON_PROPERTY_STATUS,
  Account.JSON_PROPERTY_PROVIDER,
  Account.JSON_PROPERTY_EARNINGS_TO_DATE,
  Account.JSON_PROPERTY_DEPOSIT_INSTRUCTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Account {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private UUID accountId;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private AccountType accountType;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AccountStatus status;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private ProviderDetails provider;

  public static final String JSON_PROPERTY_EARNINGS_TO_DATE = "earningsToDate";
  private EarningsToDate earningsToDate;

  public static final String JSON_PROPERTY_DEPOSIT_INSTRUCTIONS = "depositInstructions";
  private DepositInstructions depositInstructions;

  public Account() {
  }

  /**
   * Constructor with all args parameters
   */
  public Account(@JsonProperty(JSON_PROPERTY_ACCOUNT_ID) UUID accountId, @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE) AccountType accountType, @JsonProperty(JSON_PROPERTY_CURRENCY_CODE) String currencyCode, @JsonProperty(JSON_PROPERTY_STATUS) AccountStatus status, @JsonProperty(JSON_PROPERTY_PROVIDER) ProviderDetails provider, @JsonProperty(JSON_PROPERTY_EARNINGS_TO_DATE) EarningsToDate earningsToDate, @JsonProperty(JSON_PROPERTY_DEPOSIT_INSTRUCTIONS) DepositInstructions depositInstructions) {
    this.accountId = accountId;
    this.accountType = accountType;
    this.currencyCode = currencyCode;
    this.status = status;
    this.provider = provider;
    this.earningsToDate = earningsToDate;
    this.depositInstructions = depositInstructions;
  }

  public Account accountId(UUID accountId) {
    
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

  public Account accountType(AccountType accountType) {
    
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

  public Account currencyCode(String currencyCode) {
    
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

  public Account status(AccountStatus status) {
    
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

  public AccountStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(AccountStatus status) {
    this.status = status;
  }

  public Account provider(ProviderDetails provider) {
    
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProviderDetails getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(ProviderDetails provider) {
    this.provider = provider;
  }

  public Account earningsToDate(EarningsToDate earningsToDate) {
    
    this.earningsToDate = earningsToDate;
    return this;
  }

  /**
   * Get earningsToDate
   * @return earningsToDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EARNINGS_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EarningsToDate getEarningsToDate() {
    return earningsToDate;
  }


  @JsonProperty(JSON_PROPERTY_EARNINGS_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEarningsToDate(EarningsToDate earningsToDate) {
    this.earningsToDate = earningsToDate;
  }

  public Account depositInstructions(DepositInstructions depositInstructions) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.currencyCode, account.currencyCode) &&
        Objects.equals(this.status, account.status) &&
        Objects.equals(this.provider, account.provider) &&
        Objects.equals(this.earningsToDate, account.earningsToDate) &&
        Objects.equals(this.depositInstructions, account.depositInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, currencyCode, status, provider, earningsToDate, depositInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    earningsToDate: ").append(toIndentedString(earningsToDate)).append("\n");
    sb.append("    depositInstructions: ").append(toIndentedString(depositInstructions)).append("\n");
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

    private Account instance;

    public Builder() {
      this(new Account());
    }

    protected Builder(Account instance) {
      this.instance = instance;
    }

    public Account.Builder accountId(UUID accountId) {
      this.instance.accountId = accountId;
      return this;
    }
    public Account.Builder accountType(AccountType accountType) {
      this.instance.accountType = accountType;
      return this;
    }
    public Account.Builder currencyCode(String currencyCode) {
      this.instance.currencyCode = currencyCode;
      return this;
    }
    public Account.Builder status(AccountStatus status) {
      this.instance.status = status;
      return this;
    }
    public Account.Builder provider(ProviderDetails provider) {
      this.instance.provider = provider;
      return this;
    }
    public Account.Builder earningsToDate(EarningsToDate earningsToDate) {
      this.instance.earningsToDate = earningsToDate;
      return this;
    }
    public Account.Builder depositInstructions(DepositInstructions depositInstructions) {
      this.instance.depositInstructions = depositInstructions;
      return this;
    }


    /**
    * returns a built Account instance.
    *
    * The builder is not reusable.
    */
    public Account build() {
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
  public static Account.Builder builder() {
    return new Account.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Account.Builder toBuilder() {
    return new Account.Builder()
      .accountId(getAccountId())
      .accountType(getAccountType())
      .currencyCode(getCurrencyCode())
      .status(getStatus())
      .provider(getProvider())
      .earningsToDate(getEarningsToDate())
      .depositInstructions(getDepositInstructions());
  }


}

