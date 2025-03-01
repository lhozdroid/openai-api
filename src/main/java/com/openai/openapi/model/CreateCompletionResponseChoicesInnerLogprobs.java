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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CreateCompletionResponseChoicesInnerLogprobs
 */
@JsonPropertyOrder({
  CreateCompletionResponseChoicesInnerLogprobs.JSON_PROPERTY_TEXT_OFFSET,
  CreateCompletionResponseChoicesInnerLogprobs.JSON_PROPERTY_TOKEN_LOGPROBS,
  CreateCompletionResponseChoicesInnerLogprobs.JSON_PROPERTY_TOKENS,
  CreateCompletionResponseChoicesInnerLogprobs.JSON_PROPERTY_TOP_LOGPROBS
})
@JsonTypeName("CreateCompletionResponse_choices_inner_logprobs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T10:23:25.420936454-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class CreateCompletionResponseChoicesInnerLogprobs {
  public static final String JSON_PROPERTY_TEXT_OFFSET = "text_offset";
  @javax.annotation.Nullable
  private List<Integer> textOffset = new ArrayList<>();

  public static final String JSON_PROPERTY_TOKEN_LOGPROBS = "token_logprobs";
  @javax.annotation.Nullable
  private List<BigDecimal> tokenLogprobs = new ArrayList<>();

  public static final String JSON_PROPERTY_TOKENS = "tokens";
  @javax.annotation.Nullable
  private List<String> tokens = new ArrayList<>();

  public static final String JSON_PROPERTY_TOP_LOGPROBS = "top_logprobs";
  @javax.annotation.Nullable
  private List<Map<String, BigDecimal>> topLogprobs = new ArrayList<>();

  public CreateCompletionResponseChoicesInnerLogprobs() {
  }

  public CreateCompletionResponseChoicesInnerLogprobs textOffset(@javax.annotation.Nullable List<Integer> textOffset) {
    
    this.textOffset = textOffset;
    return this;
  }

  public CreateCompletionResponseChoicesInnerLogprobs addTextOffsetItem(Integer textOffsetItem) {
    if (this.textOffset == null) {
      this.textOffset = new ArrayList<>();
    }
    this.textOffset.add(textOffsetItem);
    return this;
  }

  /**
   * Get textOffset
   * @return textOffset
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTextOffset() {
    return textOffset;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextOffset(@javax.annotation.Nullable List<Integer> textOffset) {
    this.textOffset = textOffset;
  }

  public CreateCompletionResponseChoicesInnerLogprobs tokenLogprobs(@javax.annotation.Nullable List<BigDecimal> tokenLogprobs) {
    
    this.tokenLogprobs = tokenLogprobs;
    return this;
  }

  public CreateCompletionResponseChoicesInnerLogprobs addTokenLogprobsItem(BigDecimal tokenLogprobsItem) {
    if (this.tokenLogprobs == null) {
      this.tokenLogprobs = new ArrayList<>();
    }
    this.tokenLogprobs.add(tokenLogprobsItem);
    return this;
  }

  /**
   * Get tokenLogprobs
   * @return tokenLogprobs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_LOGPROBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BigDecimal> getTokenLogprobs() {
    return tokenLogprobs;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_LOGPROBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenLogprobs(@javax.annotation.Nullable List<BigDecimal> tokenLogprobs) {
    this.tokenLogprobs = tokenLogprobs;
  }

  public CreateCompletionResponseChoicesInnerLogprobs tokens(@javax.annotation.Nullable List<String> tokens) {
    
    this.tokens = tokens;
    return this;
  }

  public CreateCompletionResponseChoicesInnerLogprobs addTokensItem(String tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

  /**
   * Get tokens
   * @return tokens
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTokens() {
    return tokens;
  }


  @JsonProperty(JSON_PROPERTY_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokens(@javax.annotation.Nullable List<String> tokens) {
    this.tokens = tokens;
  }

  public CreateCompletionResponseChoicesInnerLogprobs topLogprobs(@javax.annotation.Nullable List<Map<String, BigDecimal>> topLogprobs) {
    
    this.topLogprobs = topLogprobs;
    return this;
  }

  public CreateCompletionResponseChoicesInnerLogprobs addTopLogprobsItem(Map<String, BigDecimal> topLogprobsItem) {
    if (this.topLogprobs == null) {
      this.topLogprobs = new ArrayList<>();
    }
    this.topLogprobs.add(topLogprobsItem);
    return this;
  }

  /**
   * Get topLogprobs
   * @return topLogprobs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_LOGPROBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, BigDecimal>> getTopLogprobs() {
    return topLogprobs;
  }


  @JsonProperty(JSON_PROPERTY_TOP_LOGPROBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopLogprobs(@javax.annotation.Nullable List<Map<String, BigDecimal>> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompletionResponseChoicesInnerLogprobs createCompletionResponseChoicesInnerLogprobs = (CreateCompletionResponseChoicesInnerLogprobs) o;
    return Objects.equals(this.textOffset, createCompletionResponseChoicesInnerLogprobs.textOffset) &&
        Objects.equals(this.tokenLogprobs, createCompletionResponseChoicesInnerLogprobs.tokenLogprobs) &&
        Objects.equals(this.tokens, createCompletionResponseChoicesInnerLogprobs.tokens) &&
        Objects.equals(this.topLogprobs, createCompletionResponseChoicesInnerLogprobs.topLogprobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textOffset, tokenLogprobs, tokens, topLogprobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionResponseChoicesInnerLogprobs {\n");
    sb.append("    textOffset: ").append(toIndentedString(textOffset)).append("\n");
    sb.append("    tokenLogprobs: ").append(toIndentedString(tokenLogprobs)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n");
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

    // add `text_offset` to the URL query string
    if (getTextOffset() != null) {
      for (int i = 0; i < getTextOffset().size(); i++) {
        try {
          joiner.add(String.format("%stext_offset%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTextOffset().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `token_logprobs` to the URL query string
    if (getTokenLogprobs() != null) {
      for (int i = 0; i < getTokenLogprobs().size(); i++) {
        if (getTokenLogprobs().get(i) != null) {
          try {
            joiner.add(String.format("%stoken_logprobs%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getTokenLogprobs().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    // add `tokens` to the URL query string
    if (getTokens() != null) {
      for (int i = 0; i < getTokens().size(); i++) {
        try {
          joiner.add(String.format("%stokens%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTokens().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `top_logprobs` to the URL query string
    if (getTopLogprobs() != null) {
      for (int i = 0; i < getTopLogprobs().size(); i++) {
        if (getTopLogprobs().get(i) != null) {
          try {
            joiner.add(String.format("%stop_logprobs%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(getTopLogprobs().get(i)), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
      }
    }

    return joiner.toString();
  }

}

