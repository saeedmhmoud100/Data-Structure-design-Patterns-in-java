package DesignPattrens.StrategyPattern.Solution.Quacking;

public class SimpleQuack implements IQuack{
    @Override
    public void quacking() {
        System.out.println("Quacking Simple");
    }
}
