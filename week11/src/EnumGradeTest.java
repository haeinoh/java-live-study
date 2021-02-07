public class EnumGradeTest {
    public static void main(String[] args) {
        // 열거형이름.상수명 으로 상수를 사용할 수 있다.
        System.out.println(Grade.BEGINNER);
        System.out.println(Grade.VIP);
        System.out.println(Grade.RVIP);

 /*      Grade grade;

        if(grade == Grade.BEGINNER) {
            // == 을 이용해서 비교가 가능하다.
//            ....
        } else if (grade.compareTo(Grade.VIP) > 0) {
            // compareTo()는 비교대상이 같으면 0
            // 왼쪽이 크면 양수, 오른쪽이 크면 음수를 반환한다.
//            ...
        } else if(grade > Grade.RVIP) {
            // 에러. 비교연산자는 사용할 수 없다.
            // 위와 같이 compareTo를 사용해야한다.
//            ...
        }

        switch (grade) {
            case BEGINNER:
//                ...
                break;
            case VIP:
//                ...
                break;
            case RVIP:
//                ...
                break;
        }

        Grade[] gr = Grade.values();
        for (Grade g : gr) {
            System.out.println("grade = " + g);
        }*/

        Grade grd = Grade.valueOf("BEGINNER");
        System.out.println(grd); // BEGINNER
        System.out.println(Grade.BEGINNER == Grade.valueOf("BEGINNER")); // true

    }
}
