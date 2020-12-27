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

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.http.client.ClientProtocolException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.github.oscerd.finnhub.client.FinnhubClient;
import com.github.oscerd.finnhub.model.CompanyProfile;
import com.github.oscerd.finnhub.model.Exchange;
import com.github.oscerd.finnhub.model.Quote;
import com.github.oscerd.finnhub.model.Symbol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Disabled("Provide your token to run test")
public class FinnhubClientTest {
	
	String token = "<your-token>";

    @Test
    void invocation() throws ClientProtocolException, IOException {
    	FinnhubClient client = new FinnhubClient(token);
        Quote quote = client.getQuote("IBM");
        assertNotNull(quote);
    }
    
    @Test
    void invocationCompanyProfile() throws ClientProtocolException, IOException {
    	FinnhubClient client = new FinnhubClient(token);
        CompanyProfile companyProfile = client.getCompanyProfile("IBM");
        assertNotNull(companyProfile);
    }
    
    @Test
    void invocationSymbols() throws ClientProtocolException, IOException {
    	FinnhubClient client = new FinnhubClient(token);
        List<Symbol> symbols = client.getSymbols(Exchange.US_EXCHANGES.toString());
        List<Symbol> t = symbols.stream().filter(s -> s.getDescription().contains("AMAZON.COM")).collect(Collectors.toList());
        assertEquals(1, t.size());
    }
}
