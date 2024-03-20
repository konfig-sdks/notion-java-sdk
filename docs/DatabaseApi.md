# DatabaseApi

All URIs are relative to *https://api.notion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewDatabase**](DatabaseApi.md#createNewDatabase) | **POST** /v1/databases | Create a database |
| [**executeQuery**](DatabaseApi.md#executeQuery) | **POST** /v1/databases/{database_id}/query | Query a database |
| [**getDatabase**](DatabaseApi.md#getDatabase) | **GET** /v1/databases/{database_id} | Retrieve a database |
| [**updateDatabase**](DatabaseApi.md#updateDatabase) | **PATCH** /v1/databases/{database_id} | Update a database |


<a name="createNewDatabase"></a>
# **createNewDatabase**
> String createNewDatabase(notionVersion).databaseCreateNewDatabaseRequest(databaseCreateNewDatabaseRequest).execute();

Create a database



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatabaseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String parent = "parent_example"; // A [page parent](/reference/database#page-parent)
    String properties = "properties_example"; // Property schema of database. The keys are the names of properties as they appear in Notion and the values are [property schema objects](https://developers.notion.com/reference/property-schema-object).
    String notionVersion = "2022-06-28";
    List title = new List(); // Title of database as it appears in Notion. An array of [rich text objects](ref:rich-text).
    try {
      String result = client
              .database
              .createNewDatabase(parent, properties, notionVersion)
              .title(title)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#createNewDatabase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .database
              .createNewDatabase(parent, properties, notionVersion)
              .title(title)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#createNewDatabase");
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
| **databaseCreateNewDatabaseRequest** | [**DatabaseCreateNewDatabaseRequest**](DatabaseCreateNewDatabaseRequest.md)|  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="executeQuery"></a>
# **executeQuery**
> DatabaseExecuteQueryResponse executeQuery(databaseId, notionVersion).filterProperties(filterProperties).databaseExecuteQueryRequest(databaseExecuteQueryRequest).execute();

Query a database



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatabaseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String databaseId = "databaseId_example"; // Identifier for a Notion database.
    String notionVersion = "2022-06-28";
    String filter = "filter_example"; // When supplied, limits which pages are returned based on the [filter conditions](ref:post-database-query-filter).
    List sorts = new List(); // When supplied, orders the results based on the provided [sort criteria](ref:post-database-query-sort).
    String startCursor = "startCursor_example"; // When supplied, returns a page of results starting after the cursor provided. If not supplied, this endpoint will return the first page of results.
    Integer pageSize = 100; // The number of items from the full list desired in the response. Maximum: 100
    String filterProperties = "filterProperties_example"; // A list of page property value IDs associated with the database. Use this param to limit the response to a specific page property value or values for pages that meet the `filter` criteria.
    try {
      DatabaseExecuteQueryResponse result = client
              .database
              .executeQuery(databaseId, notionVersion)
              .filter(filter)
              .sorts(sorts)
              .startCursor(startCursor)
              .pageSize(pageSize)
              .filterProperties(filterProperties)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getResults());
      System.out.println(result.getNextCursor());
      System.out.println(result.getHasMore());
      System.out.println(result.getType());
      System.out.println(result.getPageOrDatabase());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#executeQuery");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DatabaseExecuteQueryResponse> response = client
              .database
              .executeQuery(databaseId, notionVersion)
              .filter(filter)
              .sorts(sorts)
              .startCursor(startCursor)
              .pageSize(pageSize)
              .filterProperties(filterProperties)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#executeQuery");
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
| **databaseId** | **String**| Identifier for a Notion database. | |
| **notionVersion** | **String**|  | [default to 2022-06-28] |
| **filterProperties** | **String**| A list of page property value IDs associated with the database. Use this param to limit the response to a specific page property value or values for pages that meet the &#x60;filter&#x60; criteria. | [optional] |
| **databaseExecuteQueryRequest** | [**DatabaseExecuteQueryRequest**](DatabaseExecuteQueryRequest.md)|  | [optional] |

### Return type

[**DatabaseExecuteQueryResponse**](DatabaseExecuteQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getDatabase"></a>
# **getDatabase**
> DatabaseGetDatabaseResponse getDatabase(databaseId, notionVersion).execute();

Retrieve a database



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatabaseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String databaseId = "databaseId_example"; // An identifier for the Notion database.
    String notionVersion = "2022-06-28";
    try {
      DatabaseGetDatabaseResponse result = client
              .database
              .getDatabase(databaseId, notionVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getLastEditedTime());
      System.out.println(result.getIcon());
      System.out.println(result.getCover());
      System.out.println(result.getUrl());
      System.out.println(result.getProperties());
      System.out.println(result.getParent());
      System.out.println(result.getArchived());
      System.out.println(result.getIsInline());
      System.out.println(result.getPublicUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#getDatabase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DatabaseGetDatabaseResponse> response = client
              .database
              .getDatabase(databaseId, notionVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#getDatabase");
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
| **databaseId** | **String**| An identifier for the Notion database. | |
| **notionVersion** | **String**|  | [default to 2022-06-28] |

### Return type

[**DatabaseGetDatabaseResponse**](DatabaseGetDatabaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateDatabase"></a>
# **updateDatabase**
> String updateDatabase(databaseId).notionVersion(notionVersion).databaseUpdateDatabaseRequest(databaseUpdateDatabaseRequest).execute();

Update a database



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatabaseApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String databaseId = "databaseId_example"; // identifier for a Notion database
    List title = new List(); // An array of [rich text objects](https://developers.notion.com/reference/rich-text) that represents the title of the database that is displayed in the Notion UI. If omitted, then the database title remains unchanged.
    List description = new List(); // An array of [rich text objects](https://developers.notion.com/reference/rich-text) that represents the description of the database that is displayed in the Notion UI. If omitted, then the database description remains unchanged.
    String properties = "properties_example"; // The properties of a database to be changed in the request, in the form of a JSON object. If updating an existing property, then the keys are the names or IDs of the properties as they appear in Notion, and the values are [property schema objects](ref:property-schema-object). If adding a new property, then the key is the name of the new database property and the value is a [property schema object](ref:property-schema-object).
    String notionVersion = "2022-06-28";
    try {
      String result = client
              .database
              .updateDatabase(databaseId)
              .title(title)
              .description(description)
              .properties(properties)
              .notionVersion(notionVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#updateDatabase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .database
              .updateDatabase(databaseId)
              .title(title)
              .description(description)
              .properties(properties)
              .notionVersion(notionVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatabaseApi#updateDatabase");
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
| **databaseId** | **String**| identifier for a Notion database | |
| **notionVersion** | **String**|  | [optional] [default to 2022-06-28] |
| **databaseUpdateDatabaseRequest** | [**DatabaseUpdateDatabaseRequest**](DatabaseUpdateDatabaseRequest.md)|  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

