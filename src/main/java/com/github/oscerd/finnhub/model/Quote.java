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
@JsonPropertyOrder({ "c", "h", "l", "o", "pc", "t" })
public class Quote {

	@JsonProperty("c")
	private String currentPrice;
	@JsonProperty("h")
	private String highestPrice;
	@JsonProperty("l")
	private String lowestPrice;
	@JsonProperty("o")
	private String openinngPrice;
	@JsonProperty("pc")
	private Integer previousClose;
	@JsonProperty("t")
	private String timestamp;
	@JsonProperty("d")
	private Float change;
	@JsonProperty("dp")
	private Float percentChange;

	@JsonProperty("c")
	public String getCurrentPrice() {
		return currentPrice;
	}

	@JsonProperty("c")
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	@JsonProperty("h")
	public String getHighestPrice() {
		return highestPrice;
	}

	@JsonProperty("h")
	public void setHighestPrice(String highestPrice) {
		this.highestPrice = highestPrice;
	}

	@JsonProperty("l")
	public String getLowestPrice() {
		return lowestPrice;
	}

	@JsonProperty("l")
	public void setLowestPrice(String lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	@JsonProperty("o")
	public String getOpeninngPrice() {
		return openinngPrice;
	}

	@JsonProperty("o")
	public void setOpeninngPrice(String openinngPrice) {
		this.openinngPrice = openinngPrice;
	}

	@JsonProperty("pc")
	public Integer getPreviousClose() {
		return previousClose;
	}

	@JsonProperty("pc")
	public void setPreviousClose(Integer previousClose) {
		this.previousClose = previousClose;
	}

	@JsonProperty("t")
	public String getTimestamp() {
		return timestamp;
	}

	@JsonProperty("t")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("d")
	public Float getChange() {
		return change;
	}

	@JsonProperty("d")
	public void setChange(Float change) {
		this.change = change;
	}

	@JsonProperty("dp")
	public Float getPercentChange() {
		return percentChange;
	}

	@JsonProperty("dp")
	public void setPercentChange(Float percentChange) {
		this.percentChange = percentChange;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Quote{" +
				"currentPrice='" + currentPrice + '\'' +
				", highestPrice='" + highestPrice + '\'' +
				", lowestPrice='" + lowestPrice + '\'' +
				", openinngPrice='" + openinngPrice + '\'' +
				", previousClose=" + previousClose +
				", timestamp='" + timestamp + '\'' +
				", change=" + change +
				", percentChange=" + percentChange +
				'}';
	}
}
