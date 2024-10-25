package public_algorithm.kakaoGoorm.exp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayAvg {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력할 숫자의 개수를 입력하세요. : ");
        int number = Integer.parseInt(br.readLine());

        int[] arr = new int[number];;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i +1 + "번째 입력 ....");
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;
        System.out.println("현재 값의 평균 : " + avg);

        System.out.print("변경할 숫자의 위치를 입력해주세요 : ");
        int thNumber = Integer.parseInt(br.readLine());

        System.out.print("변경할 숫자 입력... ");
        arr[thNumber - 1] = Integer.parseInt(br.readLine());

        System.out.println("최종입력된 숫자 입니다. : " + Arrays.toString(arr));
    }
}
