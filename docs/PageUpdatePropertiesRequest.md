

# PageUpdatePropertiesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**properties** | **String** | The property values to update for the page. The keys are the names or IDs of the property and the values are property values. If a page property ID is not included, then it is not changed. |  [optional] |
|**archived** | **Boolean** | Whether the page is archived (deleted). Set to true to archive a page. Set to false to un-archive (restore) a page. |  [optional] |
|**icon** | **String** | A page icon for the page. Supported types are [external file object](https://developers.notion.com/reference/file-object) or [emoji object](https://developers.notion.com/reference/emoji-object). |  [optional] |
|**cover** | **String** | A cover image for the page. Only [external file objects](https://developers.notion.com/reference/file-object) are supported. |  [optional] |



