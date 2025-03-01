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
import com.openai.openapi.model.VectorStoreExpirationAfter;
import com.openai.openapi.model.VectorStoreObjectFileCounts;
import java.util.HashMap;
import java.util.Map;
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
 * A vector store is a collection of processed files can be used by the &#x60;file_search&#x60; tool.
 */
@JsonPropertyOrder({
  VectorStoreObject.JSON_PROPERTY_ID,
  VectorStoreObject.JSON_PROPERTY_OBJECT,
  VectorStoreObject.JSON_PROPERTY_CREATED_AT,
  VectorStoreObject.JSON_PROPERTY_NAME,
  VectorStoreObject.JSON_PROPERTY_USAGE_BYTES,
  VectorStoreObject.JSON_PROPERTY_FILE_COUNTS,
  VectorStoreObject.JSON_PROPERTY_STATUS,
  VectorStoreObject.JSON_PROPERTY_EXPIRES_AFTER,
  VectorStoreObject.JSON_PROPERTY_EXPIRES_AT,
  VectorStoreObject.JSON_PROPERTY_LAST_ACTIVE_AT,
  VectorStoreObject.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T10:23:25.420936454-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class VectorStoreObject {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private String id;

  /**
   * The object type, which is always &#x60;vector_store&#x60;.
   */
  public enum ObjectEnum {
    VECTOR_STORE(String.valueOf("vector_store"));

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

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @javax.annotation.Nonnull
  private Integer createdAt;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_USAGE_BYTES = "usage_bytes";
  @javax.annotation.Nonnull
  private Integer usageBytes;

  public static final String JSON_PROPERTY_FILE_COUNTS = "file_counts";
  @javax.annotation.Nonnull
  private VectorStoreObjectFileCounts fileCounts;

  /**
   * The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use.
   */
  public enum StatusEnum {
    EXPIRED(String.valueOf("expired")),
    
    IN_PROGRESS(String.valueOf("in_progress")),
    
    COMPLETED(String.valueOf("completed"));

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private StatusEnum status;

  public static final String JSON_PROPERTY_EXPIRES_AFTER = "expires_after";
  @javax.annotation.Nullable
  private VectorStoreExpirationAfter expiresAfter;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  @javax.annotation.Nullable
  private JsonNullable<Integer> expiresAt = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_LAST_ACTIVE_AT = "last_active_at";
  @javax.annotation.Nullable
  private Integer lastActiveAt;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable
  private Map<String, String> metadata;

  public VectorStoreObject() {
  }

  public VectorStoreObject id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
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

  public VectorStoreObject _object(@javax.annotation.Nonnull ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always &#x60;vector_store&#x60;.
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

  public VectorStoreObject createdAt(@javax.annotation.Nonnull Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(@javax.annotation.Nonnull Integer createdAt) {
    this.createdAt = createdAt;
  }

  public VectorStoreObject name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name of the vector store.
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }

  public VectorStoreObject usageBytes(@javax.annotation.Nonnull Integer usageBytes) {
    
    this.usageBytes = usageBytes;
    return this;
  }

  /**
   * The total number of bytes used by the files in the vector store.
   * @return usageBytes
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USAGE_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUsageBytes() {
    return usageBytes;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsageBytes(@javax.annotation.Nonnull Integer usageBytes) {
    this.usageBytes = usageBytes;
  }

  public VectorStoreObject fileCounts(@javax.annotation.Nonnull VectorStoreObjectFileCounts fileCounts) {
    
    this.fileCounts = fileCounts;
    return this;
  }

  /**
   * Get fileCounts
   * @return fileCounts
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE_COUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VectorStoreObjectFileCounts getFileCounts() {
    return fileCounts;
  }


  @JsonProperty(JSON_PROPERTY_FILE_COUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileCounts(@javax.annotation.Nonnull VectorStoreObjectFileCounts fileCounts) {
    this.fileCounts = fileCounts;
  }

  public VectorStoreObject status(@javax.annotation.Nonnull StatusEnum status) {
    
    this.status = status;
    return this;
  }

  /**
   * The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use.
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }

  public VectorStoreObject expiresAfter(@javax.annotation.Nullable VectorStoreExpirationAfter expiresAfter) {
    
    this.expiresAfter = expiresAfter;
    return this;
  }

  /**
   * Get expiresAfter
   * @return expiresAfter
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAfter(@javax.annotation.Nullable VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  public VectorStoreObject expiresAt(@javax.annotation.Nullable Integer expiresAt) {
    this.expiresAt = JsonNullable.<Integer>of(expiresAt);
    
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store will expire.
   * @return expiresAt
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getExpiresAt() {
        return expiresAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getExpiresAt_JsonNullable() {
    return expiresAt;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  public void setExpiresAt_JsonNullable(JsonNullable<Integer> expiresAt) {
    this.expiresAt = expiresAt;
  }

  public void setExpiresAt(@javax.annotation.Nullable Integer expiresAt) {
    this.expiresAt = JsonNullable.<Integer>of(expiresAt);
  }

  public VectorStoreObject lastActiveAt(@javax.annotation.Nullable Integer lastActiveAt) {
    
    this.lastActiveAt = lastActiveAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the vector store was last active.
   * @return lastActiveAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_ACTIVE_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLastActiveAt() {
    return lastActiveAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ACTIVE_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastActiveAt(@javax.annotation.Nullable Integer lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
  }

  public VectorStoreObject metadata(@javax.annotation.Nullable Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public VectorStoreObject putMetadataItem(String key, String metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.  Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters. 
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(@javax.annotation.Nullable Map<String, String> metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VectorStoreObject vectorStoreObject = (VectorStoreObject) o;
    return Objects.equals(this.id, vectorStoreObject.id) &&
        Objects.equals(this._object, vectorStoreObject._object) &&
        Objects.equals(this.createdAt, vectorStoreObject.createdAt) &&
        Objects.equals(this.name, vectorStoreObject.name) &&
        Objects.equals(this.usageBytes, vectorStoreObject.usageBytes) &&
        Objects.equals(this.fileCounts, vectorStoreObject.fileCounts) &&
        Objects.equals(this.status, vectorStoreObject.status) &&
        Objects.equals(this.expiresAfter, vectorStoreObject.expiresAfter) &&
        equalsNullable(this.expiresAt, vectorStoreObject.expiresAt) &&
        Objects.equals(this.lastActiveAt, vectorStoreObject.lastActiveAt) &&
        Objects.equals(this.metadata, vectorStoreObject.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, name, usageBytes, fileCounts, status, expiresAfter, hashCodeNullable(expiresAt), lastActiveAt, metadata);
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
    sb.append("class VectorStoreObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    usageBytes: ").append(toIndentedString(usageBytes)).append("\n");
    sb.append("    fileCounts: ").append(toIndentedString(fileCounts)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiresAfter: ").append(toIndentedString(expiresAfter)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    lastActiveAt: ").append(toIndentedString(lastActiveAt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

    // add `object` to the URL query string
    if (getObject() != null) {
      try {
        joiner.add(String.format("%sobject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getObject()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `created_at` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screated_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `usage_bytes` to the URL query string
    if (getUsageBytes() != null) {
      try {
        joiner.add(String.format("%susage_bytes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsageBytes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `file_counts` to the URL query string
    if (getFileCounts() != null) {
      joiner.add(getFileCounts().toUrlQueryString(prefix + "file_counts" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expires_after` to the URL query string
    if (getExpiresAfter() != null) {
      joiner.add(getExpiresAfter().toUrlQueryString(prefix + "expires_after" + suffix));
    }

    // add `expires_at` to the URL query string
    if (getExpiresAt() != null) {
      try {
        joiner.add(String.format("%sexpires_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiresAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `last_active_at` to the URL query string
    if (getLastActiveAt() != null) {
      try {
        joiner.add(String.format("%slast_active_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastActiveAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      for (String _key : getMetadata().keySet()) {
        try {
          joiner.add(String.format("%smetadata%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMetadata().get(_key), URLEncoder.encode(String.valueOf(getMetadata().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

