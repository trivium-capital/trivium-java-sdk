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

package tech.triviumcapital.clients.java.api;

import com.fasterxml.jackson.core.type.TypeReference;

import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.BaseApi;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.Pair;

import tech.triviumcapital.clients.java.model.MonthlyStatementMetadata;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class StatementApi extends BaseApi {

  public StatementApi() {
    super(Configuration.getDefaultApiClient());
  }

  public StatementApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * 
   * Returns list of links to monthly statement documents
   * @param userId  (required)
   * @return List&lt;MonthlyStatementMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MonthlyStatementMetadata> getApiV1StatementMonthlyUserid(UUID userId) throws ApiException {
    return this.getApiV1StatementMonthlyUserid(userId, Collections.emptyMap());
  }


  /**
   * 
   * Returns list of links to monthly statement documents
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;MonthlyStatementMetadata&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MonthlyStatementMetadata> getApiV1StatementMonthlyUserid(UUID userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getApiV1StatementMonthlyUserid");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/statement/monthly/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "httpAuth" };

    TypeReference<List<MonthlyStatementMetadata>> localVarReturnType = new TypeReference<List<MonthlyStatementMetadata>>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "httpAuth" };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
