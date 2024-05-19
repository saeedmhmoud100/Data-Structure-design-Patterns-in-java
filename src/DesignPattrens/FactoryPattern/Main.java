package DesignPattrens.FactoryPattern;

import DesignPattrens.FactoryPattern.Solution.IAnimal;
import DesignPattrens.FactoryPattern.Solution.IAnimalFactory;
import DesignPattrens.FactoryPattern.Solution.RandomFactory;

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
