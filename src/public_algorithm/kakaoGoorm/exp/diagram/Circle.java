package public_algorithm.kakaoGoorm.exp.diagram;

public class Circle extends Diagram{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculate() {
        super.calculate();
        System.out.println("(원) " + radius * radius * 3.14 + "입니다.");
    }
}
