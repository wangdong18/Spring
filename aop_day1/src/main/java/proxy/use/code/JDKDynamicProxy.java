package proxy.use.code;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mortal
 * @since 2020-07-20
 */
public class JDKDynamicProxy implements InvocationHandler {
    private Object proxyObj;

    public Object newProxy(Object proxyObj) {
        this.proxyObj = proxyObj;
        return Proxy.newProxyInstance(proxyObj.getClass().getClassLoader(), proxyObj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.proxyObj, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("before  preoxy");
    }

    private void after() {
        System.out.println("after  preoxy");
    }
}
