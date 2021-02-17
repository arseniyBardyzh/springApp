package ru.bardyzh.springCourse;

import org.springframework.stereotype.Component;

public class JazzMusic implements Music{
    private static String[] songs = {"Summertime", "Stand By Me", "Feeling Good"};

    public JazzMusic(){
    }

    @Override
    public String getSong(int i) {
        return songs[i];
    }
    public String getSong() {
        return "Summertime";
    }
}
