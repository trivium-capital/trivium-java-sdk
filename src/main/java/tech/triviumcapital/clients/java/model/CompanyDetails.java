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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CompanyDetails
 */
@JsonPropertyOrder({
  CompanyDetails.JSON_PROPERTY_TAX_ID,
  CompanyDetails.JSON_PROPERTY_COMPANY_NAME,
  CompanyDetails.JSON_PROPERTY_EMAIL,
  CompanyDetails.JSON_PROPERTY_FULL_NAME,
  CompanyDetails.JSON_PROPERTY_PREFERRED_NAME,
  CompanyDetails.JSON_PROPERTY_COUNTRY_OF_INCORPORATION,
  CompanyDetails.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class CompanyDetails implements UserDetails {
  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private String taxId;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_PREFERRED_NAME = "preferredName";
  private String preferredName;

  public static final String JSON_PROPERTY_COUNTRY_OF_INCORPORATION = "countryOfIncorporation";
  private String countryOfIncorporation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public CompanyDetails() {
  }

  /**
   * Constructor with all args parameters
   */
  public CompanyDetails(@JsonProperty(JSON_PROPERTY_TAX_ID) String taxId, @JsonProperty(JSON_PROPERTY_COMPANY_NAME) String companyName, @JsonProperty(JSON_PROPERTY_EMAIL) String email, @JsonProperty(JSON_PROPERTY_FULL_NAME) String fullName, @JsonProperty(JSON_PROPERTY_PREFERRED_NAME) String preferredName, @JsonProperty(JSON_PROPERTY_COUNTRY_OF_INCORPORATION) String countryOfIncorporation, @JsonProperty(JSON_PROPERTY_TYPE) String type) {
    this.taxId = taxId;
    this.companyName = companyName;
    this.email = email;
    this.fullName = fullName;
    this.preferredName = preferredName;
    this.countryOfIncorporation = countryOfIncorporation;
    this.type = type;
  }

  public CompanyDetails taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

  /**
   * Get taxId
   * @return taxId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTaxId() {
    return taxId;
  }


  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public CompanyDetails companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CompanyDetails email(String email) {
    
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }

  public CompanyDetails fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

  /**
   * Name of Authorised Person
   * @return fullName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CompanyDetails preferredName(String preferredName) {
    
    this.preferredName = preferredName;
    return this;
  }

  /**
   * Get preferredName
   * @return preferredName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PREFERRED_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPreferredName() {
    return preferredName;
  }


  @JsonProperty(JSON_PROPERTY_PREFERRED_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  public CompanyDetails countryOfIncorporation(String countryOfIncorporation) {
    
    this.countryOfIncorporation = countryOfIncorporation;
    return this;
  }

  /**
   * Get countryOfIncorporation
   * @return countryOfIncorporation
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryOfIncorporation() {
    return countryOfIncorporation;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryOfIncorporation(String countryOfIncorporation) {
    this.countryOfIncorporation = countryOfIncorporation;
  }

  public CompanyDetails type(String type) {
    
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
    CompanyDetails companyDetails = (CompanyDetails) o;
    return Objects.equals(this.taxId, companyDetails.taxId) &&
        Objects.equals(this.companyName, companyDetails.companyName) &&
        Objects.equals(this.email, companyDetails.email) &&
        Objects.equals(this.fullName, companyDetails.fullName) &&
        Objects.equals(this.preferredName, companyDetails.preferredName) &&
        Objects.equals(this.countryOfIncorporation, companyDetails.countryOfIncorporation) &&
        Objects.equals(this.type, companyDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxId, companyName, email, fullName, preferredName, countryOfIncorporation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyDetails {\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    countryOfIncorporation: ").append(toIndentedString(countryOfIncorporation)).append("\n");
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

    private CompanyDetails instance;

    public Builder() {
      this(new CompanyDetails());
    }

    protected Builder(CompanyDetails instance) {
      this.instance = instance;
    }

    public CompanyDetails.Builder taxId(String taxId) {
      this.instance.taxId = taxId;
      return this;
    }
    public CompanyDetails.Builder companyName(String companyName) {
      this.instance.companyName = companyName;
      return this;
    }
    public CompanyDetails.Builder email(String email) {
      this.instance.email = email;
      return this;
    }
    public CompanyDetails.Builder fullName(String fullName) {
      this.instance.fullName = fullName;
      return this;
    }
    public CompanyDetails.Builder preferredName(String preferredName) {
      this.instance.preferredName = preferredName;
      return this;
    }
    public CompanyDetails.Builder countryOfIncorporation(String countryOfIncorporation) {
      this.instance.countryOfIncorporation = countryOfIncorporation;
      return this;
    }
    public CompanyDetails.Builder type(String type) {
      this.instance.type = type;
      return this;
    }


    /**
    * returns a built CompanyDetails instance.
    *
    * The builder is not reusable.
    */
    public CompanyDetails build() {
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
  public static CompanyDetails.Builder builder() {
    return new CompanyDetails.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public CompanyDetails.Builder toBuilder() {
    return new CompanyDetails.Builder()
      .taxId(getTaxId())
      .companyName(getCompanyName())
      .email(getEmail())
      .fullName(getFullName())
      .preferredName(getPreferredName())
      .countryOfIncorporation(getCountryOfIncorporation())
      .type(getType());
  }


}

