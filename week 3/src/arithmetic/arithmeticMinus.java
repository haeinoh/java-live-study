package arithmetic;

public class arithmeticMinus {
    public static void main(String[] args) {
        // 1. 일반적인 뺄셈
        int num1 = 10;
        int num2 = 20;

        int res = num1 - num2;
        System.out.println(res); // -10

        // 2. 문자 뺄셈
        char ch  = 'Z'; // 90
        char ch2 = 'D'; // 68

        System.out.println(ch - ch2); //22

        char ch3 = '9'; // 57
        char ch4 = '2'; // 50

        System.out.println(ch3 - ch4); //7

//        char res2 = ch4 - 1;  // 컴파일 에러 발생 (형 변환이 필요하다)

        char res3 = 'b' - 1; // 리터럴 간의 연산이므로 컴파일러가 컴파일 시 적절하게 수행한다
        System.out.println(res3); // a
    }
}
