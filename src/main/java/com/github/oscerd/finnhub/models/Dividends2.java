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

import java.util.ArrayList;
import java.util.List;
/**
 * Dividends2
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class Dividends2 {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("data")
  private List<Dividends2Info> data = null;

  public Dividends2 symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol
   * @return symbol
  **/
  @Schema(description = "Symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Dividends2 data(List<Dividends2Info> data) {
    this.data = data;
    return this;
  }

  public Dividends2 addDataItem(Dividends2Info dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Dividends2Info>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<Dividends2Info> getData() {
    return data;
  }

  public void setData(List<Dividends2Info> data) {
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
    Dividends2 dividends2 = (Dividends2) o;
    return Objects.equals(this.symbol, dividends2.symbol) &&
        Objects.equals(this.data, dividends2.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dividends2 {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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