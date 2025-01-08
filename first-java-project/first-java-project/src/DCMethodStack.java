public class DCMethodStack {

    public static void m1(){
        m1();
    }
    
    public static void main(String[] args) {
        m1();
    }
}
