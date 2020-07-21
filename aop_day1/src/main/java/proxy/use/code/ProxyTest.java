package proxy.use.code;

import proxy.use.xml.AccountService;
import proxy.use.xml.impl.AccountServiceImpl;

/**
 * @author mortal
 * @since 2020-07-20
 */
public class ProxyTest {

    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImpl();
        //没有使用代理模式
        accountService.createAccount();
        System.err.println("===========================");
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();
        //使用代理模式
        AccountService proxy = (AccountService) jdkDynamicProxy.newProxy(accountService);
        proxy.createAccount();

    }
}
