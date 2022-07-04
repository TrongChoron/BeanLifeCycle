package com.example.beanlifecyrle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 7/4/2022
 * Time     : 11:40
 * Filename : Message
 */
public class Message  implements InitializingBean,
        DisposableBean {
    @Override
    // It is the init() method
    // of our bean and it gets
    // invoked on bean instantiation
    public void afterPropertiesSet()
            throws Exception
    {
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm the "
                        + "init() method");
    }
    @Override
    // This method is invoked
    // just after the container
    // is closed
    public void destroy() throws Exception
    {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }
}
