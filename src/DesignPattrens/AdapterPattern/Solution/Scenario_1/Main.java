package DesignPattrens.AdapterPattern.Solution.Scenario_1;

import DesignPattrens.AdapterPattern.Solution.Scenario_1.Adaptee;
import DesignPattrens.AdapterPattern.Solution.Scenario_1.Adapter;
import DesignPattrens.AdapterPattern.Solution.Scenario_1.ITarget;

public class Main {
    public static void main(String[] args) {
        {

            Adaptee a = new Adaptee();
            ITarget t = new Adapter(a);
            t.request();

        }
    }
}
