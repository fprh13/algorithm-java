package public_algorithm.kakaoGoorm.exp.diagram;


public class diagramEx {
    public static void main(String[] args) {

        Diagram[] diagrams = new Diagram[] {
                new Circle(3),
                new Triangle(3,3),
                new Square(3,5)
        };

        for (Diagram diagram : diagrams) {
            diagram.calculate();
        }

    }
}
