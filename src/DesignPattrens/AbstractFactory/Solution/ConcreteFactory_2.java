package DesignPattrens.AbstractFactory.Solution;

public class ConcreteFactory_2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA_2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB_2();
    }
}
