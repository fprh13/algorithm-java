package private_algorithm.linear_data.sort.java_library_sort.baekjon2751;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * 문제
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 *
 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 * 데이터는 백만개가 입력된다.
 * O(n log N) 을 사용하는 sort() 메서드를 사용하였다.
 * 입력 데이터가 많아서 입력 시간을 줄이기 위해 BufferedReader 를 사용하였다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        // Arrays.sort() 사용
        Arrays.sort(arr);

        // 출력하기
        for (int num : arr) {
            writer.write(num + "\n");
        }

        writer.flush(); // 모든 출력 내용을 한 번에 보냄
        writer.close();
        reader.close();
    }
}

