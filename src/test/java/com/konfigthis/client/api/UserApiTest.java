/*
 * Notion API
 * Notion is a new tool that blends your everyday work apps into one. It's the all-in-one workspace for you and your team.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.UserGetTokenBotUserResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Disabled
public class UserApiTest {

    private static UserApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UserApi(apiClient);
    }

    /**
     * Retrieve your token&#39;s bot user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTokenBotUserTest() throws ApiException {
        String notionVersion = null;
        UserGetTokenBotUserResponse response = api.getTokenBotUser(notionVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a user
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByIdTest() throws ApiException {
        String userId = null;
        String notionVersion = null;
        String response = api.getUserById(userId, notionVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * List all users
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllUsersTest() throws ApiException {
        String notionVersion = null;
        String startCursor = null;
        Integer pageSize = null;
        String response = api.listAllUsers(notionVersion)
                .startCursor(startCursor)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

}
