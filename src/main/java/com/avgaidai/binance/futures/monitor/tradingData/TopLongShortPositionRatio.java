package com.avgaidai.binance.futures.monitor.tradingData;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TopLongShortPositionRatio extends TradingData {

    public final String symbol;
    public final String longShortRatio;
    public final String longAccount;
    public final String shortAccount;
    public final String timestamp;


    public final static boolean responseIsArray = true;

    public final static String endPoint = "https://fapi.binance.com/futures/data/topLongShortPositionRatio";

    public TopLongShortPositionRatio(@JsonProperty("symbol") String symbol,
                                     @JsonProperty("longShortRatio") String longShortRatio,
                                     @JsonProperty("longAccount") String longAccount,
                                     @JsonProperty("shortAccount") String shortAccount,
                                     @JsonProperty("timestamp") String timestamp) {
        super();
        this.symbol = symbol;
        this.longShortRatio = longShortRatio;
        this.longAccount = longAccount;
        this.shortAccount = shortAccount;
        this.timestamp = timestamp;
    }



    @Override
    public String toString() {
        return "topLongShortPositionRatio{" +
                "symbol='" + symbol + '\'' +
                ", longShortRatio='" + longShortRatio + '\'' +
                ", longAccount='" + longAccount + '\'' +
                ", shortAccount='" + shortAccount + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

    public String getSymbol() {
        return symbol;
    }
}