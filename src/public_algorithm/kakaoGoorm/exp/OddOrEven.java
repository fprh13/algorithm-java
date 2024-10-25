package public_algorithm.kakaoGoorm.exp;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 홀수 인지 짝 수 인지
        System.out.print("숫자를 입력해주세요 -> ");

        int num = sc.nextInt();

        if (num%2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }
}
