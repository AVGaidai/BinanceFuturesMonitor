package com.avgaidai.binance.futures.monitor.spring;


import com.avgaidai.binance.futures.monitor.core.Settings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
public class SpringConfig {

    @Bean
    public Settings settings() {
        return new Settings();
    }
}
