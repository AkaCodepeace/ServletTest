import cn.codepeace.pojo.User;
import cn.codepeace.service.Impl.UserServiceImpl;
import org.junit.Test;



public class UserTest {

    @Test
    public void test(){
        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.login("peace", "123456");
        System.out.println(user.toString());
        userService.register("ccc","5555");
    }
}
