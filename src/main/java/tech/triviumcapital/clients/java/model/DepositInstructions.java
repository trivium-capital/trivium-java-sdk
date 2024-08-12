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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tech.triviumcapital.clients.java.model.InternationalTransfer;
import tech.triviumcapital.clients.java.model.LocalTransfer;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DepositInstructions
 */
@JsonPropertyOrder({
  DepositInstructions.JSON_PROPERTY_LOCAL,
  DepositInstructions.JSON_PROPERTY_GLOBAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class DepositInstructions {
  public static final String JSON_PROPERTY_LOCAL = "local";
  private List<LocalTransfer> local = new ArrayList<>();

  public static final String JSON_PROPERTY_GLOBAL = "global";
  private List<InternationalTransfer> global = new ArrayList<>();

  public DepositInstructions() {
  }

  /**
   * Constructor with all args parameters
   */
  public DepositInstructions(@JsonProperty(JSON_PROPERTY_LOCAL) List<LocalTransfer> local, @JsonProperty(JSON_PROPERTY_GLOBAL) List<InternationalTransfer> global) {
    this.local = local;
    this.global = global;
  }

  public DepositInstructions local(List<LocalTransfer> local) {
    
    this.local = local;
    return this;
  }

  public DepositInstructions addLocalItem(LocalTransfer localItem) {
    if (this.local == null) {
      this.local = new ArrayList<>();
    }
    this.local.add(localItem);
    return this;
  }

  /**
   * Get local
   * @return local
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LocalTransfer> getLocal() {
    return local;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocal(List<LocalTransfer> local) {
    this.local = local;
  }

  public DepositInstructions global(List<InternationalTransfer> global) {
    
    this.global = global;
    return this;
  }

  public DepositInstructions addGlobalItem(InternationalTransfer globalItem) {
    if (this.global == null) {
      this.global = new ArrayList<>();
    }
    this.global.add(globalItem);
    return this;
  }

  /**
   * Get global
   * @return global
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InternationalTransfer> getGlobal() {
    return global;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobal(List<InternationalTransfer> global) {
    this.global = global;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositInstructions depositInstructions = (DepositInstructions) o;
    return Objects.equals(this.local, depositInstructions.local) &&
        Objects.equals(this.global, depositInstructions.global);
  }

  @Override
  public int hashCode() {
    return Objects.hash(local, global);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositInstructions {\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
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

    private DepositInstructions instance;

    public Builder() {
      this(new DepositInstructions());
    }

    protected Builder(DepositInstructions instance) {
      this.instance = instance;
    }

    public DepositInstructions.Builder local(List<LocalTransfer> local) {
      this.instance.local = local;
      return this;
    }
    public DepositInstructions.Builder global(List<InternationalTransfer> global) {
      this.instance.global = global;
      return this;
    }


    /**
    * returns a built DepositInstructions instance.
    *
    * The builder is not reusable.
    */
    public DepositInstructions build() {
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
  public static DepositInstructions.Builder builder() {
    return new DepositInstructions.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public DepositInstructions.Builder toBuilder() {
    return new DepositInstructions.Builder()
      .local(getLocal())
      .global(getGlobal());
  }


}

