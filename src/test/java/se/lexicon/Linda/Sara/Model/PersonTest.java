package se.lexicon.Linda.Sara.Model;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

    @Test
    public void createPerson()
    {

        Person person=new Person("William","Fransson");
        assertEquals("Test getFirstName","William",person.getFirstName());
        assertEquals("Test getLastName","Fransson",person.getLastName());
        assertEquals("Test getPersonId",20, person.getPersonId());


    }
}