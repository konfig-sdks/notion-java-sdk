<div align="left">

[![Visit Notion](./header.png)](https://developers.notion.com)

# [Notion](https://developers.notion.com)

Notion is a new tool that blends your everyday work apps into one. It's the all-in-one workspace for you and your team.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Notion&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>notion-java-sdk</artifactId>
  <version>1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:notion-java-sdk:1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/notion-java-sdk-1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.notion.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BlockApi* | [**appendChildren**](docs/BlockApi.md#appendChildren) | **PATCH** /v1/blocks/{block_id}/children | Append block children
*BlockApi* | [**getChildren**](docs/BlockApi.md#getChildren) | **GET** /v1/blocks/{block_id}/children | Retrieve block children
*BlockApi* | [**getDetails**](docs/BlockApi.md#getDetails) | **GET** /v1/blocks/{block_id} | Retrieve a block
*BlockApi* | [**removeBlockById**](docs/BlockApi.md#removeBlockById) | **DELETE** /v1/blocks/{block_id} | Delete a block
*BlockApi* | [**updateBlockById**](docs/BlockApi.md#updateBlockById) | **PATCH** /v1/blocks/{block_id} | Update a block
*CommentApi* | [**createNew**](docs/CommentApi.md#createNew) | **POST** /v1/comments | Create comment
*CommentApi* | [**getList**](docs/CommentApi.md#getList) | **GET** /v1/comments | Retrieve comments
*DatabaseApi* | [**createNewDatabase**](docs/DatabaseApi.md#createNewDatabase) | **POST** /v1/databases | Create a database
*DatabaseApi* | [**executeQuery**](docs/DatabaseApi.md#executeQuery) | **POST** /v1/databases/{database_id}/query | Query a database
*DatabaseApi* | [**getDatabase**](docs/DatabaseApi.md#getDatabase) | **GET** /v1/databases/{database_id} | Retrieve a database
*DatabaseApi* | [**updateDatabase**](docs/DatabaseApi.md#updateDatabase) | **PATCH** /v1/databases/{database_id} | Update a database
*PageApi* | [**createNewPage**](docs/PageApi.md#createNewPage) | **POST** /v1/pages | Create a page
*PageApi* | [**getPage**](docs/PageApi.md#getPage) | **GET** /v1/pages/{page_id} | Retrieve a page
*PageApi* | [**getPropertyItem**](docs/PageApi.md#getPropertyItem) | **GET** /v1/pages/{page_id}/properties/{property_id} | Retrieve a page property item
*PageApi* | [**updateProperties**](docs/PageApi.md#updateProperties) | **PATCH** /v1/pages/{page_id} | Update page properties
*SearchApi* | [**byTitle**](docs/SearchApi.md#byTitle) | **POST** /v1/search | Search by title
*TokenApi* | [**generateAccess**](docs/TokenApi.md#generateAccess) | **POST** /v1/oauth/token | Create a token
*UserApi* | [**getTokenBotUser**](docs/UserApi.md#getTokenBotUser) | **GET** /v1/users/me | Retrieve your token&#39;s bot user
*UserApi* | [**getUserById**](docs/UserApi.md#getUserById) | **GET** /v1/users/{user_id} | Retrieve a user
*UserApi* | [**listAllUsers**](docs/UserApi.md#listAllUsers) | **GET** /v1/users | List all users


## Documentation for Models

 - [BlockAppendChildrenRequest](docs/BlockAppendChildrenRequest.md)
 - [BlockAppendChildrenResponse](docs/BlockAppendChildrenResponse.md)
 - [BlockAppendChildrenResponseResultsInner](docs/BlockAppendChildrenResponseResultsInner.md)
 - [BlockAppendChildrenResponseResultsInnerCreatedBy](docs/BlockAppendChildrenResponseResultsInnerCreatedBy.md)
 - [BlockAppendChildrenResponseResultsInnerHeading2](docs/BlockAppendChildrenResponseResultsInnerHeading2.md)
 - [BlockAppendChildrenResponseResultsInnerHeading2RichTextInner](docs/BlockAppendChildrenResponseResultsInnerHeading2RichTextInner.md)
 - [BlockAppendChildrenResponseResultsInnerHeading2RichTextInnerAnnotations](docs/BlockAppendChildrenResponseResultsInnerHeading2RichTextInnerAnnotations.md)
 - [BlockAppendChildrenResponseResultsInnerHeading2RichTextInnerText](docs/BlockAppendChildrenResponseResultsInnerHeading2RichTextInnerText.md)
 - [BlockAppendChildrenResponseResultsInnerLastEditedBy](docs/BlockAppendChildrenResponseResultsInnerLastEditedBy.md)
 - [BlockAppendChildrenResponseResultsInnerParent](docs/BlockAppendChildrenResponseResultsInnerParent.md)
 - [BlockGetChildrenResponse](docs/BlockGetChildrenResponse.md)
 - [BlockGetChildrenResponseResultsInner](docs/BlockGetChildrenResponseResultsInner.md)
 - [BlockGetChildrenResponseResultsInnerCreatedBy](docs/BlockGetChildrenResponseResultsInnerCreatedBy.md)
 - [BlockGetChildrenResponseResultsInnerHeading2](docs/BlockGetChildrenResponseResultsInnerHeading2.md)
 - [BlockGetChildrenResponseResultsInnerHeading2RichTextInner](docs/BlockGetChildrenResponseResultsInnerHeading2RichTextInner.md)
 - [BlockGetChildrenResponseResultsInnerHeading2RichTextInnerAnnotations](docs/BlockGetChildrenResponseResultsInnerHeading2RichTextInnerAnnotations.md)
 - [BlockGetChildrenResponseResultsInnerHeading2RichTextInnerText](docs/BlockGetChildrenResponseResultsInnerHeading2RichTextInnerText.md)
 - [BlockGetChildrenResponseResultsInnerLastEditedBy](docs/BlockGetChildrenResponseResultsInnerLastEditedBy.md)
 - [BlockGetChildrenResponseResultsInnerParent](docs/BlockGetChildrenResponseResultsInnerParent.md)
 - [BlockGetDetailsResponse](docs/BlockGetDetailsResponse.md)
 - [BlockGetDetailsResponseCreatedBy](docs/BlockGetDetailsResponseCreatedBy.md)
 - [BlockGetDetailsResponseHeading2](docs/BlockGetDetailsResponseHeading2.md)
 - [BlockGetDetailsResponseHeading2RichTextInner](docs/BlockGetDetailsResponseHeading2RichTextInner.md)
 - [BlockGetDetailsResponseHeading2RichTextInnerAnnotations](docs/BlockGetDetailsResponseHeading2RichTextInnerAnnotations.md)
 - [BlockGetDetailsResponseHeading2RichTextInnerText](docs/BlockGetDetailsResponseHeading2RichTextInnerText.md)
 - [BlockGetDetailsResponseLastEditedBy](docs/BlockGetDetailsResponseLastEditedBy.md)
 - [BlockGetDetailsResponseParent](docs/BlockGetDetailsResponseParent.md)
 - [BlockRemoveBlockByIdResponse](docs/BlockRemoveBlockByIdResponse.md)
 - [BlockRemoveBlockByIdResponseCreatedBy](docs/BlockRemoveBlockByIdResponseCreatedBy.md)
 - [BlockRemoveBlockByIdResponseLastEditedBy](docs/BlockRemoveBlockByIdResponseLastEditedBy.md)
 - [BlockRemoveBlockByIdResponseParagraph](docs/BlockRemoveBlockByIdResponseParagraph.md)
 - [BlockRemoveBlockByIdResponseParent](docs/BlockRemoveBlockByIdResponseParent.md)
 - [BlockUpdateBlockByIdRequest](docs/BlockUpdateBlockByIdRequest.md)
 - [BlockUpdateBlockByIdResponse](docs/BlockUpdateBlockByIdResponse.md)
 - [BlockUpdateBlockByIdResponseCreatedBy](docs/BlockUpdateBlockByIdResponseCreatedBy.md)
 - [BlockUpdateBlockByIdResponseHeading2](docs/BlockUpdateBlockByIdResponseHeading2.md)
 - [BlockUpdateBlockByIdResponseHeading2RichTextInner](docs/BlockUpdateBlockByIdResponseHeading2RichTextInner.md)
 - [BlockUpdateBlockByIdResponseHeading2RichTextInnerAnnotations](docs/BlockUpdateBlockByIdResponseHeading2RichTextInnerAnnotations.md)
 - [BlockUpdateBlockByIdResponseHeading2RichTextInnerText](docs/BlockUpdateBlockByIdResponseHeading2RichTextInnerText.md)
 - [BlockUpdateBlockByIdResponseLastEditedBy](docs/BlockUpdateBlockByIdResponseLastEditedBy.md)
 - [BlockUpdateBlockByIdResponseParent](docs/BlockUpdateBlockByIdResponseParent.md)
 - [CommentCreateNewRequest](docs/CommentCreateNewRequest.md)
 - [CommentCreateNewResponse](docs/CommentCreateNewResponse.md)
 - [CommentCreateNewResponseCreatedBy](docs/CommentCreateNewResponseCreatedBy.md)
 - [CommentCreateNewResponseParent](docs/CommentCreateNewResponseParent.md)
 - [CommentCreateNewResponseRichTextInner](docs/CommentCreateNewResponseRichTextInner.md)
 - [CommentCreateNewResponseRichTextInnerAnnotations](docs/CommentCreateNewResponseRichTextInnerAnnotations.md)
 - [CommentCreateNewResponseRichTextInnerText](docs/CommentCreateNewResponseRichTextInnerText.md)
 - [CommentGetListResponse](docs/CommentGetListResponse.md)
 - [CommentGetListResponseResultsInner](docs/CommentGetListResponseResultsInner.md)
 - [CommentGetListResponseResultsInnerCreatedBy](docs/CommentGetListResponseResultsInnerCreatedBy.md)
 - [CommentGetListResponseResultsInnerParent](docs/CommentGetListResponseResultsInnerParent.md)
 - [CommentGetListResponseResultsInnerRichTextInner](docs/CommentGetListResponseResultsInnerRichTextInner.md)
 - [CommentGetListResponseResultsInnerRichTextInnerAnnotations](docs/CommentGetListResponseResultsInnerRichTextInnerAnnotations.md)
 - [CommentGetListResponseResultsInnerRichTextInnerText](docs/CommentGetListResponseResultsInnerRichTextInnerText.md)
 - [DatabaseCreateNewDatabaseRequest](docs/DatabaseCreateNewDatabaseRequest.md)
 - [DatabaseExecuteQueryRequest](docs/DatabaseExecuteQueryRequest.md)
 - [DatabaseExecuteQueryResponse](docs/DatabaseExecuteQueryResponse.md)
 - [DatabaseExecuteQueryResponseResultsInner](docs/DatabaseExecuteQueryResponseResultsInner.md)
 - [DatabaseExecuteQueryResponseResultsInnerCover](docs/DatabaseExecuteQueryResponseResultsInnerCover.md)
 - [DatabaseExecuteQueryResponseResultsInnerCoverExternal](docs/DatabaseExecuteQueryResponseResultsInnerCoverExternal.md)
 - [DatabaseExecuteQueryResponseResultsInnerCreatedBy](docs/DatabaseExecuteQueryResponseResultsInnerCreatedBy.md)
 - [DatabaseExecuteQueryResponseResultsInnerIcon](docs/DatabaseExecuteQueryResponseResultsInnerIcon.md)
 - [DatabaseExecuteQueryResponseResultsInnerLastEditedBy](docs/DatabaseExecuteQueryResponseResultsInnerLastEditedBy.md)
 - [DatabaseExecuteQueryResponseResultsInnerParent](docs/DatabaseExecuteQueryResponseResultsInnerParent.md)
 - [DatabaseExecuteQueryResponseResultsInnerProperties](docs/DatabaseExecuteQueryResponseResultsInnerProperties.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesCostOfNextTrip](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesCostOfNextTrip.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesCostOfNextTripFormula](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesCostOfNextTripFormula.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesDescription](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesDescription.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesDescriptionRichTextInner](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesDescriptionRichTextInner.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesDescriptionRichTextInnerAnnotations](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesDescriptionRichTextInnerAnnotations.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesDescriptionRichTextInnerText](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesDescriptionRichTextInnerText.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroup.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroupSelect](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesFoodGroupSelect.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesInStock](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesInStock.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesLastOrdered](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesLastOrdered.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesLastOrderedDate](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesLastOrderedDate.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesName](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesName.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesNameTitleInner](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesNameTitleInner.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesNameTitleInnerAnnotations](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesNameTitleInnerAnnotations.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesNameTitleInnerText](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesNameTitleInnerText.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesNumberOfMeals](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesNumberOfMeals.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesNumberOfMealsRollup](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesNumberOfMealsRollup.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesPhoto](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesPhoto.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesPrice](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesPrice.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesRecipes](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesRecipes.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesRecipesRelationInner](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesRecipesRelationInner.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesResponsiblePerson](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesResponsiblePerson.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesResponsiblePersonPeopleInner](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesResponsiblePersonPeopleInner.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesResponsiblePersonPeopleInnerPerson](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesResponsiblePersonPeopleInnerPerson.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesStoreAvailability](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesStoreAvailability.md)
 - [DatabaseExecuteQueryResponseResultsInnerPropertiesStoreAvailabilityMultiSelectInner](docs/DatabaseExecuteQueryResponseResultsInnerPropertiesStoreAvailabilityMultiSelectInner.md)
 - [DatabaseGetDatabaseResponse](docs/DatabaseGetDatabaseResponse.md)
 - [DatabaseGetDatabaseResponseCover](docs/DatabaseGetDatabaseResponseCover.md)
 - [DatabaseGetDatabaseResponseCoverExternal](docs/DatabaseGetDatabaseResponseCoverExternal.md)
 - [DatabaseGetDatabaseResponseDescriptionInner](docs/DatabaseGetDatabaseResponseDescriptionInner.md)
 - [DatabaseGetDatabaseResponseDescriptionInnerAnnotations](docs/DatabaseGetDatabaseResponseDescriptionInnerAnnotations.md)
 - [DatabaseGetDatabaseResponseDescriptionInnerText](docs/DatabaseGetDatabaseResponseDescriptionInnerText.md)
 - [DatabaseGetDatabaseResponseIcon](docs/DatabaseGetDatabaseResponseIcon.md)
 - [DatabaseGetDatabaseResponseParent](docs/DatabaseGetDatabaseResponseParent.md)
 - [DatabaseGetDatabaseResponseProperties](docs/DatabaseGetDatabaseResponseProperties.md)
 - [DatabaseGetDatabaseResponseProperties1](docs/DatabaseGetDatabaseResponseProperties1.md)
 - [DatabaseGetDatabaseResponsePropertiesDescription](docs/DatabaseGetDatabaseResponsePropertiesDescription.md)
 - [DatabaseGetDatabaseResponsePropertiesFoodGroup](docs/DatabaseGetDatabaseResponsePropertiesFoodGroup.md)
 - [DatabaseGetDatabaseResponsePropertiesFoodGroupSelect](docs/DatabaseGetDatabaseResponsePropertiesFoodGroupSelect.md)
 - [DatabaseGetDatabaseResponsePropertiesFoodGroupSelectOptionsInner](docs/DatabaseGetDatabaseResponsePropertiesFoodGroupSelectOptionsInner.md)
 - [DatabaseGetDatabaseResponsePropertiesInStock](docs/DatabaseGetDatabaseResponsePropertiesInStock.md)
 - [DatabaseGetDatabaseResponsePropertiesLastOrdered](docs/DatabaseGetDatabaseResponsePropertiesLastOrdered.md)
 - [DatabaseGetDatabaseResponsePropertiesMeals](docs/DatabaseGetDatabaseResponsePropertiesMeals.md)
 - [DatabaseGetDatabaseResponsePropertiesMealsRelation](docs/DatabaseGetDatabaseResponsePropertiesMealsRelation.md)
 - [DatabaseGetDatabaseResponsePropertiesName](docs/DatabaseGetDatabaseResponsePropertiesName.md)
 - [DatabaseGetDatabaseResponsePropertiesNumberOfMeals](docs/DatabaseGetDatabaseResponsePropertiesNumberOfMeals.md)
 - [DatabaseGetDatabaseResponsePropertiesNumberOfMealsRollup](docs/DatabaseGetDatabaseResponsePropertiesNumberOfMealsRollup.md)
 - [DatabaseGetDatabaseResponsePropertiesPhoto](docs/DatabaseGetDatabaseResponsePropertiesPhoto.md)
 - [DatabaseGetDatabaseResponsePropertiesPrice](docs/DatabaseGetDatabaseResponsePropertiesPrice.md)
 - [DatabaseGetDatabaseResponsePropertiesPriceNumber](docs/DatabaseGetDatabaseResponsePropertiesPriceNumber.md)
 - [DatabaseGetDatabaseResponsePropertiesStoreAvailability](docs/DatabaseGetDatabaseResponsePropertiesStoreAvailability.md)
 - [DatabaseGetDatabaseResponsePropertiesStoreAvailabilityMultiSelect](docs/DatabaseGetDatabaseResponsePropertiesStoreAvailabilityMultiSelect.md)
 - [DatabaseGetDatabaseResponsePropertiesStoreAvailabilityMultiSelectOptionsInner](docs/DatabaseGetDatabaseResponsePropertiesStoreAvailabilityMultiSelectOptionsInner.md)
 - [DatabaseGetDatabaseResponseTitleInner](docs/DatabaseGetDatabaseResponseTitleInner.md)
 - [DatabaseGetDatabaseResponseTitleInnerAnnotations](docs/DatabaseGetDatabaseResponseTitleInnerAnnotations.md)
 - [DatabaseGetDatabaseResponseTitleInnerText](docs/DatabaseGetDatabaseResponseTitleInnerText.md)
 - [DatabaseUpdateDatabaseRequest](docs/DatabaseUpdateDatabaseRequest.md)
 - [PageCreateNewPageRequest](docs/PageCreateNewPageRequest.md)
 - [PageCreateNewPageResponse](docs/PageCreateNewPageResponse.md)
 - [PageCreateNewPageResponseCover](docs/PageCreateNewPageResponseCover.md)
 - [PageCreateNewPageResponseCoverExternal](docs/PageCreateNewPageResponseCoverExternal.md)
 - [PageCreateNewPageResponseCreatedBy](docs/PageCreateNewPageResponseCreatedBy.md)
 - [PageCreateNewPageResponseIcon](docs/PageCreateNewPageResponseIcon.md)
 - [PageCreateNewPageResponseLastEditedBy](docs/PageCreateNewPageResponseLastEditedBy.md)
 - [PageCreateNewPageResponseParent](docs/PageCreateNewPageResponseParent.md)
 - [PageCreateNewPageResponseProperties](docs/PageCreateNewPageResponseProperties.md)
 - [PageCreateNewPageResponsePropertiesCostOfNextTrip](docs/PageCreateNewPageResponsePropertiesCostOfNextTrip.md)
 - [PageCreateNewPageResponsePropertiesDescription](docs/PageCreateNewPageResponsePropertiesDescription.md)
 - [PageCreateNewPageResponsePropertiesFoodGroup](docs/PageCreateNewPageResponsePropertiesFoodGroup.md)
 - [PageCreateNewPageResponsePropertiesInStock](docs/PageCreateNewPageResponsePropertiesInStock.md)
 - [PageCreateNewPageResponsePropertiesLastOrdered](docs/PageCreateNewPageResponsePropertiesLastOrdered.md)
 - [PageCreateNewPageResponsePropertiesName](docs/PageCreateNewPageResponsePropertiesName.md)
 - [PageCreateNewPageResponsePropertiesNumberOfMeals](docs/PageCreateNewPageResponsePropertiesNumberOfMeals.md)
 - [PageCreateNewPageResponsePropertiesPhoto](docs/PageCreateNewPageResponsePropertiesPhoto.md)
 - [PageCreateNewPageResponsePropertiesPrice](docs/PageCreateNewPageResponsePropertiesPrice.md)
 - [PageCreateNewPageResponsePropertiesRecipes](docs/PageCreateNewPageResponsePropertiesRecipes.md)
 - [PageCreateNewPageResponsePropertiesResponsiblePerson](docs/PageCreateNewPageResponsePropertiesResponsiblePerson.md)
 - [PageCreateNewPageResponsePropertiesStoreAvailability](docs/PageCreateNewPageResponsePropertiesStoreAvailability.md)
 - [PageGetPageResponse](docs/PageGetPageResponse.md)
 - [PageGetPageResponseCover](docs/PageGetPageResponseCover.md)
 - [PageGetPageResponseCoverExternal](docs/PageGetPageResponseCoverExternal.md)
 - [PageGetPageResponseCreatedBy](docs/PageGetPageResponseCreatedBy.md)
 - [PageGetPageResponseIcon](docs/PageGetPageResponseIcon.md)
 - [PageGetPageResponseLastEditedBy](docs/PageGetPageResponseLastEditedBy.md)
 - [PageGetPageResponseParent](docs/PageGetPageResponseParent.md)
 - [PageGetPageResponseProperties](docs/PageGetPageResponseProperties.md)
 - [PageGetPageResponsePropertiesCostOfNextTrip](docs/PageGetPageResponsePropertiesCostOfNextTrip.md)
 - [PageGetPageResponsePropertiesCostOfNextTripFormula](docs/PageGetPageResponsePropertiesCostOfNextTripFormula.md)
 - [PageGetPageResponsePropertiesDescription](docs/PageGetPageResponsePropertiesDescription.md)
 - [PageGetPageResponsePropertiesDescriptionRichTextInner](docs/PageGetPageResponsePropertiesDescriptionRichTextInner.md)
 - [PageGetPageResponsePropertiesDescriptionRichTextInnerAnnotations](docs/PageGetPageResponsePropertiesDescriptionRichTextInnerAnnotations.md)
 - [PageGetPageResponsePropertiesDescriptionRichTextInnerText](docs/PageGetPageResponsePropertiesDescriptionRichTextInnerText.md)
 - [PageGetPageResponsePropertiesFoodGroup](docs/PageGetPageResponsePropertiesFoodGroup.md)
 - [PageGetPageResponsePropertiesFoodGroupSelect](docs/PageGetPageResponsePropertiesFoodGroupSelect.md)
 - [PageGetPageResponsePropertiesInStock](docs/PageGetPageResponsePropertiesInStock.md)
 - [PageGetPageResponsePropertiesLastOrdered](docs/PageGetPageResponsePropertiesLastOrdered.md)
 - [PageGetPageResponsePropertiesLastOrderedDate](docs/PageGetPageResponsePropertiesLastOrderedDate.md)
 - [PageGetPageResponsePropertiesName](docs/PageGetPageResponsePropertiesName.md)
 - [PageGetPageResponsePropertiesNameTitleInner](docs/PageGetPageResponsePropertiesNameTitleInner.md)
 - [PageGetPageResponsePropertiesNameTitleInnerAnnotations](docs/PageGetPageResponsePropertiesNameTitleInnerAnnotations.md)
 - [PageGetPageResponsePropertiesNameTitleInnerText](docs/PageGetPageResponsePropertiesNameTitleInnerText.md)
 - [PageGetPageResponsePropertiesNumberOfMeals](docs/PageGetPageResponsePropertiesNumberOfMeals.md)
 - [PageGetPageResponsePropertiesNumberOfMealsRollup](docs/PageGetPageResponsePropertiesNumberOfMealsRollup.md)
 - [PageGetPageResponsePropertiesPhoto](docs/PageGetPageResponsePropertiesPhoto.md)
 - [PageGetPageResponsePropertiesPrice](docs/PageGetPageResponsePropertiesPrice.md)
 - [PageGetPageResponsePropertiesRecipes](docs/PageGetPageResponsePropertiesRecipes.md)
 - [PageGetPageResponsePropertiesRecipesRelationInner](docs/PageGetPageResponsePropertiesRecipesRelationInner.md)
 - [PageGetPageResponsePropertiesResponsiblePerson](docs/PageGetPageResponsePropertiesResponsiblePerson.md)
 - [PageGetPageResponsePropertiesResponsiblePersonPeopleInner](docs/PageGetPageResponsePropertiesResponsiblePersonPeopleInner.md)
 - [PageGetPageResponsePropertiesResponsiblePersonPeopleInnerPerson](docs/PageGetPageResponsePropertiesResponsiblePersonPeopleInnerPerson.md)
 - [PageGetPageResponsePropertiesStoreAvailability](docs/PageGetPageResponsePropertiesStoreAvailability.md)
 - [PageGetPageResponsePropertiesStoreAvailabilityMultiSelectInner](docs/PageGetPageResponsePropertiesStoreAvailabilityMultiSelectInner.md)
 - [PageUpdatePropertiesRequest](docs/PageUpdatePropertiesRequest.md)
 - [PageUpdatePropertiesResponse](docs/PageUpdatePropertiesResponse.md)
 - [PageUpdatePropertiesResponseCover](docs/PageUpdatePropertiesResponseCover.md)
 - [PageUpdatePropertiesResponseCoverExternal](docs/PageUpdatePropertiesResponseCoverExternal.md)
 - [PageUpdatePropertiesResponseCreatedBy](docs/PageUpdatePropertiesResponseCreatedBy.md)
 - [PageUpdatePropertiesResponseIcon](docs/PageUpdatePropertiesResponseIcon.md)
 - [PageUpdatePropertiesResponseLastEditedBy](docs/PageUpdatePropertiesResponseLastEditedBy.md)
 - [PageUpdatePropertiesResponseParent](docs/PageUpdatePropertiesResponseParent.md)
 - [PageUpdatePropertiesResponseProperties](docs/PageUpdatePropertiesResponseProperties.md)
 - [PageUpdatePropertiesResponsePropertiesCostOfNextTrip](docs/PageUpdatePropertiesResponsePropertiesCostOfNextTrip.md)
 - [PageUpdatePropertiesResponsePropertiesDescription](docs/PageUpdatePropertiesResponsePropertiesDescription.md)
 - [PageUpdatePropertiesResponsePropertiesFoodGroup](docs/PageUpdatePropertiesResponsePropertiesFoodGroup.md)
 - [PageUpdatePropertiesResponsePropertiesInStock](docs/PageUpdatePropertiesResponsePropertiesInStock.md)
 - [PageUpdatePropertiesResponsePropertiesLastOrdered](docs/PageUpdatePropertiesResponsePropertiesLastOrdered.md)
 - [PageUpdatePropertiesResponsePropertiesName](docs/PageUpdatePropertiesResponsePropertiesName.md)
 - [PageUpdatePropertiesResponsePropertiesNumberOfMeals](docs/PageUpdatePropertiesResponsePropertiesNumberOfMeals.md)
 - [PageUpdatePropertiesResponsePropertiesPhoto](docs/PageUpdatePropertiesResponsePropertiesPhoto.md)
 - [PageUpdatePropertiesResponsePropertiesPrice](docs/PageUpdatePropertiesResponsePropertiesPrice.md)
 - [PageUpdatePropertiesResponsePropertiesRecipes](docs/PageUpdatePropertiesResponsePropertiesRecipes.md)
 - [PageUpdatePropertiesResponsePropertiesResponsiblePerson](docs/PageUpdatePropertiesResponsePropertiesResponsiblePerson.md)
 - [PageUpdatePropertiesResponsePropertiesStoreAvailability](docs/PageUpdatePropertiesResponsePropertiesStoreAvailability.md)
 - [SearchByTitleRequest](docs/SearchByTitleRequest.md)
 - [SearchByTitleRequestFilter](docs/SearchByTitleRequestFilter.md)
 - [SearchByTitleRequestSort](docs/SearchByTitleRequestSort.md)
 - [SearchByTitleResponse](docs/SearchByTitleResponse.md)
 - [SearchByTitleResponseResultsInner](docs/SearchByTitleResponseResultsInner.md)
 - [SearchByTitleResponseResultsInnerCover](docs/SearchByTitleResponseResultsInnerCover.md)
 - [SearchByTitleResponseResultsInnerCoverExternal](docs/SearchByTitleResponseResultsInnerCoverExternal.md)
 - [SearchByTitleResponseResultsInnerCreatedBy](docs/SearchByTitleResponseResultsInnerCreatedBy.md)
 - [SearchByTitleResponseResultsInnerIcon](docs/SearchByTitleResponseResultsInnerIcon.md)
 - [SearchByTitleResponseResultsInnerLastEditedBy](docs/SearchByTitleResponseResultsInnerLastEditedBy.md)
 - [SearchByTitleResponseResultsInnerParent](docs/SearchByTitleResponseResultsInnerParent.md)
 - [SearchByTitleResponseResultsInnerProperties](docs/SearchByTitleResponseResultsInnerProperties.md)
 - [SearchByTitleResponseResultsInnerPropertiesCostOfNextTrip](docs/SearchByTitleResponseResultsInnerPropertiesCostOfNextTrip.md)
 - [SearchByTitleResponseResultsInnerPropertiesCostOfNextTripFormula](docs/SearchByTitleResponseResultsInnerPropertiesCostOfNextTripFormula.md)
 - [SearchByTitleResponseResultsInnerPropertiesDescription](docs/SearchByTitleResponseResultsInnerPropertiesDescription.md)
 - [SearchByTitleResponseResultsInnerPropertiesDescriptionRichTextInner](docs/SearchByTitleResponseResultsInnerPropertiesDescriptionRichTextInner.md)
 - [SearchByTitleResponseResultsInnerPropertiesDescriptionRichTextInnerAnnotations](docs/SearchByTitleResponseResultsInnerPropertiesDescriptionRichTextInnerAnnotations.md)
 - [SearchByTitleResponseResultsInnerPropertiesDescriptionRichTextInnerText](docs/SearchByTitleResponseResultsInnerPropertiesDescriptionRichTextInnerText.md)
 - [SearchByTitleResponseResultsInnerPropertiesFoodGroup](docs/SearchByTitleResponseResultsInnerPropertiesFoodGroup.md)
 - [SearchByTitleResponseResultsInnerPropertiesFoodGroupSelect](docs/SearchByTitleResponseResultsInnerPropertiesFoodGroupSelect.md)
 - [SearchByTitleResponseResultsInnerPropertiesInStock](docs/SearchByTitleResponseResultsInnerPropertiesInStock.md)
 - [SearchByTitleResponseResultsInnerPropertiesLastOrdered](docs/SearchByTitleResponseResultsInnerPropertiesLastOrdered.md)
 - [SearchByTitleResponseResultsInnerPropertiesName](docs/SearchByTitleResponseResultsInnerPropertiesName.md)
 - [SearchByTitleResponseResultsInnerPropertiesNameTitleInner](docs/SearchByTitleResponseResultsInnerPropertiesNameTitleInner.md)
 - [SearchByTitleResponseResultsInnerPropertiesNameTitleInnerAnnotations](docs/SearchByTitleResponseResultsInnerPropertiesNameTitleInnerAnnotations.md)
 - [SearchByTitleResponseResultsInnerPropertiesNameTitleInnerText](docs/SearchByTitleResponseResultsInnerPropertiesNameTitleInnerText.md)
 - [SearchByTitleResponseResultsInnerPropertiesNumberOfMeals](docs/SearchByTitleResponseResultsInnerPropertiesNumberOfMeals.md)
 - [SearchByTitleResponseResultsInnerPropertiesNumberOfMealsRollup](docs/SearchByTitleResponseResultsInnerPropertiesNumberOfMealsRollup.md)
 - [SearchByTitleResponseResultsInnerPropertiesPhoto](docs/SearchByTitleResponseResultsInnerPropertiesPhoto.md)
 - [SearchByTitleResponseResultsInnerPropertiesPrice](docs/SearchByTitleResponseResultsInnerPropertiesPrice.md)
 - [SearchByTitleResponseResultsInnerPropertiesRecipes](docs/SearchByTitleResponseResultsInnerPropertiesRecipes.md)
 - [SearchByTitleResponseResultsInnerPropertiesResponsiblePerson](docs/SearchByTitleResponseResultsInnerPropertiesResponsiblePerson.md)
 - [SearchByTitleResponseResultsInnerPropertiesStoreAvailability](docs/SearchByTitleResponseResultsInnerPropertiesStoreAvailability.md)
 - [TokenGenerateAccessRequest](docs/TokenGenerateAccessRequest.md)
 - [TokenGenerateAccessResponse](docs/TokenGenerateAccessResponse.md)
 - [TokenGenerateAccessResponseOwner](docs/TokenGenerateAccessResponseOwner.md)
 - [UserGetTokenBotUserResponse](docs/UserGetTokenBotUserResponse.md)
 - [UserGetTokenBotUserResponseBot](docs/UserGetTokenBotUserResponseBot.md)
 - [UserGetTokenBotUserResponseBotOwner](docs/UserGetTokenBotUserResponseBotOwner.md)
 - [UserGetTokenBotUserResponseBotOwnerUser](docs/UserGetTokenBotUserResponseBotOwnerUser.md)
 - [UserGetTokenBotUserResponseBotOwnerUserPerson](docs/UserGetTokenBotUserResponseBotOwnerUserPerson.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
