package jcode.dynamic.proxy;

import jcode.learning.ServiceConfiguration;
import jcode.learning.dynamic.proxy.InvocationHandlerImpl;
import jcode.learning.dynamic.proxy.RealSubject;
import jcode.learning.dynamic.proxy.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author wangwenping
 * @Since: 2019/7/20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceConfiguration.class)
public class InvocationHandlerTest {

    @Resource
    RealSubject realSubject;

    @Test
    public void invocationHandlerTest() {
        InvocationHandler handler = new InvocationHandlerImpl(realSubject);

        ClassLoader loader = handler.getClass().getClassLoader();
        Class<?>[] interfaces = realSubject.getClass().getInterfaces();

        Subject subject = (Subject) Proxy.newProxyInstance(loader, interfaces, handler);
        System.out.println("动态代理对象的类型：" + subject.getClass().getName());

        String hello = subject.sayHello("wangwenping");
        System.out.println(hello);
    }

}
