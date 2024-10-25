package public_algorithm.kakaoGoorm.first_class.javaEx05;

public class MyFunctionalInterfaceMain {

    public static void main(String[] args) {
//        MyFunctionalInterface f = new MyFunctionalInterface() {
//            @Override
//            public void method() {
//                System.out.println("안녕하세요");
//            }
//        }; 람다 사용 전

        MyFunctionalInterface f = (x, y) -> {
//            System.out.println("hello");
            return x + y;
        };

        System.out.println(f.method(3,4));


    }
}
