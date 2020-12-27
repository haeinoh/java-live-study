public class lambdaExpression {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("전통적인 방식");
            }
        }).start();

        new Thread(()->{
            System.out.println("람다 표현식을 사용한 방식");
        }).start();
    }
}
