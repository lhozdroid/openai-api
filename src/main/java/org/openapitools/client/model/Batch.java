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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.BatchErrors;
import org.openapitools.client.model.BatchRequestCounts;
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
 * Batch
 */
@JsonPropertyOrder({
  Batch.JSON_PROPERTY_ID,
  Batch.JSON_PROPERTY_OBJECT,
  Batch.JSON_PROPERTY_ENDPOINT,
  Batch.JSON_PROPERTY_ERRORS,
  Batch.JSON_PROPERTY_INPUT_FILE_ID,
  Batch.JSON_PROPERTY_COMPLETION_WINDOW,
  Batch.JSON_PROPERTY_STATUS,
  Batch.JSON_PROPERTY_OUTPUT_FILE_ID,
  Batch.JSON_PROPERTY_ERROR_FILE_ID,
  Batch.JSON_PROPERTY_CREATED_AT,
  Batch.JSON_PROPERTY_IN_PROGRESS_AT,
  Batch.JSON_PROPERTY_EXPIRES_AT,
  Batch.JSON_PROPERTY_FINALIZING_AT,
  Batch.JSON_PROPERTY_COMPLETED_AT,
  Batch.JSON_PROPERTY_FAILED_AT,
  Batch.JSON_PROPERTY_EXPIRED_AT,
  Batch.JSON_PROPERTY_CANCELLING_AT,
  Batch.JSON_PROPERTY_CANCELLED_AT,
  Batch.JSON_PROPERTY_REQUEST_COUNTS,
  Batch.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class Batch {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private String id;

  /**
   * The object type, which is always &#x60;batch&#x60;.
   */
  public enum ObjectEnum {
    BATCH(String.valueOf("batch"));

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

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  @javax.annotation.Nonnull
  private String endpoint;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  @javax.annotation.Nullable
  private BatchErrors errors;

  public static final String JSON_PROPERTY_INPUT_FILE_ID = "input_file_id";
  @javax.annotation.Nonnull
  private String inputFileId;

  public static final String JSON_PROPERTY_COMPLETION_WINDOW = "completion_window";
  @javax.annotation.Nonnull
  private String completionWindow;

  /**
   * The current status of the batch.
   */
  public enum StatusEnum {
    VALIDATING(String.valueOf("validating")),
    
    FAILED(String.valueOf("failed")),
    
    IN_PROGRESS(String.valueOf("in_progress")),
    
    FINALIZING(String.valueOf("finalizing")),
    
    COMPLETED(String.valueOf("completed")),
    
    EXPIRED(String.valueOf("expired")),
    
    CANCELLING(String.valueOf("cancelling")),
    
    CANCELLED(String.valueOf("cancelled"));

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

  public static final String JSON_PROPERTY_OUTPUT_FILE_ID = "output_file_id";
  @javax.annotation.Nullable
  private String outputFileId;

  public static final String JSON_PROPERTY_ERROR_FILE_ID = "error_file_id";
  @javax.annotation.Nullable
  private String errorFileId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @javax.annotation.Nonnull
  private Integer createdAt;

  public static final String JSON_PROPERTY_IN_PROGRESS_AT = "in_progress_at";
  @javax.annotation.Nullable
  private Integer inProgressAt;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  @javax.annotation.Nullable
  private Integer expiresAt;

  public static final String JSON_PROPERTY_FINALIZING_AT = "finalizing_at";
  @javax.annotation.Nullable
  private Integer finalizingAt;

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  @javax.annotation.Nullable
  private Integer completedAt;

  public static final String JSON_PROPERTY_FAILED_AT = "failed_at";
  @javax.annotation.Nullable
  private Integer failedAt;

  public static final String JSON_PROPERTY_EXPIRED_AT = "expired_at";
  @javax.annotation.Nullable
  private Integer expiredAt;

  public static final String JSON_PROPERTY_CANCELLING_AT = "cancelling_at";
  @javax.annotation.Nullable
  private Integer cancellingAt;

  public static final String JSON_PROPERTY_CANCELLED_AT = "cancelled_at";
  @javax.annotation.Nullable
  private Integer cancelledAt;

  public static final String JSON_PROPERTY_REQUEST_COUNTS = "request_counts";
  @javax.annotation.Nullable
  private BatchRequestCounts requestCounts;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable
  private JsonNullable<Map<String, String>> metadata = JsonNullable.<Map<String, String>>undefined();

  public Batch() {
  }

  public Batch id(@javax.annotation.Nonnull String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
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

  public Batch _object(@javax.annotation.Nonnull ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always &#x60;batch&#x60;.
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

  public Batch endpoint(@javax.annotation.Nonnull String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

  /**
   * The OpenAI API endpoint used by the batch.
   * @return endpoint
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEndpoint() {
    return endpoint;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndpoint(@javax.annotation.Nonnull String endpoint) {
    this.endpoint = endpoint;
  }

  public Batch errors(@javax.annotation.Nullable BatchErrors errors) {
    
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BatchErrors getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(@javax.annotation.Nullable BatchErrors errors) {
    this.errors = errors;
  }

  public Batch inputFileId(@javax.annotation.Nonnull String inputFileId) {
    
    this.inputFileId = inputFileId;
    return this;
  }

  /**
   * The ID of the input file for the batch.
   * @return inputFileId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInputFileId() {
    return inputFileId;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInputFileId(@javax.annotation.Nonnull String inputFileId) {
    this.inputFileId = inputFileId;
  }

  public Batch completionWindow(@javax.annotation.Nonnull String completionWindow) {
    
    this.completionWindow = completionWindow;
    return this;
  }

  /**
   * The time frame within which the batch should be processed.
   * @return completionWindow
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPLETION_WINDOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCompletionWindow() {
    return completionWindow;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_WINDOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompletionWindow(@javax.annotation.Nonnull String completionWindow) {
    this.completionWindow = completionWindow;
  }

  public Batch status(@javax.annotation.Nonnull StatusEnum status) {
    
    this.status = status;
    return this;
  }

  /**
   * The current status of the batch.
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

  public Batch outputFileId(@javax.annotation.Nullable String outputFileId) {
    
    this.outputFileId = outputFileId;
    return this;
  }

  /**
   * The ID of the file containing the outputs of successfully executed requests.
   * @return outputFileId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutputFileId() {
    return outputFileId;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputFileId(@javax.annotation.Nullable String outputFileId) {
    this.outputFileId = outputFileId;
  }

  public Batch errorFileId(@javax.annotation.Nullable String errorFileId) {
    
    this.errorFileId = errorFileId;
    return this;
  }

  /**
   * The ID of the file containing the outputs of requests with errors.
   * @return errorFileId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorFileId() {
    return errorFileId;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorFileId(@javax.annotation.Nullable String errorFileId) {
    this.errorFileId = errorFileId;
  }

  public Batch createdAt(@javax.annotation.Nonnull Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was created.
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

  public Batch inProgressAt(@javax.annotation.Nullable Integer inProgressAt) {
    
    this.inProgressAt = inProgressAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started processing.
   * @return inProgressAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_PROGRESS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInProgressAt() {
    return inProgressAt;
  }


  @JsonProperty(JSON_PROPERTY_IN_PROGRESS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInProgressAt(@javax.annotation.Nullable Integer inProgressAt) {
    this.inProgressAt = inProgressAt;
  }

  public Batch expiresAt(@javax.annotation.Nullable Integer expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch will expire.
   * @return expiresAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(@javax.annotation.Nullable Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Batch finalizingAt(@javax.annotation.Nullable Integer finalizingAt) {
    
    this.finalizingAt = finalizingAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started finalizing.
   * @return finalizingAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINALIZING_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFinalizingAt() {
    return finalizingAt;
  }


  @JsonProperty(JSON_PROPERTY_FINALIZING_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinalizingAt(@javax.annotation.Nullable Integer finalizingAt) {
    this.finalizingAt = finalizingAt;
  }

  public Batch completedAt(@javax.annotation.Nullable Integer completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was completed.
   * @return completedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCompletedAt() {
    return completedAt;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedAt(@javax.annotation.Nullable Integer completedAt) {
    this.completedAt = completedAt;
  }

  public Batch failedAt(@javax.annotation.Nullable Integer failedAt) {
    
    this.failedAt = failedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch failed.
   * @return failedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFailedAt() {
    return failedAt;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedAt(@javax.annotation.Nullable Integer failedAt) {
    this.failedAt = failedAt;
  }

  public Batch expiredAt(@javax.annotation.Nullable Integer expiredAt) {
    
    this.expiredAt = expiredAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch expired.
   * @return expiredAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiredAt() {
    return expiredAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiredAt(@javax.annotation.Nullable Integer expiredAt) {
    this.expiredAt = expiredAt;
  }

  public Batch cancellingAt(@javax.annotation.Nullable Integer cancellingAt) {
    
    this.cancellingAt = cancellingAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch started cancelling.
   * @return cancellingAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANCELLING_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCancellingAt() {
    return cancellingAt;
  }


  @JsonProperty(JSON_PROPERTY_CANCELLING_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancellingAt(@javax.annotation.Nullable Integer cancellingAt) {
    this.cancellingAt = cancellingAt;
  }

  public Batch cancelledAt(@javax.annotation.Nullable Integer cancelledAt) {
    
    this.cancelledAt = cancelledAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the batch was cancelled.
   * @return cancelledAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANCELLED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCancelledAt() {
    return cancelledAt;
  }


  @JsonProperty(JSON_PROPERTY_CANCELLED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancelledAt(@javax.annotation.Nullable Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public Batch requestCounts(@javax.annotation.Nullable BatchRequestCounts requestCounts) {
    
    this.requestCounts = requestCounts;
    return this;
  }

  /**
   * Get requestCounts
   * @return requestCounts
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BatchRequestCounts getRequestCounts() {
    return requestCounts;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestCounts(@javax.annotation.Nullable BatchRequestCounts requestCounts) {
    this.requestCounts = requestCounts;
  }

  public Batch metadata(@javax.annotation.Nullable Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
    
    return this;
  }

  public Batch putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.metadata.get().put(key, metadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format, and querying for objects via API or the dashboard.  Keys are strings with a maximum length of 64 characters. Values are strings with a maximum length of 512 characters. 
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Map<String, String> getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Map<String, String>> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(@javax.annotation.Nullable Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch batch = (Batch) o;
    return Objects.equals(this.id, batch.id) &&
        Objects.equals(this._object, batch._object) &&
        Objects.equals(this.endpoint, batch.endpoint) &&
        Objects.equals(this.errors, batch.errors) &&
        Objects.equals(this.inputFileId, batch.inputFileId) &&
        Objects.equals(this.completionWindow, batch.completionWindow) &&
        Objects.equals(this.status, batch.status) &&
        Objects.equals(this.outputFileId, batch.outputFileId) &&
        Objects.equals(this.errorFileId, batch.errorFileId) &&
        Objects.equals(this.createdAt, batch.createdAt) &&
        Objects.equals(this.inProgressAt, batch.inProgressAt) &&
        Objects.equals(this.expiresAt, batch.expiresAt) &&
        Objects.equals(this.finalizingAt, batch.finalizingAt) &&
        Objects.equals(this.completedAt, batch.completedAt) &&
        Objects.equals(this.failedAt, batch.failedAt) &&
        Objects.equals(this.expiredAt, batch.expiredAt) &&
        Objects.equals(this.cancellingAt, batch.cancellingAt) &&
        Objects.equals(this.cancelledAt, batch.cancelledAt) &&
        Objects.equals(this.requestCounts, batch.requestCounts) &&
        equalsNullable(this.metadata, batch.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, endpoint, errors, inputFileId, completionWindow, status, outputFileId, errorFileId, createdAt, inProgressAt, expiresAt, finalizingAt, completedAt, failedAt, expiredAt, cancellingAt, cancelledAt, requestCounts, hashCodeNullable(metadata));
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
    sb.append("class Batch {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    inputFileId: ").append(toIndentedString(inputFileId)).append("\n");
    sb.append("    completionWindow: ").append(toIndentedString(completionWindow)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    outputFileId: ").append(toIndentedString(outputFileId)).append("\n");
    sb.append("    errorFileId: ").append(toIndentedString(errorFileId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    inProgressAt: ").append(toIndentedString(inProgressAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    finalizingAt: ").append(toIndentedString(finalizingAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    cancellingAt: ").append(toIndentedString(cancellingAt)).append("\n");
    sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
    sb.append("    requestCounts: ").append(toIndentedString(requestCounts)).append("\n");
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

    // add `endpoint` to the URL query string
    if (getEndpoint() != null) {
      try {
        joiner.add(String.format("%sendpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `errors` to the URL query string
    if (getErrors() != null) {
      joiner.add(getErrors().toUrlQueryString(prefix + "errors" + suffix));
    }

    // add `input_file_id` to the URL query string
    if (getInputFileId() != null) {
      try {
        joiner.add(String.format("%sinput_file_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInputFileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completion_window` to the URL query string
    if (getCompletionWindow() != null) {
      try {
        joiner.add(String.format("%scompletion_window%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionWindow()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `output_file_id` to the URL query string
    if (getOutputFileId() != null) {
      try {
        joiner.add(String.format("%soutput_file_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOutputFileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error_file_id` to the URL query string
    if (getErrorFileId() != null) {
      try {
        joiner.add(String.format("%serror_file_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorFileId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `in_progress_at` to the URL query string
    if (getInProgressAt() != null) {
      try {
        joiner.add(String.format("%sin_progress_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInProgressAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `finalizing_at` to the URL query string
    if (getFinalizingAt() != null) {
      try {
        joiner.add(String.format("%sfinalizing_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFinalizingAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completed_at` to the URL query string
    if (getCompletedAt() != null) {
      try {
        joiner.add(String.format("%scompleted_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failed_at` to the URL query string
    if (getFailedAt() != null) {
      try {
        joiner.add(String.format("%sfailed_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expired_at` to the URL query string
    if (getExpiredAt() != null) {
      try {
        joiner.add(String.format("%sexpired_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiredAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cancelling_at` to the URL query string
    if (getCancellingAt() != null) {
      try {
        joiner.add(String.format("%scancelling_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCancellingAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cancelled_at` to the URL query string
    if (getCancelledAt() != null) {
      try {
        joiner.add(String.format("%scancelled_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCancelledAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `request_counts` to the URL query string
    if (getRequestCounts() != null) {
      joiner.add(getRequestCounts().toUrlQueryString(prefix + "request_counts" + suffix));
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

