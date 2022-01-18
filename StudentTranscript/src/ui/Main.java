package ui;

import model.Transcript;

public class Main {
    public static void main(String[] args) {
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ada Lovelace", 8853);
        Transcript t3 = new Transcript("Owen Koh", 1155);

        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);

        //TODO: add grades to the other Transcript objects
        t2.addGrade("CPSC-210", 3.6);
        t2.addGrade("ENGL-201", 3.3);
        t2.addGrade("CPSC-110", 3.7);

        t3.addGrade("CPSC-210", 4.0);
        t3.addGrade("ENGL-201", 3.5);
        t3.addGrade("CPSC-110", 3.8);

        System.out.print(t1.getStudentName() + ": ");
        t1.printTranscript();

        System.out.println(t1.getGPA());

        //TODO: add more use cases here
        System.out.print(t2.getStudentName() + ": ");
        t2.printTranscript();

        System.out.println(t2.getGPA());

        System.out.print(t3.getStudentName() + ": ");
        t3.printTranscript();

        System.out.println(t3.getGPA());
    }
}
