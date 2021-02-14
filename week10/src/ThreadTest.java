public class ThreadTest {
    public static void main(String[] args) {
        // 1) Thread 클래스를 상속받아
        ThreadInh threadInh = new ThreadInh();

        // 2-1)Runnable 인터페이스를 구현
        Runnable r = new ThreadRun();
        // 위에서 생성한 인스턴스를 Thread 클래스의 생성장의 매개변수로 제공해야한다.
        Thread threadRun = new Thread(r);

        // 2-2) 위의 두 줄을 아래와 같이 한 줄로 표현 할 수 있다.
//        Thread threadRun = new Thread(new ThreadRun());

        // 쓰레드를 생성했다고 해서 자동으로 실행되는 것이 아니다.
        // start()를 호출해야만 쓰레드가 실행된다.
        threadInh.start();
        threadRun.start();
    }
    static class ThreadRun implements Runnable{
        // Runnable 인터페이스의 run()을 구현
        public void run() {
            // 상속받지 않기 때문에, Thread 클래스의 static 메소드인
            // currentThread()를 호출하여 쓰레드에 대한 참조를 얻어야 호출이 가능하다
            // Thread.currentThread() : 현재 실행중인 쓰레드의 참조 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
    static class ThreadInh extends Thread {
        //Thread 클래스의 run()을 오버라이딩
        public void run() {
            // Thread 클래스의 메소드를 직접 호출할 수 있다.
            // getName() : 쓰레드의 이름을 반환
            System.out.println(getName());
        }
    }

}
