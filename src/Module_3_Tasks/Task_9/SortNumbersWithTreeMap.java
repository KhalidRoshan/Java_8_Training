package Module_3_Tasks.Task_9;

import java.util.TreeMap;

public class SortNumbersWithTreeMap {
    public static void main(String[] args) {

        TreeMap<Integer,Integer> integerTreeMap = new TreeMap<Integer,Integer>((num1, num2) ->
                (num1>num2) ? -1 : (num1 < num2) ? 1 : 0);

        integerTreeMap.put(1,23131);
        integerTreeMap.put(2,54353);
        integerTreeMap.put(3,86757);
        integerTreeMap.put(4,67797);
        integerTreeMap.put(5,13232);

        System.out.println(integerTreeMap);
    }

}
