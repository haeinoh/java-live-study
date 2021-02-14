public class DeadlockTest {
    static final String resource1 = "resource1";
    static final String resource2 = "resource2";

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }

    static class Thread1 extends Thread {
        public void run() {
            synchronized (resource1) {
                System.out.println("Thread 1 : locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1 : locked resource 2 ");
                }
            }
        }
    }

    static class Thread2 extends Thread {
        public void run() {
            synchronized (resource2) {
                System.out.println("Thread 2 : locked resource 2");
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread 2 : locked resource 1");
                }
            }
        }
    }
}
