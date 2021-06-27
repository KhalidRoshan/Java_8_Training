package Module_10_Tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Supplier;

public class GetNextThursday {

    public static void main (String args[]){

        //2. Write a Supplier to get Date for next Thursday.
        
        Supplier<LocalDate> getNextThursday=()->{
            LocalDate currentDate = LocalDate.now();
            System.out.println("Today's date: " + currentDate);
            return currentDate.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        };

        System.out.println("Next Thursday is on: " + getNextThursday.get());
    }
}
