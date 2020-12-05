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

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.oscerd.finnhub.model.CompanyProfile;
import com.github.oscerd.finnhub.model.Quote;

public class FinnhubClient {

	private CloseableHttpClient httpClient = HttpClients.createDefault();
	private String token;
	private ObjectMapper objectMapper;

	public FinnhubClient(String token) {
		this.token = token;
		this.objectMapper = new ObjectMapper();
	}

	public FinnhubClient(String token, ObjectMapper objectMapper) {
		this.token = token;
		this.objectMapper = objectMapper;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}

	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public CloseableHttpClient getHttpClient() {
		return httpClient;
	}

	public void setHttpClient(CloseableHttpClient httpClient) {
		this.httpClient = httpClient;
	}

	public Quote getQuote(String symbol) throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(Endpoint.QUOTE.url() + "?token=" + token + "&symbol=" + symbol);

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(get)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return objectMapper.readValue(result, Quote.class);
	}
	
	public CompanyProfile getCompanyProfile(String symbol) throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(Endpoint.COMPANY_PROFILE.url() + "?token=" + token + "&symbol=" + symbol);

		String result = null;
		try (CloseableHttpResponse response = httpClient.execute(get)) {
			result = EntityUtils.toString(response.getEntity());
		}

		return objectMapper.readValue(result, CompanyProfile.class);
	}
}
