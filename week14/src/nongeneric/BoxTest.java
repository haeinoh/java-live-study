package nongeneric;

public class BoxTest {
    public static void main(String[] args) {
        Box n = new Box();
        n.set("Hello World");
        String str = (String) n.get(); // 타입변환

        n.set(123);
        Integer num = (Integer) n.get(); // 타입변환
    }
}
