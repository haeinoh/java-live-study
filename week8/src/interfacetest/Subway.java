package interfacetest;

public class Subway implements Vehicle {
    @Override
    public void countPassanger() {
        System.out.println("최대 탑승 인원 수 : " + maxNumberOfPassanger);
    }

    @Override
    public void pay() {
        System.out.println("지하철 요금은 1300원 입니다.");
    }

    @Override
    public void time() {
        System.out.println("운행 시간은 5시부터 11시까지 입니다.");
    }
}

/*class [클래스이름] implements [인터페이스 이름] {
        // 인터페이스에 정의된 추상메서드 구현
}*/
