package com.avgaidai.binance.futures.monitor.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Anatoly Gaidai
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@Component
public class Contract {

    Handler handler;

    @Autowired
    public Contract() {
        this.handler = new Handler();
    }
}
