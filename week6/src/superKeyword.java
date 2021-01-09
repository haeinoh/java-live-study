public class superKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.value = 10;
        c.print();
    }
}

class Parent {
    int value = 20;

}

class Child extends  Parent{
    int value;

    void print() {
        System.out.println("value : " + value);
        System.out.println("this : " + this.value);
        System.out.println("super : " + super.value);
    }
}