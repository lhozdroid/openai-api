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
import org.openapitools.client.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.client.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.client.model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
 */
@JsonPropertyOrder({
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_INDEX,
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_TYPE,
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_LOGS,
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.JSON_PROPERTY_IMAGE
})
@JsonTypeName("RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
  public static final String JSON_PROPERTY_INDEX = "index";
  @javax.annotation.Nonnull
  private Integer index;

  /**
   * Always &#x60;logs&#x60;.
   */
  public enum TypeEnum {
    LOGS(String.valueOf("logs")),
    
    IMAGE(String.valueOf("image"));

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String JSON_PROPERTY_LOGS = "logs";
  @javax.annotation.Nullable
  private String logs;

  public static final String JSON_PROPERTY_IMAGE = "image";
  @javax.annotation.Nullable
  private RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image;

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner() {
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner index(@javax.annotation.Nonnull Integer index) {
    
    this.index = index;
    return this;
  }

  /**
   * The index of the output in the outputs array.
   * @return index
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndex(@javax.annotation.Nonnull Integer index) {
    this.index = index;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner type(@javax.annotation.Nonnull TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * Always &#x60;logs&#x60;.
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner logs(@javax.annotation.Nullable String logs) {
    
    this.logs = logs;
    return this;
  }

  /**
   * The text output from the Code Interpreter tool call.
   * @return logs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogs() {
    return logs;
  }


  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogs(@javax.annotation.Nullable String logs) {
    this.logs = logs;
  }

  public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner image(@javax.annotation.Nullable RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
    
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(@javax.annotation.Nullable RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
    this.image = image;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = (RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner) o;
    return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.index) &&
        Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.type) &&
        Objects.equals(this.logs, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.logs) &&
        Objects.equals(this.image, runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, logs, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

    // add `index` to the URL query string
    if (getIndex() != null) {
      try {
        joiner.add(String.format("%sindex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `logs` to the URL query string
    if (getLogs() != null) {
      try {
        joiner.add(String.format("%slogs%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogs()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `image` to the URL query string
    if (getImage() != null) {
      joiner.add(getImage().toUrlQueryString(prefix + "image" + suffix));
    }

    return joiner.toString();
  }

}

