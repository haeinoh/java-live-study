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


        // (5) do-while문


    }
}
