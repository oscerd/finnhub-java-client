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
import org.threeten.bp.LocalDate;
/**
 * EarningsEstimatesInfo
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class EarningsEstimatesInfo {
  @SerializedName("epsAvg")
  private Float epsAvg = null;

  @SerializedName("epsHigh")
  private Float epsHigh = null;

  @SerializedName("epsLow")
  private Float epsLow = null;

  @SerializedName("numberAnalysts")
  private Long numberAnalysts = null;

  @SerializedName("period")
  private LocalDate period = null;

  @SerializedName("year")
  private Long year = null;

  @SerializedName("quarter")
  private Long quarter = null;

  public EarningsEstimatesInfo epsAvg(Float epsAvg) {
    this.epsAvg = epsAvg;
    return this;
  }

   /**
   * Average EPS estimates including Finnhub&#x27;s proprietary estimates.
   * @return epsAvg
  **/
  @Schema(description = "Average EPS estimates including Finnhub's proprietary estimates.")
  public Float getEpsAvg() {
    return epsAvg;
  }

  public void setEpsAvg(Float epsAvg) {
    this.epsAvg = epsAvg;
  }

  public EarningsEstimatesInfo epsHigh(Float epsHigh) {
    this.epsHigh = epsHigh;
    return this;
  }

   /**
   * Highest estimate.
   * @return epsHigh
  **/
  @Schema(description = "Highest estimate.")
  public Float getEpsHigh() {
    return epsHigh;
  }

  public void setEpsHigh(Float epsHigh) {
    this.epsHigh = epsHigh;
  }

  public EarningsEstimatesInfo epsLow(Float epsLow) {
    this.epsLow = epsLow;
    return this;
  }

   /**
   * Lowest estimate.
   * @return epsLow
  **/
  @Schema(description = "Lowest estimate.")
  public Float getEpsLow() {
    return epsLow;
  }

  public void setEpsLow(Float epsLow) {
    this.epsLow = epsLow;
  }

  public EarningsEstimatesInfo numberAnalysts(Long numberAnalysts) {
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

  public EarningsEstimatesInfo period(LocalDate period) {
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

  public EarningsEstimatesInfo year(Long year) {
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

  public EarningsEstimatesInfo quarter(Long quarter) {
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
    EarningsEstimatesInfo earningsEstimatesInfo = (EarningsEstimatesInfo) o;
    return Objects.equals(this.epsAvg, earningsEstimatesInfo.epsAvg) &&
        Objects.equals(this.epsHigh, earningsEstimatesInfo.epsHigh) &&
        Objects.equals(this.epsLow, earningsEstimatesInfo.epsLow) &&
        Objects.equals(this.numberAnalysts, earningsEstimatesInfo.numberAnalysts) &&
        Objects.equals(this.period, earningsEstimatesInfo.period) &&
        Objects.equals(this.year, earningsEstimatesInfo.year) &&
        Objects.equals(this.quarter, earningsEstimatesInfo.quarter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epsAvg, epsHigh, epsLow, numberAnalysts, period, year, quarter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsEstimatesInfo {\n");
    
    sb.append("    epsAvg: ").append(toIndentedString(epsAvg)).append("\n");
    sb.append("    epsHigh: ").append(toIndentedString(epsHigh)).append("\n");
    sb.append("    epsLow: ").append(toIndentedString(epsLow)).append("\n");
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
