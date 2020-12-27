public class bitwiseShift {
    public static void main(String[] args) {
        // (1) Bitwise OR
        int num1 = 10; // 1010(2)
        int num2 = 7;  // 0111(2)
                       // 1111(2) -> 15
        System.out.println(num1 | num2); // 15

        // (2) Bitwise AND
        num1 = 10; // 1010(2)
        num2 = 7;  // 0111(2)
                   // 0010(2) -> 2

        System.out.println(num1 & num2); // 2

        // (3) Bitwise XOR
        num1 = 10; // 1010(2)
        num2 = 7;  // 0111(2)
                   // 1101(2) -> 13

        System.out.println(num1 ^ num2); // 13

        // (4) Bitwise complement (~)
        byte b = ~12; // ~00001100
                      //  11110011 -> -13

        System.out.println(b); // -13

        // (5) Left Shift ( << )
        // (i) 00001010 << 1   => 00010100   => 20
        // (ii) x << n 는  x*2^n과 같은 결과를 얻을 수 있다.
        //     10 * 2^1 => 20
        System.out.println(10 << 1); // 20

        // (6) (Single) Right Shift ( >> )
        // (i) 00001010 >> 1   => 00000101   => 5
        // (ii) x >> n 는  x/2^n과 같은 결과를 얻을 수 있다.
        //     10 / 2^1 => 5
        System.out.println(10 >> 1); // 5
    }
}
