package public_algorithm.kakaoGoorm.exp.exp0827.exp1;

public class Square implements InterfaceDiagram{
    private final int width;
    private final int length;

    public Square(int a, int b) {
        width = a;
        length = b;
    }

    @Override
    public void calculate() {
        System.out.println("사각형 면적 -> " + width * length);
    }
}
