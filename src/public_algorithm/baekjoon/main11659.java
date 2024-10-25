package public_algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 옆으로 되어있는 데이터를 받기위해

        int suNo = Integer.parseInt(st.nextToken()); // 데이터의 개수
        int quizNo = Integer.parseInt(st.nextToken()); // 질의 개수

        // 합배열 만들기
        long[] S = new long[suNo + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        for(int q = 0; q < quizNo; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()); // i 부터
            int j = Integer.parseInt(st.nextToken()); // j 까지
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
