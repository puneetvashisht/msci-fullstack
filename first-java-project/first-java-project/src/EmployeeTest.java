import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee( 34, "Ravi", 34343);
        Employee employee2 = new Employee( 4, "Priya", 44343);
        // employee.id =34;
        // employee.name="Ravi";
        // employee.salary=34343;

        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(34, employee);
        employeeMap.put(4, employee2);
        Set<Integer> keys = employeeMap.keySet();
        System.out.println(keys);

        System.out.println(employee);
        // System.out.println(employee.salary);

        employee.incrementSalary(5000);
        System.out.println(employee);
    }
}
