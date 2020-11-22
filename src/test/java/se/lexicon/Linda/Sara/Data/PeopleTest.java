package se.lexicon.Linda.Sara.Data;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.Linda.Sara.Model.Person;
import se.lexicon.Linda.Sara.Data.PersonSequancer;
import se.lexicon.Linda.Sara.Data.People;

///// test  not finshed

import static org.junit.Assert.*;

public class PeopleTest {
    People people;
    Person person;

    @Before
    public void setUp()  {
      people=new People();


    }

    @Test
    public void addNewPersonArray
        Person person=new Person(20,"William","Fransson");
        assertEquals("Test getFirstName","William",person.getFirstName());
        assertEquals("Test getLastName","Fransson",person.getLastName());
        assertEquals("Test getPersonId",20, person.getPersonId());
    }
    }

    @Test
    public void size_test() {
    int expected=0;
    People.clear();
        Assert.assertEquals(expected,People.size());

    }

    @Test
    public void findAll_test() {
        int expected=1;
        Assert.assertEquals(expected,People.findAll().length);

    }



    @Test

    public void  remove_ObjectFromArray_test() {
    int expected=0;
    People.removeObjectFromArray(1);
    Assert.assertequals(expected,People.size());
    Assert.assertNull(People.findById(2);)

    }
}