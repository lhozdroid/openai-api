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
import org.openapitools.client.model.RealtimeConversationItemContentInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The item to add to the conversation.
 */
@JsonPropertyOrder({
  RealtimeConversationItem.JSON_PROPERTY_ID,
  RealtimeConversationItem.JSON_PROPERTY_TYPE,
  RealtimeConversationItem.JSON_PROPERTY_OBJECT,
  RealtimeConversationItem.JSON_PROPERTY_STATUS,
  RealtimeConversationItem.JSON_PROPERTY_ROLE,
  RealtimeConversationItem.JSON_PROPERTY_CONTENT,
  RealtimeConversationItem.JSON_PROPERTY_CALL_ID,
  RealtimeConversationItem.JSON_PROPERTY_NAME,
  RealtimeConversationItem.JSON_PROPERTY_ARGUMENTS,
  RealtimeConversationItem.JSON_PROPERTY_OUTPUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class RealtimeConversationItem {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  /**
   * The type of the item (&#x60;message&#x60;, &#x60;function_call&#x60;, &#x60;function_call_output&#x60;). 
   */
  public enum TypeEnum {
    MESSAGE(String.valueOf("message")),
    
    FUNCTION_CALL(String.valueOf("function_call")),
    
    FUNCTION_CALL_OUTPUT(String.valueOf("function_call_output"));

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
  @javax.annotation.Nullable
  private TypeEnum type;

  /**
   * Identifier for the API object being returned - always &#x60;realtime.item&#x60;. 
   */
  public enum ObjectEnum {
    REALTIME_ITEM(String.valueOf("realtime.item"));

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
  @javax.annotation.Nullable
  private ObjectEnum _object;

  /**
   * The status of the item (&#x60;completed&#x60;, &#x60;incomplete&#x60;). These have no effect on the conversation, but are accepted for consistency with the &#x60;conversation.item.created&#x60; event. 
   */
  public enum StatusEnum {
    COMPLETED(String.valueOf("completed")),
    
    INCOMPLETE(String.valueOf("incomplete"));

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
  @javax.annotation.Nullable
  private StatusEnum status;

  /**
   * The role of the message sender (&#x60;user&#x60;, &#x60;assistant&#x60;, &#x60;system&#x60;), only applicable for &#x60;message&#x60; items. 
   */
  public enum RoleEnum {
    USER(String.valueOf("user")),
    
    ASSISTANT(String.valueOf("assistant")),
    
    SYSTEM(String.valueOf("system"));

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  @javax.annotation.Nullable
  private RoleEnum role;

  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nullable
  private List<RealtimeConversationItemContentInner> content = new ArrayList<>();

  public static final String JSON_PROPERTY_CALL_ID = "call_id";
  @javax.annotation.Nullable
  private String callId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  @javax.annotation.Nullable
  private String arguments;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  @javax.annotation.Nullable
  private String output;

  public RealtimeConversationItem() {
  }

  public RealtimeConversationItem id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the item, this can be generated by the client to help manage server-side context, but is not required because the server will generate one if not provided. 
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }

  public RealtimeConversationItem type(@javax.annotation.Nullable TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * The type of the item (&#x60;message&#x60;, &#x60;function_call&#x60;, &#x60;function_call_output&#x60;). 
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable TypeEnum type) {
    this.type = type;
  }

  public RealtimeConversationItem _object(@javax.annotation.Nullable ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

  /**
   * Identifier for the API object being returned - always &#x60;realtime.item&#x60;. 
   * @return _object
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ObjectEnum getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(@javax.annotation.Nullable ObjectEnum _object) {
    this._object = _object;
  }

  public RealtimeConversationItem status(@javax.annotation.Nullable StatusEnum status) {
    
    this.status = status;
    return this;
  }

  /**
   * The status of the item (&#x60;completed&#x60;, &#x60;incomplete&#x60;). These have no effect on the conversation, but are accepted for consistency with the &#x60;conversation.item.created&#x60; event. 
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }

  public RealtimeConversationItem role(@javax.annotation.Nullable RoleEnum role) {
    
    this.role = role;
    return this;
  }

  /**
   * The role of the message sender (&#x60;user&#x60;, &#x60;assistant&#x60;, &#x60;system&#x60;), only applicable for &#x60;message&#x60; items. 
   * @return role
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(@javax.annotation.Nullable RoleEnum role) {
    this.role = role;
  }

  public RealtimeConversationItem content(@javax.annotation.Nullable List<RealtimeConversationItemContentInner> content) {
    
    this.content = content;
    return this;
  }

  public RealtimeConversationItem addContentItem(RealtimeConversationItemContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * The content of the message, applicable for &#x60;message&#x60; items. - Message items of role &#x60;system&#x60; support only &#x60;input_text&#x60; content - Message items of role &#x60;user&#x60; support &#x60;input_text&#x60; and &#x60;input_audio&#x60;   content - Message items of role &#x60;assistant&#x60; support &#x60;text&#x60; content. 
   * @return content
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RealtimeConversationItemContentInner> getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(@javax.annotation.Nullable List<RealtimeConversationItemContentInner> content) {
    this.content = content;
  }

  public RealtimeConversationItem callId(@javax.annotation.Nullable String callId) {
    
    this.callId = callId;
    return this;
  }

  /**
   * The ID of the function call (for &#x60;function_call&#x60; and &#x60;function_call_output&#x60; items). If passed on a &#x60;function_call_output&#x60; item, the server will check that a &#x60;function_call&#x60; item with the same ID exists in the conversation history. 
   * @return callId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallId() {
    return callId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallId(@javax.annotation.Nullable String callId) {
    this.callId = callId;
  }

  public RealtimeConversationItem name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name of the function being called (for &#x60;function_call&#x60; items). 
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public RealtimeConversationItem arguments(@javax.annotation.Nullable String arguments) {
    
    this.arguments = arguments;
    return this;
  }

  /**
   * The arguments of the function call (for &#x60;function_call&#x60; items). 
   * @return arguments
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArguments() {
    return arguments;
  }


  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArguments(@javax.annotation.Nullable String arguments) {
    this.arguments = arguments;
  }

  public RealtimeConversationItem output(@javax.annotation.Nullable String output) {
    
    this.output = output;
    return this;
  }

  /**
   * The output of the function call (for &#x60;function_call_output&#x60; items). 
   * @return output
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOutput() {
    return output;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutput(@javax.annotation.Nullable String output) {
    this.output = output;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeConversationItem realtimeConversationItem = (RealtimeConversationItem) o;
    return Objects.equals(this.id, realtimeConversationItem.id) &&
        Objects.equals(this.type, realtimeConversationItem.type) &&
        Objects.equals(this._object, realtimeConversationItem._object) &&
        Objects.equals(this.status, realtimeConversationItem.status) &&
        Objects.equals(this.role, realtimeConversationItem.role) &&
        Objects.equals(this.content, realtimeConversationItem.content) &&
        Objects.equals(this.callId, realtimeConversationItem.callId) &&
        Objects.equals(this.name, realtimeConversationItem.name) &&
        Objects.equals(this.arguments, realtimeConversationItem.arguments) &&
        Objects.equals(this.output, realtimeConversationItem.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, _object, status, role, content, callId, name, arguments, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeConversationItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `role` to the URL query string
    if (getRole() != null) {
      try {
        joiner.add(String.format("%srole%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRole()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      for (int i = 0; i < getContent().size(); i++) {
        if (getContent().get(i) != null) {
          joiner.add(getContent().get(i).toUrlQueryString(String.format("%scontent%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `call_id` to the URL query string
    if (getCallId() != null) {
      try {
        joiner.add(String.format("%scall_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCallId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `arguments` to the URL query string
    if (getArguments() != null) {
      try {
        joiner.add(String.format("%sarguments%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getArguments()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `output` to the URL query string
    if (getOutput() != null) {
      try {
        joiner.add(String.format("%soutput%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOutput()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

