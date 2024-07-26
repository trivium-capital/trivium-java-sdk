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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Rates
 */
@JsonPropertyOrder({
  Rates.JSON_PROPERTY_RATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-26T10:02:28.662121+08:00[Asia/Singapore]", comments = "Generator version: 7.7.0")
public class Rates {
  public static final String JSON_PROPERTY_RATES = "rates";
  private Map<String, BigDecimal> rates = new HashMap<>();

  public Rates() {
  }

  /**
   * Constructor with all args parameters
   */
  public Rates(@JsonProperty(JSON_PROPERTY_RATES) Map<String, BigDecimal> rates) {
    this.rates = rates;
  }

  public Rates rates(Map<String, BigDecimal> rates) {
    
    this.rates = rates;
    return this;
  }

  public Rates putRatesItem(String key, BigDecimal ratesItem) {
    this.rates.put(key, ratesItem);
    return this;
  }

  /**
   * Get rates
   * @return rates
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, BigDecimal> getRates() {
    return rates;
  }


  @JsonProperty(JSON_PROPERTY_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRates(Map<String, BigDecimal> rates) {
    this.rates = rates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rates rates = (Rates) o;
    return Objects.equals(this.rates, rates.rates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rates {\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
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

    private Rates instance;

    public Builder() {
      this(new Rates());
    }

    protected Builder(Rates instance) {
      this.instance = instance;
    }

    public Rates.Builder rates(Map<String, BigDecimal> rates) {
      this.instance.rates = rates;
      return this;
    }


    /**
    * returns a built Rates instance.
    *
    * The builder is not reusable.
    */
    public Rates build() {
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
  public static Rates.Builder builder() {
    return new Rates.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Rates.Builder toBuilder() {
    return new Rates.Builder()
      .rates(getRates());
  }


}

