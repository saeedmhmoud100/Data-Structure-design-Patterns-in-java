package DesignPattrens.FactoryPattern.Solution.Scenario_1;

public class Duck implements IAnimal{

    @Override
    public void display() {
        System.out.println("Duck says: Quack Quack");
    }
}
