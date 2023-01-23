package kz.mautkazy.springcourse;

import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music{
    private String[] classicalMusic= {"Lunnaya Sonata", "Hungarian Rhapsody", "Sappy"};
    @Override
    public String[] getSong() {
        return classicalMusic;
    }
}
