package com.avgaidai.binance.futures.monitor.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.avgaidai.binance.futures.monitor.spring.SpringConfig;

/**
 *
 * @author Anatoly Gaidai
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public abstract class Application {

    public static void start() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        Settings settings = context.getBean(Settings.class);



        System.out.println(settings.getEndPoint("OpenInterest"));

    }

    public static void stop() {

    }
}
