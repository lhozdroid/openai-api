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
import org.openapitools.client.model.CreateFineTuningJobRequestIntegrationsInnerWandb;
import org.openapitools.client.model.FineTuningIntegration;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * FineTuningJobIntegrationsInner
 */
@JsonPropertyOrder({
  FineTuningJobIntegrationsInner.JSON_PROPERTY_TYPE,
  FineTuningJobIntegrationsInner.JSON_PROPERTY_WANDB
})
@JsonTypeName("FineTuningJob_integrations_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class FineTuningJobIntegrationsInner {
  /**
   * The type of the integration being enabled for the fine-tuning job
   */
  public enum TypeEnum {
    WANDB(String.valueOf("wandb"));

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

  public static final String JSON_PROPERTY_WANDB = "wandb";
  @javax.annotation.Nonnull
  private CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

  public FineTuningJobIntegrationsInner() {
  }

  public FineTuningJobIntegrationsInner type(@javax.annotation.Nonnull TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * The type of the integration being enabled for the fine-tuning job
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

  public FineTuningJobIntegrationsInner wandb(@javax.annotation.Nonnull CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    
    this.wandb = wandb;
    return this;
  }

  /**
   * Get wandb
   * @return wandb
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WANDB)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreateFineTuningJobRequestIntegrationsInnerWandb getWandb() {
    return wandb;
  }


  @JsonProperty(JSON_PROPERTY_WANDB)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWandb(@javax.annotation.Nonnull CreateFineTuningJobRequestIntegrationsInnerWandb wandb) {
    this.wandb = wandb;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuningJobIntegrationsInner fineTuningJobIntegrationsInner = (FineTuningJobIntegrationsInner) o;
    return Objects.equals(this.type, fineTuningJobIntegrationsInner.type) &&
        Objects.equals(this.wandb, fineTuningJobIntegrationsInner.wandb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, wandb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobIntegrationsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    wandb: ").append(toIndentedString(wandb)).append("\n");
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

    // add `wandb` to the URL query string
    if (getWandb() != null) {
      joiner.add(getWandb().toUrlQueryString(prefix + "wandb" + suffix));
    }

    return joiner.toString();
  }

}

