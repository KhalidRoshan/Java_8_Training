package Module_3_Tasks.Task_6;

public class Employee {
    public String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return (this.getEmployeeName());
    }
}
