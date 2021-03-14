package com.avgaidai.binance.futures.monitor.tradingData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenInterest {

    public final String symbol;
    public final String openInterest;
    public final String time;

    //public final static boolean responseIsArray = false;

    public final static String endPoint = "https://fapi.binance.com/fapi/v1/openInterest";

    public OpenInterest(@JsonProperty("symbol") String symbol,
                        @JsonProperty("openInterest") String openInterest,
                        @JsonProperty("time") String time) {
        this.symbol = symbol;
        this.openInterest = openInterest;
        this.time = time;
    }

    @Override
    public String toString() {
        return "OpenInterest{" +
                "OpenInterest='" + openInterest + '\'' +
                ", Symbol='" + symbol + '\'' +
                ", Time='" + time + '\'' +
                '}';
    }
}