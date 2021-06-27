package Module_8_Tasks;

public class ConstructorsReferenceTask {

    public static void main(String args[]){
        EmployeeInterface employeeInterface = Employee::new;
        Employee employee = employeeInterface.get("John Doe","TR",10000);
        System.out.println("Employee added:\n" + employee);
    }
}