package DesignPattrens.ObserverPattern.solution;

public class PhoneDisplay implements IObserver{
    private WeatherStation station;
    public int temperature;
    public PhoneDisplay(WeatherStation station){
        this.station = station;
        this.station.addObserver(this);
        this.temperature = station.getTemperature();
    }

    @Override
    public void update() {
        this.temperature = station.getTemperature();
    }
}
