package public_algorithm.study;

import java.util.Random;

public class MyThread extends Thread {
    private static final Random random = new Random();
    @Override
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



//    @Override
//    public void run() {
//        String threadName = Thread.currentThread().getName();
//        System.out.println("- " + threadName + " 시작");
//        int delay = 1000 + random.nextInt(4000);
//        try {
//            Thread.sleep(delay);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("- " + threadName + " 종료 (" + delay + "ms)");

//    }

}
