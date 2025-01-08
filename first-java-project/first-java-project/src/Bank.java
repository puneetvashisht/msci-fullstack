import java.util.ArrayList;

public class Bank {
    int code;
    String name;
    ArrayList<Branch> branches;
    public Bank(int code, String name, ArrayList<Branch> branches) {
        this.code = code;
        this.name = name;
        this.branches = branches;
    }
    @Override
    public String toString() {
        return "Bank [code=" + code + ", name=" + name + ", branches=" + branches + "]";
    }

    
}
