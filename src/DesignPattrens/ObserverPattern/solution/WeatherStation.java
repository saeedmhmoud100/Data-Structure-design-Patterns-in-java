package DesignPattrens.ObserverPattern.solution;

import java.util.List;

public class WeatherStation implements IObservable{
    private int temperature;
    public List<IObserver> observersList;
    public WeatherStation(){
        this.observersList = new java.util.ArrayList<IObserver>();
    }
    @Override
    public void addObserver(IObserver observer) {
        this.observersList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observersList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : this.observersList){
            o.update();
        }
    }

    public int getTemperature(){
        return this.temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyObservers();
    }
}
