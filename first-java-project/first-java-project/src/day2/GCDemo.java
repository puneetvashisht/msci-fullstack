package day2;

public class GCDemo {
    public static void main(String[] args) throws InterruptedException {
        
        // String str = "";
        StringBuffer str = new StringBuffer("");

        for(int i=0;i<1000000000;i++){
            Thread.sleep(2);
            str.append(i);
        }
        System.out.println(str.toString());

    }
}
