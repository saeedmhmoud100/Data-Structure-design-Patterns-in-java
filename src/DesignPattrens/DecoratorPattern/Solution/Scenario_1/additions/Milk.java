package DesignPattrens.DecoratorPattern.Solution.Scenario_1.additions;

import DesignPattrens.DecoratorPattern.Solution.Scenario_1.AddOnDecorator;
import DesignPattrens.DecoratorPattern.Solution.Scenario_1.Beverage;

public class Milk extends AddOnDecorator {
    Beverage beverage;
    public Milk(Beverage b) {
        this.beverage = b;
    }

    @Override
    public int cost() {
        return 1 + this.beverage.cost();
    }

}
