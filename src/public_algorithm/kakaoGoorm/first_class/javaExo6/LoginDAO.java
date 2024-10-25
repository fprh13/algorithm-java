package public_algorithm.kakaoGoorm.first_class.javaExo6;

import java.util.HashMap;

public class LoginDAO {
    public static final String KEY_ID = "id";
    public static final String KEY_PW = "password";

    private String userId;
    private String password;

    public LoginDAO() {
        this.userId = KEY_ID;
        this.password = KEY_PW;
    }

    public boolean loginCheck(HashMap<String, String> map) {
        if (map.get(KEY_ID).equals(userId) && map.get(KEY_PW).equals(password)) {
            System.out.println("LoginDAO : 아이디 패스워드가 일치 ");
            return true;
        }
        System.out.println("LoginDAO : 아이디 패스워드가 불일치 ");
        return false;
    }
}
