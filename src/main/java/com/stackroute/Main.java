package com.stackroute;

import com.stackroute.ConfigBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) throws Exception {

        //using Application Context
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
        Movie movie = context.getBean("movie", Movie.class);
        movie.movieInfo();
        context.close();
    }
}
