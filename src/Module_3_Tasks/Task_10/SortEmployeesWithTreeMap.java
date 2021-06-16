package Module_3_Tasks.Task_10;

import java.util.*;

public class SortEmployeesWithTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> employeeTreeMap = new TreeMap<Integer,String>();
        employeeTreeMap.put(1,"Zack");
        employeeTreeMap.put(2,"Christopher");
        employeeTreeMap.put(3,"Quentin");
        employeeTreeMap.put(4,"Martin");
        employeeTreeMap.put(5,"Rajamouli");

        EmployeeMapInterface employeeMapInterface = (TreeMap<Integer, String> input) ->
        {
            List<Map.Entry<Integer, String>> employeeList = new LinkedList<Map.Entry<Integer, String>>(input.entrySet());

            Collections.sort(employeeList, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

            HashMap<Integer, String> temp = new HashMap<Integer, String>();
            for (Map.Entry<Integer, String> entry : employeeList) {
                temp.put(entry.getKey(), entry.getValue());
            }
            return employeeList;
        };

        List<Map.Entry<Integer, String>> sortedEmployeeList = employeeMapInterface.sortEmployeeByName(employeeTreeMap);


        System.out.println("Employee list after sorting by name: " +sortedEmployeeList);
    }
}
