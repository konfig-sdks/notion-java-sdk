

# TokenGenerateAccessRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique random code that Notion generates to authenticate with your service, generated when a user initiates the OAuth flow. |  |
|**grantType** | **String** | A constant string: \&quot;authorization_code\&quot;. |  |
|**redirectUri** | **String** | The &#x60;\&quot;redirect_uri\&quot;&#x60; that was provided in the OAuth Domain &amp; URI section of the integration&#39;s Authorization settings. Do not include this field if a &#x60;\&quot;redirect_uri\&quot;&#x60; query param was not included in the Authorization URL provided to users. In most cases, this field is required. |  |
|**externalAccount** | **Object** | Required if and only when building [Link Preview](https://developers.notion.com/docs/link-previews) integrations (otherwise ignored). An object with &#x60;key&#x60; and &#x60;name&#x60; properties. &#x60;key&#x60; should be a unique identifier for the account. Notion uses the &#x60;key&#x60; to determine whether or not the user is re-connecting the same account. &#x60;name&#x60; should be some way for the user to know which account they used to authenticate with your service. If a user has authenticated Notion with your integration before and &#x60;key&#x60; is the same but &#x60;name&#x60; is different, then Notion updates the &#x60;name&#x60; associated with your integration. |  [optional] |



