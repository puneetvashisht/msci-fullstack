package day1;

import java.util.ArrayList;

public class TestInheritance {

    public static Vehicle brakeDown(Vehicle v){
        return v;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle(10);
        v.start();
        System.out.println(v);

        Car c = new Car(200, "Fiat", "White");
        c.start();
        System.out.println(c.toString());

        Plane p = new Plane(1000, 300);
        p.start();
        p.fly();
        System.out.println(p);

        // upcasting..
        byte b = 34;
        int i = b;

        // downcasting .. explicit
        b = (byte)i;

        Vehicle v1 = c;
        v1.start();
        System.out.println(v1);

        // Vehicle vehicles [] = {v, c, p};
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(v);
        vehicles.add(c);
        vehicles.add(p);
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

    }
}
