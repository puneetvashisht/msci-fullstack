package day1;

public class TestInheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(10);
        v.start();
        System.out.println(v);

        Car c = new Car(200, "Fiat", "White");
        c.start();
        System.out.println(c.toString());

    }
}
