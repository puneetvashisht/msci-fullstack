package day2;

public class RoadBicycle extends Bicycle{

    public RoadBicycle(int speed, int gear) {
        super(speed, gear);
    }

    @Override
    public void speedUp(int increment) {
        this.speed++;
    }

    @Override
    public void brakeDown(int decrement) {
       this.speed--;
    }

    

    @Override
    public String toString() {
        return "RoadBicycle [speed=" + speed + ", gear=" + gear + "]";
    }
    

    

}
