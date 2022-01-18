package model;

import java.util.List;


/**
 * INVARIANT: course list and grade list are the same size
 * each course has a grade associated, and vice versa, at matching indices
 */
public class Transcript {
    private String studentName;
    private int studentID;
    private List<String> courses;
    private List<Double> grades;

    public Transcript(String studentName, int studentID){
        this.studentName = studentName;
        this.studentID = studentID;

    }

    // getters
    public String getStudentName(){
        return null;
    }

    // getters
    public int getStudentID(){
        return 0;
    }

    // setters
    public void setStudentName(String studentName){
        //stub
    }

    // setters
    public void setStudentID(int studentID){
        //stub
    }

    // getters0
    public int getSize(){
        return 0;
    }

    //EFFECT: returns true/false to see the course is taken
    public boolean isCourseTaken(String course){
        return false;
    }

    //REQUIRES: the grade should be between 0.0 and 4.0, and/or
    //          the course should not be null
    //MODIFIES: this
    //EFFECTS: adds a grade into a transcript
    public void addGrade(String course, double grade){
        //stub
    }

    //REQUIRES: a course the student has already taken
    //MODIFIES: nothing
    //EFFECTS: return course name and grade in format CourseName: Grade
    public String getCourseAndGrade(String course){
        return null;
    }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS: prints a transcript with course names and grades
    //         and displays student academic record
    public void printTranscript(){
        //stub
    }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS: calculates the GPA and returns the GPA
    public double getGPA(){
        return 0.0;
    }

}
