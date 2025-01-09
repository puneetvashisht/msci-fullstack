package day1;

public class Plane extends Vehicle{

    int maxAltitude;
  
 
    public Plane(int maxSpeed, int maxAltitude) {
        super(maxSpeed);
        this.maxAltitude = maxAltitude;
    }

    public Plane(){
        super();
    }

    @Override
    public void start(){
        System.out.println("Plane start...");
    }
    public void fly(){
        System.out.println("Plane fly...");
    }

    @Override
    public String toString() {
        return "Plane [maxAltitude=" + maxAltitude + ", maxSpeed=" + maxSpeed + "]";
    }


    
}
