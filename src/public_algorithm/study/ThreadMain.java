package public_algorithm.study;

public class ThreadMain {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();

        MyThread t2 = new MyThread();
        t2.start(); // 새로운 스레드를 시작하고, run() 메소드가 실행됨

        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });
        thread.start();

        Thread thread2 = new Thread(() ->
                System.out.println("Hello World"));
        thread2.start();

    }
}
