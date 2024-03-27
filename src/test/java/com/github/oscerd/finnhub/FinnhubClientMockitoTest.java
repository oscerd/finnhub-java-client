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

package com.github.oscerd.finnhub;

import com.github.oscerd.finnhub.client.FinnhubClient;
import com.github.oscerd.finnhub.models.Quote;
import org.apache.hc.core5.http.ParseException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FinnhubClientMockitoTest {

    static FinnhubClient finnhubMock;

    @BeforeAll
    static void initClientMock() throws IOException, ParseException {

        finnhubMock = mock(FinnhubClient.class);

        Quote ibm = new Quote();
        ibm.c(Float.valueOf("180.00"));
        ibm.d(Float.valueOf("185.00"));
        ibm.dp(Float.valueOf("181.00"));
        ibm.o(Float.valueOf("185.00"));
        ibm.h(Float.valueOf("185.00"));
        ibm.l(Float.valueOf("185.00"));
        ibm.pc(Float.valueOf("185.00"));

        when(finnhubMock.getQuote("IBM")).thenReturn(ibm);
    }

    @Test
    void quoteMockTest() throws ParseException, IOException {
        FinnhubClient client = finnhubMock;
        Quote quote = client.getQuote("IBM");
        assertNotNull(quote);
        assertEquals(Float.valueOf("181.00"), quote.getDp());
    }
}
