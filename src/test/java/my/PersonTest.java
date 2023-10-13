package my;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class PersonTest {

        @Test
        void testConstructor() {

            //Given
            String expectedName = "Bob";
            long expectedId = 555665;

            //When
            Person person = new ConcretePerson(expectedId, expectedName);
            //Then
            assertEquals(expectedName, person.getName());
            assertEquals(expectedId, person.getId() );

        }

        @Test
        void testSetName() {
            Person person = new ConcretePerson(111);

            //Given
            String expected = "Bob";

            //When
            person.setName(expected);
            String actual = person.getName();
            //Then
            assertEquals(expected,actual);

        }
    }