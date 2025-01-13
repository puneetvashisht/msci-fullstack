package day3;

public class ConditionWithNameR implements Condition{

    @Override
    public boolean test(Employee e) {
       return e.name.startsWith("R");
    }
    
}
