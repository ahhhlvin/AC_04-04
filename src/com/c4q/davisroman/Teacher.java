package com.c4q.davisroman;

import java.util.HashMap;

/**
 * Created by davis on 4/4/15.
 */
public class Teacher {

    HashMap<String, Student> teacherStudents = new HashMap<String, Student>();


    private String name;
    public Teacher(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addStudent(Student student){
        //FIXME how to map student to teacher relationship?
        teacherStudents.put(student.getName(), student);

    }

    public void getEachStudent() {
        for (String studentName : teacherStudents.keySet()) {
            Student myS1 = teacherStudents.get(studentName);
            System.out.println(myS1.getName());
        }
    }


    public HashMap<String, Student> getStudents() {
        return teacherStudents;
    }

}
