

# CreateRunRequestToolChoice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the tool. If type is &#x60;function&#x60;, the function name must be set |  |
|**function** | [**AssistantsNamedToolChoiceFunction**](AssistantsNamedToolChoiceFunction.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FUNCTION | &quot;function&quot; |
| CODE_INTERPRETER | &quot;code_interpreter&quot; |
| FILE_SEARCH | &quot;file_search&quot; |



