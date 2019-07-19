package jcode.learning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wangwenping
 * @Since: 2019/7/19
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("jcode.learning")
public class ServiceConfiguration {
}
