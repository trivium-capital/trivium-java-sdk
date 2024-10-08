/*
 * trivium-cash
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.6
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
 * EarningsToDate
 */
@JsonPropertyOrder({
  EarningsToDate.JSON_PROPERTY_EARNINGS,
  EarningsToDate.JSON_PROPERTY_TIME_WEIGHTED_RETURN_DECIMAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class EarningsToDate {
  public static final String JSON_PROPERTY_EARNINGS = "earnings";
  private BigDecimal earnings;

  public static final String JSON_PROPERTY_TIME_WEIGHTED_RETURN_DECIMAL = "timeWeightedReturnDecimal";
  private BigDecimal timeWeightedReturnDecimal;

  public EarningsToDate() {
  }

  /**
   * Constructor with all args parameters
   */
  public EarningsToDate(@JsonProperty(JSON_PROPERTY_EARNINGS) BigDecimal earnings, @JsonProperty(JSON_PROPERTY_TIME_WEIGHTED_RETURN_DECIMAL) BigDecimal timeWeightedReturnDecimal) {
    this.earnings = earnings;
    this.timeWeightedReturnDecimal = timeWeightedReturnDecimal;
  }

  public EarningsToDate earnings(BigDecimal earnings) {
    
    this.earnings = earnings;
    return this;
  }

  /**
   * Get earnings
   * @return earnings
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getEarnings() {
    return earnings;
  }


  @JsonProperty(JSON_PROPERTY_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEarnings(BigDecimal earnings) {
    this.earnings = earnings;
  }

  public EarningsToDate timeWeightedReturnDecimal(BigDecimal timeWeightedReturnDecimal) {
    
    this.timeWeightedReturnDecimal = timeWeightedReturnDecimal;
    return this;
  }

  /**
   * Get timeWeightedReturnDecimal
   * @return timeWeightedReturnDecimal
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIME_WEIGHTED_RETURN_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getTimeWeightedReturnDecimal() {
    return timeWeightedReturnDecimal;
  }


  @JsonProperty(JSON_PROPERTY_TIME_WEIGHTED_RETURN_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeWeightedReturnDecimal(BigDecimal timeWeightedReturnDecimal) {
    this.timeWeightedReturnDecimal = timeWeightedReturnDecimal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsToDate earningsToDate = (EarningsToDate) o;
    return Objects.equals(this.earnings, earningsToDate.earnings) &&
        Objects.equals(this.timeWeightedReturnDecimal, earningsToDate.timeWeightedReturnDecimal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earnings, timeWeightedReturnDecimal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsToDate {\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    timeWeightedReturnDecimal: ").append(toIndentedString(timeWeightedReturnDecimal)).append("\n");
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

    private EarningsToDate instance;

    public Builder() {
      this(new EarningsToDate());
    }

    protected Builder(EarningsToDate instance) {
      this.instance = instance;
    }

    public EarningsToDate.Builder earnings(BigDecimal earnings) {
      this.instance.earnings = earnings;
      return this;
    }
    public EarningsToDate.Builder timeWeightedReturnDecimal(BigDecimal timeWeightedReturnDecimal) {
      this.instance.timeWeightedReturnDecimal = timeWeightedReturnDecimal;
      return this;
    }


    /**
    * returns a built EarningsToDate instance.
    *
    * The builder is not reusable.
    */
    public EarningsToDate build() {
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
  public static EarningsToDate.Builder builder() {
    return new EarningsToDate.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public EarningsToDate.Builder toBuilder() {
    return new EarningsToDate.Builder()
      .earnings(getEarnings())
      .timeWeightedReturnDecimal(getTimeWeightedReturnDecimal());
  }


}

