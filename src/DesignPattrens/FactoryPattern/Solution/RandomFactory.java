package DesignPattrens.FactoryPattern.Solution;

public class RandomFactory implements IAnimalFactory{

    public IAnimal createAnimal() {
        int random = (int)(Math.random()*100);
        if(random <= 33){
            return new Cat();
        }else if(random <= 66){
            return new Dog();
        }else {
            return new Duck();
        }
    }
}
