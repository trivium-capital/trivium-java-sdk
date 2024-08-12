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

package tech.triviumcapital.clients.java.api;

import com.fasterxml.jackson.core.type.TypeReference;

import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.BaseApi;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.Pair;

import tech.triviumcapital.clients.java.model.FixedDepositPlacement;
import tech.triviumcapital.clients.java.model.ProcessFixedDepositPlacementRequest;
import java.util.UUID;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class FixedDepositApi extends BaseApi {

  public FixedDepositApi() {
    super(Configuration.getDefaultApiClient());
  }

  public FixedDepositApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * 
   * Get fixed deposit placement
   * @param placementId  (required)
   * @return FixedDepositPlacement
   * @throws ApiException if fails to make API call
   */
  public FixedDepositPlacement getApiV1FixeddepositPlacementPlacementid(UUID placementId) throws ApiException {
    return this.getApiV1FixeddepositPlacementPlacementid(placementId, Collections.emptyMap());
  }


  /**
   * 
   * Get fixed deposit placement
   * @param placementId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return FixedDepositPlacement
   * @throws ApiException if fails to make API call
   */
  public FixedDepositPlacement getApiV1FixeddepositPlacementPlacementid(UUID placementId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'placementId' is set
    if (placementId == null) {
      throw new ApiException(400, "Missing the required parameter 'placementId' when calling getApiV1FixeddepositPlacementPlacementid");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/fixedDeposit/placement/{placementId}"
      .replaceAll("\\{" + "placementId" + "\\}", apiClient.escapeString(placementId.toString()));

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

    TypeReference<FixedDepositPlacement> localVarReturnType = new TypeReference<FixedDepositPlacement>() {};
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

  /**
   * 
   * Get fixed deposit placement
   * @param userId  (required)
   * @return List&lt;FixedDepositPlacement&gt;
   * @throws ApiException if fails to make API call
   */
  public List<FixedDepositPlacement> getApiV1FixeddepositUserUserid(UUID userId) throws ApiException {
    return this.getApiV1FixeddepositUserUserid(userId, Collections.emptyMap());
  }


  /**
   * 
   * Get fixed deposit placement
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;FixedDepositPlacement&gt;
   * @throws ApiException if fails to make API call
   */
  public List<FixedDepositPlacement> getApiV1FixeddepositUserUserid(UUID userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getApiV1FixeddepositUserUserid");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/fixedDeposit/user/{userId}"
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

    TypeReference<List<FixedDepositPlacement>> localVarReturnType = new TypeReference<List<FixedDepositPlacement>>() {};
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

  /**
   * 
   * Start processing fixed deposit placement
   * @param placementId  (required)
   * @param processFixedDepositPlacementRequest  (required)
   * @throws ApiException if fails to make API call
   */
  public void putApiV1FixeddepositPlacementPlacementid(UUID placementId, ProcessFixedDepositPlacementRequest processFixedDepositPlacementRequest) throws ApiException {
    this.putApiV1FixeddepositPlacementPlacementid(placementId, processFixedDepositPlacementRequest, Collections.emptyMap());
  }


  /**
   * 
   * Start processing fixed deposit placement
   * @param placementId  (required)
   * @param processFixedDepositPlacementRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void putApiV1FixeddepositPlacementPlacementid(UUID placementId, ProcessFixedDepositPlacementRequest processFixedDepositPlacementRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = processFixedDepositPlacementRequest;
    
    // verify the required parameter 'placementId' is set
    if (placementId == null) {
      throw new ApiException(400, "Missing the required parameter 'placementId' when calling putApiV1FixeddepositPlacementPlacementid");
    }
    
    // verify the required parameter 'processFixedDepositPlacementRequest' is set
    if (processFixedDepositPlacementRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'processFixedDepositPlacementRequest' when calling putApiV1FixeddepositPlacementPlacementid");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/fixedDeposit/placement/{placementId}"
      .replaceAll("\\{" + "placementId" + "\\}", apiClient.escapeString(placementId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "httpAuth" };

    apiClient.invokeAPI(
        localVarPath,
        "PUT",
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
        null
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
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
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
