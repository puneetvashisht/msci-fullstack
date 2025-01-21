package structural;


import java.util.ArrayList;
import java.util.List;

interface Employee {
    void showDetails();
}

class Developer implements Employee {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Developer: " + name);
    }
}

class Manager implements Employee {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Manager: " + name);
    }
}

class CompanyDirectory implements Employee {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showDetails() {
        for (Employee emp : employees) {
            emp.showDetails();
        }
    }
}

//The Composite Pattern lets you compose objects into tree structures to represent part-whole hierarchies.
public class Composite {
    public static void main(String[] args) {
        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(new Developer("John"));
        directory.addEmployee(new Manager("Smith"));

        directory.showDetails();
        // Developer: John
        // Manager: Smith

    }
}
