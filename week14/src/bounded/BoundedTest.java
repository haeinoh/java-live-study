package bounded;

public class BoundedTest {
    public static void main(String[] args) {
        int res1 = Util.compare(10, 20);
        System.out.println(res1); // -1

        int res2 = Util.compare(8.3, 6.2);
        System.out.println(res2); // 1

//        String res3 = Util.compare("20", "30");
//        System.out.println(res3);
    }
}
