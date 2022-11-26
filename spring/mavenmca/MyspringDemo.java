package com.spring.mavenmca;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyspringDemo {
    public static void main(String[] args) {
        //Create the ApplicationContext
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Get the Bean
        Coach theCoach=context.getBean("myCoach",Coach.class);
        //Call the methods
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //Close the context
        context.close();
    }
}
