package public_algorithm.kakaoGoorm.programmers.p105배열정렬하기;


import java.util.Arrays;

/**
 * 정수 배열의 길이는 2 이상 10^5 이하 입니다.
 *
 * 데이터 개수는 최대 10^5이다. 즉 제한 시간 3초라면 ON^2 알고리즘은 사용 할 수 없다.
 *
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
