package public_algorithm.kakaoGoorm.first_class.javaExo6;

import java.util.HashMap;

public class LoginController {
    LoginDAO dao = new LoginDAO();

    public boolean loginCheck(String id, String password) {
        // HsahMap : 생성 : id, password 전달
        HashMap<String, String> map = new HashMap<>();
        map.put(LoginDAO.KEY_ID, id);
        map.put(LoginDAO.KEY_PW, password);
        // dao 에 전달
        return dao.loginCheck(map);

    }
}
