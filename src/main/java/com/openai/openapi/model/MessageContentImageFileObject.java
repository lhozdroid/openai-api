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
import com.openai.openapi.model.MessageContentImageFileObjectImageFile;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
@JsonPropertyOrder({
  MessageContentImageFileObject.JSON_PROPERTY_TYPE,
  MessageContentImageFileObject.JSON_PROPERTY_IMAGE_FILE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T10:23:25.420936454-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class MessageContentImageFileObject {
  /**
   * Always &#x60;image_file&#x60;.
   */
  public enum TypeEnum {
    IMAGE_FILE(String.valueOf("image_file"));

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

  public static final String JSON_PROPERTY_IMAGE_FILE = "image_file";
  @javax.annotation.Nonnull
  private MessageContentImageFileObjectImageFile imageFile;

  public MessageContentImageFileObject() {
  }

  public MessageContentImageFileObject type(@javax.annotation.Nonnull TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * Always &#x60;image_file&#x60;.
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

  public MessageContentImageFileObject imageFile(@javax.annotation.Nonnull MessageContentImageFileObjectImageFile imageFile) {
    
    this.imageFile = imageFile;
    return this;
  }

  /**
   * Get imageFile
   * @return imageFile
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IMAGE_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MessageContentImageFileObjectImageFile getImageFile() {
    return imageFile;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setImageFile(@javax.annotation.Nonnull MessageContentImageFileObjectImageFile imageFile) {
    this.imageFile = imageFile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentImageFileObject messageContentImageFileObject = (MessageContentImageFileObject) o;
    return Objects.equals(this.type, messageContentImageFileObject.type) &&
        Objects.equals(this.imageFile, messageContentImageFileObject.imageFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, imageFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentImageFileObject {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `image_file` to the URL query string
    if (getImageFile() != null) {
      joiner.add(getImageFile().toUrlQueryString(prefix + "image_file" + suffix));
    }

    return joiner.toString();
  }

}

