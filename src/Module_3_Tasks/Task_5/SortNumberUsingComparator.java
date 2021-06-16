package Module_3_Tasks.Task_5;


import java.util.*;

public class SortNumberUsingComparator {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(23,11,17,2,45);

        System.out.println("List before sorting in reverse: " + list);

        Collections.sort(list, ((num1, num2) -> num2.compareTo(num1)));
        System.out.println("List after sorting in reverse: " + list);
    }
}
