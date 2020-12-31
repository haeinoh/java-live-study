public class constructorTest {
    public static void main(String[] args) {
        Data data = new Data();
    }
}

class Data {
    int x;
    int y;
    String str;

    Data() { }// 매개변수가 없는 생성자

    Data(int x, int y, String str) { //매개변수가 있는 생성자
        this.x = x;
        this.y = y;
        this.str = str;
    }
}

