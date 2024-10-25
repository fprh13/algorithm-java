package public_algorithm.kakaoGoorm.first_class.javaExo6;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObject("홍길동");
        String name = (String) box.getObject();

        System.out.println(name);

        box.setObject(new Apple());
        Apple apple = (Apple) box.getObject();

        System.out.println(apple);
    }
}
