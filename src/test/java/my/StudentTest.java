package my;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StudentTest {
    @Test
    void testImplementation() {
        //Given
        Student student = new Student(1);

        //Then
        assertTrue(student instanceof Learner);

    }
    @Test
    void testInheritance() {
        //Given
        Student student = new Student(1);

        //Then
        assertTrue(student instanceof Person);

    }
    @Test
    void testLearn() {
        //Given
        Student student = new Student(1);
        double expected = 100.00;

        //When
        student.learn(expected);
        //Then
        assertEquals(student.getTotalStudyTime(), expected);

    }
}
