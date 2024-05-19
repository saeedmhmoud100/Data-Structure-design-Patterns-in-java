package DesignPattrens.StrategyPattern.Solution.Quacking;

public class HardQuack implements IQuack{
    @Override
    public void quacking() {
        System.out.println("Quacking Hard");
    }
}
