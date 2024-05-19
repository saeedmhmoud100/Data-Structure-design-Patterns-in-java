package DesignPattrens.ObserverPattern;

import DesignPattrens.ObserverPattern.solution.PhoneDisplay;
import DesignPattrens.ObserverPattern.solution.WeatherStation;

public class Main {
    public static void main(String[] args){
        WeatherStation station = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(station);

        // when i change the temperature in the weather station, the phone display will be updated
        station.setTemperature(30);
        System.out.println(phoneDisplay.temperature);
        station.setTemperature(10);
        System.out.println(phoneDisplay.temperature);
    }
}
