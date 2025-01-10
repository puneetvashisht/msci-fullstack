package day2;

public class RegularEmployee extends Employee {

    double bonus;

    public RegularEmployee(int id, String name, double salaruy) {
        super(id, name, salaruy);
    }

    public void incrementSalary(){
        this.salaruy*=1.15;
    }
    
    
    @Override
    public void applyLeaves() {
       System.out.println("3 monthly leaves..");
    }

    @Override
    public void mandatoryLeaves() {
        System.out.println("0 days mandatory leaves");
    }
   
}
