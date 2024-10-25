package public_algorithm.kakaoGoorm.exp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumAndMinus {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("==이름과 나이를 출력하는 프로그램==");

        System.out.print("이름을 입력해주세요 : ");
        String name = br.readLine();

        System.out.print("나이를 입력해주세요 : ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }

}
