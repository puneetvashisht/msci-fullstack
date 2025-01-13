package day3;

public class BakingDemo {

    public static void bake() throws InterruptedException{

        double randomValue = Math.random();
        System.out.println(randomValue);
        double timeTaken = randomValue * 10000;
        System.out.println(timeTaken);
        if(timeTaken > 5000.0){
            throw new RuntimeException("Couldn't bake in 5 seconds");
        }

        Thread.sleep((int)timeTaken);
        System.out.println("Pizza baked and served within time!");

    }

    public static void main(String[] args) {

        try{
            bake();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Rate Us!");
        }

        System.out.println("Allz well!");
        
    }
}
