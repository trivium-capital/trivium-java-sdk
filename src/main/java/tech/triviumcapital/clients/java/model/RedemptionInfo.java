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
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RedemptionInfo
 */
@JsonPropertyOrder({
  RedemptionInfo.JSON_PROPERTY_REDEMPTION_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-26T10:02:28.662121+08:00[Asia/Singapore]", comments = "Generator version: 7.7.0")
public class RedemptionInfo {
  public static final String JSON_PROPERTY_REDEMPTION_DATE = "redemptionDate";
  private LocalDate redemptionDate;

  public RedemptionInfo() {
  }

  /**
   * Constructor with all args parameters
   */
  public RedemptionInfo(@JsonProperty(JSON_PROPERTY_REDEMPTION_DATE) LocalDate redemptionDate) {
    this.redemptionDate = redemptionDate;
  }

  public RedemptionInfo redemptionDate(LocalDate redemptionDate) {
    
    this.redemptionDate = redemptionDate;
    return this;
  }

  /**
   * Get redemptionDate
   * @return redemptionDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REDEMPTION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getRedemptionDate() {
    return redemptionDate;
  }


  @JsonProperty(JSON_PROPERTY_REDEMPTION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedemptionDate(LocalDate redemptionDate) {
    this.redemptionDate = redemptionDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionInfo redemptionInfo = (RedemptionInfo) o;
    return Objects.equals(this.redemptionDate, redemptionInfo.redemptionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redemptionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionInfo {\n");
    sb.append("    redemptionDate: ").append(toIndentedString(redemptionDate)).append("\n");
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

    private RedemptionInfo instance;

    public Builder() {
      this(new RedemptionInfo());
    }

    protected Builder(RedemptionInfo instance) {
      this.instance = instance;
    }

    public RedemptionInfo.Builder redemptionDate(LocalDate redemptionDate) {
      this.instance.redemptionDate = redemptionDate;
      return this;
    }


    /**
    * returns a built RedemptionInfo instance.
    *
    * The builder is not reusable.
    */
    public RedemptionInfo build() {
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
  public static RedemptionInfo.Builder builder() {
    return new RedemptionInfo.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public RedemptionInfo.Builder toBuilder() {
    return new RedemptionInfo.Builder()
      .redemptionDate(getRedemptionDate());
  }


}

