

# SearchByTitleRequestSort

A set of criteria, `direction` and `timestamp` keys, that orders the results. The **only** supported timestamp value is `\"last_edited_time\"`. Supported `direction` values are `\"ascending\"` and `\"descending\"`. If `sort` is not provided, then the most recently edited results are returned first.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**direction** | **String** | The direction to sort. Possible values include &#x60;ascending&#x60; and &#x60;descending&#x60;. |  [optional] |
|**timestamp** | **String** | The name of the timestamp to sort against. Possible values include &#x60;last_edited_time&#x60;. |  [optional] |



