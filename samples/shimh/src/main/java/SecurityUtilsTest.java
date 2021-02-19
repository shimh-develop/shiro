import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

/**
 * @author: shiminghui
 * @create: 2021年02月
 **/
public class SecurityUtilsTest {

    public static void main(String[] args) {

        // 获取SecurityManager核心组件
        SecurityManager securityManager = null;

        //SecurityManager作为单例访问
        SecurityUtils.setSecurityManager(securityManager);


        // 具体使用
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("admin", "123456");
        currentUser.login(token);

    }

}
