package public_algorithm.kakaoGoorm.exp;

public class Square {

    // 직사각형 클래스를 작성하고, 직사각형 객체를 생성하여 넓이와 둘레를 계산한 뒤 출력하는 프로그램을 작성하세요.

    private int width;

    private int length;

    /**
     * 넓이를 구하는 메서드
     * @param width 가로 길이
     * @param length 세로 길이
     * @return 넓이
     */
    static int area(int width, int length) {
        return width * length;
    }

    /**
     * 둘레를 구하는 메서드
     * @param width 가로 길이
     * @param length 세로 길이
     * @return 직사각형의 둘레
     */
    static int perimeter(int width, int length) {
        return (width + length) * 2;
    }
}
