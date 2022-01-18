package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TranscriptTest {
    private Transcript testTranscript;

    @Before
    public void setup(){
        testTranscript = new Transcript("Owen", 1000);
    }

    @Test
    public void testAddOneGradeInTranscript(){
        testTranscript.addGrade("CPSC-210", 4.0);
        assertTrue(testTranscript.isCourseTaken("CPSC-210"));

    }

    @Test
    public void testGetCourseAndGradeFromTranscript(){
        testTranscript.addGrade("CPSC-210", 4.0);
        testTranscript.addGrade("CPSC-310", 3.0);
        testTranscript.addGrade("CPSC-410", 3.0);

        assertEquals(testTranscript.getCourseAndGrade("CPSC-210"), "CPSC-210: " + 4.0);
    }

    @Test
    public void testGetGPAOfStudent(){
        testTranscript.addGrade("CPSC-210", 4.0);
        testTranscript.addGrade("CPSC-310", 3.0);
        testTranscript.addGrade("CPSC-410", 3.0);
        testTranscript.addGrade("CPSC-210", 2.0);
        assertEquals(testTranscript.getSizeOfCoursesTaken(), 4);
    }

    @Test
    public void testSetStudentID(){
        testTranscript.setStudentID(1122);
        assertEquals(testTranscript.getStudentID(),1122);
    }

    @Test
    public void testSetStudentName(){
        testTranscript.setStudentName("YoungSoo");
        assertEquals(testTranscript.getStudentName(), "YoungSoo");
    }
}
