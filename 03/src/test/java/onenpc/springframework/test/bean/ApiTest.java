package onenpc.springframework.test.bean;

import onenpc.springframework.beans.factory.config.BeanDefinition;
import onenpc.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        factory.registerBeanDefinition("userservice",beanDefinition);

        UserService userservice = (UserService)factory.getBean("userservice","aaa");

        userservice.queryUserInfo();

//        factory.getSingleton("userservice");
    }
}
