package generic;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> s = new Box<>();
        s.set("Hello World");
        String str = s.get();
        // 자바 6 이전
//        Box<Integer> i = new Box<Integer>();
        // 자바 7 이후
        Box<Integer> i = new Box<>();
        i.set(123);
        Integer num = i.get();
    }
}
