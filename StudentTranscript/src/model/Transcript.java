package model;

import java.util.ArrayList;
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
    private double gpa;

    public Transcript(String studentName, int studentID){
        this.studentName = studentName;
        this.studentID = studentID;
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    // getters
    public String getStudentName(){
        return this.studentName;
    }

    // getters
    public int getStudentID(){
        return this.studentID;
    }

    // setters
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    // setters
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    // getters
    public int getSizeOfCoursesTaken(){
        return courses.size();
    }

    //EFFECT: returns true/false to see the course is taken
    public boolean isCourseTaken(String course){
        return courses.contains(course);
    }

    //REQUIRES: the grade should be between 0.0 and 4.0, and/or
    //          the course should not be null
    //MODIFIES: this
    //EFFECTS: adds a grade into a transcript
    public void addGrade(String course, double grade){
        courses.add(course);
        grades.add(grade);
    }

    //REQUIRES: a course the student has already taken
    //MODIFIES: nothing
    //EFFECTS: return course name and grade in format CourseName: Grade
    public String getCourseAndGrade(String course){
        return course + ": " + grades.get(courses.indexOf(course));
    }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS: prints a transcript with course names and grades
    //         and displays student academic record
    public void printTranscript(){
        for(int i=0; i < courses.size(); i++) {
            System.out.print(courses.get(i) + ": " + grades.get(i) + ",");
        }
    }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS: calculates the GPA and returns the GPA
    public String getGPA(){
        for(double n : grades){
            this.gpa = gpa + n;
        }
        return "\nGPA:" + gpa/grades.size();
    }

}
