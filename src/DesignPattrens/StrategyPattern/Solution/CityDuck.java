package DesignPattrens.StrategyPattern.Solution;

import DesignPattrens.StrategyPattern.Solution.Displaying.IDisplay;
import DesignPattrens.StrategyPattern.Solution.Flying.IFly;
import DesignPattrens.StrategyPattern.Solution.Quacking.IQuack;

public class CityDuck extends Duck {

    public CityDuck(IFly fly, IQuack quack, IDisplay display) {
        super(fly, quack, display);
    }
}
