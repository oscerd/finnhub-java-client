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
@JsonPropertyOrder({ "currency", "figi", "mic", "isin", "shareClassFIGI", "symbol2" })
public class EnrichedSymbol extends Symbol {

	@JsonProperty("currency")
	private String currency;
	@JsonProperty("figi")
	private String figi;
	@JsonProperty("mic")
	private String mic;
	@JsonProperty("isin")
	private String isin;
	@JsonProperty("shareClassFIGI")
	private String shareClassFIGI;
	@JsonProperty("symbol2")
	private String symbol2;

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("figi")
	public String getFigi() {
		return figi;
	}

	@JsonProperty("figi")
	public void setFigi(String figi) {
		this.figi = figi;
	}

	@JsonProperty("mic")
	public String getMic() {
		return mic;
	}

	@JsonProperty("mic")
	public void setMic(String mic) {
		this.mic = mic;
	}

	@JsonProperty("isin")
	public String getIsin() {
		return isin;
	}

	@JsonProperty("isin")
	public void setIsin(String isin) {
		this.isin = isin;
	}

	@JsonProperty("shareClassFIGI")
	public String getShareClassFIGI() {
		return shareClassFIGI;
	}

	@JsonProperty("shareClassFIGI")
	public void setShareClassFIGI(String shareClassFIGI) {
		this.shareClassFIGI = shareClassFIGI;
	}

	@JsonProperty("symbol2")
	public String getSymbol2() {
		return symbol2;
	}

	@JsonProperty("symbol2")
	public void setSymbol2(String symbol2) {
		this.symbol2 = symbol2;
	}

	@Override
	public String toString() {
		return "EnrichedSymbol [description=" + getDescription() + ", displaySymbol=" + getDisplaySymbol() + ", symbol=" + getSymbol() + ", type=" + getType() + 
		", currency=" + currency + ", figi=" + figi + ", mic=" + mic + ", isin=" + isin + ", shareClassFIGI=" + shareClassFIGI + ", symbol2=" + symbol2 + "]";
	}

	

}
