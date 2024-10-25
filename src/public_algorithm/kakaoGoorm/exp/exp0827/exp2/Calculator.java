package public_algorithm.kakaoGoorm.exp.exp0827.exp2;

public class Calculator {
    public int sum(int a, int b) {
        return a+ b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new RuntimeException();
        }
        return a / b;
    }
}
