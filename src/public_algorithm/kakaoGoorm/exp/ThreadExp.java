package public_algorithm.kakaoGoorm.exp;

import public_algorithm.study.MyRunnable;
import public_algorithm.study.MyThread;


public class ThreadExp {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();
    }
}
