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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateOnboardingDocumentResponse
 */
@JsonPropertyOrder({
  CreateOnboardingDocumentResponse.JSON_PROPERTY_ID,
  CreateOnboardingDocumentResponse.JSON_PROPERTY_UPLOAD_LINK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class CreateOnboardingDocumentResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_UPLOAD_LINK = "uploadLink";
  private String uploadLink;

  public CreateOnboardingDocumentResponse() {
  }

  /**
   * Constructor with all args parameters
   */
  public CreateOnboardingDocumentResponse(@JsonProperty(JSON_PROPERTY_ID) UUID id, @JsonProperty(JSON_PROPERTY_UPLOAD_LINK) String uploadLink) {
    this.id = id;
    this.uploadLink = uploadLink;
  }

  public CreateOnboardingDocumentResponse id(UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }

  public CreateOnboardingDocumentResponse uploadLink(String uploadLink) {
    
    this.uploadLink = uploadLink;
    return this;
  }

  /**
   * To upload document, perform a PUT request to this link with the file as the body.
   * @return uploadLink
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPLOAD_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUploadLink() {
    return uploadLink;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUploadLink(String uploadLink) {
    this.uploadLink = uploadLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOnboardingDocumentResponse createOnboardingDocumentResponse = (CreateOnboardingDocumentResponse) o;
    return Objects.equals(this.id, createOnboardingDocumentResponse.id) &&
        Objects.equals(this.uploadLink, createOnboardingDocumentResponse.uploadLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uploadLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOnboardingDocumentResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uploadLink: ").append(toIndentedString(uploadLink)).append("\n");
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

    private CreateOnboardingDocumentResponse instance;

    public Builder() {
      this(new CreateOnboardingDocumentResponse());
    }

    protected Builder(CreateOnboardingDocumentResponse instance) {
      this.instance = instance;
    }

    public CreateOnboardingDocumentResponse.Builder id(UUID id) {
      this.instance.id = id;
      return this;
    }
    public CreateOnboardingDocumentResponse.Builder uploadLink(String uploadLink) {
      this.instance.uploadLink = uploadLink;
      return this;
    }


    /**
    * returns a built CreateOnboardingDocumentResponse instance.
    *
    * The builder is not reusable.
    */
    public CreateOnboardingDocumentResponse build() {
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
  public static CreateOnboardingDocumentResponse.Builder builder() {
    return new CreateOnboardingDocumentResponse.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public CreateOnboardingDocumentResponse.Builder toBuilder() {
    return new CreateOnboardingDocumentResponse.Builder()
      .id(getId())
      .uploadLink(getUploadLink());
  }


}

