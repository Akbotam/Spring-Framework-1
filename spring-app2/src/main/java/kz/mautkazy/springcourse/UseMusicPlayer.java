package kz.mautkazy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseMusicPlayer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

       /* Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music); //Doing dependency injection by ourselves
        Music music2 = context.getBean("qpopMusic", Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2); //Doing dependency injection by ourselves
        musicPlayer.playMusic();
        musicPlayer2.playMusic();*/

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());

        context.close();
    }
}
