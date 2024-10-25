package public_algorithm.kakaoGoorm.exp.exp0827.exp3;

public class Triangle extends AbstractDiagram {
    public Triangle(int a , int b) {
        width = a;
        length = b;
    }

    @Override
    public void calculate() {
        System.out.println("삼각형 면적 : " + (width * length) / 2);
    }
}
