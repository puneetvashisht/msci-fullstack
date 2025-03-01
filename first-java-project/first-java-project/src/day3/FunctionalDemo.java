package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

interface  Condition {
    boolean test(Employee e);    
}

//  Condition c = (e)-> true; 

public class FunctionalDemo {

    public static void printInOneLoop(List<Employee> employees, Condition condition){
        for(Employee e: employees){
            if(condition.test(e)){
                System.out.println(e);
            }   
        }
    }
    public static void printInOneLoopWithPredicate(List<Employee> employees, Predicate<Employee> condition){
        for(Employee e: employees){
            if(condition.test(e)){
                System.out.println(e);
            }   
        }
    }   

    // public static void printWithNamesStartingR(List<Employee> employees){
    //     for(Employee e: employees){
    //         if(e.name.startsWith("R")){
    //             System.out.println(e);
    //         }   
    //     }
    // }    
    // public static void printWithSalaryGreaterTenThousand(List<Employee> employees){
    //     for(Employee e: employees){
    //         if(e.salary > 10000){
    //             System.out.println(e);
    //         }   
    //     }
    // }    
    // public static void printAll(List<Employee> employees){
    //     for(Employee e: employees){
    //         // if(e.salary > 10000){
    //             System.out.println(e);
    //         // }   
    //     }
    // }    

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee(21, "Ravi", 23233);
        Employee e2 = new Employee(2, "Shraddha", 343433);
        Employee e3 = new Employee(2, "Raj", 23433);
        Employee e4 = new Employee(2, "Rajul", 43433);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        employees.stream()
        .filter((e)-> e.name.startsWith("R"))
        .forEach((e) -> System.out.println(e));


        // Condition condition =  (e) -> false; 
        // Condition condition =  (e) -> e.name.startsWith("R"); 

        System.out.println(" ---- Names starting 'R' -----");
        // printWithNamesStartingR(employees);
        // printInOneLoop(employees, new ConditionWithNameR());
        printInOneLoopWithPredicate(employees, (e)-> e.name.startsWith("R"));
        
       
        System.out.println(" ---- Salary > 10000 -----");
        // printWithSalaryGreaterTenThousand(employees);
        // printInOneLoop(employees, new ConditionForSalary());

        // using anonymous classes
        // printInOneLoop(employees, new Condition() {

        //     @Override
        //     public boolean test(Employee e) {
        //         return e.salary > 10000;
        //     }
            
        // });
      
        // using lamdas
        printInOneLoopWithPredicate(employees, (e)-> e.salary > 30000);

        System.out.println(" ---- Print all -----");
        // printWithSalaryGreaterTenThousand(employees);
        printInOneLoopWithPredicate(employees, (e)->true);

    }

}
