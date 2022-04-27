import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTests {

    private Student student;

    @Before
    public void setup() {student = new Student(1);
    }

    @Test
    public void testGetId() {
        assertEquals(1, student.getId());
    }
}
