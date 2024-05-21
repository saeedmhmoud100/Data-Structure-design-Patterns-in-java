package DesignPattrens.AdapterPattern.Solution.Scenario_1;

public class Adapter implements ITarget{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
