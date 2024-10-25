package public_algorithm.kakaoGoorm.exp;

import java.util.Scanner;
import java.util.function.BiFunction;

public class LambdaExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요. : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요. : ");
        int num2 = sc.nextInt();

        System.out.print("연산자를 입력하세요. [+ - * /]: ");
        char operator = sc.next().charAt(0);

        BiFunction<Integer, Integer, Integer> operation = (a, b) -> {
            switch (operator) {
                case '+':
                    return a + b;
                case '-':
                    return a - b;
                case '*':
                    return a * b;
                case '/':
                    if (b == 0) {
                        throw new RuntimeException("0으로 나눌 수 없습니다.");
                    }
                    return a / b;
                default:
                    throw new RuntimeException("연산자가 잘 못 되었습니다.");
            }
        };

        try {
            int result = operation.apply(num1, num2);
            System.out.println("결과 -> " + result);
        } catch (Exception e) {
            System.out.println("오류 ->  " + e.getMessage());
        }
        sc.close();
    }
}