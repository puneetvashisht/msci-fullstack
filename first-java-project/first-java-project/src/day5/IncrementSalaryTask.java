package day5;

public class IncrementSalaryTask implements Runnable {

    Employee employee;

    public IncrementSalaryTask(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void run() {
       // Employee and increment salary
       this.employee.incrementSalary();
       System.out.println(this.employee + " done by " + Thread.currentThread().getName());
    }
    
}
