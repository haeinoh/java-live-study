package ExceptionHandling;

import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {

//        try {
//            //  예외 발생에 대비한 코드를 작성한다.
//        } catch(Exception1 e1) {
//            //  Exception1이 발생하였을 경우, 처리하는 코드를 작성한다.
//        } catch(Exception2 e2) {
//            // Exception2가 발생하였을 경우, 처리하는 코드를 작성한다.
//       }

//        try {
//            int num = 30 / 0;
//            System.out.println("num = " + num);
//        } catch(ArithmeticException e) {
//            System.out.println("예외발생");
//        }

        try{
            // 1. 먼저, new 연산자를 이용해 발생시키려는 예외 클래스의 객체를 생성한다.
            Exception e = new Exception("throw 키워드를 이용해 예외 발생");
            // 2. 키워드 throw를 이용해서 예외를 발생시킨다.
            throw e;
            
            // 1 + 2 과정을 합쳐서 한 줄로 쓸 수 있다.
//            throw new Exception("1+2 throw 키워드를 이용해 예외 발생");

        } catch(Exception e) {
            System.out.println("에러 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상종료");
    }
}
