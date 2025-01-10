package day2;

public class ContractEmployee extends Employee{

    double bonus;

    public ContractEmployee(int id, String name, double salaruy) {
        super(id, name, salaruy);
    }

    public void incrementSalary(){
        this.salaruy+=5000;
    }

    @Override
    public void applyLeaves() {
       System.out.println("2 monthly leaves..");
    }

    @Override
    public void mandatoryLeaves() {
        System.out.println("15 days mandatory leaves");
    }
    
}
