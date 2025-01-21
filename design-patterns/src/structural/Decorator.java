package structural;

interface Car {
    void assemble();
}

class BasicCar implements Car {
    public void assemble() {
        System.out.print("Basic Car");
    }
}

class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public void assemble() {
        this.car.assemble();
    }
}

class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.print(" + Adding features of Sports Car");
        // add specifics
    }
}


public class Decorator {

    //The Decorator Pattern adds new behavior to an object dynamically without modifying its structure.
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble(); // Basic Car + Adding features of Sports Car

    }
    
}
