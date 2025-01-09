package day1;

public class Vehicle extends Object{

    int maxSpeed;
    
    public Vehicle(){
        super();
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    // @Override
    // public String toString() {
    //     return "Vehicle [maxSpeed=" + maxSpeed + "]";
    // }


    public void start(){
        System.out.println("Vehicle Starting..");
    }
}