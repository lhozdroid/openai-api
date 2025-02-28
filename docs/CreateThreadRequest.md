

# CreateThreadRequest

Options to create a new thread. If no thread is provided when running a request, an empty thread will be created. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messages** | [**List&lt;CreateMessageRequest&gt;**](CreateMessageRequest.md) | A list of [messages](/docs/api-reference/messages) to start the thread with. |  [optional] |
|**toolResources** | [**CreateThreadRequestToolResources**](CreateThreadRequestToolResources.md) |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.  Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters.  |  [optional] |



