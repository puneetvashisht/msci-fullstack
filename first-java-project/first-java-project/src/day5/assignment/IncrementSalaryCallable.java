package day5.assignment;

import java.util.concurrent.Callable;

public class IncrementSalaryCallable implements Callable<Double> {

    Employee employee;

    public IncrementSalaryCallable(Employee employee) {
        this.employee = employee;
    }

    @Override
    public Double call() throws Exception {
        this.employee.incrementSalary();
        // System.out.println(this.employee + " done by " + Thread.currentThread().getName());
        return this.employee.getSalary();   
    }
    
}
