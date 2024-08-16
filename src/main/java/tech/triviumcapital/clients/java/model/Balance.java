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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Balance
 */
@JsonPropertyOrder({
  Balance.JSON_PROPERTY_TOTAL_BALANCE,
  Balance.JSON_PROPERTY_AVAILABLE_BALANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Balance {
  public static final String JSON_PROPERTY_TOTAL_BALANCE = "totalBalance";
  private BigDecimal totalBalance;

  public static final String JSON_PROPERTY_AVAILABLE_BALANCE = "availableBalance";
  private BigDecimal availableBalance;

  public Balance() {
  }

  /**
   * Constructor with all args parameters
   */
  public Balance(@JsonProperty(JSON_PROPERTY_TOTAL_BALANCE) BigDecimal totalBalance, @JsonProperty(JSON_PROPERTY_AVAILABLE_BALANCE) BigDecimal availableBalance) {
    this.totalBalance = totalBalance;
    this.availableBalance = availableBalance;
  }

  public Balance totalBalance(BigDecimal totalBalance) {
    
    this.totalBalance = totalBalance;
    return this;
  }

  /**
   * Get totalBalance
   * @return totalBalance
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getTotalBalance() {
    return totalBalance;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalBalance(BigDecimal totalBalance) {
    this.totalBalance = totalBalance;
  }

  public Balance availableBalance(BigDecimal availableBalance) {
    
    this.availableBalance = availableBalance;
    return this;
  }

  /**
   * Get availableBalance
   * @return availableBalance
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVAILABLE_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAvailableBalance() {
    return availableBalance;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.totalBalance, balance.totalBalance) &&
        Objects.equals(this.availableBalance, balance.availableBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalBalance, availableBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
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

    private Balance instance;

    public Builder() {
      this(new Balance());
    }

    protected Builder(Balance instance) {
      this.instance = instance;
    }

    public Balance.Builder totalBalance(BigDecimal totalBalance) {
      this.instance.totalBalance = totalBalance;
      return this;
    }
    public Balance.Builder availableBalance(BigDecimal availableBalance) {
      this.instance.availableBalance = availableBalance;
      return this;
    }


    /**
    * returns a built Balance instance.
    *
    * The builder is not reusable.
    */
    public Balance build() {
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
  public static Balance.Builder builder() {
    return new Balance.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Balance.Builder toBuilder() {
    return new Balance.Builder()
      .totalBalance(getTotalBalance())
      .availableBalance(getAvailableBalance());
  }


}

