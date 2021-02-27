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
import com.github.oscerd.finnhub.model.CompanyProfile;
import com.github.oscerd.finnhub.model.Exchange;
import com.github.oscerd.finnhub.model.Quote;
import com.github.oscerd.finnhub.model.EnrichedSymbol;
import com.github.oscerd.finnhub.model.SymbolLookup;

import org.apache.http.client.ClientProtocolException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class FinnhubClientTest {
	
    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocation() throws ClientProtocolException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        Quote quote = client.getQuote("IBM");
        assertNotNull(quote);
    }
    
    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationCompanyProfile() throws ClientProtocolException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        CompanyProfile companyProfile = client.getCompanyProfile("IBM");
        assertNotNull(companyProfile);
    }
    
    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationSymbols() throws ClientProtocolException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        List<EnrichedSymbol> symbols = client.getSymbols(Exchange.US_EXCHANGES.toString());
        List<EnrichedSymbol> t = symbols.stream().filter(s -> s.getDescription().contains("AMAZON.COM")).collect(Collectors.toList());
        assertEquals(1, t.size());
        System.err.println(t.toString());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "FINNHUB_TOKEN", matches = ".*")
    void invocationSymbolLookup() throws ClientProtocolException, IOException {
    	FinnhubClient client = new FinnhubClient(System.getenv("FINNHUB_TOKEN"));
        SymbolLookup lookup = client.searchSymbol("apple");
        assertEquals(12, lookup.getCount());
    }
}
