package Q2;

public class SyncDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Runnable task = () -> {
            printer.printDoc("PDF");
            printer.printWithBlock("Word");
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();
    }
}

class Printer{
    public synchronized void printDoc(String doc) {
        System.out.println(Thread.currentThread().getName() + " printing: " + doc);
    }

    public void printWithBlock(String doc) {
        synchronized(this) {
            System.out.println(Thread.currentThread().getName() + " block printing: " + doc);
        }
    }
}
