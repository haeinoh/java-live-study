package bounded;

public class Util {
    public static <T extends Number> int compare(T t1, T t2) {
        Integer v1 = t1.intValue();
        Integer v2 = t2.intValue();
        return v1.compareTo(v2);
    }
}
