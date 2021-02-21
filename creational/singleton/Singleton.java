package creational.singleton;

// used when one requires objects to make use of a single object instance
public class Singleton {
    private static Singleton firstInstance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (firstInstance == null) {
            firstInstance = new Singleton();
        }
        return firstInstance;
    }
}
