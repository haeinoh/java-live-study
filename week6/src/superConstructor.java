public class superConstructor {
    public static void main(String[] args) {
        Car c = new Car("Sonata", 2020, 29000000);
    }
}

class Vehicle {
    String name;
    int year;

    Vehicle(){ // 생성자 Vehicle()을 추가해주거나
    }

    Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }
}

class Car extends Vehicle{
    int price;
    Car(String name, int year, int price) {
        super(name, year); // Vehicle(String name, int year)를 호출하도록 해야한다.
        this.price = price;
    }
}

