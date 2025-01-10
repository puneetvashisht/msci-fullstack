package day2;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");

         str1 = str1.replace("H", "T");

        if(str1 == str2){
            System.out.println("Same references");
        }

        if(str1.equals(str2)){
            System.out.println("Same values");
        }
    }
}
