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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * CompanyProfile
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class CompanyProfile {
  @SerializedName("alias")
  private List<String> alias = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("estimateCurrency")
  private String estimateCurrency = null;

  @SerializedName("marketCapCurrency")
  private String marketCapCurrency = null;

  @SerializedName("cusip")
  private String cusip = null;

  @SerializedName("sedol")
  private String sedol = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("ggroup")
  private String ggroup = null;

  @SerializedName("gind")
  private String gind = null;

  @SerializedName("gsector")
  private String gsector = null;

  @SerializedName("gsubind")
  private String gsubind = null;

  @SerializedName("isin")
  private String isin = null;

  @SerializedName("lei")
  private String lei = null;

  @SerializedName("naicsNationalIndustry")
  private String naicsNationalIndustry = null;

  @SerializedName("naics")
  private String naics = null;

  @SerializedName("naicsSector")
  private String naicsSector = null;

  @SerializedName("naicsSubsector")
  private String naicsSubsector = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("weburl")
  private String weburl = null;

  @SerializedName("ipo")
  private LocalDate ipo = null;

  @SerializedName("marketCapitalization")
  private Float marketCapitalization = null;

  @SerializedName("shareOutstanding")
  private Float shareOutstanding = null;

  @SerializedName("employeeTotal")
  private Float employeeTotal = null;

  @SerializedName("logo")
  private String logo = null;

  @SerializedName("finnhubIndustry")
  private String finnhubIndustry = null;

  public CompanyProfile alias(List<String> alias) {
    this.alias = alias;
    return this;
  }

  public CompanyProfile addAliasItem(String aliasItem) {
    if (this.alias == null) {
      this.alias = new ArrayList<String>();
    }
    this.alias.add(aliasItem);
    return this;
  }

   /**
   * Company name alias.
   * @return alias
  **/
  @Schema(description = "Company name alias.")
  public List<String> getAlias() {
    return alias;
  }

  public void setAlias(List<String> alias) {
    this.alias = alias;
  }

  public CompanyProfile address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address of company&#x27;s headquarter.
   * @return address
  **/
  @Schema(description = "Address of company's headquarter.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CompanyProfile city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City of company&#x27;s headquarter.
   * @return city
  **/
  @Schema(description = "City of company's headquarter.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CompanyProfile country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of company&#x27;s headquarter.
   * @return country
  **/
  @Schema(description = "Country of company's headquarter.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CompanyProfile currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used in company filings and financials.
   * @return currency
  **/
  @Schema(description = "Currency used in company filings and financials.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CompanyProfile estimateCurrency(String estimateCurrency) {
    this.estimateCurrency = estimateCurrency;
    return this;
  }

   /**
   * Currency used in Estimates data.
   * @return estimateCurrency
  **/
  @Schema(description = "Currency used in Estimates data.")
  public String getEstimateCurrency() {
    return estimateCurrency;
  }

  public void setEstimateCurrency(String estimateCurrency) {
    this.estimateCurrency = estimateCurrency;
  }

  public CompanyProfile marketCapCurrency(String marketCapCurrency) {
    this.marketCapCurrency = marketCapCurrency;
    return this;
  }

   /**
   * Currency used in market capitalization.
   * @return marketCapCurrency
  **/
  @Schema(description = "Currency used in market capitalization.")
  public String getMarketCapCurrency() {
    return marketCapCurrency;
  }

  public void setMarketCapCurrency(String marketCapCurrency) {
    this.marketCapCurrency = marketCapCurrency;
  }

  public CompanyProfile cusip(String cusip) {
    this.cusip = cusip;
    return this;
  }

   /**
   * CUSIP number.
   * @return cusip
  **/
  @Schema(description = "CUSIP number.")
  public String getCusip() {
    return cusip;
  }

  public void setCusip(String cusip) {
    this.cusip = cusip;
  }

  public CompanyProfile sedol(String sedol) {
    this.sedol = sedol;
    return this;
  }

   /**
   * Sedol number.
   * @return sedol
  **/
  @Schema(description = "Sedol number.")
  public String getSedol() {
    return sedol;
  }

  public void setSedol(String sedol) {
    this.sedol = sedol;
  }

  public CompanyProfile description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Company business summary.
   * @return description
  **/
  @Schema(description = "Company business summary.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CompanyProfile exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Listed exchange.
   * @return exchange
  **/
  @Schema(description = "Listed exchange.")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public CompanyProfile ggroup(String ggroup) {
    this.ggroup = ggroup;
    return this;
  }

   /**
   * Industry group.
   * @return ggroup
  **/
  @Schema(description = "Industry group.")
  public String getGgroup() {
    return ggroup;
  }

  public void setGgroup(String ggroup) {
    this.ggroup = ggroup;
  }

  public CompanyProfile gind(String gind) {
    this.gind = gind;
    return this;
  }

   /**
   * Industry.
   * @return gind
  **/
  @Schema(description = "Industry.")
  public String getGind() {
    return gind;
  }

  public void setGind(String gind) {
    this.gind = gind;
  }

  public CompanyProfile gsector(String gsector) {
    this.gsector = gsector;
    return this;
  }

   /**
   * Sector.
   * @return gsector
  **/
  @Schema(description = "Sector.")
  public String getGsector() {
    return gsector;
  }

  public void setGsector(String gsector) {
    this.gsector = gsector;
  }

  public CompanyProfile gsubind(String gsubind) {
    this.gsubind = gsubind;
    return this;
  }

   /**
   * Sub-industry.
   * @return gsubind
  **/
  @Schema(description = "Sub-industry.")
  public String getGsubind() {
    return gsubind;
  }

  public void setGsubind(String gsubind) {
    this.gsubind = gsubind;
  }

  public CompanyProfile isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * ISIN number.
   * @return isin
  **/
  @Schema(description = "ISIN number.")
  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public CompanyProfile lei(String lei) {
    this.lei = lei;
    return this;
  }

   /**
   * LEI number.
   * @return lei
  **/
  @Schema(description = "LEI number.")
  public String getLei() {
    return lei;
  }

  public void setLei(String lei) {
    this.lei = lei;
  }

  public CompanyProfile naicsNationalIndustry(String naicsNationalIndustry) {
    this.naicsNationalIndustry = naicsNationalIndustry;
    return this;
  }

   /**
   * NAICS national industry.
   * @return naicsNationalIndustry
  **/
  @Schema(description = "NAICS national industry.")
  public String getNaicsNationalIndustry() {
    return naicsNationalIndustry;
  }

  public void setNaicsNationalIndustry(String naicsNationalIndustry) {
    this.naicsNationalIndustry = naicsNationalIndustry;
  }

  public CompanyProfile naics(String naics) {
    this.naics = naics;
    return this;
  }

   /**
   * NAICS industry.
   * @return naics
  **/
  @Schema(description = "NAICS industry.")
  public String getNaics() {
    return naics;
  }

  public void setNaics(String naics) {
    this.naics = naics;
  }

  public CompanyProfile naicsSector(String naicsSector) {
    this.naicsSector = naicsSector;
    return this;
  }

   /**
   * NAICS sector.
   * @return naicsSector
  **/
  @Schema(description = "NAICS sector.")
  public String getNaicsSector() {
    return naicsSector;
  }

  public void setNaicsSector(String naicsSector) {
    this.naicsSector = naicsSector;
  }

  public CompanyProfile naicsSubsector(String naicsSubsector) {
    this.naicsSubsector = naicsSubsector;
    return this;
  }

   /**
   * NAICS subsector.
   * @return naicsSubsector
  **/
  @Schema(description = "NAICS subsector.")
  public String getNaicsSubsector() {
    return naicsSubsector;
  }

  public void setNaicsSubsector(String naicsSubsector) {
    this.naicsSubsector = naicsSubsector;
  }

  public CompanyProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Company name.
   * @return name
  **/
  @Schema(description = "Company name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompanyProfile phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Company phone number.
   * @return phone
  **/
  @Schema(description = "Company phone number.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public CompanyProfile state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State of company&#x27;s headquarter.
   * @return state
  **/
  @Schema(description = "State of company's headquarter.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CompanyProfile ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Company symbol/ticker as used on the listed exchange.
   * @return ticker
  **/
  @Schema(description = "Company symbol/ticker as used on the listed exchange.")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public CompanyProfile weburl(String weburl) {
    this.weburl = weburl;
    return this;
  }

   /**
   * Company website.
   * @return weburl
  **/
  @Schema(description = "Company website.")
  public String getWeburl() {
    return weburl;
  }

  public void setWeburl(String weburl) {
    this.weburl = weburl;
  }

  public CompanyProfile ipo(LocalDate ipo) {
    this.ipo = ipo;
    return this;
  }

   /**
   * IPO date.
   * @return ipo
  **/
  @Schema(description = "IPO date.")
  public LocalDate getIpo() {
    return ipo;
  }

  public void setIpo(LocalDate ipo) {
    this.ipo = ipo;
  }

  public CompanyProfile marketCapitalization(Float marketCapitalization) {
    this.marketCapitalization = marketCapitalization;
    return this;
  }

   /**
   * Market Capitalization.
   * @return marketCapitalization
  **/
  @Schema(description = "Market Capitalization.")
  public Float getMarketCapitalization() {
    return marketCapitalization;
  }

  public void setMarketCapitalization(Float marketCapitalization) {
    this.marketCapitalization = marketCapitalization;
  }

  public CompanyProfile shareOutstanding(Float shareOutstanding) {
    this.shareOutstanding = shareOutstanding;
    return this;
  }

   /**
   * Number of oustanding shares.
   * @return shareOutstanding
  **/
  @Schema(description = "Number of oustanding shares.")
  public Float getShareOutstanding() {
    return shareOutstanding;
  }

  public void setShareOutstanding(Float shareOutstanding) {
    this.shareOutstanding = shareOutstanding;
  }

  public CompanyProfile employeeTotal(Float employeeTotal) {
    this.employeeTotal = employeeTotal;
    return this;
  }

   /**
   * Number of employee.
   * @return employeeTotal
  **/
  @Schema(description = "Number of employee.")
  public Float getEmployeeTotal() {
    return employeeTotal;
  }

  public void setEmployeeTotal(Float employeeTotal) {
    this.employeeTotal = employeeTotal;
  }

  public CompanyProfile logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Logo image.
   * @return logo
  **/
  @Schema(description = "Logo image.")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public CompanyProfile finnhubIndustry(String finnhubIndustry) {
    this.finnhubIndustry = finnhubIndustry;
    return this;
  }

   /**
   * Finnhub industry classification.
   * @return finnhubIndustry
  **/
  @Schema(description = "Finnhub industry classification.")
  public String getFinnhubIndustry() {
    return finnhubIndustry;
  }

  public void setFinnhubIndustry(String finnhubIndustry) {
    this.finnhubIndustry = finnhubIndustry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyProfile companyProfile = (CompanyProfile) o;
    return Objects.equals(this.alias, companyProfile.alias) &&
        Objects.equals(this.address, companyProfile.address) &&
        Objects.equals(this.city, companyProfile.city) &&
        Objects.equals(this.country, companyProfile.country) &&
        Objects.equals(this.currency, companyProfile.currency) &&
        Objects.equals(this.estimateCurrency, companyProfile.estimateCurrency) &&
        Objects.equals(this.marketCapCurrency, companyProfile.marketCapCurrency) &&
        Objects.equals(this.cusip, companyProfile.cusip) &&
        Objects.equals(this.sedol, companyProfile.sedol) &&
        Objects.equals(this.description, companyProfile.description) &&
        Objects.equals(this.exchange, companyProfile.exchange) &&
        Objects.equals(this.ggroup, companyProfile.ggroup) &&
        Objects.equals(this.gind, companyProfile.gind) &&
        Objects.equals(this.gsector, companyProfile.gsector) &&
        Objects.equals(this.gsubind, companyProfile.gsubind) &&
        Objects.equals(this.isin, companyProfile.isin) &&
        Objects.equals(this.lei, companyProfile.lei) &&
        Objects.equals(this.naicsNationalIndustry, companyProfile.naicsNationalIndustry) &&
        Objects.equals(this.naics, companyProfile.naics) &&
        Objects.equals(this.naicsSector, companyProfile.naicsSector) &&
        Objects.equals(this.naicsSubsector, companyProfile.naicsSubsector) &&
        Objects.equals(this.name, companyProfile.name) &&
        Objects.equals(this.phone, companyProfile.phone) &&
        Objects.equals(this.state, companyProfile.state) &&
        Objects.equals(this.ticker, companyProfile.ticker) &&
        Objects.equals(this.weburl, companyProfile.weburl) &&
        Objects.equals(this.ipo, companyProfile.ipo) &&
        Objects.equals(this.marketCapitalization, companyProfile.marketCapitalization) &&
        Objects.equals(this.shareOutstanding, companyProfile.shareOutstanding) &&
        Objects.equals(this.employeeTotal, companyProfile.employeeTotal) &&
        Objects.equals(this.logo, companyProfile.logo) &&
        Objects.equals(this.finnhubIndustry, companyProfile.finnhubIndustry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, address, city, country, currency, estimateCurrency, marketCapCurrency, cusip, sedol, description, exchange, ggroup, gind, gsector, gsubind, isin, lei, naicsNationalIndustry, naics, naicsSector, naicsSubsector, name, phone, state, ticker, weburl, ipo, marketCapitalization, shareOutstanding, employeeTotal, logo, finnhubIndustry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyProfile {\n");
    
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    estimateCurrency: ").append(toIndentedString(estimateCurrency)).append("\n");
    sb.append("    marketCapCurrency: ").append(toIndentedString(marketCapCurrency)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    ggroup: ").append(toIndentedString(ggroup)).append("\n");
    sb.append("    gind: ").append(toIndentedString(gind)).append("\n");
    sb.append("    gsector: ").append(toIndentedString(gsector)).append("\n");
    sb.append("    gsubind: ").append(toIndentedString(gsubind)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    lei: ").append(toIndentedString(lei)).append("\n");
    sb.append("    naicsNationalIndustry: ").append(toIndentedString(naicsNationalIndustry)).append("\n");
    sb.append("    naics: ").append(toIndentedString(naics)).append("\n");
    sb.append("    naicsSector: ").append(toIndentedString(naicsSector)).append("\n");
    sb.append("    naicsSubsector: ").append(toIndentedString(naicsSubsector)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    weburl: ").append(toIndentedString(weburl)).append("\n");
    sb.append("    ipo: ").append(toIndentedString(ipo)).append("\n");
    sb.append("    marketCapitalization: ").append(toIndentedString(marketCapitalization)).append("\n");
    sb.append("    shareOutstanding: ").append(toIndentedString(shareOutstanding)).append("\n");
    sb.append("    employeeTotal: ").append(toIndentedString(employeeTotal)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    finnhubIndustry: ").append(toIndentedString(finnhubIndustry)).append("\n");
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
