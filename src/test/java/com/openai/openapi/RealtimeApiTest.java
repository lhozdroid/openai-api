/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openai.openapi;

import com.openai.ApiException;
import com.openai.openapi.model.RealtimeSessionCreateRequest;
import com.openai.openapi.model.RealtimeSessionCreateResponse;
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
 * API tests for RealtimeApi
 */
@Disabled
public class RealtimeApiTest {

    private final RealtimeApi api = new RealtimeApi();

    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRealtimeSessionTest() throws ApiException {
        RealtimeSessionCreateRequest realtimeSessionCreateRequest = null;
        RealtimeSessionCreateResponse response = api.createRealtimeSession(realtimeSessionCreateRequest);

        // TODO: test validations
    }
}
