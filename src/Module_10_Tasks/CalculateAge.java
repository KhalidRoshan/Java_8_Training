package Module_10_Tasks;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class CalculateAge {

    public static void main(String args[]){

        //4. Write a Function to calculate the age of a person given date of birth.

        Function<LocalDate,Integer> calculateAge = (dateOfBirth) -> {
            LocalDate currentDate = LocalDate.now();
            int age = Period.between(dateOfBirth, currentDate).getYears();
            return age;
        };

        String birthday = "1998-07-23";
        LocalDate dateOfBirth = LocalDate.parse(birthday);
        System.out.println("Age of a person with date of birth " + birthday + " is " + calculateAge.apply(dateOfBirth));
    }
}
