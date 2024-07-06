package singleton.crash;

public class Singleton2 {
    private static volatile Singleton2 instance;

    private Singleton2() {
        if (instance != null) {
            throw new RuntimeException("already initialized");
        }
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
