package ExceptionHandling;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class CustomExceptionTest {
    public static void main(String[] args) {
        CustomExceptionTest test = new CustomExceptionTest();
        try {
            MyException e = new MyException("커스텀 exception");
            throw e;
        } catch (MyException e) {
            System.out.println("MyException");
            System.out.println("msg : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
