package jcode.learning.dynamic.proxy;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wangwenping
 * @Since: 2019/7/20
 */
@Component("invocationHandler")
public class InvocationHandlerImpl implements InvocationHandler {

    private Subject subject;

    public InvocationHandlerImpl(Subject subject) {
        this.subject = subject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("调用之前的处理");
        System.out.println("Method:" + method);
        Object returnValue = method.invoke(subject, args);
        System.out.println("调用之后的处理");
        return returnValue;
    }


}
