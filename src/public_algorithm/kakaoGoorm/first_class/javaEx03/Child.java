package public_algorithm.kakaoGoorm.first_class.javaEx03;

public class Child extends Parent{

    private int c;

    public void setChild() {
        c = 20;
    }

    public void showChild() {
        showParent();
        System.out.println("자식클래스 c : " + c);
    }
}
