package public_algorithm.study;

public class ThreadTest implements Runnable {
    public ThreadTest() {}

    public ThreadTest(String name){
        Thread t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        for(int i = 0; i <= 50; i++) {
            System.out.print(i + ":" + Thread.currentThread().getName() + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
