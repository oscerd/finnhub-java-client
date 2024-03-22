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
import org.threeten.bp.LocalDate;
/**
 * MutualFundHoldings
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class MutualFundHoldings {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("atDate")
  private LocalDate atDate = null;

  @SerializedName("numberOfHoldings")
  private Long numberOfHoldings = null;

  @SerializedName("holdings")
  private List<MutualFundHoldingsData> holdings = null;

  public MutualFundHoldings symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol.
   * @return symbol
  **/
  @Schema(description = "Symbol.")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public MutualFundHoldings atDate(LocalDate atDate) {
    this.atDate = atDate;
    return this;
  }

   /**
   * Holdings update date.
   * @return atDate
  **/
  @Schema(description = "Holdings update date.")
  public LocalDate getAtDate() {
    return atDate;
  }

  public void setAtDate(LocalDate atDate) {
    this.atDate = atDate;
  }

  public MutualFundHoldings numberOfHoldings(Long numberOfHoldings) {
    this.numberOfHoldings = numberOfHoldings;
    return this;
  }

   /**
   * Number of holdings.
   * @return numberOfHoldings
  **/
  @Schema(description = "Number of holdings.")
  public Long getNumberOfHoldings() {
    return numberOfHoldings;
  }

  public void setNumberOfHoldings(Long numberOfHoldings) {
    this.numberOfHoldings = numberOfHoldings;
  }

  public MutualFundHoldings holdings(List<MutualFundHoldingsData> holdings) {
    this.holdings = holdings;
    return this;
  }

  public MutualFundHoldings addHoldingsItem(MutualFundHoldingsData holdingsItem) {
    if (this.holdings == null) {
      this.holdings = new ArrayList<MutualFundHoldingsData>();
    }
    this.holdings.add(holdingsItem);
    return this;
  }

   /**
   * Array of holdings.
   * @return holdings
  **/
  @Schema(description = "Array of holdings.")
  public List<MutualFundHoldingsData> getHoldings() {
    return holdings;
  }

  public void setHoldings(List<MutualFundHoldingsData> holdings) {
    this.holdings = holdings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MutualFundHoldings mutualFundHoldings = (MutualFundHoldings) o;
    return Objects.equals(this.symbol, mutualFundHoldings.symbol) &&
        Objects.equals(this.atDate, mutualFundHoldings.atDate) &&
        Objects.equals(this.numberOfHoldings, mutualFundHoldings.numberOfHoldings) &&
        Objects.equals(this.holdings, mutualFundHoldings.holdings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, atDate, numberOfHoldings, holdings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MutualFundHoldings {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    atDate: ").append(toIndentedString(atDate)).append("\n");
    sb.append("    numberOfHoldings: ").append(toIndentedString(numberOfHoldings)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
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
