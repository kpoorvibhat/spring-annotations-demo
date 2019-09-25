package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {

    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void movieInfo(){
        System.out.println("Movie Info");
        actor.actorInfo();
    }
}
