package kz.mautkazy.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("kz.mautkazy.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public QpopMusic qpopMusic() {
        return new QpopMusic();
    }
    @Bean
    public HipHopMusic hipHopMusic() {
        return new HipHopMusic();
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), qpopMusic());
    }
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}