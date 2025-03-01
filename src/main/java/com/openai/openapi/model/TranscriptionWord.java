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


package com.openai.openapi.model;

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
 * TranscriptionWord
 */
@JsonPropertyOrder({
  TranscriptionWord.JSON_PROPERTY_WORD,
  TranscriptionWord.JSON_PROPERTY_START,
  TranscriptionWord.JSON_PROPERTY_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T10:23:25.420936454-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class TranscriptionWord {
  public static final String JSON_PROPERTY_WORD = "word";
  @javax.annotation.Nonnull
  private String word;

  public static final String JSON_PROPERTY_START = "start";
  @javax.annotation.Nonnull
  private Float start;

  public static final String JSON_PROPERTY_END = "end";
  @javax.annotation.Nonnull
  private Float end;

  public TranscriptionWord() {
  }

  public TranscriptionWord word(@javax.annotation.Nonnull String word) {
    
    this.word = word;
    return this;
  }

  /**
   * The text content of the word.
   * @return word
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWord() {
    return word;
  }


  @JsonProperty(JSON_PROPERTY_WORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWord(@javax.annotation.Nonnull String word) {
    this.word = word;
  }

  public TranscriptionWord start(@javax.annotation.Nonnull Float start) {
    
    this.start = start;
    return this;
  }

  /**
   * Start time of the word in seconds.
   * @return start
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(@javax.annotation.Nonnull Float start) {
    this.start = start;
  }

  public TranscriptionWord end(@javax.annotation.Nonnull Float end) {
    
    this.end = end;
    return this;
  }

  /**
   * End time of the word in seconds.
   * @return end
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(@javax.annotation.Nonnull Float end) {
    this.end = end;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionWord transcriptionWord = (TranscriptionWord) o;
    return Objects.equals(this.word, transcriptionWord.word) &&
        Objects.equals(this.start, transcriptionWord.start) &&
        Objects.equals(this.end, transcriptionWord.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionWord {\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

    // add `word` to the URL query string
    if (getWord() != null) {
      try {
        joiner.add(String.format("%sword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWord()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `start` to the URL query string
    if (getStart() != null) {
      try {
        joiner.add(String.format("%sstart%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStart()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `end` to the URL query string
    if (getEnd() != null) {
      try {
        joiner.add(String.format("%send%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnd()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

