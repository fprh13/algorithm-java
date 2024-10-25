package public_algorithm.kakaoGoorm.exp.diagram;

public class Square extends Diagram{
    int width, height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculate() {
        super.calculate();
        System.out.println("(사각형) " + width * height + " 입니다.");
    }
}
