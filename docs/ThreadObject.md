

# ThreadObject

Represents a thread that contains [messages](/docs/api-reference/messages).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier, which can be referenced in API endpoints. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread&#x60;. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the thread was created. |  |
|**toolResources** | [**ModifyThreadRequestToolResources**](ModifyThreadRequestToolResources.md) |  |  |
|**metadata** | **Map&lt;String, String&gt;** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.  Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| THREAD | &quot;thread&quot; |



