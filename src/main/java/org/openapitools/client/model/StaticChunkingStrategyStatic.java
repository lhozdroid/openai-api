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
 * StaticChunkingStrategyStatic
 */
@JsonPropertyOrder({
  StaticChunkingStrategyStatic.JSON_PROPERTY_MAX_CHUNK_SIZE_TOKENS,
  StaticChunkingStrategyStatic.JSON_PROPERTY_CHUNK_OVERLAP_TOKENS
})
@JsonTypeName("Static_Chunking_Strategy_static")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class StaticChunkingStrategyStatic {
  public static final String JSON_PROPERTY_MAX_CHUNK_SIZE_TOKENS = "max_chunk_size_tokens";
  @javax.annotation.Nonnull
  private Integer maxChunkSizeTokens;

  public static final String JSON_PROPERTY_CHUNK_OVERLAP_TOKENS = "chunk_overlap_tokens";
  @javax.annotation.Nonnull
  private Integer chunkOverlapTokens;

  public StaticChunkingStrategyStatic() {
  }

  public StaticChunkingStrategyStatic maxChunkSizeTokens(@javax.annotation.Nonnull Integer maxChunkSizeTokens) {
    
    this.maxChunkSizeTokens = maxChunkSizeTokens;
    return this;
  }

  /**
   * The maximum number of tokens in each chunk. The default value is &#x60;800&#x60;. The minimum value is &#x60;100&#x60; and the maximum value is &#x60;4096&#x60;.
   * minimum: 100
   * maximum: 4096
   * @return maxChunkSizeTokens
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAX_CHUNK_SIZE_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxChunkSizeTokens() {
    return maxChunkSizeTokens;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CHUNK_SIZE_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxChunkSizeTokens(@javax.annotation.Nonnull Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
  }

  public StaticChunkingStrategyStatic chunkOverlapTokens(@javax.annotation.Nonnull Integer chunkOverlapTokens) {
    
    this.chunkOverlapTokens = chunkOverlapTokens;
    return this;
  }

  /**
   * The number of tokens that overlap between chunks. The default value is &#x60;400&#x60;.  Note that the overlap must not exceed half of &#x60;max_chunk_size_tokens&#x60;. 
   * @return chunkOverlapTokens
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHUNK_OVERLAP_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getChunkOverlapTokens() {
    return chunkOverlapTokens;
  }


  @JsonProperty(JSON_PROPERTY_CHUNK_OVERLAP_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChunkOverlapTokens(@javax.annotation.Nonnull Integer chunkOverlapTokens) {
    this.chunkOverlapTokens = chunkOverlapTokens;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticChunkingStrategyStatic staticChunkingStrategyStatic = (StaticChunkingStrategyStatic) o;
    return Objects.equals(this.maxChunkSizeTokens, staticChunkingStrategyStatic.maxChunkSizeTokens) &&
        Objects.equals(this.chunkOverlapTokens, staticChunkingStrategyStatic.chunkOverlapTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChunkSizeTokens, chunkOverlapTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticChunkingStrategyStatic {\n");
    sb.append("    maxChunkSizeTokens: ").append(toIndentedString(maxChunkSizeTokens)).append("\n");
    sb.append("    chunkOverlapTokens: ").append(toIndentedString(chunkOverlapTokens)).append("\n");
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

    // add `max_chunk_size_tokens` to the URL query string
    if (getMaxChunkSizeTokens() != null) {
      try {
        joiner.add(String.format("%smax_chunk_size_tokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxChunkSizeTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `chunk_overlap_tokens` to the URL query string
    if (getChunkOverlapTokens() != null) {
      try {
        joiner.add(String.format("%schunk_overlap_tokens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChunkOverlapTokens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

