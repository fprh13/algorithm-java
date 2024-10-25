package public_algorithm.kakaoGoorm.daily.day02.Baekjoon15552;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * Scanner version code
         */
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); //최대 1,000,000
//
//        // n 번 반복
//        for (int i = 1; i <= n; i++) {
//            // 사용자로 부터 A, B 입력
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a+b);
//        }
//        sc.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write((a + b) + "\n");
        }
        bw.flush();
    }
}
