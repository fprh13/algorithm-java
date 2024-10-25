package public_algorithm.study;

/**
 * 가끔 생각날 때 막 작성하는 연습장
 */
public class MyNotePaper {

    /**
     * 람다를 위한 추상 메서드
     */
    @FunctionalInterface
    interface MyFunction {
        int calc(int x, int y);
//        int functionalInterfaceTest(); // 하나만 가져야 됨
    }
        public static void main(String[] args) {

            /**
             * 람다 테스트
             */
            MyFunction f = (x, y) -> { // x y 매개변수를 받아서 무엇을 수행한다.
                return x + y; // return은 무조건 {} 해야됨
            };

            System.out.println(new MyFunction() {
                @Override
                public int calc(int x, int y) {
                    return x + y;
                }
            }.calc(3, 5));

            System.out.println(((MyFunction) (x, y) -> x + y).calc(3, 5));

            System.out.println(((MyFunction) Integer::sum).calc(3, 5));

            System.out.println(f.calc(3, 5));



            /**
             * 엡실론 테스트
             */
            double a = 0.1 + 0.2;
            double b = 0.3;

            double epsilon = 1e-10;  // 0.0000000001 같은 매우 작은 값

            if (Math.abs(a - b) < epsilon) {
                System.out.println("a와 b는 거의 같습니다.");
            } else {
                System.out.println("a와 b는 다릅니다.");
            }

            /**
             * 배열 초기화 실습
             */
            int[] array = {1, 2, 3, 4, 5};
            int[] array1 = new int[]{1, 2, 3, 4, 5};
            // 왜 이렇게 분리 하지 ?

            int[] array3;
            // 나중에 초기화하는 경우에 사용
            array3 = new int[]{1, 2, 3, 4, 5};


            /**
             * String 이 불변 객체라 연산이 오래 걸림
             * String 7초 StringBuilder 0.02초
             */
            long start = System.currentTimeMillis();
//        String s = "";

            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= 200000; i++) {
//            s += i;
                sb.append(i);
            }
            long end = System.currentTimeMillis();
            System.out.println(((end - start) / 1000.0) + "초");
        }



}
