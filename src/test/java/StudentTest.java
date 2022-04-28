import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest {

    private Student student;

    @Before
    public void setup() {
        student = new Student("Daniel", 1);
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(80);
    }

    @Test
    public void testGetId() {
        assertEquals(1, student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Daniel", student.getName());
    }

    @Test
    public void testAddGrade() {
//        assertEquals(90, student.getGrades().get(0));

        boolean hasGrade1 = student.getGrades().contains(100);
        boolean hasGrade2 = student.getGrades().contains(90);
        boolean hasGrade3 = student.getGrades().contains(80);

        assertTrue(hasGrade1);
        assertTrue(hasGrade2);
        assertTrue(hasGrade3);
    }

    @Test
    public void testGetGrade() {
        assertEquals("[100, 90, 80]", student.getGrades().toString());
    }

    @Test
    public void testGetGradeAverage() {
        assertEquals(87.22, student.getGradeAverage(), 0.01);
    }

}
