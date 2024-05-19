package DesignPattrens.StrategyPattern.Solution;

import DesignPattrens.StrategyPattern.Solution.Displaying.IDisplay;
import DesignPattrens.StrategyPattern.Solution.Flying.IFly;
import DesignPattrens.StrategyPattern.Solution.Quacking.IQuack;

public class RubberDuck extends Duck {

    public RubberDuck(IFly fly, IQuack quack, IDisplay display) {
        super(fly, quack, display);
    }
}
