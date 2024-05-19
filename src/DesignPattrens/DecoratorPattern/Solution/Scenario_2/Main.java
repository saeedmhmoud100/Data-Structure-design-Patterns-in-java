package DesignPattrens.DecoratorPattern.Solution.Scenario_2;

import DesignPattrens.DecoratorPattern.Solution.Scenario_2.additions.Milk;
import DesignPattrens.DecoratorPattern.Solution.Scenario_2.additions.Mocha;
import DesignPattrens.DecoratorPattern.Solution.Scenario_2.drinks.Espresso;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.cost()); // 5
        espresso.addOn(new Mocha());
        System.out.println(espresso.cost()); // 7
        espresso.addOn(new Milk());
        System.out.println(espresso.cost()); // 8
    }
}
