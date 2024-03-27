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
 * InvestmentThemes
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class InvestmentThemes {
  @SerializedName("theme")
  private String theme = null;

  @SerializedName("data")
  private List<InvestmentThemePortfolio> data = null;

  public InvestmentThemes theme(String theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Investment theme
   * @return theme
  **/
  @Schema(description = "Investment theme")
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public InvestmentThemes data(List<InvestmentThemePortfolio> data) {
    this.data = data;
    return this;
  }

  public InvestmentThemes addDataItem(InvestmentThemePortfolio dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<InvestmentThemePortfolio>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Investment theme portfolio.
   * @return data
  **/
  @Schema(description = "Investment theme portfolio.")
  public List<InvestmentThemePortfolio> getData() {
    return data;
  }

  public void setData(List<InvestmentThemePortfolio> data) {
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
    InvestmentThemes investmentThemes = (InvestmentThemes) o;
    return Objects.equals(this.theme, investmentThemes.theme) &&
        Objects.equals(this.data, investmentThemes.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theme, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentThemes {\n");
    
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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