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
 * AuditLogOrganizationUpdatedChangesRequestedSettings
 */
@JsonPropertyOrder({
  AuditLogOrganizationUpdatedChangesRequestedSettings.JSON_PROPERTY_THREADS_UI_VISIBILITY,
  AuditLogOrganizationUpdatedChangesRequestedSettings.JSON_PROPERTY_USAGE_DASHBOARD_VISIBILITY
})
@JsonTypeName("AuditLog_organization_updated_changes_requested_settings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class AuditLogOrganizationUpdatedChangesRequestedSettings {
  public static final String JSON_PROPERTY_THREADS_UI_VISIBILITY = "threads_ui_visibility";
  @javax.annotation.Nullable
  private String threadsUiVisibility;

  public static final String JSON_PROPERTY_USAGE_DASHBOARD_VISIBILITY = "usage_dashboard_visibility";
  @javax.annotation.Nullable
  private String usageDashboardVisibility;

  public AuditLogOrganizationUpdatedChangesRequestedSettings() {
  }

  public AuditLogOrganizationUpdatedChangesRequestedSettings threadsUiVisibility(@javax.annotation.Nullable String threadsUiVisibility) {
    
    this.threadsUiVisibility = threadsUiVisibility;
    return this;
  }

  /**
   * Visibility of the threads page which shows messages created with the Assistants API and Playground. One of &#x60;ANY_ROLE&#x60;, &#x60;OWNERS&#x60;, or &#x60;NONE&#x60;.
   * @return threadsUiVisibility
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREADS_UI_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreadsUiVisibility() {
    return threadsUiVisibility;
  }


  @JsonProperty(JSON_PROPERTY_THREADS_UI_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreadsUiVisibility(@javax.annotation.Nullable String threadsUiVisibility) {
    this.threadsUiVisibility = threadsUiVisibility;
  }

  public AuditLogOrganizationUpdatedChangesRequestedSettings usageDashboardVisibility(@javax.annotation.Nullable String usageDashboardVisibility) {
    
    this.usageDashboardVisibility = usageDashboardVisibility;
    return this;
  }

  /**
   * Visibility of the usage dashboard which shows activity and costs for your organization. One of &#x60;ANY_ROLE&#x60; or &#x60;OWNERS&#x60;.
   * @return usageDashboardVisibility
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_DASHBOARD_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsageDashboardVisibility() {
    return usageDashboardVisibility;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_DASHBOARD_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsageDashboardVisibility(@javax.annotation.Nullable String usageDashboardVisibility) {
    this.usageDashboardVisibility = usageDashboardVisibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogOrganizationUpdatedChangesRequestedSettings auditLogOrganizationUpdatedChangesRequestedSettings = (AuditLogOrganizationUpdatedChangesRequestedSettings) o;
    return Objects.equals(this.threadsUiVisibility, auditLogOrganizationUpdatedChangesRequestedSettings.threadsUiVisibility) &&
        Objects.equals(this.usageDashboardVisibility, auditLogOrganizationUpdatedChangesRequestedSettings.usageDashboardVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadsUiVisibility, usageDashboardVisibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogOrganizationUpdatedChangesRequestedSettings {\n");
    sb.append("    threadsUiVisibility: ").append(toIndentedString(threadsUiVisibility)).append("\n");
    sb.append("    usageDashboardVisibility: ").append(toIndentedString(usageDashboardVisibility)).append("\n");
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

    // add `threads_ui_visibility` to the URL query string
    if (getThreadsUiVisibility() != null) {
      try {
        joiner.add(String.format("%sthreads_ui_visibility%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThreadsUiVisibility()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `usage_dashboard_visibility` to the URL query string
    if (getUsageDashboardVisibility() != null) {
      try {
        joiner.add(String.format("%susage_dashboard_visibility%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsageDashboardVisibility()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

