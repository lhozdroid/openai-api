/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.RealtimeConversationItemWithReference;
import org.openapitools.client.model.RealtimeResponseCreateParamsConversation;
import org.openapitools.client.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.client.model.RealtimeResponseCreateParamsToolsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Create a new Realtime response with these parameters
 */
@JsonPropertyOrder({
  RealtimeResponseCreateParams.JSON_PROPERTY_MODALITIES,
  RealtimeResponseCreateParams.JSON_PROPERTY_INSTRUCTIONS,
  RealtimeResponseCreateParams.JSON_PROPERTY_VOICE,
  RealtimeResponseCreateParams.JSON_PROPERTY_OUTPUT_AUDIO_FORMAT,
  RealtimeResponseCreateParams.JSON_PROPERTY_TOOLS,
  RealtimeResponseCreateParams.JSON_PROPERTY_TOOL_CHOICE,
  RealtimeResponseCreateParams.JSON_PROPERTY_TEMPERATURE,
  RealtimeResponseCreateParams.JSON_PROPERTY_MAX_RESPONSE_OUTPUT_TOKENS,
  RealtimeResponseCreateParams.JSON_PROPERTY_CONVERSATION,
  RealtimeResponseCreateParams.JSON_PROPERTY_METADATA,
  RealtimeResponseCreateParams.JSON_PROPERTY_INPUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class RealtimeResponseCreateParams {
  /**
   * Gets or Sets modalities
   */
  public enum ModalitiesEnum {
    TEXT(String.valueOf("text")),
    
    AUDIO(String.valueOf("audio"));

    private String value;

    ModalitiesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModalitiesEnum fromValue(String value) {
      for (ModalitiesEnum b : ModalitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MODALITIES = "modalities";
  @javax.annotation.Nullable
  private List<ModalitiesEnum> modalities = new ArrayList<>();

  public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
  @javax.annotation.Nullable
  private String instructions;

  /**
   * The voice the model uses to respond. Voice cannot be changed during the session once the model has responded with audio at least once. Current voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;, &#x60;shimmer&#x60; and &#x60;verse&#x60;. 
   */
  public enum VoiceEnum {
    ALLOY(String.valueOf("alloy")),
    
    ASH(String.valueOf("ash")),
    
    BALLAD(String.valueOf("ballad")),
    
    CORAL(String.valueOf("coral")),
    
    ECHO(String.valueOf("echo")),
    
    SAGE(String.valueOf("sage")),
    
    SHIMMER(String.valueOf("shimmer")),
    
    VERSE(String.valueOf("verse"));

    private String value;

    VoiceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VoiceEnum fromValue(String value) {
      for (VoiceEnum b : VoiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VOICE = "voice";
  @javax.annotation.Nullable
  private VoiceEnum voice;

  /**
   * The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   */
  public enum OutputAudioFormatEnum {
    PCM16(String.valueOf("pcm16")),
    
    G711_ULAW(String.valueOf("g711_ulaw")),
    
    G711_ALAW(String.valueOf("g711_alaw"));

    private String value;

    OutputAudioFormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OutputAudioFormatEnum fromValue(String value) {
      for (OutputAudioFormatEnum b : OutputAudioFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OUTPUT_AUDIO_FORMAT = "output_audio_format";
  @javax.annotation.Nullable
  private OutputAudioFormatEnum outputAudioFormat;

  public static final String JSON_PROPERTY_TOOLS = "tools";
  @javax.annotation.Nullable
  private List<RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>();

  public static final String JSON_PROPERTY_TOOL_CHOICE = "tool_choice";
  @javax.annotation.Nullable
  private String toolChoice;

  public static final String JSON_PROPERTY_TEMPERATURE = "temperature";
  @javax.annotation.Nullable
  private BigDecimal temperature;

  public static final String JSON_PROPERTY_MAX_RESPONSE_OUTPUT_TOKENS = "max_response_output_tokens";
  @javax.annotation.Nullable
  private RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens;

  public static final String JSON_PROPERTY_CONVERSATION = "conversation";
  @javax.annotation.Nullable
  private RealtimeResponseCreateParamsConversation conversation;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable
  private JsonNullable<Map<String, String>> metadata = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_INPUT = "input";
  @javax.annotation.Nullable
  private List<RealtimeConversationItemWithReference> input = new ArrayList<>();

  public RealtimeResponseCreateParams() {
  }

  public RealtimeResponseCreateParams modalities(@javax.annotation.Nullable List<ModalitiesEnum> modalities) {
    
    this.modalities = modalities;
    return this;
  }

  public RealtimeResponseCreateParams addModalitiesItem(ModalitiesEnum modalitiesItem) {
    if (this.modalities == null) {
      this.modalities = new ArrayList<>();
    }
    this.modalities.add(modalitiesItem);
    return this;
  }

  /**
   * The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;]. 
   * @return modalities
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODALITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }


  @JsonProperty(JSON_PROPERTY_MODALITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModalities(@javax.annotation.Nullable List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

  public RealtimeResponseCreateParams instructions(@javax.annotation.Nullable String instructions) {
    
    this.instructions = instructions;
    return this;
  }

  /**
   * The default system instructions (i.e. system message) prepended to model calls. This field allows the client to guide the model on desired responses. The model can be instructed on response content and format, (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed to be followed by the model, but they provide guidance to the model on the desired behavior.  Note that the server sets default instructions which will be used if this field is not set and are visible in the &#x60;session.created&#x60; event at the start of the session. 
   * @return instructions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstructions() {
    return instructions;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstructions(@javax.annotation.Nullable String instructions) {
    this.instructions = instructions;
  }

  public RealtimeResponseCreateParams voice(@javax.annotation.Nullable VoiceEnum voice) {
    
    this.voice = voice;
    return this;
  }

  /**
   * The voice the model uses to respond. Voice cannot be changed during the session once the model has responded with audio at least once. Current voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;, &#x60;shimmer&#x60; and &#x60;verse&#x60;. 
   * @return voice
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VoiceEnum getVoice() {
    return voice;
  }


  @JsonProperty(JSON_PROPERTY_VOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoice(@javax.annotation.Nullable VoiceEnum voice) {
    this.voice = voice;
  }

  public RealtimeResponseCreateParams outputAudioFormat(@javax.annotation.Nullable OutputAudioFormatEnum outputAudioFormat) {
    
    this.outputAudioFormat = outputAudioFormat;
    return this;
  }

  /**
   * The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;. 
   * @return outputAudioFormat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT_AUDIO_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutputAudioFormatEnum getOutputAudioFormat() {
    return outputAudioFormat;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_AUDIO_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputAudioFormat(@javax.annotation.Nullable OutputAudioFormatEnum outputAudioFormat) {
    this.outputAudioFormat = outputAudioFormat;
  }

  public RealtimeResponseCreateParams tools(@javax.annotation.Nullable List<RealtimeResponseCreateParamsToolsInner> tools) {
    
    this.tools = tools;
    return this;
  }

  public RealtimeResponseCreateParams addToolsItem(RealtimeResponseCreateParamsToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * Tools (functions) available to the model.
   * @return tools
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RealtimeResponseCreateParamsToolsInner> getTools() {
    return tools;
  }


  @JsonProperty(JSON_PROPERTY_TOOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTools(@javax.annotation.Nullable List<RealtimeResponseCreateParamsToolsInner> tools) {
    this.tools = tools;
  }

  public RealtimeResponseCreateParams toolChoice(@javax.annotation.Nullable String toolChoice) {
    
    this.toolChoice = toolChoice;
    return this;
  }

  /**
   * How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or specify a function, like &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60;. 
   * @return toolChoice
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_CHOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToolChoice() {
    return toolChoice;
  }


  @JsonProperty(JSON_PROPERTY_TOOL_CHOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToolChoice(@javax.annotation.Nullable String toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RealtimeResponseCreateParams temperature(@javax.annotation.Nullable BigDecimal temperature) {
    
    this.temperature = temperature;
    return this;
  }

  /**
   * Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
   * @return temperature
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPERATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTemperature() {
    return temperature;
  }


  @JsonProperty(JSON_PROPERTY_TEMPERATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemperature(@javax.annotation.Nullable BigDecimal temperature) {
    this.temperature = temperature;
  }

  public RealtimeResponseCreateParams maxResponseOutputTokens(@javax.annotation.Nullable RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    
    this.maxResponseOutputTokens = maxResponseOutputTokens;
    return this;
  }

  /**
   * Get maxResponseOutputTokens
   * @return maxResponseOutputTokens
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_RESPONSE_OUTPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RealtimeResponseCreateParamsMaxResponseOutputTokens getMaxResponseOutputTokens() {
    return maxResponseOutputTokens;
  }


  @JsonProperty(JSON_PROPERTY_MAX_RESPONSE_OUTPUT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxResponseOutputTokens(@javax.annotation.Nullable RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens) {
    this.maxResponseOutputTokens = maxResponseOutputTokens;
  }

  public RealtimeResponseCreateParams conversation(@javax.annotation.Nullable RealtimeResponseCreateParamsConversation conversation) {
    
    this.conversation = conversation;
    return this;
  }

  /**
   * Get conversation
   * @return conversation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RealtimeResponseCreateParamsConversation getConversation() {
    return conversation;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversation(@javax.annotation.Nullable RealtimeResponseCreateParamsConversation conversation) {
    this.conversation = conversation;
  }

  public RealtimeResponseCreateParams metadata(@javax.annotation.Nullable Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
    
    return this;
  }

  public RealtimeResponseCreateParams putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.metadata.get().put(key, metadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.  Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters. 
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, String> getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Map<String, String>> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(@javax.annotation.Nullable Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
  }

  public RealtimeResponseCreateParams input(@javax.annotation.Nullable List<RealtimeConversationItemWithReference> input) {
    
    this.input = input;
    return this;
  }

  public RealtimeResponseCreateParams addInputItem(RealtimeConversationItemWithReference inputItem) {
    if (this.input == null) {
      this.input = new ArrayList<>();
    }
    this.input.add(inputItem);
    return this;
  }

  /**
   * Input items to include in the prompt for the model. Using this field creates a new context for this Response instead of using the default conversation. An empty array &#x60;[]&#x60; will clear the context for this Response. Note that this can include references to items from the default conversation. 
   * @return input
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RealtimeConversationItemWithReference> getInput() {
    return input;
  }


  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInput(@javax.annotation.Nullable List<RealtimeConversationItemWithReference> input) {
    this.input = input;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseCreateParams realtimeResponseCreateParams = (RealtimeResponseCreateParams) o;
    return Objects.equals(this.modalities, realtimeResponseCreateParams.modalities) &&
        Objects.equals(this.instructions, realtimeResponseCreateParams.instructions) &&
        Objects.equals(this.voice, realtimeResponseCreateParams.voice) &&
        Objects.equals(this.outputAudioFormat, realtimeResponseCreateParams.outputAudioFormat) &&
        Objects.equals(this.tools, realtimeResponseCreateParams.tools) &&
        Objects.equals(this.toolChoice, realtimeResponseCreateParams.toolChoice) &&
        Objects.equals(this.temperature, realtimeResponseCreateParams.temperature) &&
        Objects.equals(this.maxResponseOutputTokens, realtimeResponseCreateParams.maxResponseOutputTokens) &&
        Objects.equals(this.conversation, realtimeResponseCreateParams.conversation) &&
        equalsNullable(this.metadata, realtimeResponseCreateParams.metadata) &&
        Objects.equals(this.input, realtimeResponseCreateParams.input);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(modalities, instructions, voice, outputAudioFormat, tools, toolChoice, temperature, maxResponseOutputTokens, conversation, hashCodeNullable(metadata), input);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseCreateParams {\n");
    sb.append("    modalities: ").append(toIndentedString(modalities)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    outputAudioFormat: ").append(toIndentedString(outputAudioFormat)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    maxResponseOutputTokens: ").append(toIndentedString(maxResponseOutputTokens)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `modalities` to the URL query string
    if (getModalities() != null) {
      for (int i = 0; i < getModalities().size(); i++) {
        try {
          joiner.add(String.format("%smodalities%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getModalities().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `instructions` to the URL query string
    if (getInstructions() != null) {
      try {
        joiner.add(String.format("%sinstructions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstructions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `voice` to the URL query string
    if (getVoice() != null) {
      try {
        joiner.add(String.format("%svoice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVoice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `output_audio_format` to the URL query string
    if (getOutputAudioFormat() != null) {
      try {
        joiner.add(String.format("%soutput_audio_format%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOutputAudioFormat()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tools` to the URL query string
    if (getTools() != null) {
      for (int i = 0; i < getTools().size(); i++) {
        if (getTools().get(i) != null) {
          joiner.add(getTools().get(i).toUrlQueryString(String.format("%stools%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `tool_choice` to the URL query string
    if (getToolChoice() != null) {
      try {
        joiner.add(String.format("%stool_choice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToolChoice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `temperature` to the URL query string
    if (getTemperature() != null) {
      try {
        joiner.add(String.format("%stemperature%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTemperature()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `max_response_output_tokens` to the URL query string
    if (getMaxResponseOutputTokens() != null) {
      joiner.add(getMaxResponseOutputTokens().toUrlQueryString(prefix + "max_response_output_tokens" + suffix));
    }

    // add `conversation` to the URL query string
    if (getConversation() != null) {
      joiner.add(getConversation().toUrlQueryString(prefix + "conversation" + suffix));
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      for (String _key : getMetadata().keySet()) {
        try {
          joiner.add(String.format("%smetadata%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMetadata().get(_key), URLEncoder.encode(String.valueOf(getMetadata().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `input` to the URL query string
    if (getInput() != null) {
      for (int i = 0; i < getInput().size(); i++) {
        if (getInput().get(i) != null) {
          joiner.add(getInput().get(i).toUrlQueryString(String.format("%sinput%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

