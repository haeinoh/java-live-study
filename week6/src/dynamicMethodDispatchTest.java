public class dynamicMethodDispatchTest {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.eat(); // 동물이 음식을 먹는다.
        // upcasting
        // 실행될 때 재정의 된 메소드를 찾아간다.
        Animal cat = new Cat();
        cat.eat(); // 개가 음식을 먹는다.
    }
}

class Animal {
    void eat() {
        System.out.println("동물이 음식을 먹는다.");
    }
}

class Cat extends Animal {
    // override(재정의)
    // 동적바인딩 : 호출될 메서드가 실행시점에서 결정되는 바인딩을 의미한다.
    // 컴파일 시점에서는 부모를 보고 있지만, 실행시점에서는 자식(필요한 메서드)을 보고 있을 수 있다.
    void eat() {
        System.out.println("개가 음식을 먹는다.");
    }
}


