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
package com.github.oscerd.finnhub.models;

public enum Exchange {
	
	NYSE_EURONEXT_AMSTERDAM("AS"),
    ATHENS_EXCHANGE("AT"),
    ASX("AX"),
    BOLSA_DE_COMERCIO_DE_BUENOS_AIRES("BA"),
    BOLSA_DE_VALORES_DE_COLOMBIA("BC"),
    BUDAPEST_STOCK_EXCHANGE("BD"),
    BOERSE_BERLIN("BE"),
    STOCK_EXCHANGE_OF_THAILAND("BK"),
    BSE_LTD("BO"),
    NYSE_EURONEXT_BRUSSELS("BR"),
    CANADIAN_NATIONAL_STOCK_EXCHANGE("CN"),
    NORDIC_EXCHANGE_COPENHAGEN("CO"),
    CARACAS_STOCK_EXCHANGE("CR"),
    DUBAI_FINANCIAL_MARKET("DB"),
    XETRA("DE"),
    BOERSE_DUSSELDORF("DU"),
    DEUTSCHE_BOERSE("F"),
    NASDAQ_HELSINKI("HE"),
    HONG_KONG_EXCHANGE("HK"),
    HANSEATISCHE_WERTPAPIERBOERSE_HAMBURG("HM"),
    NASDAQ_ICELAND("IC"),
    IRISH_STOCK_EXCHANGE("IR"),
    BORSA_ISTANBUL("IS"),
    INDONESIA_STOCK_EXCHANGE("JK"),
    JOHANNESBURG_STOCK_EXCHANGE("JO"),
    BURSA_MALAYSIA("KL"),
    KOSDAQ_KOREA_EXCHANGE("KQ"),
    STOCK_MARKET_KOREA_EXCHANGE("KS"),
    LONDON_STOCK_EXCHANGE("L"),
    NYSE_EURONEXT_LISBON("LS"),
    BOLSA_DE_MADRID("MC"),
    MOSCOW_EXCHANGE("ME"),
    ITALIAN_STOCK_EXCHANGE("MI"),
    BOERSE_MUNCHEN("MU"),
    BOELSA_MEXICANA_DE_VALORES("MX"),
    AEQUITAS_NEO_EXCHANGE("NE"),
    NATIONAL_STOCK_EXCHANGE_OF_INDIA("NI"),
    NEW_ZEALANDA_EXCHANGE_LTD("NZ"),
    OSLO_BORS("OL"),
    NYSE_EURONEXT_PARIS("PA"),
    PRAGUE_STOCK_EXCHANGE("PR"),
    QATAR_STOCK_EXCHANGE("QA"),
    NASDAQ_RIGA("RG"),
    BRAZIL_BOLSA_SAO_PAULO("SA"),
    BOERSE_STUTTGART("SG"),
    SINGAPORE_EXCHANGE("SI"),
    SANTIAGO_STOCK_EXCHANGE("SG"),
    SAUDI_STOCK_EXCHANGE("SR"),
    SHANGHAI_STOCK_EXCHANGE("SS"),
    NASDAQ_NORDIC("ST"),
    SWISS_EXCHANGE("SW"),
    SHENZHEN_STOCK_EXCHANGE("SZ"),
    TOKIO_STOCK_EXCHANGE("T"),
    TEL_AVIV_STOCK_EXCHANGE("TA"),
    NASDAQ_TALLIN("TL"),
    TORONTO_STOCK_EXCHANGE("TO"),
    TAIWAN_STOCK_EXCHANGE("TW"),
    US_EXCHANGES("US"),
    TSX_VENTURE_EXCHANGE("V"),
    VIENNA_STOCK_EXCHANGE("VI"),
    VIETNAM_EXCHANGES("VN"),
    NASDAQ_VILNIUS("VS"),
    WARSAW_STOCK_EXCHANGES("WA");	

    private String code;

    Exchange(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

}
