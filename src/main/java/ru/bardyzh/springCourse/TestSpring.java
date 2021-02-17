package ru.bardyzh.springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        /*Music classicalMusic = context.getBean("musicBeanClassic", Music.class);
        System.out.println(classicalMusic.getSong());

        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic);

        Music music2 = context.getBean("musicBeanRock", Music.class);

        MusicPlayer rockMusicPlayer = new MusicPlayer(music2);

        musicPlayer.playMusic();
        rockMusicPlayer.playMusic();*/

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();*/

        Computer computer = context.getBean("Computer", Computer.class);

        System.out.println(computer);

        context.close();

    }
}