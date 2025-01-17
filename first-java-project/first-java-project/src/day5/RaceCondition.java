package day5;

class IncrementTask implements Runnable {

    public int counter = 0;

    public  void increment() {
        synchronized (this) {
            counter += 1;
        }
        
    }

    @Override
    public void run() {
       
            increment();
        
    }
}

public class RaceCondition {

    
public static void main(String[] args) throws InterruptedException {

    IncrementTask r = new IncrementTask();

    for(int i = 0; i < 10000; i++) {
        Thread t = new Thread(r);
        t.start();
    }

    Thread.sleep(5000);

    

    System.out.println(r.counter);
    
}

}
