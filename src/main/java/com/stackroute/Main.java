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
        Movie movie = context.getBean("movie", Movie.class);
        movie.movieInfo();
        Movie movie2 = context.getBean("movie2", Movie.class);
        movie2.movieInfo();
    }
}
