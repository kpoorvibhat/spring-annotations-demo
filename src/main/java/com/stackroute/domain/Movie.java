package com.stackroute.domain;

import com.stackroute.domain.Actor;

public class Movie {

    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void movieInfo(){
        System.out.println("Movie Info");
        actor.actorInfo();
    }

}
