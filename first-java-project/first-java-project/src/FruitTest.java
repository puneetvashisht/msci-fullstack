import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class FruitTest {
    public static void main(String[] args) {
        Fruit apple = new Fruit("apple");
        Fruit guava = new Fruit("guava");

        // Arrays
        // Fruit fruits[] = new Fruit[4];

        // ArrayList
        // ArrayList<Fruit> fruits = new ArrayList<>();
        // LinkedList<Fruit> fruits = new LinkedList<>();
        HashSet<Fruit> fruits = new HashSet<>();
        fruits.add(apple);
        fruits.add(guava);
        fruits.add(new Fruit("apple"));

        System.out.println(fruits);
        
        for(Fruit f : fruits){
            System.out.println(f);
        }

        Fruit toBeSearched = new Fruit("apple");
        boolean result = fruits.contains(toBeSearched);
        System.out.println(result);
    }
}
