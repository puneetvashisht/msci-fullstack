package behavioral;

import java.util.ArrayList;
import java.util.List;

// This pattern defines a dependency between objects so that when one object changes state, all its dependents are notified.

// Subject
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Observer interface
interface Observer {
    void update(int temperature);
}

// Concrete observer
class WeatherApp implements Observer {
    private String name;

    public WeatherApp(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " received temperature update: " + temperature);
    }
}

// Main method
public class ObserverDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        WeatherApp app1 = new WeatherApp("App1");
        WeatherApp app2 = new WeatherApp("App2");

        station.addObserver(app1);
        station.addObserver(app2);

        station.setTemperature(25); // Both apps will be notified
        station.setTemperature(30); // Both apps will be notified
    }
}
