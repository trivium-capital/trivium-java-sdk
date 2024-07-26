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

package tech.triviumcapital.clients.java.api;

import com.fasterxml.jackson.core.type.TypeReference;

import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.ApiClient;
import tech.triviumcapital.clients.java.BaseApi;
import tech.triviumcapital.clients.java.Configuration;
import tech.triviumcapital.clients.java.Pair;

import java.util.UUID;
import tech.triviumcapital.clients.java.model.User;
import tech.triviumcapital.clients.java.model.UserDetails;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-26T10:02:28.662121+08:00[Asia/Singapore]", comments = "Generator version: 7.7.0")
public class UserApi extends BaseApi {

  public UserApi() {
    super(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * 
   * Returns user that has zero or more accounts
   * @param userId  (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getApiV1UserUserid(UUID userId) throws ApiException {
    return this.getApiV1UserUserid(userId, Collections.emptyMap());
  }


  /**
   * 
   * Returns user that has zero or more accounts
   * @param userId  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getApiV1UserUserid(UUID userId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getApiV1UserUserid");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user/{userId}"
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

    TypeReference<User> localVarReturnType = new TypeReference<User>() {};
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
   * Create new user
   * @param userDetails  (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User postApiV1User(UserDetails userDetails) throws ApiException {
    return this.postApiV1User(userDetails, Collections.emptyMap());
  }


  /**
   * 
   * Create new user
   * @param userDetails  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User postApiV1User(UserDetails userDetails, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = userDetails;
    
    // verify the required parameter 'userDetails' is set
    if (userDetails == null) {
      throw new ApiException(400, "Missing the required parameter 'userDetails' when calling postApiV1User");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "httpAuth" };

    TypeReference<User> localVarReturnType = new TypeReference<User>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
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
