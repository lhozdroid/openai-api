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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * An optional field that will only be present when you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60; in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 */
@JsonPropertyOrder({
  CreateChatCompletionStreamResponseUsage.JSON_PROPERTY_COMPLETION_TOKENS,
  CreateChatCompletionStreamResponseUsage.JSON_PROPERTY_PROMPT_TOKENS,
  CreateChatCompletionStreamResponseUsage.JSON_PROPERTY_TOTAL_TOKENS
})
@JsonTypeName("CreateChatCompletionStreamResponse_usage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class CreateChatCompletionStreamResponseUsage {
  public static final String JSON_PROPERTY_COMPLETION_TOKENS = "completion_tokens";
  @javax.annotation.Nonnull
  private Integer completionTokens;

  public static final String JSON_PROPERTY_PROMPT_TOKENS = "prompt_tokens";
  @javax.annotation.Nonnull
  private Integer promptTokens;

  public static final String JSON_PROPERTY_TOTAL_TOKENS = "total_tokens";
  @javax.annotation.Nonnull
  private Integer totalTokens;

  public CreateChatCompletionStreamResponseUsage() {
  }

  public CreateChatCompletionStreamResponseUsage completionTokens(@javax.annotation.Nonnull Integer completionTokens) {
    
    this.completionTokens = completionTokens;
    return this;
  }

  /**
   * Number of tokens in the generated completion.
   * @return completionTokens
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPLETION_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCompletionTokens() {
    return completionTokens;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompletionTokens(@javax.annotation.Nonnull Integer completionTokens) {
    this.completionTokens = completionTokens;
  }

  public CreateChatCompletionStreamResponseUsage promptTokens(@javax.annotation.Nonnull Integer promptTokens) {
    
    this.promptTokens = promptTokens;
    return this;
  }

  /**
   * Number of tokens in the prompt.
   * @return promptTokens
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROMPT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPromptTokens() {
    return promptTokens;
  }


  @JsonProperty(JSON_PROPERTY_PROMPT_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPromptTokens(@javax.annotation.Nonnull Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  public CreateChatCompletionStreamResponseUsage totalTokens(@javax.annotation.Nonnull Integer totalTokens) {
    
    this.totalTokens = totalTokens;
    return this;
  }

  /**
   * Total number of tokens used in the request (prompt + completion).
   * @return totalTokens
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalTokens() {
    return totalTokens;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalTokens(@javax.annotation.Nonnull Integer totalTokens) {
    this.totalTokens = totalTokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionStreamResponseUsage createChatCompletionStreamResponseUsage = (CreateChatCompletionStreamResponseUsage) o;
    return Objects.equals(this.completionTokens, createChatCompletionStreamResponseUsage.completionTokens) &&
        Objects.equals(this.promptTokens, createChatCompletionStreamResponseUsage.promptTokens) &&
        Objects.equals(this.totalTokens, createChatCompletionStreamResponseUsage.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionStreamResponseUsage {\n");
    sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
    sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
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

    // add `completion_tokens` to the URL query string
    if (getCompletionTokens() != null) {
      try {
        joiner.add(String.format("%scompletion_tokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `prompt_tokens` to the URL query string
    if (getPromptTokens() != null) {
      try {
        joiner.add(String.format("%sprompt_tokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPromptTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `total_tokens` to the URL query string
    if (getTotalTokens() != null) {
      try {
        joiner.add(String.format("%stotal_tokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

