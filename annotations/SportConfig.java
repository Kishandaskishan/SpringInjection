package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.annotations")
public class SportConfig {
    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }
    @Bean
    public Coach swimCoach(FortuneService fortuneService){
        return new SwimCoach(happyFortuneService());
    }
}
