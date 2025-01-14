package day4;

@FunctionalInterface
interface  Greeting {
    void sayHello(String message);
}

class JapaneseGreeting implements Greeting{
    @Override
    public void sayHello(String message) {
        System.out.println("Konnichiwa! " + message);
    }
}

class FrenchGreeting implements Greeting{
    @Override
    public void sayHello(String message) {
        System.out.println("Bonjour! " + message);
    }
}

public class FunctionalDemo {

    public static void greet(Greeting greeting){
        // supports greeting in different languages
        greeting.sayHello("Priya");
    }
    

    public static void main(String[] args) {
        // using subclasses
        greet(new JapaneseGreeting());
        greet(new FrenchGreeting());

        // use anonymous class
        greet(new Greeting() {
             @Override
            public void sayHello(String message) {
                System.out.println("Namaste! " + message);
            }    
        });

        // Greeting marathiGreeting = (s) -> System.out.println("Namaskar! " + s);
        // greet(marathiGreeting);

        greet(s-> System.out.println("Namashkar! " + s));
    }

}
