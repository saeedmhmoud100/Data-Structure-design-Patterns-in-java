package DesignPattrens.DecoratorPattern.Solution.Scenario_1.drinks;

import DesignPattrens.DecoratorPattern.Solution.Scenario_1.Beverage;

public class Espresso extends Beverage {
    @Override
    public int cost() {
        return 5;
    }
}

