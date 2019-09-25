package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Implementing Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Implementing InitializingBean");
    }

    public void customInit(){
        System.out.println("Custom Init Method Called...");
    }

    public void customDestroy() {
        System.out.println("Custom Destroy Method Called...");
    }
}
