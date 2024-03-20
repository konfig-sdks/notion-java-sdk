

# SearchByTitleRequestFilter

A set of criteria, `value` and `property` keys, that limits the results to either only pages or only databases. Possible `value` values are `\"page\"` or `\"database\"`. The only supported `property` value is `\"object\"`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **String** | The value of the property to filter the results by.  Possible values for object type include &#x60;page&#x60; or &#x60;database&#x60;.  **Limitation**: Currently the only filter allowed is &#x60;object&#x60; which will filter by type of object (either &#x60;page&#x60; or &#x60;database&#x60;) |  [optional] |
|**property** | **String** | The name of the property to filter by. Currently the only property you can filter by is the object type.  Possible values include &#x60;object&#x60;.   Limitation: Currently the only filter allowed is &#x60;object&#x60; which will filter by type of object (either &#x60;page&#x60; or &#x60;database&#x60;) |  [optional] |



