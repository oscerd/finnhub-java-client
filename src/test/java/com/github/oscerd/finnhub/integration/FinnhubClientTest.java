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
package com.github.oscerd.finnhub.integration;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.github.oscerd.finnhub.client.FinnhubClient;
import com.github.oscerd.finnhub.models.*;

import org.apache.hc.core5.http.ParseException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.*;

public class FinnhubClientTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocation() throws ParseException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        Quote quote = client.getQuote("TSLA");
        assertNotNull(quote);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationCompanyProfile() throws ParseException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        CompanyProfile2 companyProfile = client.getCompanyProfile("TSLA");
        assertNotNull(companyProfile);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationSymbols() throws ParseException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        List<StockSymbol> symbols = client.getSymbols(Exchange.US_EXCHANGES.toString());
        List<StockSymbol> t = symbols.stream().filter(s -> s.getDescription().contains("AMAZON.COM")).collect(Collectors.toList());
        assertEquals(1, t.size());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationSymbolLookup() throws ParseException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        SymbolLookup lookup = client.searchSymbol("apple");
        assertEquals(22, lookup.getCount());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationMarketStatus() throws ParseException, IOException {
        FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        MarketStatus status = client.marketStatus(Exchange.US_EXCHANGES.code());
        assertNotNull(status);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationMarketHoliday() throws ParseException, IOException {
        FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        MarketHoliday holidays = client.marketHoliday(Exchange.US_EXCHANGES.code());
        assertNotNull(holidays);
        assertTrue(holidays.getData().size() >= 1);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invokeCandlesOneDay() throws ParseException, IOException {
        FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        StockCandles candle = client.getCandle(
            "TSLA",
            "D",
            // Nov/5/2021 18:00:00 GMT = 1636135200
            1636135200,
            1636135200);

        assertEquals("ok", candle.getS());
        assertEquals(1, candle.getC().size());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invokeCandlesTwoDays() throws ParseException, IOException {
        FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        StockCandles candle = client.getCandle(
            "TSLA",
            "D",
            // Nov/4/2021 18:00:00 GMT = 1636048800
            1636048800,  // Nov/4
            1636135200   // Nov/5
            );

        assertEquals(2, candle.getC().size());
        assertEquals("ok", candle.getS());

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationDividends() throws ParseException, IOException {
        FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        List<Dividends> dividends = client.dividends("TSLA", "2020-01-01", "2023-01-01");
        assertNotNull(dividends);
        assertEquals(dividends.size(), 0);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationCompanyNews() throws ParseException, IOException {
        FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        List<CompanyNews> companyNews = client.companyNews("TSLA", "2024-01-01", "2024-03-20");
        assertNotNull(companyNews);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationBasicFinancials() throws ParseException, IOException {
        FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        BasicFinancials metrics = client.basicFinancials("TSLA", null);
        assertNotNull(metrics);
        assertNotNull(metrics.getMetric());
        metrics = client.basicFinancials("TSLA", "all");
        assertNotNull(metrics);
        assertNotNull(metrics.getMetric());
    }
}
