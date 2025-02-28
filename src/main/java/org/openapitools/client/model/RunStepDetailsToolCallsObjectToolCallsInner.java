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
import org.openapitools.client.model.RunStepDetailsToolCallsCodeObject;
import org.openapitools.client.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.client.model.RunStepDetailsToolCallsFileSearchObject;
import org.openapitools.client.model.RunStepDetailsToolCallsFileSearchObjectFileSearch;
import org.openapitools.client.model.RunStepDetailsToolCallsFunctionObject;
import org.openapitools.client.model.RunStepDetailsToolCallsFunctionObjectFunction;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RunStepDetailsToolCallsObjectToolCallsInner
 */
@JsonPropertyOrder({
  RunStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_ID,
  RunStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_TYPE,
  RunStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_CODE_INTERPRETER,
  RunStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_FILE_SEARCH,
  RunStepDetailsToolCallsObjectToolCallsInner.JSON_PROPERTY_FUNCTION
})
@JsonTypeName("RunStepDetailsToolCallsObject_tool_calls_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class RunStepDetailsToolCallsObjectToolCallsInner {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private String id;

  /**
   * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
   */
  public enum TypeEnum {
    CODE_INTERPRETER(String.valueOf("code_interpreter")),
    
    FILE_SEARCH(String.valueOf("file_search")),
    
    FUNCTION(String.valueOf("function"));

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

  public static final String JSON_PROPERTY_CODE_INTERPRETER = "code_interpreter";
  @javax.annotation.Nonnull
  private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

  public static final String JSON_PROPERTY_FILE_SEARCH = "file_search";
  @javax.annotation.Nonnull
  private RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  @javax.annotation.Nonnull
  private RunStepDetailsToolCallsFunctionObjectFunction function;

  public RunStepDetailsToolCallsObjectToolCallsInner() {
  }

  public RunStepDetailsToolCallsObjectToolCallsInner id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The ID of the tool call object.
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }

  public RunStepDetailsToolCallsObjectToolCallsInner type(@javax.annotation.Nonnull TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
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

  public RunStepDetailsToolCallsObjectToolCallsInner codeInterpreter(@javax.annotation.Nonnull RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    
    this.codeInterpreter = codeInterpreter;
    return this;
  }

  /**
   * Get codeInterpreter
   * @return codeInterpreter
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE_INTERPRETER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }


  @JsonProperty(JSON_PROPERTY_CODE_INTERPRETER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCodeInterpreter(@javax.annotation.Nonnull RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public RunStepDetailsToolCallsObjectToolCallsInner fileSearch(@javax.annotation.Nonnull RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
    
    this.fileSearch = fileSearch;
    return this;
  }

  /**
   * Get fileSearch
   * @return fileSearch
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RunStepDetailsToolCallsFileSearchObjectFileSearch getFileSearch() {
    return fileSearch;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileSearch(@javax.annotation.Nonnull RunStepDetailsToolCallsFileSearchObjectFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  public RunStepDetailsToolCallsObjectToolCallsInner function(@javax.annotation.Nonnull RunStepDetailsToolCallsFunctionObjectFunction function) {
    
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RunStepDetailsToolCallsFunctionObjectFunction getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFunction(@javax.annotation.Nonnull RunStepDetailsToolCallsFunctionObjectFunction function) {
    this.function = function;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsObjectToolCallsInner runStepDetailsToolCallsObjectToolCallsInner = (RunStepDetailsToolCallsObjectToolCallsInner) o;
    return Objects.equals(this.id, runStepDetailsToolCallsObjectToolCallsInner.id) &&
        Objects.equals(this.type, runStepDetailsToolCallsObjectToolCallsInner.type) &&
        Objects.equals(this.codeInterpreter, runStepDetailsToolCallsObjectToolCallsInner.codeInterpreter) &&
        Objects.equals(this.fileSearch, runStepDetailsToolCallsObjectToolCallsInner.fileSearch) &&
        Objects.equals(this.function, runStepDetailsToolCallsObjectToolCallsInner.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, codeInterpreter, fileSearch, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsObjectToolCallsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
    sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `code_interpreter` to the URL query string
    if (getCodeInterpreter() != null) {
      joiner.add(getCodeInterpreter().toUrlQueryString(prefix + "code_interpreter" + suffix));
    }

    // add `file_search` to the URL query string
    if (getFileSearch() != null) {
      joiner.add(getFileSearch().toUrlQueryString(prefix + "file_search" + suffix));
    }

    // add `function` to the URL query string
    if (getFunction() != null) {
      joiner.add(getFunction().toUrlQueryString(prefix + "function" + suffix));
    }

    return joiner.toString();
  }

}

