package Q4;

class A {
    synchronized void methodA(B b) {
        System.out.println("Thread 1: Locked A");
        try { Thread.sleep(100); } catch (Exception e) {}
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last()");
    }
}

class B {
    synchronized void methodB(A a) {
        System.out.println("Thread 2: Locked B");
        try { Thread.sleep(100); } catch (Exception e) {
            e.printStackTrace();
        }
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B.last()");
    }
}