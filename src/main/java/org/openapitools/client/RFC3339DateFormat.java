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

package org.openapitools.client;

import com.fasterxml.jackson.databind.util.StdDateFormat;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.text.DecimalFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:51:07.087747877-05:00[US/Eastern]", comments = "Generator version: 7.11.0")
public class RFC3339DateFormat extends DateFormat {
  private static final long serialVersionUID = 1L;
  private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone("UTC");

  private final StdDateFormat fmt = new StdDateFormat()
          .withTimeZone(TIMEZONE_Z)
          .withColonInTimeZone(true);

  public RFC3339DateFormat() {
    this.calendar = new GregorianCalendar();
    this.numberFormat = new DecimalFormat();
  }

  @Override
  public Date parse(String source) {
    return parse(source, new ParsePosition(0));
  }

  @Override
  public Date parse(String source, ParsePosition pos) {
    return fmt.parse(source, pos);
  }

  @Override
  public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
    return fmt.format(date, toAppendTo, fieldPosition);
  }

  @Override
  public Object clone() {
    return super.clone();
  }
}
