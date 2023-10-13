package my;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestPeople {
    @Test
    void testAdd(){
        //Given
        People people = new People();
        Person person1 = new Student(1);
        Person person2 = new Instructor(2);
        //when
        people.add(person1);
        people.add(person2);

        //then
        assertTrue(people.contains(person1));
        assertTrue(people.contains(person2));

    }
    void testRemove(){
        //Given
        People people = new People();
        Person person1 = new Student(1);
        Person person2 = new Instructor(2);
        //when
        people.add(person1);
        people.add(person2);
        people.remove(person1.getId());

        //then
        assertTrue(people.contains(person1));
        assertFalse(people.contains(person2));

    }
    @Test
    public void testFindById() {
        People people = new People();

        // Given
        Person person1 = new Student(1, "John");
        Person person2 = new Student(2, "Jane");

        // When
        people.add(person1);
        people.add(person2);

        // Then
        assertEquals(person1, people.findByID(1));
        assertEquals(person2, people.findByID(2));
        assertNull(people.findByID(3));
    }
}
