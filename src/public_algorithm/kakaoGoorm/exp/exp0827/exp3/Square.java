package public_algorithm.kakaoGoorm.exp.exp0827.exp3;

import public_algorithm.kakaoGoorm.exp.exp0827.exp1.InterfaceDiagram;

public class Square extends AbstractDiagram {

    public Square(int a, int b) {
        width = a;
        length = b;
    }

    @Override
    public void calculate() {
        System.out.println("사각형 면적 : " + (width * length));
    }
}
