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

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanFile.xml");
        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo=(BeanLifeCycleDemo) applicationContext.getBean("cycle");

    }
}
