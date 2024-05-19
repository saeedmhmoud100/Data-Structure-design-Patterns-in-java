package DesignPattrens.DecoratorPattern.Solution.Scenario_2.additions;

import DesignPattrens.DecoratorPattern.Solution.Scenario_2.AddOnDecorator;
import DesignPattrens.DecoratorPattern.Solution.Scenario_2.Beverage;

public class Mocha extends AddOnDecorator {

    @Override
    public int cost() {
        return 2;
    }
}
