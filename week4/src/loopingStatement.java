import java.util.Arrays;

public class loopingStatement {
    public static void main(String[] args) {
        // (1) for문
        // 기본형태
        for(int i = 0; i < 5; i++) {
            // i가 0부터 4까지 출력된다.
            System.out.println("i = " + i); // 0 1 2 3 4 (줄을 바꿔야하지만 생략해서 표현)
        }

        // 초기화를 두 개 하는 경우
        for(int i = 0, j = 0; i < 5; i++, j+=2) {
            // i는 0부터 4까지 출력된다.
            // j는 0부터 2씩 증가하여 8까지 출력된다.
            System.out.println("i = " + i); // 0 1 2 3 4 (줄을 바꿔야하지만 생략해서 표현)
            System.out.println("j = " + j); // 0 2 4 6 8 (줄을 바꿔야하지만 생략해서 표현)
        }

        // 생략하는 경우
        int k = 0;
        for(;k < 5; k++) { // 초기화나 증감식을 생략할 수 있다.
            System.out.println("k = " + k); // 0 1 2 3 4 (줄을 바꿔야하지만 생략해서 표현)
        }

        // (2) 중첩 for문
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int i = 0; i < 3; i++) { // 바깥쪽 for문은 3번
            for(int j= 0; j < 3; j++) { // 안쪽 for문은 3 * 3 , 총 9번 반복된다.
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // 1 2 3
        // 4 5 6
        // 7 8 9

        // (3) 향상된 for문
        int nums[] = {1, 2, 3, 4, 5};

        //기존 for문 방식
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " "); // 1 2 3 4 5
        }
        System.out.println();

        //향상된 for문 문법
        for(int i : nums) {
            System.out.print(i + " "); // 1 2 3 4 5
        }

        // (4) while문
        // 먼저 공부했던 for문과 비교하면 이렇다.
        // for문은 초기화; 조건식; 증감식을 한 곳에서 처리를 하고
        for(int i = 1; i <= 5; i++) { // 초기화;조건식;증감식
            System.out.println("실행"); // 5번 실행
        }
        // while문은 초기화, 조건식, 증감식을 다 따로 처리한다.
        int p = 1; // 초기화
        while(p <= 5) { // 조건식
            System.out.println("실행"); // 5번 실행
            p++; //증감식
        }

        // 항상 참이 되며, 벗어날 수 있는 조건이 블럭내에 필요하다.
        while(true) {
            // break가 필요함
            break;
        }

        // (5) do-while문
        int q = 1;
        do { // 조건식을 체크하기전에 무조건 블록 { }을 한 번은 실행한다.
            System.out.println("실행"); // 5번 실행
            q++;
        } while(q <= 5); // 끝에 ; 를 붙여주어야한다.

        // (6) break문
        int value = 10;
        while(true) { // 항상 참인 while(true)문 같은 경우
            // break문을 통해서 블럭을 빠져나올 수 있게 해주어야한다.
            // 해당 조건식이 참인경우 while문을 빠져나온다.
            if(value > 50) break;
            // break 조건을 만족 할 때까지 value값을 계속 더한다.
            value += 10;
        }

        // (7) continue문
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) continue; // 증감식으로 이동하게 된다.
            // i % 2 != 0일 때만 출력된다.
            // 1 3 5 7 9 만출력된다.
            System.out.println("출력 : " + i);
        }

        // (8) 이름 붙은 반복문

        loop:for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5;j++) {
                // break문에 붙은 이름과 매칭되는 반복문을 끝낼 수 있다.
                if(i > 3) break loop;
            }
        }

    }
}
