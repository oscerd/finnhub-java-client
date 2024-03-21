package com.github.oscerd.finnhub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "exchange", "holiday", "isOpen", "session", "t", "timezone" })
public class MarketStatus {

    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("t")
    private String timestamp;
    @JsonProperty("holiday")
    private String holiday;

    @JsonProperty("session")
    private String session;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("isOpen")
    private Boolean isOpen;

    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("t")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("t")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("holiday")
    public String getHoliday() {
        return holiday;
    }

    @JsonProperty("holiday")
    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    @JsonProperty("session")
    public String getSession() {
        return session;
    }

    @JsonProperty("session")
    public void setSession(String session) {
        this.session = session;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("isOpen")
    public Boolean getOpen() {
        return isOpen;
    }

    @JsonProperty("isOpen")
    public void setOpen(Boolean open) {
        isOpen = open;
    }
}
