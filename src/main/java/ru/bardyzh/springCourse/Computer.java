package ru.bardyzh.springCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static ru.bardyzh.springCourse.Genre.*;

@Component("Computer")
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    public String toString(){
        return "Computer " + id + " " + musicPlayer.playMusic(JAZZ);
    }
}
