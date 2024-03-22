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
 * StockSymbol
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class StockSymbol {
  @SerializedName("description")
  private String description = null;

  @SerializedName("displaySymbol")
  private String displaySymbol = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("mic")
  private String mic = null;

  @SerializedName("figi")
  private String figi = null;

  @SerializedName("shareClassFIGI")
  private String shareClassFIGI = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("symbol2")
  private String symbol2 = null;

  @SerializedName("isin")
  private String isin = null;

  public StockSymbol description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Symbol description
   * @return description
  **/
  @Schema(description = "Symbol description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StockSymbol displaySymbol(String displaySymbol) {
    this.displaySymbol = displaySymbol;
    return this;
  }

   /**
   * Display symbol name.
   * @return displaySymbol
  **/
  @Schema(description = "Display symbol name.")
  public String getDisplaySymbol() {
    return displaySymbol;
  }

  public void setDisplaySymbol(String displaySymbol) {
    this.displaySymbol = displaySymbol;
  }

  public StockSymbol symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Unique symbol used to identify this symbol used in &lt;code&gt;/stock/candle&lt;/code&gt; endpoint.
   * @return symbol
  **/
  @Schema(description = "Unique symbol used to identify this symbol used in <code>/stock/candle</code> endpoint.")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public StockSymbol type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Security type.
   * @return type
  **/
  @Schema(description = "Security type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StockSymbol mic(String mic) {
    this.mic = mic;
    return this;
  }

   /**
   * Primary exchange&#x27;s MIC.
   * @return mic
  **/
  @Schema(description = "Primary exchange's MIC.")
  public String getMic() {
    return mic;
  }

  public void setMic(String mic) {
    this.mic = mic;
  }

  public StockSymbol figi(String figi) {
    this.figi = figi;
    return this;
  }

   /**
   * FIGI identifier.
   * @return figi
  **/
  @Schema(description = "FIGI identifier.")
  public String getFigi() {
    return figi;
  }

  public void setFigi(String figi) {
    this.figi = figi;
  }

  public StockSymbol shareClassFIGI(String shareClassFIGI) {
    this.shareClassFIGI = shareClassFIGI;
    return this;
  }

   /**
   * Global Share Class FIGI.
   * @return shareClassFIGI
  **/
  @Schema(description = "Global Share Class FIGI.")
  public String getShareClassFIGI() {
    return shareClassFIGI;
  }

  public void setShareClassFIGI(String shareClassFIGI) {
    this.shareClassFIGI = shareClassFIGI;
  }

  public StockSymbol currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Price&#x27;s currency. This might be different from the reporting currency of fundamental data.
   * @return currency
  **/
  @Schema(description = "Price's currency. This might be different from the reporting currency of fundamental data.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public StockSymbol symbol2(String symbol2) {
    this.symbol2 = symbol2;
    return this;
  }

   /**
   * Alternative ticker for exchanges with multiple tickers for 1 stock such as BSE.
   * @return symbol2
  **/
  @Schema(description = "Alternative ticker for exchanges with multiple tickers for 1 stock such as BSE.")
  public String getSymbol2() {
    return symbol2;
  }

  public void setSymbol2(String symbol2) {
    this.symbol2 = symbol2;
  }

  public StockSymbol isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * ISIN. This field is only available for EU stocks and selected Asian markets. Entitlement from Finnhub is required to access this field.
   * @return isin
  **/
  @Schema(description = "ISIN. This field is only available for EU stocks and selected Asian markets. Entitlement from Finnhub is required to access this field.")
  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockSymbol stockSymbol = (StockSymbol) o;
    return Objects.equals(this.description, stockSymbol.description) &&
        Objects.equals(this.displaySymbol, stockSymbol.displaySymbol) &&
        Objects.equals(this.symbol, stockSymbol.symbol) &&
        Objects.equals(this.type, stockSymbol.type) &&
        Objects.equals(this.mic, stockSymbol.mic) &&
        Objects.equals(this.figi, stockSymbol.figi) &&
        Objects.equals(this.shareClassFIGI, stockSymbol.shareClassFIGI) &&
        Objects.equals(this.currency, stockSymbol.currency) &&
        Objects.equals(this.symbol2, stockSymbol.symbol2) &&
        Objects.equals(this.isin, stockSymbol.isin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displaySymbol, symbol, type, mic, figi, shareClassFIGI, currency, symbol2, isin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockSymbol {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displaySymbol: ").append(toIndentedString(displaySymbol)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mic: ").append(toIndentedString(mic)).append("\n");
    sb.append("    figi: ").append(toIndentedString(figi)).append("\n");
    sb.append("    shareClassFIGI: ").append(toIndentedString(shareClassFIGI)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    symbol2: ").append(toIndentedString(symbol2)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
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
