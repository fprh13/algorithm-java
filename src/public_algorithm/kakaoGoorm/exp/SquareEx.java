package public_algorithm.kakaoGoorm.exp;

public class SquareEx {
    public static void main(String[] args) {

        int width = 5;
        int length = 7;

        System.out.println("직사각형의 넓이는 : " + Square.area(width , length));
        System.out.println("직사각형의 둘레는 : " + Square.perimeter(width , length));
    }
}
