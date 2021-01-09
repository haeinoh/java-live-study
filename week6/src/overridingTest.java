import java.io.IOException;

public class overridingTest {
    public static void main(String[] args) {

    }
}

class Parent {
    void print(){
        ....
    }
}

class Child extends Parent {
    void print() { // 오버라이딩
        ....
    }
    void print(int num) { // 오버로딩
        ....
    }
}
