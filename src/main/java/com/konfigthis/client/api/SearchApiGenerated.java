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


import com.konfigthis.client.model.SearchByTitleRequest;
import com.konfigthis.client.model.SearchByTitleRequestFilter;
import com.konfigthis.client.model.SearchByTitleRequestSort;
import com.konfigthis.client.model.SearchByTitleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SearchApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SearchApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call byTitleCall(String notionVersion, SearchByTitleRequest searchByTitleRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = searchByTitleRequest;

        // create path and map variables
        String localVarPath = "/v1/search";

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
    private okhttp3.Call byTitleValidateBeforeCall(String notionVersion, SearchByTitleRequest searchByTitleRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'notionVersion' is set
        if (notionVersion == null) {
            throw new ApiException("Missing the required parameter 'notionVersion' when calling byTitle(Async)");
        }

        return byTitleCall(notionVersion, searchByTitleRequest, _callback);

    }


    private ApiResponse<SearchByTitleResponse> byTitleWithHttpInfo(String notionVersion, SearchByTitleRequest searchByTitleRequest) throws ApiException {
        okhttp3.Call localVarCall = byTitleValidateBeforeCall(notionVersion, searchByTitleRequest, null);
        Type localVarReturnType = new TypeToken<SearchByTitleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call byTitleAsync(String notionVersion, SearchByTitleRequest searchByTitleRequest, final ApiCallback<SearchByTitleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = byTitleValidateBeforeCall(notionVersion, searchByTitleRequest, _callback);
        Type localVarReturnType = new TypeToken<SearchByTitleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ByTitleRequestBuilder {
        private final String notionVersion;
        private String query;
        private SearchByTitleRequestSort sort;
        private SearchByTitleRequestFilter filter;
        private String startCursor;
        private Integer pageSize;

        private ByTitleRequestBuilder(String notionVersion) {
            this.notionVersion = notionVersion;
        }

        /**
         * Set query
         * @param query The text that the API compares page and database titles against. (optional)
         * @return ByTitleRequestBuilder
         */
        public ByTitleRequestBuilder query(String query) {
            this.query = query;
            return this;
        }
        
        /**
         * Set sort
         * @param sort  (optional)
         * @return ByTitleRequestBuilder
         */
        public ByTitleRequestBuilder sort(SearchByTitleRequestSort sort) {
            this.sort = sort;
            return this;
        }
        
        /**
         * Set filter
         * @param filter  (optional)
         * @return ByTitleRequestBuilder
         */
        public ByTitleRequestBuilder filter(SearchByTitleRequestFilter filter) {
            this.filter = filter;
            return this;
        }
        
        /**
         * Set startCursor
         * @param startCursor A &#x60;cursor&#x60; value returned in a previous response that If supplied, limits the response to results starting after the &#x60;cursor&#x60;. If not supplied, then the first page of results is returned. Refer to [pagination](https://developers.notion.com/reference/intro#pagination) for more details. (optional)
         * @return ByTitleRequestBuilder
         */
        public ByTitleRequestBuilder startCursor(String startCursor) {
            this.startCursor = startCursor;
            return this;
        }
        
        /**
         * Set pageSize
         * @param pageSize The number of items from the full list to include in the response. Maximum: &#x60;100&#x60;. (optional, default to 100)
         * @return ByTitleRequestBuilder
         */
        public ByTitleRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Build call for byTitle
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
            SearchByTitleRequest searchByTitleRequest = buildBodyParams();
            return byTitleCall(notionVersion, searchByTitleRequest, _callback);
        }

        private SearchByTitleRequest buildBodyParams() {
            SearchByTitleRequest searchByTitleRequest = new SearchByTitleRequest();
            searchByTitleRequest.query(this.query);
            searchByTitleRequest.sort(this.sort);
            searchByTitleRequest.filter(this.filter);
            searchByTitleRequest.startCursor(this.startCursor);
            searchByTitleRequest.pageSize(this.pageSize);
            return searchByTitleRequest;
        }

        /**
         * Execute byTitle request
         * @return SearchByTitleResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public SearchByTitleResponse execute() throws ApiException {
            SearchByTitleRequest searchByTitleRequest = buildBodyParams();
            ApiResponse<SearchByTitleResponse> localVarResp = byTitleWithHttpInfo(notionVersion, searchByTitleRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute byTitle request with HTTP info returned
         * @return ApiResponse&lt;SearchByTitleResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SearchByTitleResponse> executeWithHttpInfo() throws ApiException {
            SearchByTitleRequest searchByTitleRequest = buildBodyParams();
            return byTitleWithHttpInfo(notionVersion, searchByTitleRequest);
        }

        /**
         * Execute byTitle request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SearchByTitleResponse> _callback) throws ApiException {
            SearchByTitleRequest searchByTitleRequest = buildBodyParams();
            return byTitleAsync(notionVersion, searchByTitleRequest, _callback);
        }
    }

    /**
     * Search by title
     * 
     * @param notionVersion  (required)
     * @return ByTitleRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public ByTitleRequestBuilder byTitle(String notionVersion) throws IllegalArgumentException {
        if (notionVersion == null) throw new IllegalArgumentException("\"notionVersion\" is required but got null");
            

        return new ByTitleRequestBuilder(notionVersion);
    }
}