package DesignPattrens.FactoryPattern.Solution.Scenario_1;

import DesignPattrens.FactoryPattern.Solution.Scenario_1.IAnimal;
import DesignPattrens.FactoryPattern.Solution.Scenario_1.IAnimalFactory;
import DesignPattrens.FactoryPattern.Solution.Scenario_1.RandomFactory;

public class Main {
    public static void main(String[] args) {
        IAnimalFactory animalFactory = new RandomFactory();
        IAnimal[] animals = new IAnimal[10];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = animalFactory.createAnimal();
            animals[i].display();
        }
    }
}
