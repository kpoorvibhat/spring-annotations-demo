package com.stackroute;

import com.stackroute.ConfigBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) throws Exception {

        //using Application Context
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
        Movie movie1 = context.getBean("movie1", Movie.class);
        movie1.movieInfo();
        Movie movie3 = context.getBean("movie3", Movie.class);
        movie3.movieInfo();

        //using Bean Factory
        BeanFactory factory = new AnnotationConfigApplicationContext(ConfigBean.class);
        Movie movie2 = factory.getBean("movie2", Movie.class);
        movie2.movieInfo();

        System.out.println(movie1==movie3);

    }
}
