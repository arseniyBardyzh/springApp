package ru.bardyzh.springCourse;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{

    private static String[] songs = {"We will Rock You", "Song 2", "Can't Stop"};

    public RockMusic(){
    }

    @Override
    public String getSong(int i) {
        return songs[i];
    }
}
