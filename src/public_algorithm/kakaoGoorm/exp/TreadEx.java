package public_algorithm.kakaoGoorm.exp;

public class TreadEx {
    public static void main(String[] args) {


        /* 싱글쓰레드 환경에서 성능차이*/
//        StringBuffer stringBufferSingleThread = new StringBuffer();
//        StringBuilder stringBuilderSingleThread = new StringBuilder();
//
//
//        System.out.println("[SINGLE THREAD TEST]");
//
//        new Thread(() -> {
//            long start = System.currentTimeMillis(); //측정시작
//            for (int i = 0; i < 20000; i++) {
//                stringBufferSingleThread.append(i);
//            }
//            long end = System.currentTimeMillis(); //측정종료
//
//            System.out.println("StringBuffer length: " + stringBufferSingleThread.length());
//            System.out.println("StringBuffer time: " + (end - start));
//        }).start();
//
//
//        new Thread(() -> {
//            long start = System.currentTimeMillis(); //측정시작
//            for (int i = 0; i < 20000; i++) {
//                stringBuilderSingleThread.append(i);
//            }
//            long end = System.currentTimeMillis(); //측정종료
//            System.out.println("StringBuilder length: " + stringBuilderSingleThread.length());
//            System.out.println("StringBuilder time: " + (end - start));
//        }).start();
//    }

//        System.out.println("=================");
//        System.out.println("[MULTI THREAD TEST]");
//        /* 멀티쓰레드 환경에서 수행 횟수 차이 */
//
//        StringBuffer stringBufferMultiThread = new StringBuffer();
//        StringBuilder stringBuilderMultiThread = new StringBuilder();
//
////        두 개의 쓰레드에서 각자 한 StringBuffer, StringBuilder에 접근
//        new Thread(() -> {
//            for (int i = 0; i < 10000; i++) {
//                stringBufferMultiThread.append(i);
//                stringBuilderMultiThread.append(i);
//            }
//        }).start();
//
//        new Thread(() -> {
//            for (int i = 0; i < 10000; i++) {
//                stringBufferMultiThread.append(i);
//                stringBuilderMultiThread.append(i);
//            }
//        }).start();
//
//        new Thread(()->{
//            try {
//                Thread.sleep(1000);
//                System.out.println("StringBuffer length : " + stringBufferMultiThread.length());
//                System.out.println("StringBuilder length : " + stringBuilderMultiThread.length());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();
//    }

        System.out.println("=================");
        System.out.println("[MULTI THREAD TEST(StringBuilder 동기화 진행]");
        /* 멀티쓰레드 환경에서 수행 횟수 차이 */

        StringBuffer stringBufferMultiThread = new StringBuffer();
        StringBuilder stringBuilderMultiThread = new StringBuilder();

        Object stringBuilderLock = new Object();
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                stringBufferMultiThread.append(i);
                synchronized (stringBuilderLock) {
                    stringBuilderMultiThread.append(i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                stringBufferMultiThread.append(i);
                synchronized (stringBuilderLock) {
                    stringBuilderMultiThread.append(i);
                }
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("StringBuffer length : " + stringBufferMultiThread.length());
                System.out.println("StringBuilder length : " + stringBuilderMultiThread.length());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
