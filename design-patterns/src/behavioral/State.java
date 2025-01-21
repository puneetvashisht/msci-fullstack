package behavioral;


// The State Pattern allows an object to alter its behavior when its internal state changes, making it appear as if the object has changed its class.
// State interface
interface TrafficLightState {
    void changeLight(TrafficLight trafficLight);
}

// Concrete states
class RedLight implements TrafficLightState {
    @Override
    public void changeLight(TrafficLight trafficLight) {
        System.out.println("Red Light -> Switching to Green Light");
        trafficLight.setState(new GreenLight());
    }
}

class GreenLight implements TrafficLightState {
    @Override
    public void changeLight(TrafficLight trafficLight) {
        System.out.println("Green Light -> Switching to Yellow Light");
        trafficLight.setState(new YellowLight());
    }
}

class YellowLight implements TrafficLightState {
    @Override
    public void changeLight(TrafficLight trafficLight) {
        System.out.println("Yellow Light -> Switching to Red Light");
        trafficLight.setState(new RedLight());
    }
}

// Context
class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        currentState = new RedLight(); // Initial state
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void changeLight() {
        currentState.changeLight(this);
    }
}

// Main method
public class State {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        for (int i = 0; i < 5; i++) {
            trafficLight.changeLight();
        }
    }
}

