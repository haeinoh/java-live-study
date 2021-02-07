public enum Grade {
    BEGINNER(1), VIP(15), RVIP(20); // ; 추가

    private final int point; // 정수를 저장할 필드 추가

    Grade(int point) { // 생성자 추가
        this.point = point;
    }

    public int getPoint() {
        return point;
    }
}
