import java.util.ArrayList;

public class DSLinearSearch {
    public static void main(String[] args) {
        String fruits[] = new String[3];
        fruits[0] = "apple";
        fruits[1] = "guava";
        fruits[2] = "mango";
        // fruits[3] = "pineapple";

        String searchForFruit = "mango";

        for(int i=0;i<fruits.length; i++){
            // System.out.println(fruits[i]);
            if(searchForFruit.equals(fruits[i])){
                System.out.println("Found!");
            }    

        }

        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("mango");

        fruitsList.contains("apple");
    }
}
