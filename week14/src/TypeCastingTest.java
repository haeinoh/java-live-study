import java.util.ArrayList;

public class TypeCastingTest {
    public static void main(String[] args) {
        // 1) 비제네릭 코드
        ArrayList listWithoutGeneric = new ArrayList();
        listWithoutGeneric.add("list Without Genreic");
        String stringWithoutGenric = listWithoutGeneric.get(0);

        // 2) 제네릭 코드
        ArrayList<String> listWithGeneric = new ArrayList<>();
        listWithGeneric.add("list With Generic");
        // 타입변환을 하지 않는다.
        String stringWithGeneric = listWithGeneric.get(0);
        System.out.println(stringWithGeneric);
    }
}
