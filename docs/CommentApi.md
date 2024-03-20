# CommentApi

All URIs are relative to *https://api.notion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNew**](CommentApi.md#createNew) | **POST** /v1/comments | Create comment |
| [**getList**](CommentApi.md#getList) | **GET** /v1/comments | Retrieve comments |


<a name="createNew"></a>
# **createNew**
> CommentCreateNewResponse createNew(notionVersion).commentCreateNewRequest(commentCreateNewRequest).execute();

Create comment

Creates a comment in a page or existing discussion thread.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String richText = "richText_example"; // A [rich text object](ref:rich-text)
    String notionVersion = "2022-06-28";
    String parent = "parent_example"; // A [page parent](/reference/database#page-parent). Either this or a discussion_id is required (not both)
    String discussionId = "discussionId_example"; // A UUID identifier for a discussion thread. Either this or a parent object is required (not both)
    try {
      CommentCreateNewResponse result = client
              .comment
              .createNew(richText, notionVersion)
              .parent(parent)
              .discussionId(discussionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getParent());
      System.out.println(result.getDiscussionId());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getLastEditedTime());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getRichText());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommentCreateNewResponse> response = client
              .comment
              .createNew(richText, notionVersion)
              .parent(parent)
              .discussionId(discussionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notionVersion** | **String**|  | [default to 2022-06-28] |
| **commentCreateNewRequest** | [**CommentCreateNewRequest**](CommentCreateNewRequest.md)|  | [optional] |

### Return type

[**CommentCreateNewResponse**](CommentCreateNewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getList"></a>
# **getList**
> CommentGetListResponse getList(notionVersion, blockId).startCursor(startCursor).pageSize(pageSize).execute();

Retrieve comments

Retrieves a list of un-resolved [Comment objects](ref:comment-object) from a page or block.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String notionVersion = "2022-06-28";
    String blockId = "blockId_example"; // Identifier for a Notion block or page
    String startCursor = "startCursor_example"; // If supplied, this endpoint will return a page of results starting after the cursor provided. If not supplied, this endpoint will return the first page of results.
    Integer pageSize = 56; // The number of items from the full list desired in the response. Maximum: 100
    try {
      CommentGetListResponse result = client
              .comment
              .getList(notionVersion, blockId)
              .startCursor(startCursor)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getResults());
      System.out.println(result.getNextCursor());
      System.out.println(result.getHasMore());
      System.out.println(result.getType());
      System.out.println(result.getComment());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CommentGetListResponse> response = client
              .comment
              .getList(notionVersion, blockId)
              .startCursor(startCursor)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notionVersion** | **String**|  | [default to 2022-06-28] |
| **blockId** | **String**| Identifier for a Notion block or page | |
| **startCursor** | **String**| If supplied, this endpoint will return a page of results starting after the cursor provided. If not supplied, this endpoint will return the first page of results. | [optional] |
| **pageSize** | **Integer**| The number of items from the full list desired in the response. Maximum: 100 | [optional] |

### Return type

[**CommentGetListResponse**](CommentGetListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

