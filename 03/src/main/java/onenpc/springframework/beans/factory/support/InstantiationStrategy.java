package onenpc.springframework.beans.factory.support;

import onenpc.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor cons,Object[] arg);
}
