public class instnaceofOperator {
    public static void main(String[] args) {

        System.out.println("String" instanceof String); // true

        // String은 Object의 instance라고 할 수 있다.
        System.out.println("" instanceof Object); // true

        // null인 경우 언제나 false
        System.out.println(null instanceof Object); // false

    }

}

