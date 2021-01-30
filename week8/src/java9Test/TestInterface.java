package java9Test;

public interface TestInterface {

    // 일반적인 추상 메서드
    void abstaractMethod();

    // default 메서드
    default void defaultMethod() {
        privateMethod(); // private method는 default 메서드에서 사용할 수 있다.
        privateStaticMethod(); // private static method는 다른 non-static 메서드에서 사용할 수 있다.
        System.out.println("default 메서드 입니다");
    }

    // static 메서드
    static void staticMethod() {
        privateStaticMethod(); // private static method는 다른 static 메서드에서 사용할 수 있다.
        System.out.println("static 메서드 입니다.");
    }

    // private 메서드
    private void privateMethod() {
        System.out.println("private 메서드 입니다.");
    }

    // private static 메서드
    private static void privateStaticMethod() {
        System.out.println("private static 메서드 입니다.");
    }
}
