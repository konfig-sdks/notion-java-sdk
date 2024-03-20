# SearchApi

All URIs are relative to *https://api.notion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**byTitle**](SearchApi.md#byTitle) | **POST** /v1/search | Search by title |


<a name="byTitle"></a>
# **byTitle**
> SearchByTitleResponse byTitle(notionVersion).searchByTitleRequest(searchByTitleRequest).execute();

Search by title



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String notionVersion = "2022-06-28";
    String query = "query_example"; // The text that the API compares page and database titles against.
    SearchByTitleRequestSort sort = new SearchByTitleRequestSort();
    SearchByTitleRequestFilter filter = new SearchByTitleRequestFilter();
    String startCursor = "startCursor_example"; // A `cursor` value returned in a previous response that If supplied, limits the response to results starting after the `cursor`. If not supplied, then the first page of results is returned. Refer to [pagination](https://developers.notion.com/reference/intro#pagination) for more details.
    Integer pageSize = 100; // The number of items from the full list to include in the response. Maximum: `100`.
    try {
      SearchByTitleResponse result = client
              .search
              .byTitle(notionVersion)
              .query(query)
              .sort(sort)
              .filter(filter)
              .startCursor(startCursor)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getResults());
      System.out.println(result.getNextCursor());
      System.out.println(result.getHasMore());
      System.out.println(result.getType());
      System.out.println(result.getPageOrDatabase());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#byTitle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SearchByTitleResponse> response = client
              .search
              .byTitle(notionVersion)
              .query(query)
              .sort(sort)
              .filter(filter)
              .startCursor(startCursor)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#byTitle");
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
| **searchByTitleRequest** | [**SearchByTitleRequest**](SearchByTitleRequest.md)|  | [optional] |

### Return type

[**SearchByTitleResponse**](SearchByTitleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

