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

import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.model.MonthlyStatementMetadata;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatementApi
 */
@Disabled
public class StatementApiTest {

    private final StatementApi api = new StatementApi();

    /**
     * Returns list of links to monthly statement documents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApiV1StatementMonthlyUseridTest() throws ApiException {
        UUID userId = null;
        List<MonthlyStatementMetadata> response = api.getApiV1StatementMonthlyUserid(userId);

        // TODO: test validations
    }
}
