package onenpc.springframework.beans.factory;


public interface BeanFactory {

    public Object getBean(String name);

    public Object getBean(String name,Object... args);

}
