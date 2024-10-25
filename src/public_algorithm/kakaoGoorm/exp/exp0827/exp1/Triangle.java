package public_algorithm.kakaoGoorm.exp.exp0827.exp1;

public class Triangle implements InterfaceDiagram{

    private final int width;
    private final int length;

    public Triangle(int a , int b) {
        width = a;
        length = b;
    }

    @Override
    public void calculate() {
        System.out.println("삼각형 면적 -> " + (width * length) / 2);
    }
}
