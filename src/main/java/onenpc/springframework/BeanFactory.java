package onenpc.springframework;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();
    public Object getBean(String name){
        Object bean = beanDefinitionMap.get(name).getBean();
        return bean;
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
