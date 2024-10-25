package public_algorithm.kakaoGoorm.exp;

import java.util.Arrays;
import java.util.Scanner;

public class AscSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 숫자를 오름차순 정리를 해드립니다.");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + 1 + "번째 숫자 입력 : ");
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
//        int[] numbers = {5,6,4,3,7,1,8,9,10};
//
//        Arrays.sort(numbers);
//
//        // 스왑 알고리즘
//        for (int i = 0; i < numbers.length / 2; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[numbers.length - 1 - i];
//            numbers[numbers.length - 1 - i] = temp;
//        }
//
//        System.out.println(Arrays.toString(numbers));
    }
}
