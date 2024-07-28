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

import tech.triviumcapital.clients.java.ApiException;
import tech.triviumcapital.clients.java.model.PaginationResultUserTransaction;
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
 * API tests for TransactionsApi
 */
@Disabled
public class TransactionsApiTest {

    private final TransactionsApi api = new TransactionsApi();

    /**
     * Get list of transactions for all products for user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getApiV1TransactionsUseridTest() throws ApiException {
        UUID userId = null;
        Integer limit = null;
        Integer offset = null;
        UUID transactionId = null;
        PaginationResultUserTransaction response = api.getApiV1TransactionsUserid(userId, limit, offset, transactionId);

        // TODO: test validations
    }
}
