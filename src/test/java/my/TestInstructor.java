package my;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestInstructor {
    void testImplementation() {
        //Given
        Instructor instructor = new Instructor(1);

        //Then
        assertTrue(instructor instanceof Teacher);

    }
    @Test
    void testInheritance() {
        //Given

        Instructor instructor = new Instructor(1);

        //Then
        assertTrue(instructor instanceof Person);

    }
    @Test
    void testTeach() {
        //Given
        Instructor instructor = new Instructor(1);
        Student student = new Student(2);
        double expected = 100.00;

        //When
        instructor.teach(student, expected);
        //Then
        assertEquals(student.getTotalStudyTime(), expected);

    }
    @Test
    void testLecture(){
        //Given
        Instructor instructor = new Instructor(1);
        Student[] students = {
                new Student(2),
                new Student(3),
                new Student(4),
                new Student(5),
        };
        double hours = 100.00;
        double expected = hours /students.length;
        //When
        instructor.lecture(students, hours);
        //Then
        for (Student student : students) {
            assertEquals(expected, student.getTotalStudyTime());
        }


    }
}
