package com.c4q.davisroman;


import java.util.HashMap;

/**
 * Created by davis on 4/4/15.
 */
public class Principal {

    HashMap<String, Teacher> teachers = new HashMap<String, Teacher>();


    private String name;
    public Principal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addTeacher(Teacher teacher){

        // each teacher has its own HashMaps!
        teachers.put(teacher.getName(), teacher);

    }
    // Given a color, return the number of students that have this
    // color lunchbox
    public int numOfStudentsWithCertainColorLunchbox(String color){
        int counter = 0;
        for (String teacherName : teachers.keySet()) {
            Teacher teacher = teachers.get(teacherName);
            // creates a variable for each TEACHER that is going through the 'for each' loop
            for (String student : teacher.getStudents().keySet()) {
                Student myS1 = teachers.get(teacherName).getStudents().get(student);
                // creates a variable for each STUDENT within each TEACHER that is going through the 'for each' loop


                if (myS1.getLunchBox().getName().equals(color)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    // Similar to the one above except that you should print the
    // names of students that have this color lunchbox.
    public void studentsWithCertainColorLunchbox(String color){
        //FIXME
        for (String teacherName : teachers.keySet()) {
            Teacher teacher = teachers.get(teacherName);
            for (String student : teacher.getStudents().keySet()) {
                Student myS1 = teachers.get(teacherName).getStudents().get(student);

                if (myS1.getLunchBox().getName().equals(color)) {
                    System.out.println(myS1.getName());;
                }
            }
        }
    }

    // Given a student's name, return the student's teacher.
    // If no teacher is found, then print "new student"
    public String whoIsThisStudentsTeacher(String studentName){
        //FIXME

        for (String teacherName : teachers.keySet())
        {
            Teacher teacher = teachers.get(teacherName);
            for(String student : teacher.getStudents().keySet())
            {

                // if students within specific teacher set is equal to the name of the input 'studentName', return the name of that teacher from the list of teachers
                if(student.equals(studentName))
                {
                    return teacherName;
                }

            }
        }

        return "new student";
    }


    // Print the teachers who have students with less than 3 pencils
    // in their pocket.
    public void teachersThatHaveStudentsWithLessThanACertainNumberOfPencils(int numOfPencils ){
        //FIXME
        for (String teacherName : teachers.keySet())
        {
            Teacher teacher = teachers.get(teacherName);
            for(String student : teacher.getStudents().keySet())
            {
                Student myS1 = teachers.get(teacherName).getStudents().get(student);

                if(myS1.getNumOfPencilsInPocket() < 3)
                {
                    System.out.println(teacherName);
                }
            }
        }
    }

}
