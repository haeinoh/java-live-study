package arithmetic;

public class arithmeticPlus {
    public static void main(String[] args) {
        // 1. 일반적인 덧셈
        int num1 = 10;
        int num2 = 20;

        int res = num1 + num2;
        System.out.println(res); // 30

        // 2. 타입이 다른 두 피연산자간의 덧셈
        // (1) byte + byte (int형 보다 크기가 작은 타입 인 경우)
        byte num3 = 10;
        byte num4 = 15;
        // byte는 int형보다 크기가 작은 타입이므로 int형으로 변환 된 후
        // 연산을 수행하게 된다.
        System.out.println(num3 + num4); // 25

        // (2) int + long (int형 보다 크기가 큰 long 타입이 있을 경우)
        int num5 = 10;
        long num6 = 25;

        // int형 보다 크기가 큰 long 타입과의 연산에서는 long 타입으로 변환 후
        // 연산을 수행하게 된다.
        System.out.println(num5 + num6); // 35

        // (3) 실수형 + 정수형
        int num7 = 20;
        double num8 = 10;

        // 크기가 더 큰 실수 타입으로 변환된 후 연산을 수행하게 된다.
        System.out.println(num7 + num8); // 30.0

        // 3. 문자열 간의 덧셈
        String str= "Hello";
        String str2 = "World";

        System.out.println(str + str2); // HelloWorld

        int str3 = 2020;
        // 문자열 + int형인 경우 문자열로 변환되어 문자열처럼
        // 연산을 수행하게 된다.
        System.out.println(str + str3); // Hello2020
    }
}
