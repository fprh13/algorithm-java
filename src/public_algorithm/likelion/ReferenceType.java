package public_algorithm.likelion;

public class ReferenceType {
    public static void main(String[] args) {
//        참조형
//        참조형 데이터의 값이 어디로 가는지 = > 힙 메모리 영역
//        변수에 대입되는 값이 뭔지 = > 힙 메모리의 영역의 주소값

        String a = new String("Hello!");
        System.out.println(a);

        String b = "Hello!";
        String c = "Hello!";

        if (a==b) {
            System.out.println("a == b");
        }
        if (b==c) {
            System.out.println("b == c");
        }


        }
}
