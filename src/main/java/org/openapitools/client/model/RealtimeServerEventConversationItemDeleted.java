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
 * Returned when an item in the conversation is deleted by the client with a &#x60;conversation.item.delete&#x60; event. This event is used to synchronize the server&#39;s understanding of the conversation history with the client&#39;s view. 
 */
@JsonPropertyOrder({
  RealtimeServerEventConversationItemDeleted.JSON_PROPERTY_EVENT_ID,
  RealtimeServerEventConversationItemDeleted.JSON_PROPERTY_TYPE,
  RealtimeServerEventConversationItemDeleted.JSON_PROPERTY_ITEM_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class RealtimeServerEventConversationItemDeleted {
  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  @javax.annotation.Nonnull
  private String eventId;

  /**
   * The event type, must be &#x60;conversation.item.deleted&#x60;.
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_DELETED(String.valueOf("conversation.item.deleted"));

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

  public static final String JSON_PROPERTY_ITEM_ID = "item_id";
  @javax.annotation.Nonnull
  private String itemId;

  public RealtimeServerEventConversationItemDeleted() {
  }

  public RealtimeServerEventConversationItemDeleted eventId(@javax.annotation.Nonnull String eventId) {
    
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

  public RealtimeServerEventConversationItemDeleted type(@javax.annotation.Nonnull TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * The event type, must be &#x60;conversation.item.deleted&#x60;.
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

  public RealtimeServerEventConversationItemDeleted itemId(@javax.annotation.Nonnull String itemId) {
    
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the item that was deleted.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventConversationItemDeleted realtimeServerEventConversationItemDeleted = (RealtimeServerEventConversationItemDeleted) o;
    return Objects.equals(this.eventId, realtimeServerEventConversationItemDeleted.eventId) &&
        Objects.equals(this.type, realtimeServerEventConversationItemDeleted.type) &&
        Objects.equals(this.itemId, realtimeServerEventConversationItemDeleted.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationItemDeleted {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

    // add `item_id` to the URL query string
    if (getItemId() != null) {
      try {
        joiner.add(String.format("%sitem_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getItemId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

