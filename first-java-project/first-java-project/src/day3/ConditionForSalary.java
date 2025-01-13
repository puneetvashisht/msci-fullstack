package day3;

public class ConditionForSalary implements Condition{

    @Override
    public boolean test(Employee e) {
       return e.salary > 30000;
    }
    
}
