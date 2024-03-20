

# DatabaseUpdateDatabaseRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **List** | An array of [rich text objects](https://developers.notion.com/reference/rich-text) that represents the title of the database that is displayed in the Notion UI. If omitted, then the database title remains unchanged. |  [optional] |
|**description** | **List** | An array of [rich text objects](https://developers.notion.com/reference/rich-text) that represents the description of the database that is displayed in the Notion UI. If omitted, then the database description remains unchanged. |  [optional] |
|**properties** | **String** | The properties of a database to be changed in the request, in the form of a JSON object. If updating an existing property, then the keys are the names or IDs of the properties as they appear in Notion, and the values are [property schema objects](ref:property-schema-object). If adding a new property, then the key is the name of the new database property and the value is a [property schema object](ref:property-schema-object). |  [optional] |



