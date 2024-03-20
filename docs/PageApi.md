# PageApi

All URIs are relative to *https://api.notion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewPage**](PageApi.md#createNewPage) | **POST** /v1/pages | Create a page |
| [**getPage**](PageApi.md#getPage) | **GET** /v1/pages/{page_id} | Retrieve a page |
| [**getPropertyItem**](PageApi.md#getPropertyItem) | **GET** /v1/pages/{page_id}/properties/{property_id} | Retrieve a page property item |
| [**updateProperties**](PageApi.md#updateProperties) | **PATCH** /v1/pages/{page_id} | Update page properties |


<a name="createNewPage"></a>
# **createNewPage**
> PageCreateNewPageResponse createNewPage(notionVersion).pageCreateNewPageRequest(pageCreateNewPageRequest).execute();

Create a page



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String parent = "parent_example"; // The parent page or database where the new page is inserted, represented as a JSON object with a `page_id` or `database_id` key, and the corresponding ID.
    String properties = "properties_example"; // The values of the page’s properties. If the `parent` is a database, then the schema must match the parent database’s properties. If the `parent` is a page, then the only valid object key is `title`.
    String notionVersion = "2022-06-28";
    List<String> children = Arrays.asList(); // The content to be rendered on the new page, represented as an array of [block objects](https://developers.notion.com/reference/block).
    String icon = "icon_example"; // The icon of the new page. Either an [emoji object](https://developers.notion.com/reference/emoji-object) or an [external file object](https://developers.notion.com/reference/file-object)..
    String cover = "cover_example"; // The cover image of the new page, represented as a [file object](https://developers.notion.com/reference/file-object).
    try {
      PageCreateNewPageResponse result = client
              .page
              .createNewPage(parent, properties, notionVersion)
              .children(children)
              .icon(icon)
              .cover(cover)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getLastEditedTime());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastEditedBy());
      System.out.println(result.getCover());
      System.out.println(result.getIcon());
      System.out.println(result.getParent());
      System.out.println(result.getArchived());
      System.out.println(result.getProperties());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling PageApi#createNewPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageCreateNewPageResponse> response = client
              .page
              .createNewPage(parent, properties, notionVersion)
              .children(children)
              .icon(icon)
              .cover(cover)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PageApi#createNewPage");
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
| **pageCreateNewPageRequest** | [**PageCreateNewPageRequest**](PageCreateNewPageRequest.md)|  | [optional] |

### Return type

[**PageCreateNewPageResponse**](PageCreateNewPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getPage"></a>
# **getPage**
> PageGetPageResponse getPage(pageId, notionVersion).filterProperties(filterProperties).execute();

Retrieve a page



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String pageId = "pageId_example"; // Identifier for a Notion page
    String notionVersion = "2022-06-28";
    String filterProperties = "filterProperties_example"; // A list of page property value IDs associated with the page. Use this param to limit the response to a specific page property value or values. To retrieve multiple properties, specify each page property ID. For example: `?filter_properties=iAk8&filter_properties=b7dh`.
    try {
      PageGetPageResponse result = client
              .page
              .getPage(pageId, notionVersion)
              .filterProperties(filterProperties)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getLastEditedTime());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastEditedBy());
      System.out.println(result.getCover());
      System.out.println(result.getIcon());
      System.out.println(result.getParent());
      System.out.println(result.getArchived());
      System.out.println(result.getProperties());
      System.out.println(result.getUrl());
      System.out.println(result.getPublicUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling PageApi#getPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageGetPageResponse> response = client
              .page
              .getPage(pageId, notionVersion)
              .filterProperties(filterProperties)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PageApi#getPage");
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
| **pageId** | **String**| Identifier for a Notion page | |
| **notionVersion** | **String**|  | [default to 2022-06-28] |
| **filterProperties** | **String**| A list of page property value IDs associated with the page. Use this param to limit the response to a specific page property value or values. To retrieve multiple properties, specify each page property ID. For example: &#x60;?filter_properties&#x3D;iAk8&amp;filter_properties&#x3D;b7dh&#x60;. | [optional] |

### Return type

[**PageGetPageResponse**](PageGetPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getPropertyItem"></a>
# **getPropertyItem**
> String getPropertyItem(pageId, propertyId).pageSize(pageSize).startCursor(startCursor).notionVersion(notionVersion).execute();

Retrieve a page property item



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String pageId = "pageId_example"; // Identifier for a Notion page
    String propertyId = "propertyId_example"; // Identifier for a page [property](https://developers.notion.com/reference/page#all-property-values)
    Integer pageSize = 56; // For paginated properties. The max number of property item objects on a page. The default size is 100
    String startCursor = "startCursor_example"; // For paginated properties.
    String notionVersion = "2022-06-28";
    try {
      String result = client
              .page
              .getPropertyItem(pageId, propertyId)
              .pageSize(pageSize)
              .startCursor(startCursor)
              .notionVersion(notionVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PageApi#getPropertyItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .page
              .getPropertyItem(pageId, propertyId)
              .pageSize(pageSize)
              .startCursor(startCursor)
              .notionVersion(notionVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PageApi#getPropertyItem");
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
| **pageId** | **String**| Identifier for a Notion page | |
| **propertyId** | **String**| Identifier for a page [property](https://developers.notion.com/reference/page#all-property-values) | |
| **pageSize** | **Integer**| For paginated properties. The max number of property item objects on a page. The default size is 100 | [optional] |
| **startCursor** | **String**| For paginated properties. | [optional] |
| **notionVersion** | **String**|  | [optional] [default to 2022-06-28] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateProperties"></a>
# **updateProperties**
> PageUpdatePropertiesResponse updateProperties(pageId).notionVersion(notionVersion).pageUpdatePropertiesRequest(pageUpdatePropertiesRequest).execute();

Update page properties



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String pageId = "pageId_example"; // The identifier for the Notion page to be updated.
    String properties = "properties_example"; // The property values to update for the page. The keys are the names or IDs of the property and the values are property values. If a page property ID is not included, then it is not changed.
    Boolean archived = true; // Whether the page is archived (deleted). Set to true to archive a page. Set to false to un-archive (restore) a page.
    String icon = "icon_example"; // A page icon for the page. Supported types are [external file object](https://developers.notion.com/reference/file-object) or [emoji object](https://developers.notion.com/reference/emoji-object).
    String cover = "cover_example"; // A cover image for the page. Only [external file objects](https://developers.notion.com/reference/file-object) are supported.
    String notionVersion = "2022-06-28";
    try {
      PageUpdatePropertiesResponse result = client
              .page
              .updateProperties(pageId)
              .properties(properties)
              .archived(archived)
              .icon(icon)
              .cover(cover)
              .notionVersion(notionVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getLastEditedTime());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getLastEditedBy());
      System.out.println(result.getCover());
      System.out.println(result.getIcon());
      System.out.println(result.getParent());
      System.out.println(result.getArchived());
      System.out.println(result.getProperties());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling PageApi#updateProperties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageUpdatePropertiesResponse> response = client
              .page
              .updateProperties(pageId)
              .properties(properties)
              .archived(archived)
              .icon(icon)
              .cover(cover)
              .notionVersion(notionVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PageApi#updateProperties");
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
| **pageId** | **String**| The identifier for the Notion page to be updated. | |
| **notionVersion** | **String**|  | [optional] [default to 2022-06-28] |
| **pageUpdatePropertiesRequest** | [**PageUpdatePropertiesRequest**](PageUpdatePropertiesRequest.md)|  | [optional] |

### Return type

[**PageUpdatePropertiesResponse**](PageUpdatePropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

