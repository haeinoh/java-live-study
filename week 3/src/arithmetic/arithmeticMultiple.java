package arithmetic;

public class arithmeticMultiple {
    public static void main(String[] args) {
        // 1. 일반적인 곱셈
        int num1 = 10;
        int num2 = 20;

        int res = num1 * num2;
        System.out.println(res); // 200

        // 2. 오버플로우
        int num3 = 123456;
        int num4 = 789123;
        long num5 = 789123;

        // int * int의 범위가 int형의 범위를 넘어가는 경우 오버플로우가 발생해서 올바른 결과를 얻을 수가 없다.
        System.out.println(num3 * num4); // -1362278720 (오버플로우)
        // int * long형의 경우 long타입의 연산이 되므로, 정상적인 결과를 얻을 수 있다.
        System.out.println(num3 * num5); // 97421969088 (정상 출력)
    }
}
