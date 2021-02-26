package method;

import generic.Box;

public class BoxMethodTest {
    public static void main(String[] args) {
        //1. 구체적인 타입파라미터 지정
        Box<String> box1 = Util.<String>boxing("Hello World");
        String str = box1.get();

        //2. 컴파일러가 타입파라미터 추정
        Box<Integer> box2 = Util.boxing(100);
        Integer num = box2.get();
    }
}
