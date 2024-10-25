package public_algorithm.kakaoGoorm.daily.day02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


//최대값 인덱스 구하기 문제 (프로그래머스)
//문제 설명
//주어진 입력중 최대값을 구하고, 최대값이 이 위치하는 index 값의 목록을 반환하세요.
//입력:
//        [2, 4, 1, 3, 2, 5, 6, 6, 1]
//입력된 목록의 최대값은 6입니다.
//6와 동일한 값을 가진 위치는 6번째, 7번째 위치 입니다.
//이 위치에 해당하는 index는 [6, 7] 입니다.
//        출력:
//        [6, 7]
//
//입출력 예
//입력: [2, 4, 1, 3, 2, 5, 6, 6, 1]
//출력: [6, 7]
//입력: [9, 2, 3, 1, 0, 2, 9, 9]
//출력: [0, 6, 7]
//입력: [0, 2, 4, 2, 4, 0]
//출력: [2, 4]


public class MaxIndexEx03 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 3, 2, 5, 6, 6, 1};
        int[] arr2 = {9,2, 3, 1, 0, 2, 9, 9};
        int[] arr3 = {0, 2, 4, 2, 4, 0};

        System.out.println("[입력1]: " + Arrays.toString(arr1));
        System.out.println("[출력1]: " + Arrays.toString(solution(arr1)));
        System.out.println("[입력2]: " + Arrays.toString(arr2));
        System.out.println("[출력2]: " + Arrays.toString(solution(arr2)));
        System.out.println("[입력3]: " + Arrays.toString(arr3));
        System.out.println("[출력3]: " + Arrays.toString(solution(arr3)));
    }
    // 1. 배열을 사용
    public static int[] solution(int[] arr) {
        // 최대값 구하기
        int max = Arrays.stream(arr).max().getAsInt();
//        for (int i : arr) {
//            if (i > max) {
//                max = i;
//            }
//        }

        // 최대값이 몇개인지
//        int count = 0;
//        for (int i : arr) {
//            if (i == max)
//                count++;
//        }

        // 리턴할 리스트 만들기
//        int[] answer = new int[count];
        List<Integer> list = new LinkedList<>();

        // 리스트에 인데스 채우기
//        int index = 0;
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == max) {
//                answer[index++] = i;
                list.add(i);
            }
        }
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            answer[i] = list.get(i);
//        }
//        return answer;
//        return answer;
        return list.stream().mapToInt(i -> i).toArray();
    }
}
