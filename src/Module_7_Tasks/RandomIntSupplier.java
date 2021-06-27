package Module_7_Tasks;

import java.util.Random;
import java.util.function.IntSupplier;

public class RandomIntSupplier {

    public static void main(String[] args) {
        IntSupplier supplier = () -> {
            Random r = new Random();
            int result = r.nextInt(5000);
            return result;
        };

        System.out.println(supplier.getAsInt());
    }
}
