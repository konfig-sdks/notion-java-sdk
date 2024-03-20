# TokenApi

All URIs are relative to *https://api.notion.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateAccess**](TokenApi.md#generateAccess) | **POST** /v1/oauth/token | Create a token |


<a name="generateAccess"></a>
# **generateAccess**
> TokenGenerateAccessResponse generateAccess().tokenGenerateAccessRequest(tokenGenerateAccessRequest).execute();

Create a token

Creates an access token that a third-party service can use to authenticate with Notion.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Notion;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.notion.com";
    
    // Configure HTTP bearer authorization: token
    configuration.token = "BEARER TOKEN";
    Notion client = new Notion(configuration);
    String code = "code_example"; // A unique random code that Notion generates to authenticate with your service, generated when a user initiates the OAuth flow.
    String grantType = "\\\"authorization_code\\\""; // A constant string: \\\"authorization_code\\\".
    String redirectUri = "redirectUri_example"; // The `\\\"redirect_uri\\\"` that was provided in the OAuth Domain & URI section of the integration's Authorization settings. Do not include this field if a `\\\"redirect_uri\\\"` query param was not included in the Authorization URL provided to users. In most cases, this field is required.
    Object externalAccount = null; // Required if and only when building [Link Preview](https://developers.notion.com/docs/link-previews) integrations (otherwise ignored). An object with `key` and `name` properties. `key` should be a unique identifier for the account. Notion uses the `key` to determine whether or not the user is re-connecting the same account. `name` should be some way for the user to know which account they used to authenticate with your service. If a user has authenticated Notion with your integration before and `key` is the same but `name` is different, then Notion updates the `name` associated with your integration.
    try {
      TokenGenerateAccessResponse result = client
              .token
              .generateAccess(code, grantType, redirectUri)
              .externalAccount(externalAccount)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getBotId());
      System.out.println(result.getDuplicatedTemplateId());
      System.out.println(result.getOwner());
      System.out.println(result.getWorkspaceIcon());
      System.out.println(result.getWorkspaceId());
      System.out.println(result.getWorkspaceName());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#generateAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokenGenerateAccessResponse> response = client
              .token
              .generateAccess(code, grantType, redirectUri)
              .externalAccount(externalAccount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#generateAccess");
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
| **tokenGenerateAccessRequest** | [**TokenGenerateAccessRequest**](TokenGenerateAccessRequest.md)|  | [optional] |

### Return type

[**TokenGenerateAccessResponse**](TokenGenerateAccessResponse.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

