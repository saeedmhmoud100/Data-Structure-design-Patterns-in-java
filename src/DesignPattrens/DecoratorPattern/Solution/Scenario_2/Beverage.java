package DesignPattrens.DecoratorPattern.Solution.Scenario_2;

abstract public class Beverage {
    protected Beverage additions;

    public Beverage() {
        this.additions = null;
    }

    public void addOn(Beverage a) {
        a.additions = this.additions;
        this.additions = a;

    }
    public int cost(){
        if(this.additions == null)
            return 0;
        return this.additions.cost();
    };
}
