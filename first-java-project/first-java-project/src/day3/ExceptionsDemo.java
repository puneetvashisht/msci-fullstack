package day3;

public class ExceptionsDemo {

    public static void m2(int x) {
        if (x == 0) {
            // explicit throw an exception
            throw new RuntimeException("X isn;t suppied with right value!");
        }
        String str = "";
        int z = 34;
        int result = z / x;
        str.concat(result + "");
        System.out.println(result);
    }

    public static void m1() {

        m2(0);

        System.out.println("M1 execution");

    }

    public static void main(String[] args) {
        try {
            m1();
        }
        // } catch (ArithmeticException e) {
        //     System.out.println("input x shouldn't be zero!");
        //     e.printStackTrace();
        //     m2(1);
        // } catch (NullPointerException e) {
        //     e.printStackTrace();
        // }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Allz well that ends well!");
    }

}
