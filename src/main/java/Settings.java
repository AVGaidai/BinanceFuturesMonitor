import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;


/**
 * The enumerated class Settings is an implementation of the Singleton design pattern.
 * It providing a global access point to the {@link Settings#GLOBAL} instance.
 *
 * @author Anatoly Gaidai
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public enum Settings {
    /**
     *
     */
    GLOBAL;

    HashMap<String, String> endPoints;

    Settings() {
        if (ordinal() != 0) {
            throw new IllegalStateException("В живых должен остаться только один");
        }
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void init() throws IOException {
        String pathname = "src/main/resources/";

        scanConfigFiles(pathname);
    }

    private void scanConfigFiles(String pathname) throws IOException {
        endPoints = new HashMap<String, String>();

        InputStream in = new FileInputStream(pathname + "Endpoints.cfg");

        Properties properties = new Properties();
        properties.load(in);
        in.close();

        for (final String name: properties.stringPropertyNames())
            endPoints.put(name, properties.getProperty(name));



        System.out.println(endPoints);
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

    Settings() throws IOException {
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


    public Settings getOwner(String index) {

        return JAVA;
    }
}
*/
