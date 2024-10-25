package public_algorithm.kakaoGoorm.exp.exp0827.exp1;

public class Circle implements InterfaceDiagram{

    private final int radius;

    public Circle(int a) {
        radius = a;
    }

    @Override
    public void calculate() {
        System.out.println("원의 면적은 -> " + radius * radius * 3.14);
    }


}
