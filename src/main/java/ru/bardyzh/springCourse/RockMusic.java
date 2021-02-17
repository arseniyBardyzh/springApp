package ru.bardyzh.springCourse;

import org.springframework.stereotype.Component;

@Component("musicBeanRock")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Smells like tean spirit";
    }
}
