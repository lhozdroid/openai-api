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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ChatCompletionMessageToolCall;
import org.openapitools.client.model.ChatCompletionRequestAssistantMessageAudio;
import org.openapitools.client.model.ChatCompletionRequestAssistantMessageContent;
import org.openapitools.client.model.ChatCompletionRequestAssistantMessageFunctionCall;
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
 * FineTuneChatCompletionRequestAssistantMessage
 */
@JsonPropertyOrder({
  FineTuneChatCompletionRequestAssistantMessage.JSON_PROPERTY_CONTENT,
  FineTuneChatCompletionRequestAssistantMessage.JSON_PROPERTY_REFUSAL,
  FineTuneChatCompletionRequestAssistantMessage.JSON_PROPERTY_ROLE,
  FineTuneChatCompletionRequestAssistantMessage.JSON_PROPERTY_NAME,
  FineTuneChatCompletionRequestAssistantMessage.JSON_PROPERTY_AUDIO,
  FineTuneChatCompletionRequestAssistantMessage.JSON_PROPERTY_TOOL_CALLS,
  FineTuneChatCompletionRequestAssistantMessage.JSON_PROPERTY_FUNCTION_CALL,
  FineTuneChatCompletionRequestAssistantMessage.JSON_PROPERTY_WEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class FineTuneChatCompletionRequestAssistantMessage {
  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nullable
  private JsonNullable<ChatCompletionRequestAssistantMessageContent> content = JsonNullable.<ChatCompletionRequestAssistantMessageContent>undefined();

  public static final String JSON_PROPERTY_REFUSAL = "refusal";
  @javax.annotation.Nullable
  private JsonNullable<String> refusal = JsonNullable.<String>undefined();

  /**
   * The role of the messages author, in this case &#x60;assistant&#x60;.
   */
  public enum RoleEnum {
    ASSISTANT(String.valueOf("assistant"));

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  @javax.annotation.Nonnull
  private RoleEnum role;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_AUDIO = "audio";
  @javax.annotation.Nullable
  private JsonNullable<ChatCompletionRequestAssistantMessageAudio> audio = JsonNullable.<ChatCompletionRequestAssistantMessageAudio>undefined();

  public static final String JSON_PROPERTY_TOOL_CALLS = "tool_calls";
  @javax.annotation.Nullable
  private List<ChatCompletionMessageToolCall> toolCalls = new ArrayList<>();

  public static final String JSON_PROPERTY_FUNCTION_CALL = "function_call";
  @javax.annotation.Nullable
  private JsonNullable<ChatCompletionRequestAssistantMessageFunctionCall> functionCall = JsonNullable.<ChatCompletionRequestAssistantMessageFunctionCall>undefined();

  /**
   * Controls whether the assistant message is trained against (0 or 1)
   */
  public enum WeightEnum {
    NUMBER_0(Integer.valueOf(0)),
    
    NUMBER_1(Integer.valueOf(1));

    private Integer value;

    WeightEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WeightEnum fromValue(Integer value) {
      for (WeightEnum b : WeightEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  @javax.annotation.Nullable
  private WeightEnum weight;

  public FineTuneChatCompletionRequestAssistantMessage() {
  }

  public FineTuneChatCompletionRequestAssistantMessage content(@javax.annotation.Nullable ChatCompletionRequestAssistantMessageContent content) {
    this.content = JsonNullable.<ChatCompletionRequestAssistantMessageContent>of(content);
    
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public ChatCompletionRequestAssistantMessageContent getContent() {
        return content.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ChatCompletionRequestAssistantMessageContent> getContent_JsonNullable() {
    return content;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT)
  public void setContent_JsonNullable(JsonNullable<ChatCompletionRequestAssistantMessageContent> content) {
    this.content = content;
  }

  public void setContent(@javax.annotation.Nullable ChatCompletionRequestAssistantMessageContent content) {
    this.content = JsonNullable.<ChatCompletionRequestAssistantMessageContent>of(content);
  }

  public FineTuneChatCompletionRequestAssistantMessage refusal(@javax.annotation.Nullable String refusal) {
    this.refusal = JsonNullable.<String>of(refusal);
    
    return this;
  }

  /**
   * The refusal message by the assistant.
   * @return refusal
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getRefusal() {
        return refusal.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFUSAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRefusal_JsonNullable() {
    return refusal;
  }
  
  @JsonProperty(JSON_PROPERTY_REFUSAL)
  public void setRefusal_JsonNullable(JsonNullable<String> refusal) {
    this.refusal = refusal;
  }

  public void setRefusal(@javax.annotation.Nullable String refusal) {
    this.refusal = JsonNullable.<String>of(refusal);
  }

  public FineTuneChatCompletionRequestAssistantMessage role(@javax.annotation.Nonnull RoleEnum role) {
    
    this.role = role;
    return this;
  }

  /**
   * The role of the messages author, in this case &#x60;assistant&#x60;.
   * @return role
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(@javax.annotation.Nonnull RoleEnum role) {
    this.role = role;
  }

  public FineTuneChatCompletionRequestAssistantMessage name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public FineTuneChatCompletionRequestAssistantMessage audio(@javax.annotation.Nullable ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = JsonNullable.<ChatCompletionRequestAssistantMessageAudio>of(audio);
    
    return this;
  }

  /**
   * Get audio
   * @return audio
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public ChatCompletionRequestAssistantMessageAudio getAudio() {
        return audio.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUDIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ChatCompletionRequestAssistantMessageAudio> getAudio_JsonNullable() {
    return audio;
  }
  
  @JsonProperty(JSON_PROPERTY_AUDIO)
  public void setAudio_JsonNullable(JsonNullable<ChatCompletionRequestAssistantMessageAudio> audio) {
    this.audio = audio;
  }

  public void setAudio(@javax.annotation.Nullable ChatCompletionRequestAssistantMessageAudio audio) {
    this.audio = JsonNullable.<ChatCompletionRequestAssistantMessageAudio>of(audio);
  }

  public FineTuneChatCompletionRequestAssistantMessage toolCalls(@javax.annotation.Nullable List<ChatCompletionMessageToolCall> toolCalls) {
    
    this.toolCalls = toolCalls;
    return this;
  }

  public FineTuneChatCompletionRequestAssistantMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

  /**
   * The tool calls generated by the model, such as function calls.
   * @return toolCalls
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }


  @JsonProperty(JSON_PROPERTY_TOOL_CALLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToolCalls(@javax.annotation.Nullable List<ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }

  public FineTuneChatCompletionRequestAssistantMessage functionCall(@javax.annotation.Nullable ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = JsonNullable.<ChatCompletionRequestAssistantMessageFunctionCall>of(functionCall);
    
    return this;
  }

  /**
   * Get functionCall
   * @return functionCall
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  @JsonIgnore

  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
        return functionCall.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FUNCTION_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ChatCompletionRequestAssistantMessageFunctionCall> getFunctionCall_JsonNullable() {
    return functionCall;
  }
  
  @JsonProperty(JSON_PROPERTY_FUNCTION_CALL)
  public void setFunctionCall_JsonNullable(JsonNullable<ChatCompletionRequestAssistantMessageFunctionCall> functionCall) {
    this.functionCall = functionCall;
  }

  public void setFunctionCall(@javax.annotation.Nullable ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = JsonNullable.<ChatCompletionRequestAssistantMessageFunctionCall>of(functionCall);
  }

  public FineTuneChatCompletionRequestAssistantMessage weight(@javax.annotation.Nullable WeightEnum weight) {
    
    this.weight = weight;
    return this;
  }

  /**
   * Controls whether the assistant message is trained against (0 or 1)
   * @return weight
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WeightEnum getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(@javax.annotation.Nullable WeightEnum weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneChatCompletionRequestAssistantMessage fineTuneChatCompletionRequestAssistantMessage = (FineTuneChatCompletionRequestAssistantMessage) o;
    return equalsNullable(this.content, fineTuneChatCompletionRequestAssistantMessage.content) &&
        equalsNullable(this.refusal, fineTuneChatCompletionRequestAssistantMessage.refusal) &&
        Objects.equals(this.role, fineTuneChatCompletionRequestAssistantMessage.role) &&
        Objects.equals(this.name, fineTuneChatCompletionRequestAssistantMessage.name) &&
        equalsNullable(this.audio, fineTuneChatCompletionRequestAssistantMessage.audio) &&
        Objects.equals(this.toolCalls, fineTuneChatCompletionRequestAssistantMessage.toolCalls) &&
        equalsNullable(this.functionCall, fineTuneChatCompletionRequestAssistantMessage.functionCall) &&
        Objects.equals(this.weight, fineTuneChatCompletionRequestAssistantMessage.weight);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(content), hashCodeNullable(refusal), role, name, hashCodeNullable(audio), toolCalls, hashCodeNullable(functionCall), weight);
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
    sb.append("class FineTuneChatCompletionRequestAssistantMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

    // add `content` to the URL query string
    if (getContent() != null) {
      joiner.add(getContent().toUrlQueryString(prefix + "content" + suffix));
    }

    // add `refusal` to the URL query string
    if (getRefusal() != null) {
      try {
        joiner.add(String.format("%srefusal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefusal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `role` to the URL query string
    if (getRole() != null) {
      try {
        joiner.add(String.format("%srole%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRole()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `audio` to the URL query string
    if (getAudio() != null) {
      joiner.add(getAudio().toUrlQueryString(prefix + "audio" + suffix));
    }

    // add `tool_calls` to the URL query string
    if (getToolCalls() != null) {
      for (int i = 0; i < getToolCalls().size(); i++) {
        if (getToolCalls().get(i) != null) {
          joiner.add(getToolCalls().get(i).toUrlQueryString(String.format("%stool_calls%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `function_call` to the URL query string
    if (getFunctionCall() != null) {
      joiner.add(getFunctionCall().toUrlQueryString(prefix + "function_call" + suffix));
    }

    // add `weight` to the URL query string
    if (getWeight() != null) {
      try {
        joiner.add(String.format("%sweight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWeight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

