package ExceptionHandling;

public class tryCatchFinallyTest {
    static void method() {
        try {
            System.out.println("method()의 try문 실행");
            return;
        } catch(Exception e) {
           e.printStackTrace();             
        } finally {
            System.out.println("finally블럭 실행");
        }
    }
    public static void main(String[] args) {
        method();
        System.out.println("method() 마침");
    }
}
        /*try {
            // 예외가 발생할 가능성이 있는 문장
        } catch (Exception e){
            // try문 내에서 발생하는 예외를 처리하기 위한 문장
        } finally {
            // 예외 발생여부에 관계없이 항상 수행되어야 하는 문장
        }*/
