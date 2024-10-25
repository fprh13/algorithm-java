package public_algorithm.kakaoGoorm.first_class.javaEx02;

public class CalculatorEx {
    public static void main(String[] args) {
        // static 필드 사용 : 클래스 명 멤버
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(3, 2);
        int result3 = Calculator.minus(3, 2);
//        System.out.println(result1, result2, result3);
    }
}
