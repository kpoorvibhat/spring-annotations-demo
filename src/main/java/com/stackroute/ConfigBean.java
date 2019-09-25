package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigBean {

    @Bean(name = {"movie1", "movie3"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie movieBean() {
        Movie movie = new Movie(actorBean());
        return movie;
    }

    @Bean(name = {"movie2"})
    public Movie movieBean2() {
        Movie movie = new Movie(actorBean2());
        return movie;
    }

    @Bean
    public Actor actorBean() {
        return new Actor("Shivani Sajjan", "Female", 22);
    }

    @Bean
    public Actor actorBean2() {
        return new Actor("Deepak", "Male", 25);
    }
}
