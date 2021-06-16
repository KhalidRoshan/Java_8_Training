package Module_3_Tasks.Task_6;

import java.util.ArrayList;
import java.util.List;

public class SortEmployeeName {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Christopher"));
        employees.add(new Employee("Zack"));
        employees.add(new Employee("Quentin"));
        employees.add(new Employee("Martin"));
        employees.add(new Employee("Rajamouli"));

        System.out.println("Employee list before sorting:" + employees);
        employees.sort((Employee e1, Employee e2)->e1.getEmployeeName().compareTo(e2.getEmployeeName()));
        System.out.println("Employee list before sorting:" + employees);
    }
}
