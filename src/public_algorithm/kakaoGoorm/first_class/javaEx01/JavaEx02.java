package public_algorithm.kakaoGoorm.first_class.javaEx01;

import java.util.Scanner;

public class JavaEx02 {

    public static void main(String[] args) {
        // 반복문
        // for : 고정된 횟수 만큼
        // 향상된 for 문 ( for - each)
        // while : 조건이 참인 동안 반복
        // do while : 코드 블록을 무조건 한번 실행하고 반복

        // 배열과 반복문
        // java.util.Arrays 클래스

        /**
         * for 문
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("곱셈표를 출력할 숫자를 입력");
        int number = sc.nextInt();

        for (int i = 0; i <= 10; i++) { // int i 는 지역 변수
            System.out.println(number + " X " + i + " = " + (number * 1));
        }

        /**
         * for-each 문
         */
        System.out.println("입력할 정수의 개수를 입력해주세요.");
        int n = sc.nextInt();
        int[] array = new int[n]; // 배열의 크기

        for (int i = 0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("배열의 요소 : ");

        for (int i : array) { // array 만큼 처음부터 돌려서 i에 저장 하겠다 : array 가 int 이니까 i는 int 여야 함
            System.out.print(i + " ");
        }
        System.out.println();

        /**
         * while 문
         */
        System.out.println("합을 계산할 숫자를 입력: ");
        int limit = sc.nextInt();
        int sum = 0;
        int i = 1; // 전역 변수
        while (i <= limit) {
            // i 가 limit 보다 작거나 같을 동안 sum에 i를 더하면 됨
            sum += i;
            i++;
        }
        System.out.println("1부터 " + limit + "까지의 합은 " + sum);

        /**
         * do while 문 한번은 실행해야하고 조건식을 나중에 비교
         * - 사용자가 맞출 때까지 숫자를 추측하는 게임
         */

        int secret = 7;
        int guess;

        do {
            System.out.println("숫자를 맞춰 보세요 (1-10) : ");
            guess = sc.nextInt();
        } while (guess != secret);

        System.out.println(" 정답입니다. ");


    }
}
