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
 * UploadFile
 */
@JsonPropertyOrder({
  UploadFile.JSON_PROPERTY_ID,
  UploadFile.JSON_PROPERTY_BYTES,
  UploadFile.JSON_PROPERTY_CREATED_AT,
  UploadFile.JSON_PROPERTY_FILENAME,
  UploadFile.JSON_PROPERTY_OBJECT,
  UploadFile.JSON_PROPERTY_PURPOSE,
  UploadFile.JSON_PROPERTY_STATUS,
  UploadFile.JSON_PROPERTY_STATUS_DETAILS
})
@JsonTypeName("Upload_file")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class UploadFile {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private String id;

  public static final String JSON_PROPERTY_BYTES = "bytes";
  @javax.annotation.Nonnull
  private Integer bytes;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @javax.annotation.Nonnull
  private Integer createdAt;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  @javax.annotation.Nonnull
  private String filename;

  /**
   * The object type, which is always &#x60;file&#x60;.
   */
  public enum ObjectEnum {
    FILE(String.valueOf("file"));

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

  /**
   * The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;.
   */
  public enum PurposeEnum {
    ASSISTANTS(String.valueOf("assistants")),
    
    ASSISTANTS_OUTPUT(String.valueOf("assistants_output")),
    
    BATCH(String.valueOf("batch")),
    
    BATCH_OUTPUT(String.valueOf("batch_output")),
    
    FINE_TUNE(String.valueOf("fine-tune")),
    
    FINE_TUNE_RESULTS(String.valueOf("fine-tune-results")),
    
    VISION(String.valueOf("vision"));

    private String value;

    PurposeEnum(String value) {
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
    public static PurposeEnum fromValue(String value) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PURPOSE = "purpose";
  @javax.annotation.Nonnull
  private PurposeEnum purpose;

  /**
   * Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
   */
  public enum StatusEnum {
    UPLOADED(String.valueOf("uploaded")),
    
    PROCESSED(String.valueOf("processed")),
    
    ERROR(String.valueOf("error"));

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

  public static final String JSON_PROPERTY_STATUS_DETAILS = "status_details";
  @javax.annotation.Nullable
  private String statusDetails;

  public UploadFile() {
  }

  public UploadFile id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The file identifier, which can be referenced in the API endpoints.
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

  public UploadFile bytes(@javax.annotation.Nonnull Integer bytes) {
    
    this.bytes = bytes;
    return this;
  }

  /**
   * The size of the file, in bytes.
   * @return bytes
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBytes() {
    return bytes;
  }


  @JsonProperty(JSON_PROPERTY_BYTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBytes(@javax.annotation.Nonnull Integer bytes) {
    this.bytes = bytes;
  }

  public UploadFile createdAt(@javax.annotation.Nonnull Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the file was created.
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

  public UploadFile filename(@javax.annotation.Nonnull String filename) {
    
    this.filename = filename;
    return this;
  }

  /**
   * The name of the file.
   * @return filename
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilename(@javax.annotation.Nonnull String filename) {
    this.filename = filename;
  }

  public UploadFile _object(@javax.annotation.Nonnull ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always &#x60;file&#x60;.
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

  public UploadFile purpose(@javax.annotation.Nonnull PurposeEnum purpose) {
    
    this.purpose = purpose;
    return this;
  }

  /**
   * The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;.
   * @return purpose
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PurposeEnum getPurpose() {
    return purpose;
  }


  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPurpose(@javax.annotation.Nonnull PurposeEnum purpose) {
    this.purpose = purpose;
  }

  public UploadFile status(@javax.annotation.Nonnull StatusEnum status) {
    
    this.status = status;
    return this;
  }

  /**
   * Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
   * @return status
   * @deprecated
   */
  @Deprecated
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

  public UploadFile statusDetails(@javax.annotation.Nullable String statusDetails) {
    
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.
   * @return statusDetails
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusDetails() {
    return statusDetails;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusDetails(@javax.annotation.Nullable String statusDetails) {
    this.statusDetails = statusDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFile uploadFile = (UploadFile) o;
    return Objects.equals(this.id, uploadFile.id) &&
        Objects.equals(this.bytes, uploadFile.bytes) &&
        Objects.equals(this.createdAt, uploadFile.createdAt) &&
        Objects.equals(this.filename, uploadFile.filename) &&
        Objects.equals(this._object, uploadFile._object) &&
        Objects.equals(this.purpose, uploadFile.purpose) &&
        Objects.equals(this.status, uploadFile.status) &&
        Objects.equals(this.statusDetails, uploadFile.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bytes, createdAt, filename, _object, purpose, status, statusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadFile {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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

    // add `bytes` to the URL query string
    if (getBytes() != null) {
      try {
        joiner.add(String.format("%sbytes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBytes()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `filename` to the URL query string
    if (getFilename() != null) {
      try {
        joiner.add(String.format("%sfilename%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFilename()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `purpose` to the URL query string
    if (getPurpose() != null) {
      try {
        joiner.add(String.format("%spurpose%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPurpose()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `status_details` to the URL query string
    if (getStatusDetails() != null) {
      try {
        joiner.add(String.format("%sstatus_details%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatusDetails()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

