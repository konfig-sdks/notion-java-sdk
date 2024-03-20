# UserApi

All URIs are relative to *https://api.notion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTokenBotUser**](UserApi.md#getTokenBotUser) | **GET** /v1/users/me | Retrieve your token&#39;s bot user |
| [**getUserById**](UserApi.md#getUserById) | **GET** /v1/users/{user_id} | Retrieve a user |
| [**listAllUsers**](UserApi.md#listAllUsers) | **GET** /v1/users | List all users |


<a name="getTokenBotUser"></a>
# **getTokenBotUser**
> UserGetTokenBotUserResponse getTokenBotUser(notionVersion).execute();

Retrieve your token&#39;s bot user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String notionVersion = "2022-06-28";
    try {
      UserGetTokenBotUserResponse result = client
              .user
              .getTokenBotUser(notionVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getType());
      System.out.println(result.getBot());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getTokenBotUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserGetTokenBotUserResponse> response = client
              .user
              .getTokenBotUser(notionVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getTokenBotUser");
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

### Return type

[**UserGetTokenBotUserResponse**](UserGetTokenBotUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getUserById"></a>
# **getUserById**
> String getUserById(userId, notionVersion).execute();

Retrieve a user



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String userId = "userId_example"; // Identifier for a Notion user
    String notionVersion = "2022-06-28";
    try {
      String result = client
              .user
              .getUserById(userId, notionVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .user
              .getUserById(userId, notionVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserById");
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
| **userId** | **String**| Identifier for a Notion user | |
| **notionVersion** | **String**|  | [default to 2022-06-28] |

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

<a name="listAllUsers"></a>
# **listAllUsers**
> String listAllUsers(notionVersion).startCursor(startCursor).pageSize(pageSize).execute();

List all users



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    Notion client = new Notion(configuration);
    String notionVersion = "2022-06-28";
    String startCursor = "startCursor_example"; // If supplied, this endpoint will return a page of results starting after the cursor provided. If not supplied, this endpoint will return the first page of results.
    Integer pageSize = 100; // The number of items from the full list desired in the response. Maximum: 100
    try {
      String result = client
              .user
              .listAllUsers(notionVersion)
              .startCursor(startCursor)
              .pageSize(pageSize)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listAllUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .user
              .listAllUsers(notionVersion)
              .startCursor(startCursor)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#listAllUsers");
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
| **startCursor** | **String**| If supplied, this endpoint will return a page of results starting after the cursor provided. If not supplied, this endpoint will return the first page of results. | [optional] |
| **pageSize** | **Integer**| The number of items from the full list desired in the response. Maximum: 100 | [optional] [default to 100] |

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

