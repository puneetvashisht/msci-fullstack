package day4;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {
    

    public static void main(String[] args) {
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

        //stream 
        // 0 to many intermediate operations
        // terminal operation

        employees.stream()
        .filter((e)-> e.name.startsWith("R"))
        // .skip(1)
        // .limit(2)
        .distinct()
        .map(e -> e.name)
        .forEach(e-> System.out.println(e));
    }
}
