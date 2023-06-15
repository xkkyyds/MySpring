package onenpc.springframework.test;

import onenpc.springframework.test.bean.UserService;
import org.junit.Test;

import onenpc.springframework.BeanDefinition;
import onenpc.springframework.BeanFactory;

public class ApiTeat {
    @Test
    public void test_BeanFactory(){
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition userservice = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userservice",userservice);
        UserService userservice1 = (UserService) beanFactory.getBean("userservice");
        userservice1.queryUserInfo();
    }
}
