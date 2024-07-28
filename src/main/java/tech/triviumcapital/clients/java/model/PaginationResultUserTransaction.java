/*
 * trivium-cash
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.1
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
import tech.triviumcapital.clients.java.model.UserTransaction;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaginationResultUserTransaction
 */
@JsonPropertyOrder({
  PaginationResultUserTransaction.JSON_PROPERTY_RESULTS,
  PaginationResultUserTransaction.JSON_PROPERTY_TOTAL_COUNT,
  PaginationResultUserTransaction.JSON_PROPERTY_HAS_NEXT_PAGE
})
@JsonTypeName("PaginationResult_UserTransaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class PaginationResultUserTransaction {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<UserTransaction> results = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_HAS_NEXT_PAGE = "hasNextPage";
  private Boolean hasNextPage;

  public PaginationResultUserTransaction() {
  }

  /**
   * Constructor with all args parameters
   */
  public PaginationResultUserTransaction(@JsonProperty(JSON_PROPERTY_RESULTS) List<UserTransaction> results, @JsonProperty(JSON_PROPERTY_TOTAL_COUNT) Integer totalCount, @JsonProperty(JSON_PROPERTY_HAS_NEXT_PAGE) Boolean hasNextPage) {
    this.results = results;
    this.totalCount = totalCount;
    this.hasNextPage = hasNextPage;
  }

  public PaginationResultUserTransaction results(List<UserTransaction> results) {
    
    this.results = results;
    return this;
  }

  public PaginationResultUserTransaction addResultsItem(UserTransaction resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UserTransaction> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<UserTransaction> results) {
    this.results = results;
  }

  public PaginationResultUserTransaction totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public PaginationResultUserTransaction hasNextPage(Boolean hasNextPage) {
    
    this.hasNextPage = hasNextPage;
    return this;
  }

  /**
   * Get hasNextPage
   * @return hasNextPage
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HAS_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean isHasNextPage() {
    return hasNextPage;
  }


  @JsonProperty(JSON_PROPERTY_HAS_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationResultUserTransaction paginationResultUserTransaction = (PaginationResultUserTransaction) o;
    return Objects.equals(this.results, paginationResultUserTransaction.results) &&
        Objects.equals(this.totalCount, paginationResultUserTransaction.totalCount) &&
        Objects.equals(this.hasNextPage, paginationResultUserTransaction.hasNextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalCount, hasNextPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationResultUserTransaction {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
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

    private PaginationResultUserTransaction instance;

    public Builder() {
      this(new PaginationResultUserTransaction());
    }

    protected Builder(PaginationResultUserTransaction instance) {
      this.instance = instance;
    }

    public PaginationResultUserTransaction.Builder results(List<UserTransaction> results) {
      this.instance.results = results;
      return this;
    }
    public PaginationResultUserTransaction.Builder totalCount(Integer totalCount) {
      this.instance.totalCount = totalCount;
      return this;
    }
    public PaginationResultUserTransaction.Builder hasNextPage(Boolean hasNextPage) {
      this.instance.hasNextPage = hasNextPage;
      return this;
    }


    /**
    * returns a built PaginationResultUserTransaction instance.
    *
    * The builder is not reusable.
    */
    public PaginationResultUserTransaction build() {
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
  public static PaginationResultUserTransaction.Builder builder() {
    return new PaginationResultUserTransaction.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public PaginationResultUserTransaction.Builder toBuilder() {
    return new PaginationResultUserTransaction.Builder()
      .results(getResults())
      .totalCount(getTotalCount())
      .hasNextPage(isHasNextPage());
  }


}

