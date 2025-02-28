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
 * SubmitToolOutputsRunRequestToolOutputsInner
 */
@JsonPropertyOrder({
  SubmitToolOutputsRunRequestToolOutputsInner.JSON_PROPERTY_TOOL_CALL_ID,
  SubmitToolOutputsRunRequestToolOutputsInner.JSON_PROPERTY_OUTPUT
})
@JsonTypeName("SubmitToolOutputsRunRequest_tool_outputs_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class SubmitToolOutputsRunRequestToolOutputsInner {
  public static final String JSON_PROPERTY_TOOL_CALL_ID = "tool_call_id";
  @javax.annotation.Nullable
  private String toolCallId;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  @javax.annotation.Nullable
  private String output;

  public SubmitToolOutputsRunRequestToolOutputsInner() {
  }

  public SubmitToolOutputsRunRequestToolOutputsInner toolCallId(@javax.annotation.Nullable String toolCallId) {
    
    this.toolCallId = toolCallId;
    return this;
  }

  /**
   * The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.
   * @return toolCallId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToolCallId() {
    return toolCallId;
  }


  @JsonProperty(JSON_PROPERTY_TOOL_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToolCallId(@javax.annotation.Nullable String toolCallId) {
    this.toolCallId = toolCallId;
  }

  public SubmitToolOutputsRunRequestToolOutputsInner output(@javax.annotation.Nullable String output) {
    
    this.output = output;
    return this;
  }

  /**
   * The output of the tool call to be submitted to continue the run.
   * @return output
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutput() {
    return output;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutput(@javax.annotation.Nullable String output) {
    this.output = output;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitToolOutputsRunRequestToolOutputsInner submitToolOutputsRunRequestToolOutputsInner = (SubmitToolOutputsRunRequestToolOutputsInner) o;
    return Objects.equals(this.toolCallId, submitToolOutputsRunRequestToolOutputsInner.toolCallId) &&
        Objects.equals(this.output, submitToolOutputsRunRequestToolOutputsInner.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolCallId, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitToolOutputsRunRequestToolOutputsInner {\n");
    sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

    // add `tool_call_id` to the URL query string
    if (getToolCallId() != null) {
      try {
        joiner.add(String.format("%stool_call_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToolCallId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `output` to the URL query string
    if (getOutput() != null) {
      try {
        joiner.add(String.format("%soutput%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOutput()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

