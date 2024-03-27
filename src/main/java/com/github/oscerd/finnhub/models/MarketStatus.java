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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * MarketStatus
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class MarketStatus {
  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("session")
  private String session = null;

  @SerializedName("holiday")
  private String holiday = null;

  @SerializedName("isOpen")
  private Boolean isOpen = null;

  @SerializedName("t")
  private Long t = null;

  public MarketStatus exchange(String exchange) {
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

  public MarketStatus timezone(String timezone) {
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

  public MarketStatus session(String session) {
    this.session = session;
    return this;
  }

   /**
   * Market session.
   * @return session
  **/
  @Schema(description = "Market session.")
  public String getSession() {
    return session;
  }

  public void setSession(String session) {
    this.session = session;
  }

  public MarketStatus holiday(String holiday) {
    this.holiday = holiday;
    return this;
  }

   /**
   * Holiday event.
   * @return holiday
  **/
  @Schema(description = "Holiday event.")
  public String getHoliday() {
    return holiday;
  }

  public void setHoliday(String holiday) {
    this.holiday = holiday;
  }

  public MarketStatus isOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }

   /**
   * Whether the market is open at the moment.
   * @return isOpen
  **/
  @Schema(description = "Whether the market is open at the moment.")
  public Boolean isIsOpen() {
    return isOpen;
  }

  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
  }

  public MarketStatus t(Long t) {
    this.t = t;
    return this;
  }

   /**
   * Current timestamp.
   * @return t
  **/
  @Schema(description = "Current timestamp.")
  public Long getT() {
    return t;
  }

  public void setT(Long t) {
    this.t = t;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketStatus marketStatus = (MarketStatus) o;
    return Objects.equals(this.exchange, marketStatus.exchange) &&
        Objects.equals(this.timezone, marketStatus.timezone) &&
        Objects.equals(this.session, marketStatus.session) &&
        Objects.equals(this.holiday, marketStatus.holiday) &&
        Objects.equals(this.isOpen, marketStatus.isOpen) &&
        Objects.equals(this.t, marketStatus.t);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange, timezone, session, holiday, isOpen, t);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketStatus {\n");
    
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    holiday: ").append(toIndentedString(holiday)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
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