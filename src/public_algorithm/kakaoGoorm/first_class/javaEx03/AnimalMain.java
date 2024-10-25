package public_algorithm.kakaoGoorm.first_class.javaEx03;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a = new Animal();

        a.show();
        a.sound();

        Cat c = new Cat();
        c.show();
        c.sound();

        // 다형성 표현: 부모 클래스 타입에 여러 자식 객체 대입
        // 하나의 타입에 여러 객체를 대입함으로써 다양한 기능 이용
        // 자식 타입이 부모 타입으로 자동 타입 변입 변환 발생
        Animal s = new Cat();
        s.show();
        s.sound();

        // 만일 자식 클래스에서 오버라이딩을 안했다면
        // 부모 클래스 Animal 클래스의 show sound 호출

        // 다시 자식 타입으로 변환하고 자 할 때 : 강제 타입
    }
}
