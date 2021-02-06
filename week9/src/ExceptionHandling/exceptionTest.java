package ExceptionHandling;

public class exceptionTest {
    public static void main(String[] args) {
//        throw new Exception();

//        throw new RuntimeException();

        try {
            System.out.println("나누기 : " + (12/0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("예외 메시지 : " + e.getMessage());
        }
    }
}
