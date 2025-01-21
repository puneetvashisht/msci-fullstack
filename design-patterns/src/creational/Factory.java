package creational;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}

class Rectangle extends Shape {
    void draw() { System.out.println("Drawing Rectangle"); }
}

class ShapeFactory {
    public static Shape getShape(String type) {
        if ("CIRCLE".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        }
        return null;
    }
}


public class Factory {

    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw(); // Drawing Circle

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw(); // Drawing Rectangle

    }
    
}
