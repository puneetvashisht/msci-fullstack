package day1;

public class VarAgsDemo {
    public static void print(int x, int... numbers) {
        for(int n : numbers) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        
        print(1, 2, 3);
    }
}
