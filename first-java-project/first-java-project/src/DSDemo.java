import java.util.ArrayList;

public class DSDemo {
    public static void main(String[] args) {

        int scores[] = {23,45,56,76};

        for(int i=0; i<=scores.length;i++){
            System.out.println(scores[i]);
        }

        for(int score: scores){
            System.out.println(score);
        }


        // String apple = "Apple";
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

        
        // use a ds
        ArrayList list = new ArrayList();
        list.add("first");
        list.add("second item");
        list.add("first");
        list.add("second item");
        list.add("first");
        list.add("second item");


        System.out.println(list);

    }
}
