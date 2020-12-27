package arithmetic;

public class arithmeticModulo {
    public static void main(String[] args) {
        // 1. 일반적인 나눗셈에서의 나머지 값
        int num1 = 9;
        int num2 = 2;

        int res = num1 % num2;
        System.out.println(res); //  1

        // 2. 나누는 수로 0을 사용할 수 없다.
        int num3 = 200;
        int num4 =10;

        System.out.println(num3 / num4); // 컴파일은 되지만 0으로 나눌 수 없다.

        // 3. 나누는 수로 음수를 허용한다. 부호는 무시된다
        int num5 = 20;
        int num6 = -7;

        System.out.println(num5 % num6); // 6
    }

}
