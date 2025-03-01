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
import com.openai.openapi.model.Invite;
import com.openai.openapi.model.InviteDeleteResponse;
import com.openai.openapi.model.InviteListResponse;
import com.openai.openapi.model.InviteRequest;
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
 * API tests for InvitesApi
 */
@Disabled
public class InvitesApiTest {

    private final InvitesApi api = new InvitesApi();

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInviteTest() throws ApiException {
        String inviteId = null;
        InviteDeleteResponse response = api.deleteInvite(inviteId);

        // TODO: test validations
    }
    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inviteUserTest() throws ApiException {
        InviteRequest inviteRequest = null;
        Invite response = api.inviteUser(inviteRequest);

        // TODO: test validations
    }
    /**
     * Returns a list of invites in the organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInvitesTest() throws ApiException {
        Integer limit = null;
        String after = null;
        InviteListResponse response = api.listInvites(limit, after);

        // TODO: test validations
    }
    /**
     * Retrieves an invite.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveInviteTest() throws ApiException {
        String inviteId = null;
        Invite response = api.retrieveInvite(inviteId);

        // TODO: test validations
    }
}
