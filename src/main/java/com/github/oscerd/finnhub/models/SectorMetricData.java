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

import java.util.Objects;

/**
 * SectorMetricData
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class SectorMetricData {
  @SerializedName("sector")
  private String sector = null;

  @SerializedName("metrics")
  private Object metrics = null;

  public SectorMetricData sector(String sector) {
    this.sector = sector;
    return this;
  }

   /**
   * Sector
   * @return sector
  **/
  @Schema(description = "Sector")
  public String getSector() {
    return sector;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public SectorMetricData metrics(Object metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Metrics data in key-value format. &lt;code&gt;a&lt;/code&gt; and &lt;code&gt;m&lt;/code&gt; fields are for average and median respectively.
   * @return metrics
  **/
  @Schema(description = "Metrics data in key-value format. <code>a</code> and <code>m</code> fields are for average and median respectively.")
  public Object getMetrics() {
    return metrics;
  }

  public void setMetrics(Object metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectorMetricData sectorMetricData = (SectorMetricData) o;
    return Objects.equals(this.sector, sectorMetricData.sector) &&
        Objects.equals(this.metrics, sectorMetricData.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sector, metrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectorMetricData {\n");
    
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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