public class realationalOperator {
    public static void main(String[] args) {
        // (1) <
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 < num2); // 10 < 20 : true
        // (2) <=
        int num3 = 10;
        int num4 = 10;

        System.out.println(num3 <= num4); // 10 <= 10 : true


        // (3) >
        //문자간의 비교 혹은 문자와 정수형간의 비교도 가능하다.
        char ch1 = 'A';
        char ch2 = 'B';

        System.out.println(ch1 > ch2); // 'A' < 'B' : false

        // (4) >=
        char ch3 = 'A';
        int num5 = 65;

        System.out.println(ch3 >= num5); // 'A' (65) >= 65 : true

        // 실수형 비교에서는 근사값때문에 오차가 발생할 수 있다.
        // (5) ==
        float fl = 0.1f;
        double dble = 0.1;

        // 0.1f와 0.1의 실제값은 다르다.
        System.out.println(fl == dble); // 0.1f != 0.1 : false

        // (6) !=
        float fl2 = 10.0f;
        double dble2 = 10.0;
        //하지만, 10.0f는 오차 없이 10.0이므로 double 타입과 같다라고 볼 수 있다.
        System.out.println(fl2 != dble2); // 10.0f == 10.0 : false


        // (7) .equlas()
        // 문자열은 문자나 정수 등과 다르게 '==' 비교연산자를 사용하지 않는다.
        String str = "hello";
        String str2 = "HELLO";

        System.out.println(str.equals(str2)); // 대소문자를 구분하기 때문에 false
        // (8) .equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase(str2)); // 대소문자를 구분하지 않기 때문에 true
    }
}
