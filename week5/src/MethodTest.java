public class MethodTest {
    public static void main(String[] args) {
        Location loc = new Location();
        loc.x = 3;
        loc.y = 5;

        loc.print(); // x는 3이고, y는 5이다
        System.out.println(loc.sum(4, 6)); // 10
    }
}

class Location {
    int x;
    int y;

    void print() {
        System.out.printf("x는 %d이고, y는 %d이다\n", x, y);
    }

    int sum(int num1, int num2) {
        return num1 + num2;
    }
}

class Variable {
    static int classVariable; // 클래스변수(static 변수)
    int instanceVariable; // 인스턴스변수(non-static 변수)

    void method() {
        int localVariable; // 지역변수
    }
}
