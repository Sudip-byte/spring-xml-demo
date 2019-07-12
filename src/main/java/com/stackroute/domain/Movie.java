package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie{

    // Actor class object declaration.
    Actor actor;

    // Setting actor object to null.
    public Movie()
    {
        this.actor=null;
    }

    // Setting actor object to value assigned by constructor parameter.
    public Movie(Actor actor)
    {
        this.actor=actor;
    }

    // Actor class getter method.
    public Actor getActor() {
        return actor;
    }

    // Actor class setter method.
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }


}
