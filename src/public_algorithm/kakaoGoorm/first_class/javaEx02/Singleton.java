package public_algorithm.kakaoGoorm.first_class.javaEx02;

public class Singleton {
    private static Singleton singleton = new Singleton();

    // 외부에서 new 연산자로 생성자를 호출할 수 없도록 private 으로
    private Singleton() {

    }

    // 외부에서 호출할 수 있는 static 메서드 사용
    public static Singleton getInstance() {
        return singleton;
    }

}
