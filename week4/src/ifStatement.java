public class ifStatement {
    public static void main(String[] args) {
        int score = 70;
        // (1) if문
        if(score > 60) { // 조건문 70 > 60 -> true
            //true 일 때 실행
            System.out.println("합격"); // 블럭 안의 문장
        }

        score = 40;
        if(score > 60) // 40 < 60 -> false
            System.out.println("합격");
        // 조건문이 false 이므로 출력되지 않는다


        score = 40;
        if(score > 60) 
            System.out.println("합격"); // 40 < 60 -> false
            System.out.println("축하"); // false임에도 출력 된다.
            // "합격"인 경우에만 "축하"를 출력하고 싶은 경우가 있을 때,
            // 블럭을 생략해서 표현하면, 합격이 아닌 경우에도 "축하"가 출력 될 수 있다.


        // (2) if-else
        score = 40;
        if(score > 60) { // 40 > 60 -> false
            System.out.println("합격");
        } else { // 조건식이 거짓(false) 이므로 else문의 블럭내 문장을 실행한다.
            System.out.println("불합격");
       }

        // (3) if-else if
        score = 60;

        if(score > 80) {
            // 이 조건식이 참인 경우 아래 이 블럭내 문장 실행
            System.out.println("합격");
        } else if(score < 50) {
            // 위의 조건식이 참이 아닌 경우 체크 하며, 참인 경우 이 블럭내 문장 실행
            System.out.println("불합격");
        } else {
            // 위의 두 조건식 모두 참이 아닌 경우 블럭 내 문장 실행
            // else는 필요없으면 생략이 가능하다.
            // score >= 50 && score <= 80 인 경우, true
            System.out.println("통과"); // 출력
        }

        // (4) 중첩if문

        score = 70;

        if(score > 50) {
            if(score <= 60) { // score > 50 이면서 , 60 이하인 경우
                System.out.println("통과");
            } else { // score > 50 이면서 60 이상인경우
                System.out.println("합격"); // 출력
            }
        } else {
            System.out.println("불합격");
        }

        // (5) switch
        score = 70;

        switch(score) { // 구분할 조건식
            case 50: // 조건식
                System.out.println("불합격"); // 조건식이 참일 경우 수행
                break; //case 사이의 구분, 필수
            case 60:
                System.out.println("통과");
                break;
            case 70:
                System.out.println("합격");
                break;
            default: // if-else문의 else와 같은 역할
                System.out.println("없음"); 
                break; // default의 break는 생략 가능
        }

        // (6) block

        if(score > 50) {
            System.out.println("블럭의 시작을 조건식 바로 옆에 하거나");
        }

        if(score > 50)
        {
            System.out.println("블럭의 시작을 조건식 아래에 위치하거나");
        }

    }
}
