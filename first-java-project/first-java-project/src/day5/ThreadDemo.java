package day5;

class Task implements Runnable{
    public void execute(){
        System.out.println("Run task by " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        this.execute();
    }
}

public class ThreadDemo {


    
    public static void main(String[] args) {
        
        System.out.println("Start.... " + Thread.currentThread().getName());

           // in b/w code 
        //    new Task().execute();
        Thread t = new Thread(new Task());
        t.start();
        Thread t1 = new Thread(new Task());
        t1.start();


        System.out.println("Finish.... " + Thread.currentThread().getName());


    }

}
