public class Singleton {
    private static Singleton singleton = null;

    public Singleton() {
    }

    ;


    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    ;
}
