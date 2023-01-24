package kz.mautkazy.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    private String[] classicalMusic= {"Lunnaya Sonata", "Hungarian Rhapsody", "Sappy"};
    @Override
    public String[] getSong() {
        return classicalMusic;
    }
}
