package Module_9_Tasks;

public class Employee {

    String name;
    String account;
    int salary;

    public Employee(String name, String account, int salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("Employee: "+ this.getName() + " | Account : " + this.getAccount() + " | Salary : " + this.getSalary());
    }
}
