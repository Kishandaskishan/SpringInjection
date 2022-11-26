package com.annotations;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //Create the spring object factory
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext1.xml");

        //Get the bean
        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
        //Compare the beans
        boolean result= (theCoach==alphaCoach);
        System.out.println("Both beans are same : "+result);
        System.out.println("Memory location of theCoach: "+theCoach);
        System.out.println("Memory location of alphaCoach: "+alphaCoach);
        //close the context
        context.close();
    }
}
