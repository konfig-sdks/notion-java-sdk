

# DatabaseExecuteQueryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filter** | **String** | When supplied, limits which pages are returned based on the [filter conditions](ref:post-database-query-filter). |  [optional] |
|**sorts** | **List** | When supplied, orders the results based on the provided [sort criteria](ref:post-database-query-sort). |  [optional] |
|**startCursor** | **String** | When supplied, returns a page of results starting after the cursor provided. If not supplied, this endpoint will return the first page of results. |  [optional] |
|**pageSize** | **Integer** | The number of items from the full list desired in the response. Maximum: 100 |  [optional] |



