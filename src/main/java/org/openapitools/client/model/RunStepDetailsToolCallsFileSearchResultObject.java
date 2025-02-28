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
import java.util.List;
import org.openapitools.client.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A result instance of the file search.
 */
@JsonPropertyOrder({
  RunStepDetailsToolCallsFileSearchResultObject.JSON_PROPERTY_FILE_ID,
  RunStepDetailsToolCallsFileSearchResultObject.JSON_PROPERTY_FILE_NAME,
  RunStepDetailsToolCallsFileSearchResultObject.JSON_PROPERTY_SCORE,
  RunStepDetailsToolCallsFileSearchResultObject.JSON_PROPERTY_CONTENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class RunStepDetailsToolCallsFileSearchResultObject {
  public static final String JSON_PROPERTY_FILE_ID = "file_id";
  @javax.annotation.Nonnull
  private String fileId;

  public static final String JSON_PROPERTY_FILE_NAME = "file_name";
  @javax.annotation.Nonnull
  private String fileName;

  public static final String JSON_PROPERTY_SCORE = "score";
  @javax.annotation.Nonnull
  private BigDecimal score;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nullable
  private List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = new ArrayList<>();

  public RunStepDetailsToolCallsFileSearchResultObject() {
  }

  public RunStepDetailsToolCallsFileSearchResultObject fileId(@javax.annotation.Nonnull String fileId) {
    
    this.fileId = fileId;
    return this;
  }

  /**
   * The ID of the file that result was found in.
   * @return fileId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFileId() {
    return fileId;
  }


  @JsonProperty(JSON_PROPERTY_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileId(@javax.annotation.Nonnull String fileId) {
    this.fileId = fileId;
  }

  public RunStepDetailsToolCallsFileSearchResultObject fileName(@javax.annotation.Nonnull String fileName) {
    
    this.fileName = fileName;
    return this;
  }

  /**
   * The name of the file that result was found in.
   * @return fileName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileName(@javax.annotation.Nonnull String fileName) {
    this.fileName = fileName;
  }

  public RunStepDetailsToolCallsFileSearchResultObject score(@javax.annotation.Nonnull BigDecimal score) {
    
    this.score = score;
    return this;
  }

  /**
   * The score of the result. All values must be a floating point number between 0 and 1.
   * minimum: 0
   * maximum: 1
   * @return score
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getScore() {
    return score;
  }


  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScore(@javax.annotation.Nonnull BigDecimal score) {
    this.score = score;
  }

  public RunStepDetailsToolCallsFileSearchResultObject content(@javax.annotation.Nullable List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    
    this.content = content;
    return this;
  }

  public RunStepDetailsToolCallsFileSearchResultObject addContentItem(RunStepDetailsToolCallsFileSearchResultObjectContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * The content of the result that was found. The content is only included if requested via the include query parameter.
   * @return content
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(@javax.annotation.Nullable List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFileSearchResultObject runStepDetailsToolCallsFileSearchResultObject = (RunStepDetailsToolCallsFileSearchResultObject) o;
    return Objects.equals(this.fileId, runStepDetailsToolCallsFileSearchResultObject.fileId) &&
        Objects.equals(this.fileName, runStepDetailsToolCallsFileSearchResultObject.fileName) &&
        Objects.equals(this.score, runStepDetailsToolCallsFileSearchResultObject.score) &&
        Objects.equals(this.content, runStepDetailsToolCallsFileSearchResultObject.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, fileName, score, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFileSearchResultObject {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

    // add `file_id` to the URL query string
    if (getFileId() != null) {
      try {
        joiner.add(String.format("%sfile_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `file_name` to the URL query string
    if (getFileName() != null) {
      try {
        joiner.add(String.format("%sfile_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `score` to the URL query string
    if (getScore() != null) {
      try {
        joiner.add(String.format("%sscore%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScore()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      for (int i = 0; i < getContent().size(); i++) {
        if (getContent().get(i) != null) {
          joiner.add(getContent().get(i).toUrlQueryString(String.format("%scontent%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

