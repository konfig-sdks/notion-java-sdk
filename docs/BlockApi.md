# BlockApi

All URIs are relative to *https://api.notion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appendChildren**](BlockApi.md#appendChildren) | **PATCH** /v1/blocks/{block_id}/children | Append block children |
| [**getChildren**](BlockApi.md#getChildren) | **GET** /v1/blocks/{block_id}/children | Retrieve block children |
| [**getDetails**](BlockApi.md#getDetails) | **GET** /v1/blocks/{block_id} | Retrieve a block |
| [**removeBlockById**](BlockApi.md#removeBlockById) | **DELETE** /v1/blocks/{block_id} | Delete a block |
| [**updateBlockById**](BlockApi.md#updateBlockById) | **PATCH** /v1/blocks/{block_id} | Update a block |


<a name="appendChildren"></a>
# **appendChildren**
> BlockAppendChildrenResponse appendChildren(blockId, notionVersion).blockAppendChildrenRequest(blockAppendChildrenRequest).execute();

Append block children



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BlockApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    List children = new List(); // Child content to append to a container block as an array of [block objects](ref:block)
    String blockId = "blockId_example"; // Identifier for a [block](ref:block). Also accepts a [page](ref:page) ID.
    String notionVersion = "2022-06-28";
    String after = "after_example"; // The ID of the existing block that the new block should be appended after.
    try {
      BlockAppendChildrenResponse result = client
              .block
              .appendChildren(children, blockId, notionVersion)
              .after(after)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getResults());
      System.out.println(result.getNextCursor());
      System.out.println(result.getHasMore());
      System.out.println(result.getType());
      System.out.println(result.getBlock());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#appendChildren");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BlockAppendChildrenResponse> response = client
              .block
              .appendChildren(children, blockId, notionVersion)
              .after(after)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#appendChildren");
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
| **blockId** | **String**| Identifier for a [block](ref:block). Also accepts a [page](ref:page) ID. | |
| **notionVersion** | **String**|  | [default to 2022-06-28] |
| **blockAppendChildrenRequest** | [**BlockAppendChildrenRequest**](BlockAppendChildrenRequest.md)|  | [optional] |

### Return type

[**BlockAppendChildrenResponse**](BlockAppendChildrenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getChildren"></a>
# **getChildren**
> BlockGetChildrenResponse getChildren(blockId, notionVersion).startCursor(startCursor).pageSize(pageSize).execute();

Retrieve block children



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BlockApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String blockId = "blockId_example"; // Identifier for a [block](ref:block)
    String notionVersion = "2022-06-28";
    String startCursor = "startCursor_example"; // If supplied, this endpoint will return a page of results starting after the cursor provided. If not supplied, this endpoint will return the first page of results.
    Integer pageSize = 100; // The number of items from the full list desired in the response. Maximum: 100
    try {
      BlockGetChildrenResponse result = client
              .block
              .getChildren(blockId, notionVersion)
              .startCursor(startCursor)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getResults());
      System.out.println(result.getNextCursor());
      System.out.println(result.getHasMore());
      System.out.println(result.getType());
      System.out.println(result.getBlock());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#getChildren");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BlockGetChildrenResponse> response = client
              .block
              .getChildren(blockId, notionVersion)
              .startCursor(startCursor)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#getChildren");
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
| **blockId** | **String**| Identifier for a [block](ref:block) | |
| **notionVersion** | **String**|  | [default to 2022-06-28] |
| **startCursor** | **String**| If supplied, this endpoint will return a page of results starting after the cursor provided. If not supplied, this endpoint will return the first page of results. | [optional] |
| **pageSize** | **Integer**| The number of items from the full list desired in the response. Maximum: 100 | [optional] [default to 100] |

### Return type

[**BlockGetChildrenResponse**](BlockGetChildrenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getDetails"></a>
# **getDetails**
> BlockGetDetailsResponse getDetails(blockId).notionVersion(notionVersion).execute();

Retrieve a block



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BlockApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String blockId = "blockId_example"; // Identifier for a Notion block
    String notionVersion = "2022-06-28";
    try {
      BlockGetDetailsResponse result = client
              .block
              .getDetails(blockId)
              .notionVersion(notionVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getParent());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getLastEditedTime());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastEditedBy());
      System.out.println(result.getHasChildren());
      System.out.println(result.getArchived());
      System.out.println(result.getType());
      System.out.println(result.getHeading2());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BlockGetDetailsResponse> response = client
              .block
              .getDetails(blockId)
              .notionVersion(notionVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#getDetails");
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
| **blockId** | **String**| Identifier for a Notion block | |
| **notionVersion** | **String**|  | [optional] [default to 2022-06-28] |

### Return type

[**BlockGetDetailsResponse**](BlockGetDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="removeBlockById"></a>
# **removeBlockById**
> BlockRemoveBlockByIdResponse removeBlockById(blockId).notionVersion(notionVersion).execute();

Delete a block



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BlockApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String blockId = "blockId_example"; // Identifier for a Notion block
    String notionVersion = "2022-06-28";
    try {
      BlockRemoveBlockByIdResponse result = client
              .block
              .removeBlockById(blockId)
              .notionVersion(notionVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getParent());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getLastEditedTime());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastEditedBy());
      System.out.println(result.getHasChildren());
      System.out.println(result.getArchived());
      System.out.println(result.getType());
      System.out.println(result.getParagraph());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#removeBlockById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BlockRemoveBlockByIdResponse> response = client
              .block
              .removeBlockById(blockId)
              .notionVersion(notionVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#removeBlockById");
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
| **blockId** | **String**| Identifier for a Notion block | |
| **notionVersion** | **String**|  | [optional] [default to 2022-06-28] |

### Return type

[**BlockRemoveBlockByIdResponse**](BlockRemoveBlockByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateBlockById"></a>
# **updateBlockById**
> BlockUpdateBlockByIdResponse updateBlockById(blockId).notionVersion(notionVersion).blockUpdateBlockByIdRequest(blockUpdateBlockByIdRequest).execute();

Update a block



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BlockApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String blockId = "blockId_example"; // Identifier for a Notion block
    Object leftCurlyBracketTypeRightCurlyBracket = null; // The [block object `type`](ref:block#block-object-keys) value with the properties to be updated. Currently only `text` (for supported block types) and `checked` (for `to_do` blocks) fields can be updated.
    Boolean archived = true; // Set to true to archive (delete) a block. Set to false to un-archive (restore) a block.
    String notionVersion = "2022-06-28";
    try {
      BlockUpdateBlockByIdResponse result = client
              .block
              .updateBlockById(blockId)
              .leftCurlyBracketTypeRightCurlyBracket(leftCurlyBracketTypeRightCurlyBracket)
              .archived(archived)
              .notionVersion(notionVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getParent());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getLastEditedTime());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastEditedBy());
      System.out.println(result.getHasChildren());
      System.out.println(result.getArchived());
      System.out.println(result.getType());
      System.out.println(result.getHeading2());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#updateBlockById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BlockUpdateBlockByIdResponse> response = client
              .block
              .updateBlockById(blockId)
              .leftCurlyBracketTypeRightCurlyBracket(leftCurlyBracketTypeRightCurlyBracket)
              .archived(archived)
              .notionVersion(notionVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#updateBlockById");
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
| **blockId** | **String**| Identifier for a Notion block | |
| **notionVersion** | **String**|  | [optional] [default to 2022-06-28] |
| **blockUpdateBlockByIdRequest** | [**BlockUpdateBlockByIdRequest**](BlockUpdateBlockByIdRequest.md)|  | [optional] |

### Return type

[**BlockUpdateBlockByIdResponse**](BlockUpdateBlockByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

