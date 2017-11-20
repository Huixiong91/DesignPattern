package SingletonPattern;

public class Singleton {
    static Singleton instance;
    private Singleton() {
        // exist to prevent instantiation from outer world
    }

    synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
