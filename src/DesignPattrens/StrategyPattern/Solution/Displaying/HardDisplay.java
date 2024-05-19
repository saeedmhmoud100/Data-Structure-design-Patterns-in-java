package DesignPattrens.StrategyPattern.Solution.Displaying;

public class HardDisplay implements IDisplay{
    @Override
    public void displaying() {
        System.out.println("I am displaying in a hard way");
    }
}
