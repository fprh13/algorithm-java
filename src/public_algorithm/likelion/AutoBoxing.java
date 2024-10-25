package public_algorithm.likelion;

public class AutoBoxing {
    public static void main(String[] args) {

        // 박싱
//        int i = 10;
//        Integer num = new Integer(1);

        // 언박싱
//        Integer number = new Integer(10);
//        int j = number.intValue();

        // 오토 박싱
//        int i = 10;
//        Integer num = i;

        // 오토 언박싱
//        Integer num = new Integer(10);
//        int i = num;

        // 오토박싱 연산 -> 9ms
//        long t = System.currentTimeMillis();
//        Long sum = 0L;
//        for (long i = 0; i < 1000000; i++) {
//            sum += i;
//        }
//        System.out.println("실행 시간: " + (System.currentTimeMillis() - t) + " ms");

        // 동일 타입 연산 -> 2ms
        long t = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - t) + " ms") ;
    }
//
//    // 문자열 -> 기본형
//    int number1 = Integer.parseInt("100");
//    // 문자열 -> wrapper class
//    Integer number2 = Integer.valueOf("100");

//        int i;
//        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        int ptr = 3; // ptr은 배열 인덱스 역할을 함
//
//        for (i = 0; i < 5; ++i) {
//            System.out.println(a[ptr + i] - 3);
//        }
//    }
}
