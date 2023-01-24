package kz.mautkazy.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(), qpopMusic(), hipHopMusic());
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
