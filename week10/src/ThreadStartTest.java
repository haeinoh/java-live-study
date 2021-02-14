public class ThreadStartTest {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}
class Thread1 extends Thread {
    public void run() {
        throwException();
    }
    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
