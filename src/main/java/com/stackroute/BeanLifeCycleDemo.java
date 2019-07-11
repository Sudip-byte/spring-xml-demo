package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) applicationContext.getBean("cycle");

    }
        public void customInit ()
        {
            System.out.println("Initialization");
        }

        public void clean ()
        {
            System.out.println("Custom destroy");
        }

        @Override
        public void destroy () throws Exception {
            System.out.println("Destroy");
        }

        @Override
        public void afterPropertiesSet () throws Exception {
            System.out.println("After properties");
        }
    }
