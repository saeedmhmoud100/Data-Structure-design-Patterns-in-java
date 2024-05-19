package DesignPattrens.Singleton.Solution;

public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void display() {
        System.out.println("Singleton class");
    }
}
