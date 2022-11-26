package com.spring.mavenmca;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        //Create the spring object factory
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Get the bean
        Coach theCoach=context.getBean("myCoach",Coach.class);
        Coach alphaCoach=context.getBean("myCoach",Coach.class);
        //Compare the beans
        boolean result= (theCoach==alphaCoach);
        System.out.println("Both beans are same : "+result);
        System.out.println("Memory location of theCoach: "+theCoach);
        System.out.println("Memory location of alphaCoach: "+alphaCoach);
        //close the context
        context.close();
    }
}
