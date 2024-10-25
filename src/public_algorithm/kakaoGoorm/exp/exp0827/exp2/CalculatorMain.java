package public_algorithm.kakaoGoorm.exp.exp0827.exp2;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("덧셈을 진행할 두개의 숫자 입력...");
        int sumA = sc.nextInt();
        int sumB = sc.nextInt();
        System.out.println("결과 : " + calculator.sum(sumA, sumB));

        System.out.println("곱셈을 진행 할 두개의 숫자 입력...");
        int multiA = sc.nextInt();
        int multiB = sc.nextInt();
        System.out.println("결과: " + calculator.multi(multiA, multiB));

        System.out.println("나누기를 진행 할 두개의 숫자 입력...");
        int diviA = sc.nextInt();
        int diviB = sc.nextInt();
        System.out.println("결과 : " + calculator.division(diviA, diviB));
    }
}
