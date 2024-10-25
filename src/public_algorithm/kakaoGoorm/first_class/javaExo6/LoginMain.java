package public_algorithm.kakaoGoorm.first_class.javaExo6;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        LoginController controller = new LoginController();
        Scanner sc = new Scanner(System.in);

        String id , password;
        boolean result;

        while(true) {
            System.out.println("아이디 입력...");
            id = sc.next();
            System.out.println("패스워드 입력...");
            password = sc.next();

            result = controller.loginCheck(id, password);
            if (result) {
                System.out.println("로그인 성공");
                break;
            }
            System.out.println("로그인 실패");
        }



        sc.close();
    }
}
