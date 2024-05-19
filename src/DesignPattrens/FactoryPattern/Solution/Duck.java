package DesignPattrens.FactoryPattern.Solution;

public class Duck implements IAnimal{

    @Override
    public void display() {
        System.out.println("Duck says: Quack Quack");
    }
}
