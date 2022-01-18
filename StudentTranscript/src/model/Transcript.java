package model;

public class Transcript {
    private String studentName;
    private int studentID;

    public Transcript(String studentName, int studentID){
        this.studentName = studentName;
        this.studentID = studentID;
    }

    // getters
    public String getStudentName(){
        return null;
    }

    // setters
    public void setStudentName(){
        //stub
    }

    // setters
    public void setStudentID(){
        //stub
    }

    //REQUIRES: the grade should be between 0.0 and 4.0, and/or
    //          the course should not be null
    //MODIFIES: this
    //EFFECTS: adds a grade into a transcript
    public void addGrade(String course, double grade){
        //stub
    }

    //REQUIRES: the list should not be empty
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
