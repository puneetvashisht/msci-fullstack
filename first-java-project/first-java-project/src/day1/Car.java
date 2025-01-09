package day1;

public class Car extends Vehicle{

    String model;
    String color;

    
    
    public Car(int maxSpeed, String model, String color) {
        super(maxSpeed);
        // this.maxSpeed = maxSpeed;
        this.model = model;
        this.color = color;
    }

    public Car(){
        super();
    }

    @Override
    public void start(){
        System.out.println("Car start...");
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", maxSpeed=" + maxSpeed + ", color=" + color + "]";
    }

    
}
