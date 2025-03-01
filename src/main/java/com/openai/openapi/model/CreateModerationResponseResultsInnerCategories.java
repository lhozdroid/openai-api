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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A list of the categories, and whether they are flagged or not.
 */
@JsonPropertyOrder({
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_HATE,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_HATE_THREATENING,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_HARASSMENT,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_HARASSMENT_THREATENING,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_ILLICIT,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_ILLICIT_VIOLENT,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_SELF_HARM,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_SELF_HARM_INTENT,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_SELF_HARM_INSTRUCTIONS,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_SEXUAL,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_SEXUAL_MINORS,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_VIOLENCE,
  CreateModerationResponseResultsInnerCategories.JSON_PROPERTY_VIOLENCE_GRAPHIC
})
@JsonTypeName("CreateModerationResponse_results_inner_categories")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T10:23:25.420936454-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class CreateModerationResponseResultsInnerCategories {
  public static final String JSON_PROPERTY_HATE = "hate";
  @javax.annotation.Nonnull
  private Boolean hate;

  public static final String JSON_PROPERTY_HATE_THREATENING = "hate/threatening";
  @javax.annotation.Nonnull
  private Boolean hateThreatening;

  public static final String JSON_PROPERTY_HARASSMENT = "harassment";
  @javax.annotation.Nonnull
  private Boolean harassment;

  public static final String JSON_PROPERTY_HARASSMENT_THREATENING = "harassment/threatening";
  @javax.annotation.Nonnull
  private Boolean harassmentThreatening;

  public static final String JSON_PROPERTY_ILLICIT = "illicit";
  @javax.annotation.Nullable
  private Boolean illicit;

  public static final String JSON_PROPERTY_ILLICIT_VIOLENT = "illicit/violent";
  @javax.annotation.Nullable
  private Boolean illicitViolent;

  public static final String JSON_PROPERTY_SELF_HARM = "self-harm";
  @javax.annotation.Nonnull
  private Boolean selfHarm;

  public static final String JSON_PROPERTY_SELF_HARM_INTENT = "self-harm/intent";
  @javax.annotation.Nonnull
  private Boolean selfHarmIntent;

  public static final String JSON_PROPERTY_SELF_HARM_INSTRUCTIONS = "self-harm/instructions";
  @javax.annotation.Nonnull
  private Boolean selfHarmInstructions;

  public static final String JSON_PROPERTY_SEXUAL = "sexual";
  @javax.annotation.Nonnull
  private Boolean sexual;

  public static final String JSON_PROPERTY_SEXUAL_MINORS = "sexual/minors";
  @javax.annotation.Nonnull
  private Boolean sexualMinors;

  public static final String JSON_PROPERTY_VIOLENCE = "violence";
  @javax.annotation.Nonnull
  private Boolean violence;

  public static final String JSON_PROPERTY_VIOLENCE_GRAPHIC = "violence/graphic";
  @javax.annotation.Nonnull
  private Boolean violenceGraphic;

  public CreateModerationResponseResultsInnerCategories() {
  }

  public CreateModerationResponseResultsInnerCategories hate(@javax.annotation.Nonnull Boolean hate) {
    
    this.hate = hate;
    return this;
  }

  /**
   * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
   * @return hate
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHate() {
    return hate;
  }


  @JsonProperty(JSON_PROPERTY_HATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHate(@javax.annotation.Nonnull Boolean hate) {
    this.hate = hate;
  }

  public CreateModerationResponseResultsInnerCategories hateThreatening(@javax.annotation.Nonnull Boolean hateThreatening) {
    
    this.hateThreatening = hateThreatening;
    return this;
  }

  /**
   * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
   * @return hateThreatening
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HATE_THREATENING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHateThreatening() {
    return hateThreatening;
  }


  @JsonProperty(JSON_PROPERTY_HATE_THREATENING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHateThreatening(@javax.annotation.Nonnull Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }

  public CreateModerationResponseResultsInnerCategories harassment(@javax.annotation.Nonnull Boolean harassment) {
    
    this.harassment = harassment;
    return this;
  }

  /**
   * Content that expresses, incites, or promotes harassing language towards any target.
   * @return harassment
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HARASSMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHarassment() {
    return harassment;
  }


  @JsonProperty(JSON_PROPERTY_HARASSMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHarassment(@javax.annotation.Nonnull Boolean harassment) {
    this.harassment = harassment;
  }

  public CreateModerationResponseResultsInnerCategories harassmentThreatening(@javax.annotation.Nonnull Boolean harassmentThreatening) {
    
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

  /**
   * Harassment content that also includes violence or serious harm towards any target.
   * @return harassmentThreatening
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HARASSMENT_THREATENING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHarassmentThreatening() {
    return harassmentThreatening;
  }


  @JsonProperty(JSON_PROPERTY_HARASSMENT_THREATENING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHarassmentThreatening(@javax.annotation.Nonnull Boolean harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }

  public CreateModerationResponseResultsInnerCategories illicit(@javax.annotation.Nullable Boolean illicit) {
    
    this.illicit = illicit;
    return this;
  }

  /**
   * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \&quot;how to shoplift\&quot; would fit this category.
   * @return illicit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ILLICIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIllicit() {
    return illicit;
  }


  @JsonProperty(JSON_PROPERTY_ILLICIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIllicit(@javax.annotation.Nullable Boolean illicit) {
    this.illicit = illicit;
  }

  public CreateModerationResponseResultsInnerCategories illicitViolent(@javax.annotation.Nullable Boolean illicitViolent) {
    
    this.illicitViolent = illicitViolent;
    return this;
  }

  /**
   * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
   * @return illicitViolent
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ILLICIT_VIOLENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIllicitViolent() {
    return illicitViolent;
  }


  @JsonProperty(JSON_PROPERTY_ILLICIT_VIOLENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIllicitViolent(@javax.annotation.Nullable Boolean illicitViolent) {
    this.illicitViolent = illicitViolent;
  }

  public CreateModerationResponseResultsInnerCategories selfHarm(@javax.annotation.Nonnull Boolean selfHarm) {
    
    this.selfHarm = selfHarm;
    return this;
  }

  /**
   * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
   * @return selfHarm
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SELF_HARM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSelfHarm() {
    return selfHarm;
  }


  @JsonProperty(JSON_PROPERTY_SELF_HARM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSelfHarm(@javax.annotation.Nonnull Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

  public CreateModerationResponseResultsInnerCategories selfHarmIntent(@javax.annotation.Nonnull Boolean selfHarmIntent) {
    
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

  /**
   * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
   * @return selfHarmIntent
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SELF_HARM_INTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSelfHarmIntent() {
    return selfHarmIntent;
  }


  @JsonProperty(JSON_PROPERTY_SELF_HARM_INTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSelfHarmIntent(@javax.annotation.Nonnull Boolean selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }

  public CreateModerationResponseResultsInnerCategories selfHarmInstructions(@javax.annotation.Nonnull Boolean selfHarmInstructions) {
    
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

  /**
   * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
   * @return selfHarmInstructions
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SELF_HARM_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSelfHarmInstructions() {
    return selfHarmInstructions;
  }


  @JsonProperty(JSON_PROPERTY_SELF_HARM_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSelfHarmInstructions(@javax.annotation.Nonnull Boolean selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }

  public CreateModerationResponseResultsInnerCategories sexual(@javax.annotation.Nonnull Boolean sexual) {
    
    this.sexual = sexual;
    return this;
  }

  /**
   * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
   * @return sexual
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEXUAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSexual() {
    return sexual;
  }


  @JsonProperty(JSON_PROPERTY_SEXUAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSexual(@javax.annotation.Nonnull Boolean sexual) {
    this.sexual = sexual;
  }

  public CreateModerationResponseResultsInnerCategories sexualMinors(@javax.annotation.Nonnull Boolean sexualMinors) {
    
    this.sexualMinors = sexualMinors;
    return this;
  }

  /**
   * Sexual content that includes an individual who is under 18 years old.
   * @return sexualMinors
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEXUAL_MINORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSexualMinors() {
    return sexualMinors;
  }


  @JsonProperty(JSON_PROPERTY_SEXUAL_MINORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSexualMinors(@javax.annotation.Nonnull Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }

  public CreateModerationResponseResultsInnerCategories violence(@javax.annotation.Nonnull Boolean violence) {
    
    this.violence = violence;
    return this;
  }

  /**
   * Content that depicts death, violence, or physical injury.
   * @return violence
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VIOLENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getViolence() {
    return violence;
  }


  @JsonProperty(JSON_PROPERTY_VIOLENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setViolence(@javax.annotation.Nonnull Boolean violence) {
    this.violence = violence;
  }

  public CreateModerationResponseResultsInnerCategories violenceGraphic(@javax.annotation.Nonnull Boolean violenceGraphic) {
    
    this.violenceGraphic = violenceGraphic;
    return this;
  }

  /**
   * Content that depicts death, violence, or physical injury in graphic detail.
   * @return violenceGraphic
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VIOLENCE_GRAPHIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getViolenceGraphic() {
    return violenceGraphic;
  }


  @JsonProperty(JSON_PROPERTY_VIOLENCE_GRAPHIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setViolenceGraphic(@javax.annotation.Nonnull Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponseResultsInnerCategories createModerationResponseResultsInnerCategories = (CreateModerationResponseResultsInnerCategories) o;
    return Objects.equals(this.hate, createModerationResponseResultsInnerCategories.hate) &&
        Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategories.hateThreatening) &&
        Objects.equals(this.harassment, createModerationResponseResultsInnerCategories.harassment) &&
        Objects.equals(this.harassmentThreatening, createModerationResponseResultsInnerCategories.harassmentThreatening) &&
        Objects.equals(this.illicit, createModerationResponseResultsInnerCategories.illicit) &&
        Objects.equals(this.illicitViolent, createModerationResponseResultsInnerCategories.illicitViolent) &&
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategories.selfHarm) &&
        Objects.equals(this.selfHarmIntent, createModerationResponseResultsInnerCategories.selfHarmIntent) &&
        Objects.equals(this.selfHarmInstructions, createModerationResponseResultsInnerCategories.selfHarmInstructions) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategories.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategories.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategories.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategories.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, harassment, harassmentThreatening, illicit, illicitViolent, selfHarm, selfHarmIntent, selfHarmInstructions, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategories {\n");
    sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
    sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n");
    sb.append("    harassment: ").append(toIndentedString(harassment)).append("\n");
    sb.append("    harassmentThreatening: ").append(toIndentedString(harassmentThreatening)).append("\n");
    sb.append("    illicit: ").append(toIndentedString(illicit)).append("\n");
    sb.append("    illicitViolent: ").append(toIndentedString(illicitViolent)).append("\n");
    sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n");
    sb.append("    selfHarmIntent: ").append(toIndentedString(selfHarmIntent)).append("\n");
    sb.append("    selfHarmInstructions: ").append(toIndentedString(selfHarmInstructions)).append("\n");
    sb.append("    sexual: ").append(toIndentedString(sexual)).append("\n");
    sb.append("    sexualMinors: ").append(toIndentedString(sexualMinors)).append("\n");
    sb.append("    violence: ").append(toIndentedString(violence)).append("\n");
    sb.append("    violenceGraphic: ").append(toIndentedString(violenceGraphic)).append("\n");
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

    // add `hate` to the URL query string
    if (getHate() != null) {
      try {
        joiner.add(String.format("%shate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hate/threatening` to the URL query string
    if (getHateThreatening() != null) {
      try {
        joiner.add(String.format("%shate/threatening%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHateThreatening()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `harassment` to the URL query string
    if (getHarassment() != null) {
      try {
        joiner.add(String.format("%sharassment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHarassment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `harassment/threatening` to the URL query string
    if (getHarassmentThreatening() != null) {
      try {
        joiner.add(String.format("%sharassment/threatening%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHarassmentThreatening()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `illicit` to the URL query string
    if (getIllicit() != null) {
      try {
        joiner.add(String.format("%sillicit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIllicit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `illicit/violent` to the URL query string
    if (getIllicitViolent() != null) {
      try {
        joiner.add(String.format("%sillicit/violent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIllicitViolent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `self-harm` to the URL query string
    if (getSelfHarm() != null) {
      try {
        joiner.add(String.format("%sself-harm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSelfHarm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `self-harm/intent` to the URL query string
    if (getSelfHarmIntent() != null) {
      try {
        joiner.add(String.format("%sself-harm/intent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSelfHarmIntent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `self-harm/instructions` to the URL query string
    if (getSelfHarmInstructions() != null) {
      try {
        joiner.add(String.format("%sself-harm/instructions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSelfHarmInstructions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sexual` to the URL query string
    if (getSexual() != null) {
      try {
        joiner.add(String.format("%ssexual%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSexual()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sexual/minors` to the URL query string
    if (getSexualMinors() != null) {
      try {
        joiner.add(String.format("%ssexual/minors%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSexualMinors()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `violence` to the URL query string
    if (getViolence() != null) {
      try {
        joiner.add(String.format("%sviolence%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getViolence()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `violence/graphic` to the URL query string
    if (getViolenceGraphic() != null) {
      try {
        joiner.add(String.format("%sviolence/graphic%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getViolenceGraphic()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

