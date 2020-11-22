package se.lexicon.Linda.Sara.Model;

import org.junit.Test;

import static org.junit.Assert.*;
public class PersonTest {

    @Test
    public void createPerson()
    {

        Person person=new Person(20,"William","Fransson");
        assertEquals("Test getFirstName","William",person.getFirstName());
        assertEquals("Test getLastName","Fransson",person.getLastName());
        assertEquals("Test getPersonId",20, person.getPersonId());


    }
}