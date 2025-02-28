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
import org.openapitools.client.model.ChatCompletionRequestToolMessageContent;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ChatCompletionRequestToolMessage
 */
@JsonPropertyOrder({
  ChatCompletionRequestToolMessage.JSON_PROPERTY_ROLE,
  ChatCompletionRequestToolMessage.JSON_PROPERTY_CONTENT,
  ChatCompletionRequestToolMessage.JSON_PROPERTY_TOOL_CALL_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class ChatCompletionRequestToolMessage {
  /**
   * The role of the messages author, in this case &#x60;tool&#x60;.
   */
  public enum RoleEnum {
    TOOL(String.valueOf("tool"));

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

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nonnull
  private ChatCompletionRequestToolMessageContent content;

  public static final String JSON_PROPERTY_TOOL_CALL_ID = "tool_call_id";
  @javax.annotation.Nonnull
  private String toolCallId;

  public ChatCompletionRequestToolMessage() {
  }

  public ChatCompletionRequestToolMessage role(@javax.annotation.Nonnull RoleEnum role) {
    
    this.role = role;
    return this;
  }

  /**
   * The role of the messages author, in this case &#x60;tool&#x60;.
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

  public ChatCompletionRequestToolMessage content(@javax.annotation.Nonnull ChatCompletionRequestToolMessageContent content) {
    
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ChatCompletionRequestToolMessageContent getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(@javax.annotation.Nonnull ChatCompletionRequestToolMessageContent content) {
    this.content = content;
  }

  public ChatCompletionRequestToolMessage toolCallId(@javax.annotation.Nonnull String toolCallId) {
    
    this.toolCallId = toolCallId;
    return this;
  }

  /**
   * Tool call that this message is responding to.
   * @return toolCallId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOOL_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToolCallId() {
    return toolCallId;
  }


  @JsonProperty(JSON_PROPERTY_TOOL_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToolCallId(@javax.annotation.Nonnull String toolCallId) {
    this.toolCallId = toolCallId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestToolMessage chatCompletionRequestToolMessage = (ChatCompletionRequestToolMessage) o;
    return Objects.equals(this.role, chatCompletionRequestToolMessage.role) &&
        Objects.equals(this.content, chatCompletionRequestToolMessage.content) &&
        Objects.equals(this.toolCallId, chatCompletionRequestToolMessage.toolCallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, content, toolCallId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestToolMessage {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
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

    // add `role` to the URL query string
    if (getRole() != null) {
      try {
        joiner.add(String.format("%srole%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRole()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      joiner.add(getContent().toUrlQueryString(prefix + "content" + suffix));
    }

    // add `tool_call_id` to the URL query string
    if (getToolCallId() != null) {
      try {
        joiner.add(String.format("%stool_call_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToolCallId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

