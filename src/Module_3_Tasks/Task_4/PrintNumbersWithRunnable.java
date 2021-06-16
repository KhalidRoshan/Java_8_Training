package Module_3_Tasks.Task_4;

public class PrintNumbersWithRunnable {
    public static void main(String args[]){
        Runnable t1 = () -> {
            System.out.println("Starting Thread t1 ...");
            for(int i = 1; i <= 5; i++) {
                System.out.println("Thread t1 with i = "+ i);
            }
            System.out.println("Exiting Thread t1 ...");
        };

        Runnable t2 = () -> {
            System.out.println("Starting Thread t2 ...");
            for(int j = 1; j <= 5; j++) {
                System.out.println("Thread t2 with j = "+ j);
            }
            System.out.println("Exiting Thread t2 ...");
        };

        new Thread(t1).start();
        new Thread(t2).start();
    }
}
