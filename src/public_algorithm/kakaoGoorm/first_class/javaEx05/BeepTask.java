package public_algorithm.kakaoGoorm.first_class.javaEx05;

import java.awt.*;

public class BeepTask implements Runnable{

    @Override
    public void run() {
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 1;  i <= 5; i++) {
            System.out.println("Runnable : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
