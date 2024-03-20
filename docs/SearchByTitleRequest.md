

# SearchByTitleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**query** | **String** | The text that the API compares page and database titles against. |  [optional] |
|**sort** | [**SearchByTitleRequestSort**](SearchByTitleRequestSort.md) |  |  [optional] |
|**filter** | [**SearchByTitleRequestFilter**](SearchByTitleRequestFilter.md) |  |  [optional] |
|**startCursor** | **String** | A &#x60;cursor&#x60; value returned in a previous response that If supplied, limits the response to results starting after the &#x60;cursor&#x60;. If not supplied, then the first page of results is returned. Refer to [pagination](https://developers.notion.com/reference/intro#pagination) for more details. |  [optional] |
|**pageSize** | **Integer** | The number of items from the full list to include in the response. Maximum: &#x60;100&#x60;. |  [optional] |



