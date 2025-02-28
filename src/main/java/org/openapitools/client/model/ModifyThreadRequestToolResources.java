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
import org.openapitools.client.model.CreateAssistantRequestToolResourcesCodeInterpreter;
import org.openapitools.client.model.ModifyThreadRequestToolResourcesFileSearch;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A set of resources that are made available to the assistant&#39;s tools in this thread. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */
@JsonPropertyOrder({
  ModifyThreadRequestToolResources.JSON_PROPERTY_CODE_INTERPRETER,
  ModifyThreadRequestToolResources.JSON_PROPERTY_FILE_SEARCH
})
@JsonTypeName("ModifyThreadRequest_tool_resources")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class ModifyThreadRequestToolResources {
  public static final String JSON_PROPERTY_CODE_INTERPRETER = "code_interpreter";
  @javax.annotation.Nullable
  private CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter;

  public static final String JSON_PROPERTY_FILE_SEARCH = "file_search";
  @javax.annotation.Nullable
  private ModifyThreadRequestToolResourcesFileSearch fileSearch;

  public ModifyThreadRequestToolResources() {
  }

  public ModifyThreadRequestToolResources codeInterpreter(@javax.annotation.Nullable CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    
    this.codeInterpreter = codeInterpreter;
    return this;
  }

  /**
   * Get codeInterpreter
   * @return codeInterpreter
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_INTERPRETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }


  @JsonProperty(JSON_PROPERTY_CODE_INTERPRETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCodeInterpreter(@javax.annotation.Nullable CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public ModifyThreadRequestToolResources fileSearch(@javax.annotation.Nullable ModifyThreadRequestToolResourcesFileSearch fileSearch) {
    
    this.fileSearch = fileSearch;
    return this;
  }

  /**
   * Get fileSearch
   * @return fileSearch
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModifyThreadRequestToolResourcesFileSearch getFileSearch() {
    return fileSearch;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSearch(@javax.annotation.Nullable ModifyThreadRequestToolResourcesFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyThreadRequestToolResources modifyThreadRequestToolResources = (ModifyThreadRequestToolResources) o;
    return Objects.equals(this.codeInterpreter, modifyThreadRequestToolResources.codeInterpreter) &&
        Objects.equals(this.fileSearch, modifyThreadRequestToolResources.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeInterpreter, fileSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyThreadRequestToolResources {\n");
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
    sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
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

    // add `code_interpreter` to the URL query string
    if (getCodeInterpreter() != null) {
      joiner.add(getCodeInterpreter().toUrlQueryString(prefix + "code_interpreter" + suffix));
    }

    // add `file_search` to the URL query string
    if (getFileSearch() != null) {
      joiner.add(getFileSearch().toUrlQueryString(prefix + "file_search" + suffix));
    }

    return joiner.toString();
  }

}

