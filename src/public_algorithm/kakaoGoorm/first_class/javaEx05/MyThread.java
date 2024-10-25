package public_algorithm.kakaoGoorm.first_class.javaEx05;

import public_algorithm.study.MyRunnable;

public class MyThread {
    public static void main(String[] args) {
        Runnable my = new MyRunnable();

        Thread thread = new Thread(my);

        thread.start();
    }
}
