

# PageCreateNewPageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parent** | **String** | The parent page or database where the new page is inserted, represented as a JSON object with a &#x60;page_id&#x60; or &#x60;database_id&#x60; key, and the corresponding ID. |  |
|**properties** | **String** | The values of the page’s properties. If the &#x60;parent&#x60; is a database, then the schema must match the parent database’s properties. If the &#x60;parent&#x60; is a page, then the only valid object key is &#x60;title&#x60;. |  |
|**children** | **List&lt;String&gt;** | The content to be rendered on the new page, represented as an array of [block objects](https://developers.notion.com/reference/block). |  [optional] |
|**icon** | **String** | The icon of the new page. Either an [emoji object](https://developers.notion.com/reference/emoji-object) or an [external file object](https://developers.notion.com/reference/file-object).. |  [optional] |
|**cover** | **String** | The cover image of the new page, represented as a [file object](https://developers.notion.com/reference/file-object). |  [optional] |



