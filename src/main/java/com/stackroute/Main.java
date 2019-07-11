package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("ALL")
public class Main {

    public  static  void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movieFirst= (Movie)context.getBean("moviecast1");
        Movie movieSecond = (Movie) context.getBean("moviecast1");


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=(Movie)applicationContext.getBean("moviecast2");
        Movie movie1 = (Movie)applicationContext.getBean("moviecast2");


        System.out.println(movieFirst.getActor());
        System.out.println(movie.getActor());

        System.out.println(movieSecond==movieFirst);
        System.out.println(movie==movie1);

    }
}
