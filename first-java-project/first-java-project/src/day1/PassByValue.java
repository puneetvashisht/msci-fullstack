package day1;

class Num{
    int n;

    public Num(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Num [n=" + n + "]";
    }
    
}

public class PassByValue {

    private static void changeX(int y) {
        y = y + 1;
    }
    private static void changeX(Num y) {
        y.n = y.n + 1;
    }

    public static void main(String[] args) {
        // int x = 5;
        Num x = new Num(5);
        changeX(x);
        System.out.println(x.n);
            
    }    
           

}
