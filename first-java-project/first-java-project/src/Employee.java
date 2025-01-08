public class Employee {
    // fields
    int id;
    String name;
    double salary;

    public Employee(int id, String firstName, double salary){
        this.id = id;
        this.name = firstName;
        this.salary = salary;
    }

    // methods
    double incrementSalary(double incremntByAmount){
        this.salary =  this.salary + incremntByAmount;
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    // public String toString(){
    //     return "Employee: " + this.name + " salary: " + this.salary;
    // }

    
    // public static void main(String[] args) {
    //     Employee employee = new Employee();
    //     employee.id =34;
    //     employee.name="Ravi";
    //     employee.salary=34343;

    //     System.out.println(employee.name);
    //     System.out.println(employee.salary);

    //     employee.incrementSalary(5000);
    //     System.out.println(employee.salary);
    // }

}
