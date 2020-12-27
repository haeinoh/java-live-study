public class LogicalOperator {
    public static void main(String[] args) {
        // (1) &&
        int num = 10;

        // 둘 다 true여야지만 결과값으로 true를 얻을 수 있다.
        System.out.println(num <= 10 && num >= 15); // true && false => false

        // (2) ||
        char ch = 'P';

        // 둘 중 하나만 true이어도 결과값으로 true를 얻을 수 있다.
        System.out.println(ch >= 'E' || ch <= 'C'); // true || false => true

        // (3) !
        boolean flag = true;

        // !를 붙이면 true는 false로, false는 true로 결과값을 반환하게 된다.
        System.out.println(!flag); // false
        System.out.println(!!flag); // true
    }
}
