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

public enum Endpoint {
	
    QUOTE("https://finnhub.io/api/v1/quote"),
    COMPANY_PROFILE("https://finnhub.io/api/v1/stock/profile2"),
    SYMBOL("https://finnhub.io/api/v1/stock/symbol"),
    SYMBOL_LOOKUP("https://finnhub.io/api/v1/search"),
    MARKET_STATUS("https://finnhub.io/api/v1/stock/market-status"),

    MARKET_HOLIDAY("https://finnhub.io/api/v1/stock/market-holiday"),
    CANDLE("https://finnhub.io/api/v1/stock/candle");


    private String url;

    Endpoint(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
