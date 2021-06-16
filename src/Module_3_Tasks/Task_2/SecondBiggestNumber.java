package Module_3_Tasks.Task_2;

import java.util.ArrayList;
import java.util.Collections;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        SecondBiggestNumberInterface secBigNum = (ArrayList<Integer> integerArrayList) -> {
            Collections.sort(integerArrayList);
            int listSize=integerArrayList.size();
            Integer result = integerArrayList.get(listSize-2);
            System.out.println(result);
        };
        ArrayList<Integer> integerArrayList=new ArrayList<Integer>();
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(5);
        integerArrayList.add(7);
        integerArrayList.add(11);
        integerArrayList.add(13);
        integerArrayList.add(17);

        secBigNum.findSecondBiggestNumber(integerArrayList);
    }
}
