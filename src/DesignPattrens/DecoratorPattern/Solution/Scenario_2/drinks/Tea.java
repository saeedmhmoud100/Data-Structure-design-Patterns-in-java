package DesignPattrens.DecoratorPattern.Solution.Scenario_2.drinks;

import DesignPattrens.DecoratorPattern.Solution.Scenario_2.Beverage;

public class Tea extends Beverage {
    @Override
    public int cost() {
        return 1 + super.cost();
    }
}
