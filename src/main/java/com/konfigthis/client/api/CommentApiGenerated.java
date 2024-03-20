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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CommentCreateNewRequest;
import com.konfigthis.client.model.CommentCreateNewResponse;
import com.konfigthis.client.model.CommentGetListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CommentApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CommentApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CommentApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createNewCall(String notionVersion, CommentCreateNewRequest commentCreateNewRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = commentCreateNewRequest;

        // create path and map variables
        String localVarPath = "/v1/comments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (notionVersion != null) {
            localVarHeaderParams.put("Notion-Version", localVarApiClient.parameterToString(notionVersion));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNewValidateBeforeCall(String notionVersion, CommentCreateNewRequest commentCreateNewRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'notionVersion' is set
        if (notionVersion == null) {
            throw new ApiException("Missing the required parameter 'notionVersion' when calling createNew(Async)");
        }

        return createNewCall(notionVersion, commentCreateNewRequest, _callback);

    }


    private ApiResponse<CommentCreateNewResponse> createNewWithHttpInfo(String notionVersion, CommentCreateNewRequest commentCreateNewRequest) throws ApiException {
        okhttp3.Call localVarCall = createNewValidateBeforeCall(notionVersion, commentCreateNewRequest, null);
        Type localVarReturnType = new TypeToken<CommentCreateNewResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNewAsync(String notionVersion, CommentCreateNewRequest commentCreateNewRequest, final ApiCallback<CommentCreateNewResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewValidateBeforeCall(notionVersion, commentCreateNewRequest, _callback);
        Type localVarReturnType = new TypeToken<CommentCreateNewResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateNewRequestBuilder {
        private final String richText;
        private final String notionVersion;
        private String parent;
        private String discussionId;

        private CreateNewRequestBuilder(String richText, String notionVersion) {
            this.richText = richText;
            this.notionVersion = notionVersion;
        }

        /**
         * Set parent
         * @param parent A [page parent](/reference/database#page-parent). Either this or a discussion_id is required (not both) (optional)
         * @return CreateNewRequestBuilder
         */
        public CreateNewRequestBuilder parent(String parent) {
            this.parent = parent;
            return this;
        }
        
        /**
         * Set discussionId
         * @param discussionId A UUID identifier for a discussion thread. Either this or a parent object is required (not both) (optional)
         * @return CreateNewRequestBuilder
         */
        public CreateNewRequestBuilder discussionId(String discussionId) {
            this.discussionId = discussionId;
            return this;
        }
        
        /**
         * Build call for createNew
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CommentCreateNewRequest commentCreateNewRequest = buildBodyParams();
            return createNewCall(notionVersion, commentCreateNewRequest, _callback);
        }

        private CommentCreateNewRequest buildBodyParams() {
            CommentCreateNewRequest commentCreateNewRequest = new CommentCreateNewRequest();
            commentCreateNewRequest.parent(this.parent);
            commentCreateNewRequest.discussionId(this.discussionId);
            commentCreateNewRequest.richText(this.richText);
            return commentCreateNewRequest;
        }

        /**
         * Execute createNew request
         * @return CommentCreateNewResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public CommentCreateNewResponse execute() throws ApiException {
            CommentCreateNewRequest commentCreateNewRequest = buildBodyParams();
            ApiResponse<CommentCreateNewResponse> localVarResp = createNewWithHttpInfo(notionVersion, commentCreateNewRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createNew request with HTTP info returned
         * @return ApiResponse&lt;CommentCreateNewResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CommentCreateNewResponse> executeWithHttpInfo() throws ApiException {
            CommentCreateNewRequest commentCreateNewRequest = buildBodyParams();
            return createNewWithHttpInfo(notionVersion, commentCreateNewRequest);
        }

        /**
         * Execute createNew request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CommentCreateNewResponse> _callback) throws ApiException {
            CommentCreateNewRequest commentCreateNewRequest = buildBodyParams();
            return createNewAsync(notionVersion, commentCreateNewRequest, _callback);
        }
    }

    /**
     * Create comment
     * Creates a comment in a page or existing discussion thread.
     * @param notionVersion  (required)
     * @return CreateNewRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public CreateNewRequestBuilder createNew(String richText, String notionVersion) throws IllegalArgumentException {
        if (richText == null) throw new IllegalArgumentException("\"richText\" is required but got null");
            

        if (notionVersion == null) throw new IllegalArgumentException("\"notionVersion\" is required but got null");
            

        return new CreateNewRequestBuilder(richText, notionVersion);
    }
    private okhttp3.Call getListCall(String notionVersion, String blockId, String startCursor, Integer pageSize, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/comments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (blockId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("block_id", blockId));
        }

        if (startCursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_cursor", startCursor));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (notionVersion != null) {
            localVarHeaderParams.put("Notion-Version", localVarApiClient.parameterToString(notionVersion));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getListValidateBeforeCall(String notionVersion, String blockId, String startCursor, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'notionVersion' is set
        if (notionVersion == null) {
            throw new ApiException("Missing the required parameter 'notionVersion' when calling getList(Async)");
        }

        // verify the required parameter 'blockId' is set
        if (blockId == null) {
            throw new ApiException("Missing the required parameter 'blockId' when calling getList(Async)");
        }

        return getListCall(notionVersion, blockId, startCursor, pageSize, _callback);

    }


    private ApiResponse<CommentGetListResponse> getListWithHttpInfo(String notionVersion, String blockId, String startCursor, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getListValidateBeforeCall(notionVersion, blockId, startCursor, pageSize, null);
        Type localVarReturnType = new TypeToken<CommentGetListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getListAsync(String notionVersion, String blockId, String startCursor, Integer pageSize, final ApiCallback<CommentGetListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getListValidateBeforeCall(notionVersion, blockId, startCursor, pageSize, _callback);
        Type localVarReturnType = new TypeToken<CommentGetListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetListRequestBuilder {
        private final String notionVersion;
        private final String blockId;
        private String startCursor;
        private Integer pageSize;

        private GetListRequestBuilder(String notionVersion, String blockId) {
            this.notionVersion = notionVersion;
            this.blockId = blockId;
        }

        /**
         * Set startCursor
         * @param startCursor If supplied, this endpoint will return a page of results starting after the cursor provided. If not supplied, this endpoint will return the first page of results. (optional)
         * @return GetListRequestBuilder
         */
        public GetListRequestBuilder startCursor(String startCursor) {
            this.startCursor = startCursor;
            return this;
        }
        
        /**
         * Set pageSize
         * @param pageSize The number of items from the full list desired in the response. Maximum: 100 (optional)
         * @return GetListRequestBuilder
         */
        public GetListRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Build call for getList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getListCall(notionVersion, blockId, startCursor, pageSize, _callback);
        }


        /**
         * Execute getList request
         * @return CommentGetListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public CommentGetListResponse execute() throws ApiException {
            ApiResponse<CommentGetListResponse> localVarResp = getListWithHttpInfo(notionVersion, blockId, startCursor, pageSize);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getList request with HTTP info returned
         * @return ApiResponse&lt;CommentGetListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CommentGetListResponse> executeWithHttpInfo() throws ApiException {
            return getListWithHttpInfo(notionVersion, blockId, startCursor, pageSize);
        }

        /**
         * Execute getList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CommentGetListResponse> _callback) throws ApiException {
            return getListAsync(notionVersion, blockId, startCursor, pageSize, _callback);
        }
    }

    /**
     * Retrieve comments
     * Retrieves a list of un-resolved [Comment objects](ref:comment-object) from a page or block.
     * @param notionVersion  (required)
     * @param blockId Identifier for a Notion block or page (required)
     * @return GetListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetListRequestBuilder getList(String notionVersion, String blockId) throws IllegalArgumentException {
        if (notionVersion == null) throw new IllegalArgumentException("\"notionVersion\" is required but got null");
            

        if (blockId == null) throw new IllegalArgumentException("\"blockId\" is required but got null");
            

        return new GetListRequestBuilder(notionVersion, blockId);
    }
}