package DesignPattrens.CommandPattern;

import DesignPattrens.CommandPattern.Solution.Broker;
import DesignPattrens.CommandPattern.Solution.BuyStock;
import DesignPattrens.CommandPattern.Solution.SellStock;
import DesignPattrens.CommandPattern.Solution.Stock;

public class Main {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
