package day5;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ParallelSalaryIncrement {
    public static void main(String[] args) throws InterruptedException {
        
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee(21, "Ravi", 23233);
        Employee e2 = new Employee(22, "Shraddha", 343433);
        Employee e3 = new Employee(2, "Raj", 23433);
        Employee e5 = new Employee(2, "Raj", 23433);
        Employee e4 = new Employee(12, "Rajul", 43433);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        LocalTime startTime = LocalTime.now();
        System.out.println(startTime);

        List<Thread> threads = new ArrayList<>();

        for(Employee e: employees){
            Runnable r = new IncrementSalaryTask(e);
            Thread t = new Thread(r);
            t.start();
            threads.add(t);
            // e.incrementSalary();
          
        }

        for(Thread t : threads){
            t.join();
        }

        // try {
        //     Thread.sleep(3000);
        // } catch (InterruptedException e6) {
        //     // TODO Auto-generated catch block
        //     e6.printStackTrace();
        // }

        LocalTime endTime = LocalTime.now();
        System.out.println(endTime);

        Duration totalDuration = Duration.between(startTime, endTime);
        System.out.println("Total time in seconds " + totalDuration.getSeconds());

    }
}
