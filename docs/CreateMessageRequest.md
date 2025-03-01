

# CreateMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | [**RoleEnum**](#RoleEnum) | The role of the entity that is creating the message. Allowed values include: - &#x60;user&#x60;: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - &#x60;assistant&#x60;: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation.  |  |
|**content** | [**CreateMessageRequestContent**](CreateMessageRequestContent.md) |  |  |
|**attachments** | [**List&lt;CreateMessageRequestAttachmentsInner&gt;**](CreateMessageRequestAttachmentsInner.md) | A list of files attached to the message, and the tools they should be added to. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.  Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ASSISTANT | &quot;assistant&quot; |



