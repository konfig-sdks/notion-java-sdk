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
import com.konfigthis.client.model.BlockAppendChildrenRequest;
import com.konfigthis.client.model.BlockAppendChildrenResponse;
import com.konfigthis.client.model.BlockGetChildrenResponse;
import com.konfigthis.client.model.BlockGetDetailsResponse;
import com.konfigthis.client.model.BlockRemoveBlockByIdResponse;
import com.konfigthis.client.model.BlockUpdateBlockByIdRequest;
import com.konfigthis.client.model.BlockUpdateBlockByIdResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlockApi
 */
@Disabled
public class BlockApiTest {

    private static BlockApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BlockApi(apiClient);
    }

    /**
     * Append block children
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appendChildrenTest() throws ApiException {
        List children = null;
        String blockId = null;
        String notionVersion = null;
        String after = null;
        BlockAppendChildrenResponse response = api.appendChildren(children, blockId, notionVersion)
                .after(after)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve block children
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getChildrenTest() throws ApiException {
        String blockId = null;
        String notionVersion = null;
        String startCursor = null;
        Integer pageSize = null;
        BlockGetChildrenResponse response = api.getChildren(blockId, notionVersion)
                .startCursor(startCursor)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a block
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String blockId = null;
        String notionVersion = null;
        BlockGetDetailsResponse response = api.getDetails(blockId)
                .notionVersion(notionVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a block
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeBlockByIdTest() throws ApiException {
        String blockId = null;
        String notionVersion = null;
        BlockRemoveBlockByIdResponse response = api.removeBlockById(blockId)
                .notionVersion(notionVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a block
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBlockByIdTest() throws ApiException {
        String blockId = null;
        Object leftCurlyBracketTypeRightCurlyBracket = null;
        Boolean archived = null;
        String notionVersion = null;
        BlockUpdateBlockByIdResponse response = api.updateBlockById(blockId)
                .leftCurlyBracketTypeRightCurlyBracket(leftCurlyBracketTypeRightCurlyBracket)
                .archived(archived)
                .notionVersion(notionVersion)
                .execute();
        // TODO: test validations
    }

}