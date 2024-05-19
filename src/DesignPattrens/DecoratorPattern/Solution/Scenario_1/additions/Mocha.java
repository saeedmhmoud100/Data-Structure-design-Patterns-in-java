package DesignPattrens.DecoratorPattern.Solution.Scenario_1.additions;

import DesignPattrens.DecoratorPattern.Solution.Scenario_1.AddOnDecorator;
import DesignPattrens.DecoratorPattern.Solution.Scenario_1.Beverage;

public class Mocha extends AddOnDecorator {
    Beverage beverage;
    public Mocha(Beverage b) {
        this.beverage = b;
    }

    @Override
    public int cost() {
        return 2 + this.beverage.cost();
    }
}
