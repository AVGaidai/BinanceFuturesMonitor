package com.avgaidai.binance.futures.monitor.core;

/**
 *
 * @author Anatoly Gaidai
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public enum CryptoPair {

    BTCUSDT ("BTCUSDT"),
    ETHUSDT ("ETHUSDT");

    private String title;

    CryptoPair(String title) {
        this.title = title;
    }
}
