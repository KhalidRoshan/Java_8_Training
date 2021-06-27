package Module_7_Tasks;

import java.util.function.IntConsumer;

public class SquareConsumer {
    public static void main(String[] args) {
        IntConsumer calculateSquare = (number) -> { System.out.println(number * number); };
        calculateSquare.accept(5);
    }
}
