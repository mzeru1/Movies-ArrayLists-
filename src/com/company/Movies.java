package com.company;

import java.util.ArrayList;

public class Movies {

    private String title;
    private String actor;
    private int year;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setActor(String actor) {
        actor.toUpperCase();
        this.actor = actor;
    }

    public String getActor() {
        return actor.toUpperCase();
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

//    public void printMovies(ArrayList list) {
//        ArrayList<String> movieList = new ArrayList<String>();
//        for (String movies : movieList) {
//            System.out.println(movies);
//        }
//}
    public String display (){
        return getTitle() + "\n " + getActor() + "\n" + getYear();
    }
}
