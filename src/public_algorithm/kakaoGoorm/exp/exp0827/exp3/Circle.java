package public_algorithm.kakaoGoorm.exp.exp0827.exp3;

public class Circle extends AbstractDiagram {

    public Circle(int a) {
        radius = a;
    }

    @Override
    public void calculate() {
        System.out.println("원의 면적은 : " + radius * radius * 3.14);
    }
}
