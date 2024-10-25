package public_algorithm.kakaoGoorm.exp.exp0827.exp1;

public class InterfaceDiagramMain {
    public static void main(String[] args) {
        InterfaceDiagram[] interfaceDiagrams = new InterfaceDiagram[] {
                new Square(3,3),
                new Triangle(5,6),
                new Circle(4)
        };

        for (InterfaceDiagram interfaceDiagram : interfaceDiagrams) {
            interfaceDiagram.calculate();
        }
    }
}
