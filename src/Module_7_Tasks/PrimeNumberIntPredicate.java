package Module_7_Tasks;

import java.util.function.IntPredicate;

public class PrimeNumberIntPredicate {

    public static void main(String[] args) {

        IntPredicate primeNumberCheck = (number) -> {

            int flag = 0;
            boolean result = false;
            int m = number / 2;

            if (number == 0 || number == 1)
                System.out.println(number + " is not a prime number");

            else {
                for (int i = 2; i <= m; i++) {
                    if (number % i == 0) {
                        System.out.println(number + " is not a prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(number + " is a prime number");
                    result = true;
                }
            }

            return result;
        };

        System.out.println(primeNumberCheck.test(11));
    }
}
