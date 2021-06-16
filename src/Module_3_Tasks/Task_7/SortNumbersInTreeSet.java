package Module_3_Tasks.Task_7;

import java.util.TreeSet;

public class SortNumbersInTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> integerTreeSet = new TreeSet<Integer>((num1, num2) ->  (num1>num2) ? -1 : (num1 < num2) ? 1 : 0);

        integerTreeSet.add(3);
        integerTreeSet.add(5);
        integerTreeSet.add(7);
        integerTreeSet.add(11);
        integerTreeSet.add(1);

        System.out.println("TreeSet after sorting: " + integerTreeSet);
    }
}
