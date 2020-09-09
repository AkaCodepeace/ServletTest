import cn.codepeace.pojo.User;
import cn.codepeace.service.Impl.UserServiceImpl;
import cn.codepeace.service.UserService;
import cn.codepeace.util.JdbcUtil;
import org.junit.Test;

import java.sql.Connection;

public class UserTest {

    @Test
    public void test(){
        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.login("peace", "123456");
        System.out.println(user.toString());
        userService.register("aaa","987654");

    }
}
