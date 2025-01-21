package creational;

class Prototype implements Cloneable {
    private String name;

    public Prototype(String name) {
        this.name = name;
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    @Override
    public String toString() {
        return "Prototype{" + "name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        Prototype prototype1 = new Prototype("Original");
        try {
            Prototype prototype2 = prototype1.clone();
            System.out.println(prototype1); // Prototype{name='Original'}
            System.out.println(prototype2); // Prototype{name='Original'}
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}


