import org.w3c.dom.ls.LSOutput;

public class assignmentOperator {
    public static void main(String[] args) {
        // (1) =
        int value = 10;
        // (2) +=
        System.out.println(value += 1); // 11
        // (3) -=
        System.out.println(value -= 1); // 10
        // (4) *=
        System.out.println(value *= 2); // 20
        // (5) /=
        System.out.println(value /= 2); // 10
        // (6) %=
        System.out.println(value %= 6); // 4
        // (7) <<=
        System.out.println(value << 1); // 8
        // (8) >>=
        System.out.println(value >> 1); // 2
        // (9) &=
        System.out.println(value &= 15); // 4
        // (10) ^=
        System.out.println(value ^= 2); // 6
        // (11) |=
        value = value |= 2;
        System.out.println(value); // 6

    }
}
