package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean { // Implementing 2 lifecycle interfaces

     public static void main(String[] args) {

         //referting to the beans.xml file
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();

        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) applicationContext.getBean("cycle");

    }
        // creating a customInit method
        public void customInit ()
        {
            System.out.println("Initialization");
        }

        // creating a custom destroy  method
        public void clean ()
        {
            System.out.println("Custom destroy");
        }

        //implementing destroy method from interfaces
        @Override
        public void destroy () throws Exception {
            System.out.println("Destroy");
        }

        //implementing afterPropertiesSet method from interfaces
        @Override
        public void afterPropertiesSet () throws Exception {
            System.out.println("After properties");
        }
    }
