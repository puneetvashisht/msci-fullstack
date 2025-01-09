package day1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(21, "Ravi", 23233);
        Employee e2 = new Employee(2, "Shraddha");

        System.out.println(e2);
        e2.setSalary(10000);
        System.out.println(e1.getSalary());
    }
}
