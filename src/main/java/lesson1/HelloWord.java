package lesson1;

/**
 * Created by lizandro on 19/08/15.
 */
public class HelloWord {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread() {
            public void run() {
                System.out.println("Hello from new thread");
            }
        };

        //myThread.sleep(1000);
        Thread.yield();
        myThread.start();
        //myThread.yield();
        //Thread.sleep(1000);
        //para ceder el proceso principal
        System.out.println("Hello from main thread");
        myThread.join();

    }
}
