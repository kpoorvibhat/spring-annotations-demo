package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    @Autowired
    private Actor actor;

    public void movieInfo(){
        System.out.println("Movie Info");
        actor.actorInfo();
    }
}
