package DesignPattrens.Singleton;

import DesignPattrens.Singleton.Solution.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton.display();
        singleton2.display();
    }
}
