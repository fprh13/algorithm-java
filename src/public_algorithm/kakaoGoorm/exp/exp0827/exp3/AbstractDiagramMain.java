package public_algorithm.kakaoGoorm.exp.exp0827.exp3;


public class AbstractDiagramMain {
    public static void main(String[] args) {


        AbstractDiagram[] abstractDiagram = new AbstractDiagram[] {
                new Circle(3),
                new Square(4,5),
                new Triangle(5,6)
        };

        for (AbstractDiagram diagram : abstractDiagram) {
            diagram.calculate();
        }
    }
}
