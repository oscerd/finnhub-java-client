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
package com.github.oscerd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.github.oscerd.finnhub.client.FinnhubClient;
import com.github.oscerd.finnhub.model.Candle;
import com.github.oscerd.finnhub.model.CompanyProfile;
import com.github.oscerd.finnhub.model.Exchange;
import com.github.oscerd.finnhub.model.Quote;
import com.github.oscerd.finnhub.model.EnrichedSymbol;
import com.github.oscerd.finnhub.model.SymbolLookup;

import org.apache.hc.core5.http.ParseException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class FinnhubClientTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocation() throws ParseException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        Quote quote = client.getQuote("IBM");
        assertNotNull(quote);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationCompanyProfile() throws ParseException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        CompanyProfile companyProfile = client.getCompanyProfile("IBM");
        assertNotNull(companyProfile);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationSymbols() throws ParseException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        List<EnrichedSymbol> symbols = client.getSymbols(Exchange.US_EXCHANGES.toString());
        List<EnrichedSymbol> t = symbols.stream().filter(s -> s.getDescription().contains("AMAZON.COM")).collect(Collectors.toList());
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
    void invokeCandlesOneDay() throws ParseException, IOException {
        FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        Candle candle = client.getCandle(
            "TSLA",
            "D",
            // Nov/5/2021 18:00:00 GMT = 1636135200
            1636135200,
            1636135200);

        assertEquals("ok", candle.getS());
        assertEquals(1, candle.getC().length);
        assertEquals(1222.09D, candle.getC()[0]);
        assertEquals(21628812L, candle.getV()[0]);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invokeCandlesTwoDays() throws ParseException, IOException {
        FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        Candle candle = client.getCandle(
            "TSLA",
            "D",
            // Nov/4/2021 18:00:00 GMT = 1636048800
            1636048800,  // Nov/4
            1636135200   // Nov/5
            );

        assertEquals(2, candle.getC().length);
        assertEquals("ok", candle.getS());

        assertEquals(1229.91D, candle.getC()[0]);
        assertEquals(1222.09D, candle.getC()[1]);

        assertEquals(25397410L, candle.getV()[0]);
        assertEquals(21628812L, candle.getV()[1]);

    }
}
