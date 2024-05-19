package DesignPattrens.StrategyPattern;

import DesignPattrens.StrategyPattern.Solution.CityDuck;
import DesignPattrens.StrategyPattern.Solution.Displaying.HardDisplay;
import DesignPattrens.StrategyPattern.Solution.Displaying.IDisplay;
import DesignPattrens.StrategyPattern.Solution.Displaying.SimpleDisplay;
import DesignPattrens.StrategyPattern.Solution.Duck;
import DesignPattrens.StrategyPattern.Solution.Flying.HardFly;
import DesignPattrens.StrategyPattern.Solution.Flying.IFly;
import DesignPattrens.StrategyPattern.Solution.Flying.SimpleFly;
import DesignPattrens.StrategyPattern.Solution.Quacking.HardQuack;
import DesignPattrens.StrategyPattern.Solution.Quacking.IQuack;
import DesignPattrens.StrategyPattern.Solution.Quacking.SimpleQuack;
import DesignPattrens.StrategyPattern.Solution.RubberDuck;

public class Main {
    public static void main(String[] args) {
        IDisplay simp_display = new SimpleDisplay();
        IQuack simp_quack = new SimpleQuack();
        IFly simp_fly = new SimpleFly();

        IDisplay hard_display = new HardDisplay();
        IQuack hard_quack = new HardQuack();
        IFly hard_fly = new HardFly();

        Duck cityDuck = new CityDuck(simp_fly, simp_quack, simp_display);
        cityDuck.fly();
        cityDuck.quack();
        cityDuck.display();

        Duck rubberDuck = new RubberDuck(hard_fly, hard_quack, hard_display);
        rubberDuck.fly();
        rubberDuck.quack();
        rubberDuck.display();

    }
}