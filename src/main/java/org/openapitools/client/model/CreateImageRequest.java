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
import org.openapitools.client.model.CreateImageRequestModel;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CreateImageRequest
 */
@JsonPropertyOrder({
  CreateImageRequest.JSON_PROPERTY_PROMPT,
  CreateImageRequest.JSON_PROPERTY_MODEL,
  CreateImageRequest.JSON_PROPERTY_N,
  CreateImageRequest.JSON_PROPERTY_QUALITY,
  CreateImageRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  CreateImageRequest.JSON_PROPERTY_SIZE,
  CreateImageRequest.JSON_PROPERTY_STYLE,
  CreateImageRequest.JSON_PROPERTY_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class CreateImageRequest {
  public static final String JSON_PROPERTY_PROMPT = "prompt";
  @javax.annotation.Nonnull
  private String prompt;

  public static final String JSON_PROPERTY_MODEL = "model";
  @javax.annotation.Nullable
  private JsonNullable<CreateImageRequestModel> model = JsonNullable.<CreateImageRequestModel>of(new CreateImageRequestModel());

  public static final String JSON_PROPERTY_N = "n";
  @javax.annotation.Nullable
  private JsonNullable<Integer> n = JsonNullable.<Integer>of(1);

  /**
   * The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;.
   */
  public enum QualityEnum {
    STANDARD(String.valueOf("standard")),
    
    HD(String.valueOf("hd"));

    private String value;

    QualityEnum(String value) {
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
    public static QualityEnum fromValue(String value) {
      for (QualityEnum b : QualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_QUALITY = "quality";
  @javax.annotation.Nullable
  private QualityEnum quality = QualityEnum.STANDARD;

  /**
   * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
   */
  public enum ResponseFormatEnum {
    URL(String.valueOf("url")),
    
    B64_JSON(String.valueOf("b64_json"));

    private String value;

    ResponseFormatEnum(String value) {
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
    public static ResponseFormatEnum fromValue(String value) {
      for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  @javax.annotation.Nullable
  private JsonNullable<ResponseFormatEnum> responseFormat = JsonNullable.<ResponseFormatEnum>of(ResponseFormatEnum.URL);

  /**
   * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models.
   */
  public enum SizeEnum {
    _256X256(String.valueOf("256x256")),
    
    _512X512(String.valueOf("512x512")),
    
    _1024X1024(String.valueOf("1024x1024")),
    
    _1792X1024(String.valueOf("1792x1024")),
    
    _1024X1792(String.valueOf("1024x1792"));

    private String value;

    SizeEnum(String value) {
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
    public static SizeEnum fromValue(String value) {
      for (SizeEnum b : SizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SIZE = "size";
  @javax.annotation.Nullable
  private JsonNullable<SizeEnum> size = JsonNullable.<SizeEnum>of(SizeEnum._1024X1024);

  /**
   * The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;.
   */
  public enum StyleEnum {
    VIVID(String.valueOf("vivid")),
    
    NATURAL(String.valueOf("natural"));

    private String value;

    StyleEnum(String value) {
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
    public static StyleEnum fromValue(String value) {
      for (StyleEnum b : StyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_STYLE = "style";
  @javax.annotation.Nullable
  private JsonNullable<StyleEnum> style = JsonNullable.<StyleEnum>of(StyleEnum.VIVID);

  public static final String JSON_PROPERTY_USER = "user";
  @javax.annotation.Nullable
  private String user;

  public CreateImageRequest() {
  }

  public CreateImageRequest prompt(@javax.annotation.Nonnull String prompt) {
    
    this.prompt = prompt;
    return this;
  }

  /**
   * A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;.
   * @return prompt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrompt() {
    return prompt;
  }


  @JsonProperty(JSON_PROPERTY_PROMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrompt(@javax.annotation.Nonnull String prompt) {
    this.prompt = prompt;
  }

  public CreateImageRequest model(@javax.annotation.Nullable CreateImageRequestModel model) {
    this.model = JsonNullable.<CreateImageRequestModel>of(model);
    
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public CreateImageRequestModel getModel() {
        return model.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CreateImageRequestModel> getModel_JsonNullable() {
    return model;
  }
  
  @JsonProperty(JSON_PROPERTY_MODEL)
  public void setModel_JsonNullable(JsonNullable<CreateImageRequestModel> model) {
    this.model = model;
  }

  public void setModel(@javax.annotation.Nullable CreateImageRequestModel model) {
    this.model = JsonNullable.<CreateImageRequestModel>of(model);
  }

  public CreateImageRequest n(@javax.annotation.Nullable Integer n) {
    this.n = JsonNullable.<Integer>of(n);
    
    return this;
  }

  /**
   * The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
   * minimum: 1
   * maximum: 10
   * @return n
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getN() {
        return n.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getN_JsonNullable() {
    return n;
  }
  
  @JsonProperty(JSON_PROPERTY_N)
  public void setN_JsonNullable(JsonNullable<Integer> n) {
    this.n = n;
  }

  public void setN(@javax.annotation.Nullable Integer n) {
    this.n = JsonNullable.<Integer>of(n);
  }

  public CreateImageRequest quality(@javax.annotation.Nullable QualityEnum quality) {
    
    this.quality = quality;
    return this;
  }

  /**
   * The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;.
   * @return quality
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QualityEnum getQuality() {
    return quality;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuality(@javax.annotation.Nullable QualityEnum quality) {
    this.quality = quality;
  }

  public CreateImageRequest responseFormat(@javax.annotation.Nullable ResponseFormatEnum responseFormat) {
    this.responseFormat = JsonNullable.<ResponseFormatEnum>of(responseFormat);
    
    return this;
  }

  /**
   * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
   * @return responseFormat
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public ResponseFormatEnum getResponseFormat() {
        return responseFormat.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ResponseFormatEnum> getResponseFormat_JsonNullable() {
    return responseFormat;
  }
  
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  public void setResponseFormat_JsonNullable(JsonNullable<ResponseFormatEnum> responseFormat) {
    this.responseFormat = responseFormat;
  }

  public void setResponseFormat(@javax.annotation.Nullable ResponseFormatEnum responseFormat) {
    this.responseFormat = JsonNullable.<ResponseFormatEnum>of(responseFormat);
  }

  public CreateImageRequest size(@javax.annotation.Nullable SizeEnum size) {
    this.size = JsonNullable.<SizeEnum>of(size);
    
    return this;
  }

  /**
   * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models.
   * @return size
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public SizeEnum getSize() {
        return size.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SizeEnum> getSize_JsonNullable() {
    return size;
  }
  
  @JsonProperty(JSON_PROPERTY_SIZE)
  public void setSize_JsonNullable(JsonNullable<SizeEnum> size) {
    this.size = size;
  }

  public void setSize(@javax.annotation.Nullable SizeEnum size) {
    this.size = JsonNullable.<SizeEnum>of(size);
  }

  public CreateImageRequest style(@javax.annotation.Nullable StyleEnum style) {
    this.style = JsonNullable.<StyleEnum>of(style);
    
    return this;
  }

  /**
   * The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;.
   * @return style
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public StyleEnum getStyle() {
        return style.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StyleEnum> getStyle_JsonNullable() {
    return style;
  }
  
  @JsonProperty(JSON_PROPERTY_STYLE)
  public void setStyle_JsonNullable(JsonNullable<StyleEnum> style) {
    this.style = style;
  }

  public void setStyle(@javax.annotation.Nullable StyleEnum style) {
    this.style = JsonNullable.<StyleEnum>of(style);
  }

  public CreateImageRequest user(@javax.annotation.Nullable String user) {
    
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
    CreateImageRequest createImageRequest = (CreateImageRequest) o;
    return Objects.equals(this.prompt, createImageRequest.prompt) &&
        equalsNullable(this.model, createImageRequest.model) &&
        equalsNullable(this.n, createImageRequest.n) &&
        Objects.equals(this.quality, createImageRequest.quality) &&
        equalsNullable(this.responseFormat, createImageRequest.responseFormat) &&
        equalsNullable(this.size, createImageRequest.size) &&
        equalsNullable(this.style, createImageRequest.style) &&
        Objects.equals(this.user, createImageRequest.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, hashCodeNullable(model), hashCodeNullable(n), quality, hashCodeNullable(responseFormat), hashCodeNullable(size), hashCodeNullable(style), user);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateImageRequest {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

    // add `prompt` to the URL query string
    if (getPrompt() != null) {
      try {
        joiner.add(String.format("%sprompt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrompt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `model` to the URL query string
    if (getModel() != null) {
      joiner.add(getModel().toUrlQueryString(prefix + "model" + suffix));
    }

    // add `n` to the URL query string
    if (getN() != null) {
      try {
        joiner.add(String.format("%sn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getN()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quality` to the URL query string
    if (getQuality() != null) {
      try {
        joiner.add(String.format("%squality%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuality()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `response_format` to the URL query string
    if (getResponseFormat() != null) {
      try {
        joiner.add(String.format("%sresponse_format%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResponseFormat()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      try {
        joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `style` to the URL query string
    if (getStyle() != null) {
      try {
        joiner.add(String.format("%sstyle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStyle()), "UTF-8").replaceAll("\\+", "%20")));
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

