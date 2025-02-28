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
import org.openapitools.client.model.CreateEmbeddingRequestInput;
import org.openapitools.client.model.CreateEmbeddingRequestModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CreateEmbeddingRequest
 */
@JsonPropertyOrder({
  CreateEmbeddingRequest.JSON_PROPERTY_INPUT,
  CreateEmbeddingRequest.JSON_PROPERTY_MODEL,
  CreateEmbeddingRequest.JSON_PROPERTY_ENCODING_FORMAT,
  CreateEmbeddingRequest.JSON_PROPERTY_DIMENSIONS,
  CreateEmbeddingRequest.JSON_PROPERTY_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class CreateEmbeddingRequest {
  public static final String JSON_PROPERTY_INPUT = "input";
  @javax.annotation.Nonnull
  private CreateEmbeddingRequestInput input;

  public static final String JSON_PROPERTY_MODEL = "model";
  @javax.annotation.Nonnull
  private CreateEmbeddingRequestModel model;

  /**
   * The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
   */
  public enum EncodingFormatEnum {
    FLOAT(String.valueOf("float")),
    
    BASE64(String.valueOf("base64"));

    private String value;

    EncodingFormatEnum(String value) {
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
    public static EncodingFormatEnum fromValue(String value) {
      for (EncodingFormatEnum b : EncodingFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENCODING_FORMAT = "encoding_format";
  @javax.annotation.Nullable
  private EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT;

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  @javax.annotation.Nullable
  private Integer dimensions;

  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable
  private String user;

  public CreateEmbeddingRequest() {
  }

  public CreateEmbeddingRequest input(@javax.annotation.Nonnull CreateEmbeddingRequestInput input) {
    
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreateEmbeddingRequestInput getInput() {
    return input;
  }


  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInput(@javax.annotation.Nonnull CreateEmbeddingRequestInput input) {
    this.input = input;
  }

  public CreateEmbeddingRequest model(@javax.annotation.Nonnull CreateEmbeddingRequestModel model) {
    
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreateEmbeddingRequestModel getModel() {
    return model;
  }


  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModel(@javax.annotation.Nonnull CreateEmbeddingRequestModel model) {
    this.model = model;
  }

  public CreateEmbeddingRequest encodingFormat(@javax.annotation.Nullable EncodingFormatEnum encodingFormat) {
    
    this.encodingFormat = encodingFormat;
    return this;
  }

  /**
   * The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
   * @return encodingFormat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCODING_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EncodingFormatEnum getEncodingFormat() {
    return encodingFormat;
  }


  @JsonProperty(JSON_PROPERTY_ENCODING_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncodingFormat(@javax.annotation.Nullable EncodingFormatEnum encodingFormat) {
    this.encodingFormat = encodingFormat;
  }

  public CreateEmbeddingRequest dimensions(@javax.annotation.Nullable Integer dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  /**
   * The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models. 
   * minimum: 1
   * @return dimensions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDimensions() {
    return dimensions;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensions(@javax.annotation.Nullable Integer dimensions) {
    this.dimensions = dimensions;
  }

  public CreateEmbeddingRequest user(@javax.annotation.Nullable String user) {
    
    this.user = user;
    return this;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
   * @return user
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(@javax.annotation.Nullable String user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmbeddingRequest createEmbeddingRequest = (CreateEmbeddingRequest) o;
    return Objects.equals(this.input, createEmbeddingRequest.input) &&
        Objects.equals(this.model, createEmbeddingRequest.model) &&
        Objects.equals(this.encodingFormat, createEmbeddingRequest.encodingFormat) &&
        Objects.equals(this.dimensions, createEmbeddingRequest.dimensions) &&
        Objects.equals(this.user, createEmbeddingRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, model, encodingFormat, dimensions, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingRequest {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    encodingFormat: ").append(toIndentedString(encodingFormat)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

    // add `input` to the URL query string
    if (getInput() != null) {
      joiner.add(getInput().toUrlQueryString(prefix + "input" + suffix));
    }

    // add `model` to the URL query string
    if (getModel() != null) {
      joiner.add(getModel().toUrlQueryString(prefix + "model" + suffix));
    }

    // add `encoding_format` to the URL query string
    if (getEncodingFormat() != null) {
      try {
        joiner.add(String.format("%sencoding_format%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEncodingFormat()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dimensions` to the URL query string
    if (getDimensions() != null) {
      try {
        joiner.add(String.format("%sdimensions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDimensions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `user` to the URL query string
    if (getUser() != null) {
      try {
        joiner.add(String.format("%suser%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUser()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

