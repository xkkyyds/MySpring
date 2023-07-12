package onenpc.springframework.beans.factory.support;

import onenpc.springframework.beans.BeansException;
import onenpc.springframework.beans.factory.BeanFactory;
import onenpc.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
//    @Override
//    public Object getBean(String name) {
//        Object bean = getSingleton(name);
//        if (bean != null) {
//            return bean;
//        }
//        BeanDefinition beanDefinition = getBeanDefinition(name);
//        return creatBean(name, beanDefinition, args);
//    }
    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }
    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) creatBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);
    protected abstract Object creatBean(String beanName, BeanDefinition beanDefinition, Object[] args);

}
