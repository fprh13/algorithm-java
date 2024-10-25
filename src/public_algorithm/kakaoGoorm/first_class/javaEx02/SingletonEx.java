package public_algorithm.kakaoGoorm.first_class.javaEx02;

public class SingletonEx {
    public static void main(String[] args) {
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();

        if(ob1 == ob2) {
            System.out.println("같은 singleton 객체 입니다."); // static으로 생성되어 getInstance로 하나의 객체만 생성할 수 있다는 뜻
        } else {
            System.out.println("다른 singleton 객체 입니다.");
        }
    }
}
