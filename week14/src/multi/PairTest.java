package multi;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> si = new Pair<>("Hello", 5);
        String str = si.getKey();
        Integer val = si.getValue();

        Pair<String, String> ss = new Pair<>("Hello", "value");
        String str2 = ss.getKey();
        String val2 = ss.getValue();
    }
}
