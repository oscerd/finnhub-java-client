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
 * FundOwnership
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class FundOwnership {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("ownership")
  private List<FundOwnershipInfo> ownership = null;

  public FundOwnership symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol of the company.
   * @return symbol
  **/
  @Schema(description = "Symbol of the company.")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public FundOwnership ownership(List<FundOwnershipInfo> ownership) {
    this.ownership = ownership;
    return this;
  }

  public FundOwnership addOwnershipItem(FundOwnershipInfo ownershipItem) {
    if (this.ownership == null) {
      this.ownership = new ArrayList<FundOwnershipInfo>();
    }
    this.ownership.add(ownershipItem);
    return this;
  }

   /**
   * Array of investors with detailed information about their holdings.
   * @return ownership
  **/
  @Schema(description = "Array of investors with detailed information about their holdings.")
  public List<FundOwnershipInfo> getOwnership() {
    return ownership;
  }

  public void setOwnership(List<FundOwnershipInfo> ownership) {
    this.ownership = ownership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundOwnership fundOwnership = (FundOwnership) o;
    return Objects.equals(this.symbol, fundOwnership.symbol) &&
        Objects.equals(this.ownership, fundOwnership.ownership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, ownership);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundOwnership {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
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
