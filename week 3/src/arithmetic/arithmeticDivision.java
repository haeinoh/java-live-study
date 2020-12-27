package arithmetic;

public class arithmeticDivision {
    public static void main(String[] args) {
        // 1. 일반적인 나눗셈
        int num1 = 40;
        int num2 = 20;

        int res = num1 / num2;
        System.out.println(res); //  2

        // 2. 나누는 수로 0을 사용할 수 없다.
        int num3 = 200;
        int num4 = 0;

        System.out.println(num3 / num4); // 컴파일은 되지만 0으로 나눌 수 없다.


    }
}
