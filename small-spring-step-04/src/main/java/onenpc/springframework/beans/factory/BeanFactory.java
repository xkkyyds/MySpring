package onenpc.springframework.beans.factory;

import onenpc.springframework.beans.BeansException;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
