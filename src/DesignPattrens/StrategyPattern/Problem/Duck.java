package DesignPattrens.StrategyPattern.Problem;


// not extendable
// not reusable
// fixed behavior
// open for modification closed for extension

public class Duck {
    public void quack() {
        System.out.println("Quack Quack");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void display() {
        System.out.println("Displaying");
    }

    public void fly() {
        System.out.println("Flying");
    }
}
