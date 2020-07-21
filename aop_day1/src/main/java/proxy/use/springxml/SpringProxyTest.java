package proxy.use.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mortal
 * @since 2020-07-20
 */
public class SpringProxyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springbean.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("springxmlAccount");
        accountService.deleteAccount();
        accountService.createAccount();
        accountService.updateAccount(1);
    }
}
