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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets OnboardingDocumentType
 */
public enum OnboardingDocumentType {
  
  OTHER("OTHER"),
  
  PROOF_OF_ADDRESS("PROOF_OF_ADDRESS"),
  
  PROOF_OF_COMPANY_REGISTRATION("PROOF_OF_COMPANY_REGISTRATION"),
  
  PROOF_OF_IDENTITY("PROOF_OF_IDENTITY"),
  
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private String value;

  OnboardingDocumentType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OnboardingDocumentType fromValue(String value) {
    for (OnboardingDocumentType b : OnboardingDocumentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }
}

