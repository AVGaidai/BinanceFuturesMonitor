package com.avgaidai.binance.futures.monitor.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;


/**
 * The enumerated class core.Settings is an implementation of the Singleton design pattern.
 * It providing a global access point to the {@link Settings#endPoints} instance.
 *
 * @author Anatoly Gaidai
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@Component
@Service
//@PropertySource(value = "classpath:application.properties")
@Scope("singleton")
public class Settings {

    @Value("#{${settings.endPoints}}")
    HashMap<String, String> endPoints;

    public Settings() {

        //endPoints = new HashMap<String, String>();

    }

    private void scanConfigFiles(String path) throws IOException {

        System.out.println(endPoints);
    }

    public void printEndPoints() {
        System.out.println(this.endPoints);
    }

    public String getEndPoint(String key) {
        return endPoints.get(key);
    }
    /** java-doc */
    public String getOwner(String index) {
        // логика здесь
        return "Джеймс Гослинг, Sun Microsystems";
    }
}
/*
    JAVA;

    HashMap<String, String> endPoints;

    core.Settings() throws IOException {
        if (ordinal() != 0) {
            throw new IllegalStateException("В живых должен остаться только один");
        }
        init();
    }

    private void init() throws IOException {
        String pathname = "src/main/resources/Endpoints.cfg";

        scanConfigFile(pathname);
    }

    private void scanConfigFile(String filename) throws IOException {
        InputStream in = new FileInputStream(filename);

        Properties properties = new Properties();
        properties.load(in);
        in.close();

        endPoints.put("TopLongShortPositionRatio", properties.getProperty("TopLongShortPositionRatio"));
        endPoints.put("OpenInterest", properties.getProperty("OpenInterest"));
    }


    public core.Settings getOwner(String index) {

        return JAVA;
    }
}
*/
