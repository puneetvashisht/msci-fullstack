package day1;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int tempretures[] = {23,44,5,66,42,23};

        Arrays.sort(tempretures);


        int total = 0;
        for(int tempreture: tempretures){
            System.out.println(tempreture);
            total+=tempreture;
        }
        System.out.println(total / tempretures.length);

        System.out.println(tempretures[tempretures.length-1]);
    }
}
