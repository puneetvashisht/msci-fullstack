package day5.assignment;

public class Employee {
    int id;
    String first_name;
    String last_name; 
    String email;
    String gender;
    String ip_address;
    String country_code;
    double salary;

    // constructors
    public Employee(int id, String first_name, String last_name, String email, String gender, String ip_address, String country_code, double salary) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ip_address = ip_address;
        this.country_code = country_code;
        this.salary = salary;
    }

    public void incrementSalary(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.salary *= 1.1;
    }

    public Employee() {
        //TODO Auto-generated constructor stub
    }

    // getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
                + ", gender=" + gender + ", ip_address=" + ip_address + ", country_code=" + country_code + ", salary="
                + salary + "]";
    }
    


}
