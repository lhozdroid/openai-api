

# RealtimeSessionCreateRequestInputAudioTranscription

Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native to the model, since the model consumes audio directly. Transcription runs  asynchronously through [OpenAI Whisper transcription](https://platform.openai.com/docs/api-reference/audio/createTranscription) and should be treated as rough guidance rather than the representation understood by the model. The client can optionally set the language and prompt for transcription, these fields will be passed to the Whisper API. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** | The model to use for transcription, &#x60;whisper-1&#x60; is the only currently supported model.  |  [optional] |
|**language** | **String** | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) (e.g. &#x60;en&#x60;) format will improve accuracy and latency.  |  [optional] |
|**prompt** | **String** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  |  [optional] |



