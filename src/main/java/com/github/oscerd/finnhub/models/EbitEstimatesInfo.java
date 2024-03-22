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
import org.threeten.bp.LocalDate;

import java.util.Objects;
/**
 * EbitEstimatesInfo
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class EbitEstimatesInfo {
  @SerializedName("ebitAvg")
  private Float ebitAvg = null;

  @SerializedName("ebitHigh")
  private Float ebitHigh = null;

  @SerializedName("ebitLow")
  private Float ebitLow = null;

  @SerializedName("numberAnalysts")
  private Long numberAnalysts = null;

  @SerializedName("period")
  private LocalDate period = null;

  @SerializedName("year")
  private Long year = null;

  @SerializedName("quarter")
  private Long quarter = null;

  public EbitEstimatesInfo ebitAvg(Float ebitAvg) {
    this.ebitAvg = ebitAvg;
    return this;
  }

   /**
   * Average EBIT estimates including Finnhub&#x27;s proprietary estimates.
   * @return ebitAvg
  **/
  @Schema(description = "Average EBIT estimates including Finnhub's proprietary estimates.")
  public Float getEbitAvg() {
    return ebitAvg;
  }

  public void setEbitAvg(Float ebitAvg) {
    this.ebitAvg = ebitAvg;
  }

  public EbitEstimatesInfo ebitHigh(Float ebitHigh) {
    this.ebitHigh = ebitHigh;
    return this;
  }

   /**
   * Highest estimate.
   * @return ebitHigh
  **/
  @Schema(description = "Highest estimate.")
  public Float getEbitHigh() {
    return ebitHigh;
  }

  public void setEbitHigh(Float ebitHigh) {
    this.ebitHigh = ebitHigh;
  }

  public EbitEstimatesInfo ebitLow(Float ebitLow) {
    this.ebitLow = ebitLow;
    return this;
  }

   /**
   * Lowest estimate.
   * @return ebitLow
  **/
  @Schema(description = "Lowest estimate.")
  public Float getEbitLow() {
    return ebitLow;
  }

  public void setEbitLow(Float ebitLow) {
    this.ebitLow = ebitLow;
  }

  public EbitEstimatesInfo numberAnalysts(Long numberAnalysts) {
    this.numberAnalysts = numberAnalysts;
    return this;
  }

   /**
   * Number of Analysts.
   * @return numberAnalysts
  **/
  @Schema(description = "Number of Analysts.")
  public Long getNumberAnalysts() {
    return numberAnalysts;
  }

  public void setNumberAnalysts(Long numberAnalysts) {
    this.numberAnalysts = numberAnalysts;
  }

  public EbitEstimatesInfo period(LocalDate period) {
    this.period = period;
    return this;
  }

   /**
   * Period.
   * @return period
  **/
  @Schema(description = "Period.")
  public LocalDate getPeriod() {
    return period;
  }

  public void setPeriod(LocalDate period) {
    this.period = period;
  }

  public EbitEstimatesInfo year(Long year) {
    this.year = year;
    return this;
  }

   /**
   * Fiscal year.
   * @return year
  **/
  @Schema(description = "Fiscal year.")
  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }

  public EbitEstimatesInfo quarter(Long quarter) {
    this.quarter = quarter;
    return this;
  }

   /**
   * Fiscal quarter.
   * @return quarter
  **/
  @Schema(description = "Fiscal quarter.")
  public Long getQuarter() {
    return quarter;
  }

  public void setQuarter(Long quarter) {
    this.quarter = quarter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EbitEstimatesInfo ebitEstimatesInfo = (EbitEstimatesInfo) o;
    return Objects.equals(this.ebitAvg, ebitEstimatesInfo.ebitAvg) &&
        Objects.equals(this.ebitHigh, ebitEstimatesInfo.ebitHigh) &&
        Objects.equals(this.ebitLow, ebitEstimatesInfo.ebitLow) &&
        Objects.equals(this.numberAnalysts, ebitEstimatesInfo.numberAnalysts) &&
        Objects.equals(this.period, ebitEstimatesInfo.period) &&
        Objects.equals(this.year, ebitEstimatesInfo.year) &&
        Objects.equals(this.quarter, ebitEstimatesInfo.quarter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebitAvg, ebitHigh, ebitLow, numberAnalysts, period, year, quarter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EbitEstimatesInfo {\n");
    
    sb.append("    ebitAvg: ").append(toIndentedString(ebitAvg)).append("\n");
    sb.append("    ebitHigh: ").append(toIndentedString(ebitHigh)).append("\n");
    sb.append("    ebitLow: ").append(toIndentedString(ebitLow)).append("\n");
    sb.append("    numberAnalysts: ").append(toIndentedString(numberAnalysts)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
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
