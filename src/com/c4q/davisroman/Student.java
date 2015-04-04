package com.c4q.davisroman;

/**
 * Created by davis on 4/4/15.
 */
public class Student {
    private String name;
    private int numOfPencilsInPocket;
    private lunchbox lunch;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getNumOfPencilsInPocket(){
        return numOfPencilsInPocket;
    }
    public void setNumOfPencilsInPocket(int numOfPencilsInPocket){
        this.numOfPencilsInPocket = numOfPencilsInPocket;
    }

    public void setLunchBox(lunchbox lunch){
        this.lunch = lunch;
    }

    public lunchbox getLunchBox() {
        return lunch;
    }


}


