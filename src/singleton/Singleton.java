package singleton;

/**
 * Created by pc on 22.01.2016.
 */
public class Singleton {
    private String name;
    private static Singleton instance;

    public String getName() {
        return name;
    }

    private Singleton() {
        name = "Single Instance";
    }

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
