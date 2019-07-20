package jcode.learning.dynamic.proxy;

import org.springframework.stereotype.Component;

/**
 * @author wangwenping
 * @Since: 2019/7/20
 */
@Component("realSubject")
public class RealSubject implements Subject {

    public String sayHello(String name) {
        return "hello " + name;
    }

    public String sayGoodBye() {
        return "goode bye";
    }
}
