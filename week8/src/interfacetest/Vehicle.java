package interfacetest;

public interface Vehicle {
    int maxNumberOfPassanger = 100;

    public abstract void countPassanger();
    public void pay();
    public void time();

    default void vehicleMethod() {
    }

    static void staticMethod() {
    }
}

/*
interface [인터페이스이름] {
   // public static final은 생략가능하다.
   // interface는 상수를 멤버로 허용한다.
   public static final 타입 상수명 = 값;

   // public abstract은 생략가능하다.
   // interface는 추상화 메서드를 멤버로 허용한다.
   public abstract void 메서드이름(매개변수);
}
*/
