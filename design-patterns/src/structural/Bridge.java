package structural;

interface Color {
    String fill();
}

class RedColor implements Color {
    public String fill() {
        return "Red";
    }
}

class BlueColor implements Color {
    public String fill() {
        return "Blue";
    }
}

abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.println("Drawing Circle in " + color.fill());
    }
}

//The Bridge Pattern separates an abstraction from its implementation, allowing them to evolve independently.
class Bridge {
    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor());
        circle.draw(); // Drawing Circle in Red

    }
}