package DesignPattrens.DecoratorPattern.Solution.Scenario_1;

import DesignPattrens.DecoratorPattern.Solution.Scenario_1.additions.Milk;
import DesignPattrens.DecoratorPattern.Solution.Scenario_1.drinks.Espresso;
import DesignPattrens.DecoratorPattern.Solution.Scenario_1.additions.Mocha;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(); // espresso costs 5

        System.out.println(beverage.cost());

        beverage = new Mocha(beverage); // espresso with mocha costs 7

        System.out.println(beverage.cost());

        beverage = new Milk(beverage); // espresso with mocha and milk costs 8

        System.out.println(beverage.cost());
    }
}
