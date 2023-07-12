package onenpc.springframework.beans.factory.support;

import onenpc.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimpleInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor cons, Object[] arg) {
        Class beanClass = beanDefinition.getBeanClass();

        try {
            if (cons != null) {
                return beanClass.getDeclaredConstructor(cons.getParameterTypes()).newInstance(arg);
            } else {
                return beanClass.getDeclaredConstructor().newInstance(arg);
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }

        return null;
    }
}
