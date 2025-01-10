package day2;

public class MountainBicycle extends Bicycle{

    public MountainBicycle(int speed, int gear) {
        super(speed, gear);
    }

    @Override
    public void speedUp(int increment) {
        this.speed+=2;
    }

    @Override
    public void brakeDown(int decrement) {
       this.speed-=2;
    }

    

    @Override
    public String toString() {
        return "MountainBicycle [speed=" + speed + ", gear=" + gear + "]";
    }
    

    

}
