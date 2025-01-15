
package day5;

import java.util.ArrayList;
import java.util.List;

public class ThreadLamdas {
    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();

        for(int i=0;i<10;i++){
            Thread t = new Thread(()-> System.out.println("Task executed by " + Thread.currentThread().getName() ));
            t.start();
            threads.add(t);
            // t.join();
        }


        for(Thread t : threads){
            t.join();
        }
        

        // Thread t1 = new Thread(()-> System.out.println("Task executed by " + Thread.currentThread().getName() ));
        // t1.start();  
        // t1.join();
        


        System.out.println("Allz well " + Thread.currentThread().getName());
    }
}
