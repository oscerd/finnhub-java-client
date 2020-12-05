/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.oscerd.finnhub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "country", "currency", "exchange", "name", "ticker", "ipo", "marketCapitalization",
		"shareOutstanding", "logo", "phone", "weburl", "finnhubIndustry" })
public class CompanyProfile {

	@JsonProperty("country")
	private String country;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("ipo")
	private String ipo;
	@JsonProperty("marketCapitalization")
	private Integer marketCapitalization;
	@JsonProperty("name")
	private String name;
	@JsonProperty("shareOutstanding")
	private Double shareOutstanding;
	@JsonProperty("ticker")
	private String ticker;
	@JsonProperty("weburl")
	private String weburl;
	@JsonProperty("logo")
	private String logo;
	@JsonProperty("finnhubIndustry")
	private String finnhubIndustry;
	@JsonProperty("phone")
	private String phone;

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("exchange")
	public String getExchange() {
		return exchange;
	}

	@JsonProperty("exchange")
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@JsonProperty("ipo")
	public String getIpo() {
		return ipo;
	}

	@JsonProperty("ipo")
	public void setIpo(String ipo) {
		this.ipo = ipo;
	}

	@JsonProperty("marketCapitalization")
	public Integer getMarketCapitalization() {
		return marketCapitalization;
	}

	@JsonProperty("marketCapitalization")
	public void setMarketCapitalization(Integer marketCapitalization) {
		this.marketCapitalization = marketCapitalization;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("shareOutstanding")
	public Double getShareOutstanding() {
		return shareOutstanding;
	}

	@JsonProperty("shareOutstanding")
	public void setShareOutstanding(Double shareOutstanding) {
		this.shareOutstanding = shareOutstanding;
	}

	@JsonProperty("ticker")
	public String getTicker() {
		return ticker;
	}

	@JsonProperty("ticker")
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	@JsonProperty("weburl")
	public String getWeburl() {
		return weburl;
	}

	@JsonProperty("weburl")
	public void setWeburl(String weburl) {
		this.weburl = weburl;
	}

	@JsonProperty("logo")
	public String getLogo() {
		return logo;
	}

	@JsonProperty("logo")
	public void setLogo(String logo) {
		this.logo = logo;
	}

	@JsonProperty("finnhubIndustry")
	public String getFinnhubIndustry() {
		return finnhubIndustry;
	}

	@JsonProperty("finnhubIndustry")
	public void setFinnhubIndustry(String finnhubIndustry) {
		this.finnhubIndustry = finnhubIndustry;
	}
	
	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CompanyProfile [country=" + country + ", currency=" + currency + ", exchange=" + exchange + ", ipo="
				+ ipo + ", marketCapitalization=" + marketCapitalization + ", name=" + name + ", shareOutstanding="
				+ shareOutstanding + ", ticker=" + ticker + ", weburl=" + weburl + ", logo=" + logo
				+ ", finnhubIndustry=" + finnhubIndustry + ", phone=" + phone + "]";
	}
}
