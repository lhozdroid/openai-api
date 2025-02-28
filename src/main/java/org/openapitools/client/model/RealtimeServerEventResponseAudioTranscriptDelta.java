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
 * Returned when the model-generated transcription of audio output is updated. 
 */
@JsonPropertyOrder({
  RealtimeServerEventResponseAudioTranscriptDelta.JSON_PROPERTY_EVENT_ID,
  RealtimeServerEventResponseAudioTranscriptDelta.JSON_PROPERTY_TYPE,
  RealtimeServerEventResponseAudioTranscriptDelta.JSON_PROPERTY_RESPONSE_ID,
  RealtimeServerEventResponseAudioTranscriptDelta.JSON_PROPERTY_ITEM_ID,
  RealtimeServerEventResponseAudioTranscriptDelta.JSON_PROPERTY_OUTPUT_INDEX,
  RealtimeServerEventResponseAudioTranscriptDelta.JSON_PROPERTY_CONTENT_INDEX,
  RealtimeServerEventResponseAudioTranscriptDelta.JSON_PROPERTY_DELTA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class RealtimeServerEventResponseAudioTranscriptDelta {
  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  @javax.annotation.Nonnull
  private String eventId;

  /**
   * The event type, must be &#x60;response.audio_transcript.delta&#x60;.
   */
  public enum TypeEnum {
    RESPONSE_AUDIO_TRANSCRIPT_DELTA(String.valueOf("response.audio_transcript.delta"));

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

  public static final String JSON_PROPERTY_RESPONSE_ID = "response_id";
  @javax.annotation.Nonnull
  private String responseId;

  public static final String JSON_PROPERTY_ITEM_ID = "item_id";
  @javax.annotation.Nonnull
  private String itemId;

  public static final String JSON_PROPERTY_OUTPUT_INDEX = "output_index";
  @javax.annotation.Nonnull
  private Integer outputIndex;

  public static final String JSON_PROPERTY_CONTENT_INDEX = "content_index";
  @javax.annotation.Nonnull
  private Integer contentIndex;

  public static final String JSON_PROPERTY_DELTA = "delta";
  @javax.annotation.Nonnull
  private String delta;

  public RealtimeServerEventResponseAudioTranscriptDelta() {
  }

  public RealtimeServerEventResponseAudioTranscriptDelta eventId(@javax.annotation.Nonnull String eventId) {
    
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventId() {
    return eventId;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventId(@javax.annotation.Nonnull String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta type(@javax.annotation.Nonnull TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * The event type, must be &#x60;response.audio_transcript.delta&#x60;.
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

  public RealtimeServerEventResponseAudioTranscriptDelta responseId(@javax.annotation.Nonnull String responseId) {
    
    this.responseId = responseId;
    return this;
  }

  /**
   * The ID of the response.
   * @return responseId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESPONSE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResponseId() {
    return responseId;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResponseId(@javax.annotation.Nonnull String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta itemId(@javax.annotation.Nonnull String itemId) {
    
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the item.
   * @return itemId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemId() {
    return itemId;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItemId(@javax.annotation.Nonnull String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta outputIndex(@javax.annotation.Nonnull Integer outputIndex) {
    
    this.outputIndex = outputIndex;
    return this;
  }

  /**
   * The index of the output item in the response.
   * @return outputIndex
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OUTPUT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOutputIndex() {
    return outputIndex;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOutputIndex(@javax.annotation.Nonnull Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta contentIndex(@javax.annotation.Nonnull Integer contentIndex) {
    
    this.contentIndex = contentIndex;
    return this;
  }

  /**
   * The index of the content part in the item&#39;s content array.
   * @return contentIndex
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getContentIndex() {
    return contentIndex;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContentIndex(@javax.annotation.Nonnull Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventResponseAudioTranscriptDelta delta(@javax.annotation.Nonnull String delta) {
    
    this.delta = delta;
    return this;
  }

  /**
   * The transcript delta.
   * @return delta
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELTA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDelta() {
    return delta;
  }


  @JsonProperty(JSON_PROPERTY_DELTA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelta(@javax.annotation.Nonnull String delta) {
    this.delta = delta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseAudioTranscriptDelta realtimeServerEventResponseAudioTranscriptDelta = (RealtimeServerEventResponseAudioTranscriptDelta) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseAudioTranscriptDelta.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseAudioTranscriptDelta.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseAudioTranscriptDelta.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseAudioTranscriptDelta.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseAudioTranscriptDelta.outputIndex) &&
        Objects.equals(this.contentIndex, realtimeServerEventResponseAudioTranscriptDelta.contentIndex) &&
        Objects.equals(this.delta, realtimeServerEventResponseAudioTranscriptDelta.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseAudioTranscriptDelta {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

    // add `event_id` to the URL query string
    if (getEventId() != null) {
      try {
        joiner.add(String.format("%sevent_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `response_id` to the URL query string
    if (getResponseId() != null) {
      try {
        joiner.add(String.format("%sresponse_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResponseId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `item_id` to the URL query string
    if (getItemId() != null) {
      try {
        joiner.add(String.format("%sitem_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getItemId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `output_index` to the URL query string
    if (getOutputIndex() != null) {
      try {
        joiner.add(String.format("%soutput_index%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOutputIndex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content_index` to the URL query string
    if (getContentIndex() != null) {
      try {
        joiner.add(String.format("%scontent_index%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContentIndex()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `delta` to the URL query string
    if (getDelta() != null) {
      try {
        joiner.add(String.format("%sdelta%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelta()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

