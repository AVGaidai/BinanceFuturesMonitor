
/**
 *
 * @author Anatoly Gaidai
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public abstract class Application {

    public static void start() {
        Settings settings;

        System.out.println(Settings.GLOBAL.getEndPoint("OpenInterest"));

    }

    public static void stop() {

    }
}
