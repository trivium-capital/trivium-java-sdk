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
import java.util.HashMap;
import java.util.Map;
import tech.triviumcapital.clients.java.model.Balance;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Balances
 */
@JsonPropertyOrder({
  Balances.JSON_PROPERTY_BALANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Balances {
  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Map<String, Balance> balance = new HashMap<>();

  public Balances() {
  }

  /**
   * Constructor with all args parameters
   */
  public Balances(@JsonProperty(JSON_PROPERTY_BALANCE) Map<String, Balance> balance) {
    this.balance = balance;
  }

  public Balances balance(Map<String, Balance> balance) {
    
    this.balance = balance;
    return this;
  }

  public Balances putBalanceItem(String key, Balance balanceItem) {
    this.balance.put(key, balanceItem);
    return this;
  }

  /**
   * Get balance
   * @return balance
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, Balance> getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalance(Map<String, Balance> balance) {
    this.balance = balance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balances balances = (Balances) o;
    return Objects.equals(this.balance, balances.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balances {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

    private Balances instance;

    public Builder() {
      this(new Balances());
    }

    protected Builder(Balances instance) {
      this.instance = instance;
    }

    public Balances.Builder balance(Map<String, Balance> balance) {
      this.instance.balance = balance;
      return this;
    }


    /**
    * returns a built Balances instance.
    *
    * The builder is not reusable.
    */
    public Balances build() {
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
  public static Balances.Builder builder() {
    return new Balances.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Balances.Builder toBuilder() {
    return new Balances.Builder()
      .balance(getBalance());
  }


}

