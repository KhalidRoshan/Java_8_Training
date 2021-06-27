package Module_10_Tasks;

import java.util.Date;
import java.util.TimeZone;
import java.util.function.Supplier;

public class ConvertTimeToEST {

    public static void main(String args[]){

        // 3. Write a Supplier to get CurrentTime in EST timezone

        Supplier<Date> convertToEST = () -> {
            TimeZone.setDefault(TimeZone.getTimeZone("EST"));
            return new Date();
        };

        System.out.println(convertToEST.get());

    }
}
