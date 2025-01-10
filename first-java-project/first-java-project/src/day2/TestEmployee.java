package day2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee contractEmployee = new ContractEmployee(1, "Ajit", 23333);

        RegularEmployee regularEmployee = new RegularEmployee(3, "Radhika", 10000);


        Employee employees[] = {contractEmployee, regularEmployee};

        for(Employee employee: employees){
            System.out.println(employee);
            employee.incrementSalary();
            employee.applyLeaves();
            employee.outings();
            employee.mandatoryLeaves();
            System.out.println(employee);
        }
    }
}
