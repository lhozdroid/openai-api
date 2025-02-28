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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CompletionUsage;
import org.openapitools.client.model.CreateChatCompletionFunctionResponseChoicesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 */
@JsonPropertyOrder({
  CreateChatCompletionFunctionResponse.JSON_PROPERTY_ID,
  CreateChatCompletionFunctionResponse.JSON_PROPERTY_CHOICES,
  CreateChatCompletionFunctionResponse.JSON_PROPERTY_CREATED,
  CreateChatCompletionFunctionResponse.JSON_PROPERTY_MODEL,
  CreateChatCompletionFunctionResponse.JSON_PROPERTY_SYSTEM_FINGERPRINT,
  CreateChatCompletionFunctionResponse.JSON_PROPERTY_OBJECT,
  CreateChatCompletionFunctionResponse.JSON_PROPERTY_USAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class CreateChatCompletionFunctionResponse {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private String id;

  public static final String JSON_PROPERTY_CHOICES = "choices";
  @javax.annotation.Nonnull
  private List<CreateChatCompletionFunctionResponseChoicesInner> choices = new ArrayList<>();

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nonnull
  private Integer created;

  public static final String JSON_PROPERTY_MODEL = "model";
  @javax.annotation.Nonnull
  private String model;

  public static final String JSON_PROPERTY_SYSTEM_FINGERPRINT = "system_fingerprint";
  @javax.annotation.Nullable
  private String systemFingerprint;

  /**
   * The object type, which is always &#x60;chat.completion&#x60;.
   */
  public enum ObjectEnum {
    CHAT_COMPLETION(String.valueOf("chat.completion"));

    private String value;

    ObjectEnum(String value) {
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
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OBJECT = "object";
  @javax.annotation.Nonnull
  private ObjectEnum _object;

  public static final String JSON_PROPERTY_USAGE = "usage";
  @javax.annotation.Nullable
  private CompletionUsage usage;

  public CreateChatCompletionFunctionResponse() {
  }

  public CreateChatCompletionFunctionResponse id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for the chat completion.
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

  public CreateChatCompletionFunctionResponse choices(@javax.annotation.Nonnull List<CreateChatCompletionFunctionResponseChoicesInner> choices) {
    
    this.choices = choices;
    return this;
  }

  public CreateChatCompletionFunctionResponse addChoicesItem(CreateChatCompletionFunctionResponseChoicesInner choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
   * @return choices
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHOICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CreateChatCompletionFunctionResponseChoicesInner> getChoices() {
    return choices;
  }


  @JsonProperty(JSON_PROPERTY_CHOICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChoices(@javax.annotation.Nonnull List<CreateChatCompletionFunctionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionFunctionResponse created(@javax.annotation.Nonnull Integer created) {
    
    this.created = created;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the chat completion was created.
   * @return created
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(@javax.annotation.Nonnull Integer created) {
    this.created = created;
  }

  public CreateChatCompletionFunctionResponse model(@javax.annotation.Nonnull String model) {
    
    this.model = model;
    return this;
  }

  /**
   * The model used for the chat completion.
   * @return model
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModel() {
    return model;
  }


  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModel(@javax.annotation.Nonnull String model) {
    this.model = model;
  }

  public CreateChatCompletionFunctionResponse systemFingerprint(@javax.annotation.Nullable String systemFingerprint) {
    
    this.systemFingerprint = systemFingerprint;
    return this;
  }

  /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
   * @return systemFingerprint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSystemFingerprint() {
    return systemFingerprint;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemFingerprint(@javax.annotation.Nullable String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  public CreateChatCompletionFunctionResponse _object(@javax.annotation.Nonnull ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always &#x60;chat.completion&#x60;.
   * @return _object
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ObjectEnum getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObject(@javax.annotation.Nonnull ObjectEnum _object) {
    this._object = _object;
  }

  public CreateChatCompletionFunctionResponse usage(@javax.annotation.Nullable CompletionUsage usage) {
    
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CompletionUsage getUsage() {
    return usage;
  }


  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsage(@javax.annotation.Nullable CompletionUsage usage) {
    this.usage = usage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionFunctionResponse createChatCompletionFunctionResponse = (CreateChatCompletionFunctionResponse) o;
    return Objects.equals(this.id, createChatCompletionFunctionResponse.id) &&
        Objects.equals(this.choices, createChatCompletionFunctionResponse.choices) &&
        Objects.equals(this.created, createChatCompletionFunctionResponse.created) &&
        Objects.equals(this.model, createChatCompletionFunctionResponse.model) &&
        Objects.equals(this.systemFingerprint, createChatCompletionFunctionResponse.systemFingerprint) &&
        Objects.equals(this._object, createChatCompletionFunctionResponse._object) &&
        Objects.equals(this.usage, createChatCompletionFunctionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, systemFingerprint, _object, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionFunctionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    systemFingerprint: ").append(toIndentedString(systemFingerprint)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

    // add `choices` to the URL query string
    if (getChoices() != null) {
      for (int i = 0; i < getChoices().size(); i++) {
        if (getChoices().get(i) != null) {
          joiner.add(getChoices().get(i).toUrlQueryString(String.format("%schoices%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      try {
        joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreated()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `model` to the URL query string
    if (getModel() != null) {
      try {
        joiner.add(String.format("%smodel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `system_fingerprint` to the URL query string
    if (getSystemFingerprint() != null) {
      try {
        joiner.add(String.format("%ssystem_fingerprint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSystemFingerprint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `object` to the URL query string
    if (getObject() != null) {
      try {
        joiner.add(String.format("%sobject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getObject()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `usage` to the URL query string
    if (getUsage() != null) {
      joiner.add(getUsage().toUrlQueryString(prefix + "usage" + suffix));
    }

    return joiner.toString();
  }

}

