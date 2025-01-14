

# CreateChatCompletionRequestPrediction

Configuration for a [Predicted Output](/docs/guides/predicted-outputs), which can greatly improve response times when large parts of the model response are known ahead of time. This is most common when you are regenerating a file with only minor changes to most of the content. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;.  |  |
|**content** | [**PredictionContentContent**](PredictionContentContent.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONTENT | &quot;content&quot; |



