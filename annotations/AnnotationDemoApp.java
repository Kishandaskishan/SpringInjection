package com.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        //Create the Object Factory
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext1.xml");
        //Get the Bean
        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        //Call the Methods using Beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //Close the Context
        context.close();
    }
}
