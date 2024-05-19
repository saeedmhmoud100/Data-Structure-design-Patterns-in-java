package DesignPattrens.AbstractFactory;

import DesignPattrens.AbstractFactory.Solution.AbstractFactory;
import DesignPattrens.AbstractFactory.Solution.ConcreteFactory;
import DesignPattrens.AbstractFactory.Solution.ConcreteFactory_2;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory();
        abstractFactory.createProductA().display();
        abstractFactory.createProductB().display();

        AbstractFactory abstractFactory2 = new ConcreteFactory_2();
        abstractFactory2.createProductA().display();
        abstractFactory2.createProductB().display();
    }
}
