package com.github.oscerd.finnhub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "exchange", "timezone" })
public class MarketHoliday {

    @JsonProperty("data")
    private List<Holiday> data;
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("data")
    public List<Holiday> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Holiday> data) {
        this.data = data;
    }

    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "atDate", "eventName", "tradingHour" })
    static class Holiday {
        @JsonProperty("atDate")
        private String atDate;
        @JsonProperty("eventName")
        private String eventName;
        @JsonProperty("tradingHour")
        private String tradingHour;

        @JsonProperty("atDate")
        public String getAtDate() {
            return atDate;
        }

        @JsonProperty("atDate")
        public void setAtDate(String atDate) {
            this.atDate = atDate;
        }

        @JsonProperty("eventName")
        public String getEventName() {
            return eventName;
        }

        @JsonProperty("eventName")
        public void setEventName(String eventName) {
            this.eventName = eventName;
        }

        @JsonProperty("tradingHour")
        public String getTradingHour() {
            return tradingHour;
        }

        @JsonProperty("tradingHour")
        public void setTradingHour(String tradingHour) {
            this.tradingHour = tradingHour;
        }
    }
}
