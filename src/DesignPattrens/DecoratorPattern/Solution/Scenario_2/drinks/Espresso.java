package DesignPattrens.DecoratorPattern.Solution.Scenario_2.drinks;

import DesignPattrens.DecoratorPattern.Solution.Scenario_2.AddOnDecorator;
import DesignPattrens.DecoratorPattern.Solution.Scenario_2.Beverage;

public class Espresso extends Beverage {
    @Override
    public int cost() {
        return 5 + super.cost();
    }


}

