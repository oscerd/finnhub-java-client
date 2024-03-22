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
 * BondYieldCurveInfo
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class BondYieldCurveInfo {
  @SerializedName("d")
  private String d = null;

  @SerializedName("v")
  private Float v = null;

  public BondYieldCurveInfo d(String d) {
    this.d = d;
    return this;
  }

   /**
   * Date of the reading
   * @return d
  **/
  @Schema(description = "Date of the reading")
  public String getD() {
    return d;
  }

  public void setD(String d) {
    this.d = d;
  }

  public BondYieldCurveInfo v(Float v) {
    this.v = v;
    return this;
  }

   /**
   * Value
   * @return v
  **/
  @Schema(description = "Value")
  public Float getV() {
    return v;
  }

  public void setV(Float v) {
    this.v = v;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BondYieldCurveInfo bondYieldCurveInfo = (BondYieldCurveInfo) o;
    return Objects.equals(this.d, bondYieldCurveInfo.d) &&
        Objects.equals(this.v, bondYieldCurveInfo.v);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d, v);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BondYieldCurveInfo {\n");
    
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    v: ").append(toIndentedString(v)).append("\n");
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
