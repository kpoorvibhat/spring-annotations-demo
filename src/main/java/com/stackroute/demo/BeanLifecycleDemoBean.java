package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Implementing Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Implementing InitializingBean");
    }

    @PostConstruct
    public void customInit(){
        System.out.println("Custom Init Method Called...");
    }

    @PreDestroy
    public void customDestroy() {
        System.out.println("Custom Destroy Method Called...");
    }
}
