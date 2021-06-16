package Module_3_Tasks.Task_8;

import Module_3_Tasks.Task_6.Employee;

import java.util.TreeSet;

public class SortEmployeesWithTreeSet {
    public static void main(String[] args) {
        TreeSet<Employee> employeeTreeSet = new TreeSet<Employee>((Employee e1, Employee e2) ->
                e1.getEmployeeName().compareTo(e2.getEmployeeName()));

        employeeTreeSet.add(new Employee("Zack"));
        employeeTreeSet.add(new Employee("Christopher"));
        employeeTreeSet.add(new Employee("Quentin"));
        employeeTreeSet.add(new Employee("Martin"));
        employeeTreeSet.add(new Employee("Rajamouli"));

        System.out.println("Employees after sorting: ");
        employeeTreeSet.forEach((employeeName) -> System.out.println(employeeName));

    }

}
