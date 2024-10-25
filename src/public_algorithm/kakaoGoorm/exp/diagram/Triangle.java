package public_algorithm.kakaoGoorm.exp.diagram;

public class Triangle extends Diagram{
    int width, height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculate() {
        super.calculate();
        System.out.println("(삼각형) " + (width * height) / 2 + "입니다.");
    }
}
