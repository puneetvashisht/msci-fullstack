import java.util.ArrayList;
import java.util.HashMap;

public class TestBankSetup {
    public static void main(String[] args) {
        Branch branch1 = new Branch(123, false);
        Branch branch2 = new Branch(234, true);

        ArrayList<Branch> branches = new ArrayList<>();
        branches.add(branch1);
        branches.add(branch2);

        System.out.println(branches);

        Bank bank1 = new Bank(454, "ICICI", branches);
        System.out.println(bank1);

        HashMap<String, Bank> bankMap = new HashMap<>();
        bankMap.put("icici", bank1);

        System.out.println(bankMap);
    }
}
