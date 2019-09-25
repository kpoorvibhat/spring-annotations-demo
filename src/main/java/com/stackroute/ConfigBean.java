package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigBean {

    @Bean(name = {"movie"})
    public Movie movieBean() {
        return new Movie();
    }

    @Bean(name = {"movie2"})
    public Movie movieBean2(){
        return new Movie();
    }

    @Bean
    public Actor actor() {
        return new Actor("Shivani Sajjan", "Female", 22);
    }

    @Bean
    public Actor actor2() {
        return new Actor("Poorvi", "Female", 25);
    }

}
