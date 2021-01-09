public class abstractTest {
    public static void main(String[] args) {
        Job p = new Programmer();
        Job d = new Designer();
        p.work();
        d.work();
    }
}

abstract class Job {
    abstract void work();
}

class Programmer extends Job {
    void work() { // 재정의
        System.out.println("프로그래머는 일을 한다.");
    }
}

class Designer extends Job {
    void work() { // 재정의
        System.out.println("디자이너는 일을 한다.");
    }
}
