package DesignPattrens.StrategyPattern.Solution;

import DesignPattrens.StrategyPattern.Solution.Behaviors.*;
import DesignPattrens.StrategyPattern.Solution.Displaying.IDisplay;
import DesignPattrens.StrategyPattern.Solution.Flying.IFly;
import DesignPattrens.StrategyPattern.Solution.Quacking.IQuack;


// extendable
// reusable
// changeable behavior
// open for extension closed for modification

public class Duck implements IFlyBehavior, IQuackBehavior, IDisplayBehavior {

    IFly fly;
    IQuack quack;
    IDisplay display;
    public Duck(IFly fly, IQuack quack, IDisplay display) {
        this.fly = fly;
        this.quack = quack;
        this.display = display;
    }

    public void setFly(IFly fly) {
        this.fly = fly;
    }
    public void setQuack(IQuack quack) {
        this.quack = quack;
    }
    public void setDisplay(IDisplay display) {
        this.display = display;
    }
    public void quack() {
        quack.quacking();
    }
    public void display() {
        display.displaying();
    }
    @Override
    public void fly() {
        fly.flying();
    }
}
