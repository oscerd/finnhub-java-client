/*
 * Finnhub API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.oscerd.finnhub.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * MarketHoliday
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class MarketHoliday {
  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("data")
  private List<MarketHolidayData> data = null;

  public MarketHoliday timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone.
   * @return timezone
  **/
  @Schema(description = "Timezone.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public MarketHoliday exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Exchange.
   * @return exchange
  **/
  @Schema(description = "Exchange.")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public MarketHoliday data(List<MarketHolidayData> data) {
    this.data = data;
    return this;
  }

  public MarketHoliday addDataItem(MarketHolidayData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<MarketHolidayData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Array of holidays.
   * @return data
  **/
  @Schema(description = "Array of holidays.")
  public List<MarketHolidayData> getData() {
    return data;
  }

  public void setData(List<MarketHolidayData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketHoliday marketHoliday = (MarketHoliday) o;
    return Objects.equals(this.timezone, marketHoliday.timezone) &&
        Objects.equals(this.exchange, marketHoliday.exchange) &&
        Objects.equals(this.data, marketHoliday.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone, exchange, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketHoliday {\n");
    
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

}
