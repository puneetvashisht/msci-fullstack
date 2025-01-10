package day2;

public abstract class Employee implements Perks{
    int id;
    String name;
    double salaruy;
    public Employee(){

    }
    public Employee(int id, String name, double salaruy) {
        this.id = id;
        this.name = name;
        this.salaruy = salaruy;
    }

    public abstract void applyLeaves();

    public abstract void incrementSalary();

    public void outings(){
        System.out.println("outings!!");
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salaruy=" + salaruy + "]";
    }

    
}
