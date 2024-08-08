/*
 * trivium-cash
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.2
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
import tech.triviumcapital.clients.java.model.TransferDetails;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Transfer
 */
@JsonPropertyOrder({
  Transfer.JSON_PROPERTY_FROM,
  Transfer.JSON_PROPERTY_TO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Transfer {
  public static final String JSON_PROPERTY_FROM = "from";
  private TransferDetails from;

  public static final String JSON_PROPERTY_TO = "to";
  private TransferDetails to;

  public Transfer() {
  }

  /**
   * Constructor with all args parameters
   */
  public Transfer(@JsonProperty(JSON_PROPERTY_FROM) TransferDetails from, @JsonProperty(JSON_PROPERTY_TO) TransferDetails to) {
    this.from = from;
    this.to = to;
  }

  public Transfer from(TransferDetails from) {
    
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TransferDetails getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrom(TransferDetails from) {
    this.from = from;
  }

  public Transfer to(TransferDetails to) {
    
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TransferDetails getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTo(TransferDetails to) {
    this.to = to;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transfer transfer = (Transfer) o;
    return Objects.equals(this.from, transfer.from) &&
        Objects.equals(this.to, transfer.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

    private Transfer instance;

    public Builder() {
      this(new Transfer());
    }

    protected Builder(Transfer instance) {
      this.instance = instance;
    }

    public Transfer.Builder from(TransferDetails from) {
      this.instance.from = from;
      return this;
    }
    public Transfer.Builder to(TransferDetails to) {
      this.instance.to = to;
      return this;
    }


    /**
    * returns a built Transfer instance.
    *
    * The builder is not reusable.
    */
    public Transfer build() {
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
  public static Transfer.Builder builder() {
    return new Transfer.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Transfer.Builder toBuilder() {
    return new Transfer.Builder()
      .from(getFrom())
      .to(getTo());
  }


}

