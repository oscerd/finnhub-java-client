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
package com.github.oscerd.finnhub.client;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import com.github.oscerd.finnhub.models.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.support.ClassicRequestBuilder;

public class FinnhubClient {

	private CloseableHttpClient httpClient = HttpClients.createDefault();
	private String token;
	private Gson gson;

	public FinnhubClient() {
	}

	public FinnhubClient(String token) {
		this.token = token;
		this.gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter().nullSafe()).create();
	}

	public FinnhubClient(String token, Gson gson) {
		this.token = token;
		this.gson = gson;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Gson getGson() {
		return gson;
	}

	public void setGson(Gson gson) {
		this.gson = gson;
	}

	public CloseableHttpClient getHttpClient() {
		return httpClient;
	}

	public void setHttpClient(CloseableHttpClient httpClient) {
		this.httpClient = httpClient;
	}

	public Quote getQuote(String symbol) throws IOException, ParseException {
		HttpGet get = new HttpGet(Endpoint.QUOTE.url() + "?token=" + token + "&symbol=" + symbol);

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(get)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return gson.fromJson(result, Quote.class);
	}

	/**
	 *  Get the Stock Candle object for a date or a range. Set startEpoch equal to the endEpoch for one day.
	 * @param symbol Ticker symbol
	 * @param resolution Supported resolution includes 1, 5, 15, 30, 60, D, W, M.
	 * Some timeframes might not be available depending on the exchange.
	 * @param startEpoch In seconds, not milliseconds.
	 * @param endEpoch As above.
	 * @return JSON object with arrays for the close, low, high, open, volume. status is a String.
	 * @throws IOException
	 * @throws ParseException
	 */
	public StockCandles getCandle(String symbol, String resolution, long startEpoch, long endEpoch) throws IOException, ParseException {
		HttpGet get = new HttpGet(Endpoint.CANDLE.url() + "?token=" + token
				+ "&symbol=" + symbol.toUpperCase() + "&resolution=" + resolution + "&from=" + startEpoch + "&to=" + endEpoch);

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(get)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return gson.fromJson(result, StockCandles.class);
	}

	public CompanyProfile2 getCompanyProfile(String symbol) throws IOException, ParseException {
		HttpGet get = new HttpGet(Endpoint.COMPANY_PROFILE.url() + "?token=" + token + "&symbol=" + symbol);

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(get)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return gson.fromJson(result, CompanyProfile2.class);
	}
	
	public List<StockSymbol> getSymbols(String exchange) throws IOException, ParseException {
		HttpGet get = new HttpGet(Endpoint.SYMBOL.url() + "?token=" + token + "&exchange=" + Exchange.valueOf(exchange).code());

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(get)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return gson.fromJson(result, new TypeToken<List<StockSymbol>>(){});
	}

	public SymbolLookup searchSymbol(String query) throws IOException, ParseException {
		HttpGet get = new HttpGet(Endpoint.SYMBOL_LOOKUP.url() + "?token=" + token + "&q=" + query);

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(get)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return gson.fromJson(result, SymbolLookup.class);
	}

	public MarketStatus marketStatus(String exchange) throws IOException, ParseException {
		HttpGet get = new HttpGet(Endpoint.MARKET_STATUS.url() + "?token=" + token + "&exchange=" + exchange);

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(get)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return gson.fromJson(result, MarketStatus.class);
	}

	public MarketHoliday marketHoliday(String exchange) throws IOException, ParseException {
		HttpGet get = new HttpGet(Endpoint.MARKET_HOLIDAY.url() + "?token=" + token + "&exchange=" + exchange);

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(get)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return gson.fromJson(result, MarketHoliday.class);
	}

	public List<Dividends> dividends(String symbol, String from, String to) throws IOException, ParseException {
		HttpGet get = new HttpGet(Endpoint.DIVIDEND.url() + "?token=" + token + "&symbol=" + symbol  + "&from=" + from + "&to=" + to);

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(get)) {
			result = EntityUtils.toString(response.getEntity());
			System.err.println(result.toString());
		}

		return gson.fromJson(result, new TypeToken<List<Dividends>>(){}.getType());
	}

	public List<CompanyNews> companyNews(String symbol, String from, String to) throws IOException, ParseException {
		ClassicHttpRequest httpGet = ClassicRequestBuilder.get(Endpoint.COMPANY_NEWS.url() + "?token=" + token + "&symbol=" + symbol  + "&from=" + from + "&to=" + to)
				.build();

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return gson.fromJson(result, new TypeToken<List<CompanyNews>>(){}.getType());
	}

	public static class Builder {

		private final FinnhubClient client;

		public Builder() {
			client = new FinnhubClient();
		}

		public Builder token(String token) {
			client.setToken(token);
			return this;
		}

		public Builder to(CloseableHttpClient httpClient) {
			client.setHttpClient(httpClient);
			return this;
		}

		public Builder gson(Gson mapper) {
			client.setGson(mapper);
			return this;
		}

		public FinnhubClient build() {
			if (client.getGson() == null) {
				client.setGson(new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter().nullSafe()).create());
			}
			return client;
		}
	}

	private static final class LocalDateAdapter extends TypeAdapter<LocalDate> {
		@Override
		public void write(final JsonWriter jsonWriter, final LocalDate localDate ) throws IOException {
			jsonWriter.value(localDate.toString());
		}

		@Override
		public LocalDate read( final JsonReader jsonReader ) throws IOException {
			return LocalDate.parse(jsonReader.nextString());
		}
	}
}
