package ExceptionInJava.checkedExceptionHandle;

public class HandleUsingtryCatch {
    public static void main(String[] args) {
        Thread sleepingThread = new Thread(() -> {
            try {
                System.out.println("Thread: Going to sleep for 5 seconds...");
                Thread.sleep(1000);
                System.out.println("Thread: Woke up naturally!");
            } catch (InterruptedException e) {
                System.out.println("Thread: I was interrupted!");
            }
        });

        sleepingThread.start();

        // Interrupt the thread after 2 seconds
        try {
            Thread.sleep(2000); // Main thread sleeps
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main: Interrupting the sleeping thread...");
        sleepingThread.interrupt(); // This interrupts the sleeping thread
    }
}
