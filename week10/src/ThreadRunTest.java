public class ThreadRunTest {
    public static void main(String[] args) {
        Thread2 t2 = new Thread2();
        t2.run();
    }
}

class Thread2 extends Thread {
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