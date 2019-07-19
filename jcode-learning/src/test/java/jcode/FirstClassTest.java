package jcode;

import jcode.learning.ServiceConfiguration;
import jcode.learning.service.FirstClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author wangwenping
 * @Since: 2019/7/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceConfiguration.class)
public class FirstClassTest {

    @Resource
    FirstClass firstClass;

    @Test
    public void test() {
        System.out.println(firstClass.getTestString());
    }


}
