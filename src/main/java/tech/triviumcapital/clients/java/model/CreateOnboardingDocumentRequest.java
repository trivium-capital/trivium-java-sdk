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
import tech.triviumcapital.clients.java.model.OnboardingDocumentType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateOnboardingDocumentRequest
 */
@JsonPropertyOrder({
  CreateOnboardingDocumentRequest.JSON_PROPERTY_TAX_ID,
  CreateOnboardingDocumentRequest.JSON_PROPERTY_DOCUMENT_TYPE,
  CreateOnboardingDocumentRequest.JSON_PROPERTY_DOCUMENT_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CreateOnboardingDocumentRequest {
  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private String taxId;

  public static final String JSON_PROPERTY_DOCUMENT_TYPE = "documentType";
  private OnboardingDocumentType documentType;

  public static final String JSON_PROPERTY_DOCUMENT_NAME = "documentName";
  private String documentName;

  public CreateOnboardingDocumentRequest() {
  }

  /**
   * Constructor with all args parameters
   */
  public CreateOnboardingDocumentRequest(@JsonProperty(JSON_PROPERTY_TAX_ID) String taxId, @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE) OnboardingDocumentType documentType, @JsonProperty(JSON_PROPERTY_DOCUMENT_NAME) String documentName) {
    this.taxId = taxId;
    this.documentType = documentType;
    this.documentName = documentName;
  }

  public CreateOnboardingDocumentRequest taxId(String taxId) {
    
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

  public CreateOnboardingDocumentRequest documentType(OnboardingDocumentType documentType) {
    
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OnboardingDocumentType getDocumentType() {
    return documentType;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentType(OnboardingDocumentType documentType) {
    this.documentType = documentType;
  }

  public CreateOnboardingDocumentRequest documentName(String documentName) {
    
    this.documentName = documentName;
    return this;
  }

  /**
   * Get documentName
   * @return documentName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOCUMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDocumentName() {
    return documentName;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOnboardingDocumentRequest createOnboardingDocumentRequest = (CreateOnboardingDocumentRequest) o;
    return Objects.equals(this.taxId, createOnboardingDocumentRequest.taxId) &&
        Objects.equals(this.documentType, createOnboardingDocumentRequest.documentType) &&
        Objects.equals(this.documentName, createOnboardingDocumentRequest.documentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxId, documentType, documentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOnboardingDocumentRequest {\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
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

    private CreateOnboardingDocumentRequest instance;

    public Builder() {
      this(new CreateOnboardingDocumentRequest());
    }

    protected Builder(CreateOnboardingDocumentRequest instance) {
      this.instance = instance;
    }

    public CreateOnboardingDocumentRequest.Builder taxId(String taxId) {
      this.instance.taxId = taxId;
      return this;
    }
    public CreateOnboardingDocumentRequest.Builder documentType(OnboardingDocumentType documentType) {
      this.instance.documentType = documentType;
      return this;
    }
    public CreateOnboardingDocumentRequest.Builder documentName(String documentName) {
      this.instance.documentName = documentName;
      return this;
    }


    /**
    * returns a built CreateOnboardingDocumentRequest instance.
    *
    * The builder is not reusable.
    */
    public CreateOnboardingDocumentRequest build() {
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
  public static CreateOnboardingDocumentRequest.Builder builder() {
    return new CreateOnboardingDocumentRequest.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public CreateOnboardingDocumentRequest.Builder toBuilder() {
    return new CreateOnboardingDocumentRequest.Builder()
      .taxId(getTaxId())
      .documentType(getDocumentType())
      .documentName(getDocumentName());
  }


}

