package Q3;

public class VolatileDemo  extends Thread{
    volatile boolean running = true;

    public void run() {
        System.out.println("Thread started...");
        while (running) {
        }
        System.out.println("Thread stopped.");
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileDemo t = new VolatileDemo();
        t.start();

        Thread.sleep(1000);
        t.running = false;
        System.out.println("Flag changed to false.");
    }
}
