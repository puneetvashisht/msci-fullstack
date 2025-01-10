package day2;

public abstract class Bicycle implements IBicycle {

    int speed;
    int gear;
    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    @Override
    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    @Override
    public String toString() {
        return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
    }

    

}
