package com.c4q.davisroman;

/**
 * Created by davis on 4/4/15.
 */
public class Principal {
    private String name;
    public Principal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addTeacher(Teacher teacher){
        //FIXME
    }
    // Given a color, return the number of students that have this
    // color lunchbox
    public int numOfStudentsWithCertainColorLunchbox(String color){
        //FIXME
        return 0;
    }

    // Similar to the one above except that you should print the
    // names of students that have this color lunchbox.
    public void studentsWithCertainColorLunchbox(String color){
        //FIXME
    }

    // Given a student's name, return the student's teacher.
    // If no teacher is found, then print "new student"
    public String whoIsThisStudentsTeacher(String studentname){
        //FIXME
        return "";
    }

    // Print the teachers who have students with less than 3 pencils
    // in their pocket.
    public void teachersThatHaveStudentsWithLessThanACertainNumberOfPencils(int numOfPencils ){
        //FIXME
    }

}
