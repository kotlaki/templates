package Dz3.Singleton;

// Singleton

class Singleton {
    private static Singleton instance;
    private Singleton () {};

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
