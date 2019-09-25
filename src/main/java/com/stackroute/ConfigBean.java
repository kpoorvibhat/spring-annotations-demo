package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {

    @Bean
    public Movie movieBean() {
        Movie movie = new Movie();
        movie.setActor(actorBean());
        return movie;
    }

    @Bean
    public Actor actorBean() {
        return new Actor();
    }
}
