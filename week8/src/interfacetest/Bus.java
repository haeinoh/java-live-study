package interfacetest;

public class Bus implements Vehicle {
    @Override
    public void countPassanger() {
        System.out.println("최대 탑승 인원 수 : " + maxNumberOfPassanger);
    }

    @Override
    public void pay() {
        System.out.println("버스 요금은 1200원 입니다.");
    }

    @Override
    public void time() {
        System.out.println("운행 시간은 6시부터 12시까지 입니다.");
    }
}
