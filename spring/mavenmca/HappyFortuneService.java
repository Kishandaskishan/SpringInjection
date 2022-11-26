package com.spring.mavenmca;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Have a good Day";
    }
}
