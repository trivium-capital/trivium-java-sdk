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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CashAccountActivated
 */
@JsonPropertyOrder({
  CashAccountActivated.JSON_PROPERTY_ACCOUNT_ID,
  CashAccountActivated.JSON_PROPERTY_USER_ID,
  CashAccountActivated.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CashAccountActivated implements CashCallbackEvent {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private UUID accountId;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private UUID userId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public CashAccountActivated() {
  }

  /**
   * Constructor with all args parameters
   */
  public CashAccountActivated(@JsonProperty(JSON_PROPERTY_ACCOUNT_ID) UUID accountId, @JsonProperty(JSON_PROPERTY_USER_ID) UUID userId, @JsonProperty(JSON_PROPERTY_TYPE) String type) {
    this.accountId = accountId;
    this.userId = userId;
    this.type = type;
  }

  public CashAccountActivated accountId(UUID accountId) {
    
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

  public CashAccountActivated userId(UUID userId) {
    
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

  public CashAccountActivated type(String type) {
    
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
    CashAccountActivated cashAccountActivated = (CashAccountActivated) o;
    return Objects.equals(this.accountId, cashAccountActivated.accountId) &&
        Objects.equals(this.userId, cashAccountActivated.userId) &&
        Objects.equals(this.type, cashAccountActivated.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, userId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashAccountActivated {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

    private CashAccountActivated instance;

    public Builder() {
      this(new CashAccountActivated());
    }

    protected Builder(CashAccountActivated instance) {
      this.instance = instance;
    }

    public CashAccountActivated.Builder accountId(UUID accountId) {
      this.instance.accountId = accountId;
      return this;
    }
    public CashAccountActivated.Builder userId(UUID userId) {
      this.instance.userId = userId;
      return this;
    }
    public CashAccountActivated.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    /**
    * returns a built CashAccountActivated instance.
    *
    * The builder is not reusable.
    */
    public CashAccountActivated build() {
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
  public static CashAccountActivated.Builder builder() {
    return new CashAccountActivated.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public CashAccountActivated.Builder toBuilder() {
    return new CashAccountActivated.Builder()
      .accountId(getAccountId())
      .userId(getUserId())
      .type(getType());
  }


}

