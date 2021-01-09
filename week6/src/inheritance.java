
public class inheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.print();


    }
}

class Animal {
    String name;
    int age;

    void print() {
        System.out.printf("name : %s, age : %d", name, age);
    }
}

class Cat extends Animal {
    int jump;
    void print() { // 오버라이딩
        System.out.printf("name : %s, age : %d, jump : %d", name, age, jump);
    }
}

//class Car {
//
//}
//class Vehicle {
//
//}
//
//class Sonata extends Car, Vehicle {
//
//}
