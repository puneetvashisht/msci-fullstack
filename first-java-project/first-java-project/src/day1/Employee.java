package day1;

public class Employee {

    int id;
    String name;
    private double salary;

    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary > 0)
            this.salary = salary;
    }
    public Employee(){

    }
    public Employee(int id, String name){
        super();
        this.id = id;
        this.name = name;
    }
    public Employee(int id, String name, double salary) {
        // this.id = id;
        // this.name = name;
        this(id, name);
        
        this.salary = salary;
        
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    


}
