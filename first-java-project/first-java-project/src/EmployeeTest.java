public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee( 34, "Ravi", 34343);
        // employee.id =34;
        // employee.name="Ravi";
        // employee.salary=34343;

        System.out.println(employee);
        // System.out.println(employee.salary);

        employee.incrementSalary(5000);
        System.out.println(employee);
    }
}
