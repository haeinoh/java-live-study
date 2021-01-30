package java9Test;

public class TestClass implements TestInterface {
    @Override
    public void abstaractMethod() {
        System.out.println("abstarct method 입니다.");
    }

    public static void main(String[] args) {
        TestInterface t = new TestClass();
        System.out.println("====== abstarct 메서드 ======");
        t.abstaractMethod();
        System.out.println("====== default 메서드 ======");
        t.defaultMethod();
        System.out.println("====== static 메서드 ======");
        TestInterface.staticMethod();
    }
}
