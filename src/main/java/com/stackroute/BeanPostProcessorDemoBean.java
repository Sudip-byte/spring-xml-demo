package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {

    // displaying bean name before initialization
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before initialization bean name is :"+beanName);
        return bean;
    }

    // displaying bean name after initialization
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after initialization bean name is :"+beanName);
        return bean;
    }

}
