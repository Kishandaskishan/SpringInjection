package com.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SourceConfigBeanDemoApp {
    public static void main(String[] args) {
        //Create the Object Factory
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SportConfig.class);
        //Get the Bean
        Coach theCoach=context.getBean("swimCoach",Coach.class);
        //Call the Methods using Beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //Close the Context
        context.close();
    }
}
