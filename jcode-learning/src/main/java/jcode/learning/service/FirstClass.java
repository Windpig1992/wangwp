package jcode.learning.service;

import org.springframework.stereotype.Component;

/**
 * @author wangwenping
 * @Since: 2019/7/19
 */
@Component("firstClass")
public class FirstClass {
    private String testString = "testString";

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
}
