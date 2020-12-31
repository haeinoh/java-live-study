public class CarTest {
    public static void main(String[] args) {
        // (1) Car라는 클래스 타입의 car라는 참조변수를 선언
        Car car;

        // (2) 인스턴스를 생성하고, 참조변수 car에 저장한다.
        car = new Car();
        // Car car = new Car(); //이렇게 인스턴스 생성과 동시에 참조변수에 저장할 수도 있다.

        // (3) Car인스턴스의 멤버 변수(name)에 접근해 "자동차"라고 값을 저장한다.
        car.name = "자동차";

        // (4) Car인스턴스의 메소드(print)에 접근하여 호출한다.
        car.print();


        // 객체배열 carArr를 생성한다.
        Car carArr[] = new Car[3];

        // 객체를 생성해서 carArr 배열의 각 요소에 저장한다.
        carArr[0] = new Car();
        carArr[1] = new Car();
        carArr[2] = new Car();

    }
}
class Car {
    // 객체의 속성 (field)
    String name;
    String color;
    int price;

//    // 생성자 (Constructor)
//    Car (String n, String c, int p) {
//        name = n;
//        color = c;
//        price = p;
//    }

    // 객체의 동작 (method)
    void print() {
        System.out.println("자동차의 이름 : " + name);
        System.out.println("자동차의 색깔 : " + color);
        System.out.println("자동차의 가격 : " + price);
    }
}
