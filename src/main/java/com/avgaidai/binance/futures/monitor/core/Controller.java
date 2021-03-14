package com.avgaidai.binance.futures.monitor.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This is the main application controller class.it performs basic initial actions
 * (reading settings, creating subscriptions to contracts) and controls the process
 * of user interaction with the application.
 *
 * @author Anatoly Gaidai
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@Component
public class Controller {

    Contract[] subscriptions;

    @Autowired
    public Controller(Contract[] subscriptions) {
        this.subscriptions = subscriptions;

    }
}
