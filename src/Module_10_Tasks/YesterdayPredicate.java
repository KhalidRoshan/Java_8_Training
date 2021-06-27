package Module_10_Tasks;

import java.time.LocalDate;
import java.util.function.Predicate;

public class YesterdayPredicate {

    public static void main(String args[]) {

        // 1. Write a predicate to check if the given date is yesterday date.

        Predicate<LocalDate> checkIfYesterday = (date) -> {
            LocalDate yesterday = LocalDate.now().minusDays(1);
            return yesterday.equals(date);
        };

        String date = "2021-06-26";
        LocalDate dateToCheck = LocalDate.parse(date);

        if(checkIfYesterday.test(dateToCheck))
            System.out.println(date + " was yesterday.");
        else
            System.out.println(date + " was not yesterday.");
    }
}
