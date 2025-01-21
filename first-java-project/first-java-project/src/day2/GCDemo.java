package day2;

public class GCDemo {
    public static void main(String[] args) throws InterruptedException {
        
        // String str = "";
        StringBuffer str = new StringBuffer("");

        // str.append("abc").append(34.34).append(343434l).toString()

        for(int i=0;i<1000000000;i++){
            Thread.sleep(2);
            str.append(i);
        }
        System.out.println(str.toString());

    }
}
