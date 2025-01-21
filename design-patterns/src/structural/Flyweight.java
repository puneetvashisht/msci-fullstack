package structural;

import java.util.HashMap;

class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}

class Circle {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing Circle with color: " + color);
    }
}

//The Flyweight Pattern minimizes memory usage by sharing as much data as possible among similar objects.

public class Flyweight {

    public static void main(String[] args) {
        Circle circle1 = ShapeFactory.getCircle("Red");
        circle1.draw(); // Creating circle of color: Red

        Circle circle2 = ShapeFactory.getCircle("Red");
        circle2.draw(); // No new creation

    }
    
}
