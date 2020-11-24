package se.lexicon.Linda.Sara.Data;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.Linda.Sara.Model.Person;
import se.lexicon.Linda.Sara.Data.PersonSequancer;
import se.lexicon.Linda.Sara.Data.People;

///// test  not finshed

public class PeopleTest {
    People testobject;

    @Before
    public void setUp() {
        testobject =new People() ;}

    @Test
    public void addNewPersonArrayTest(){
        Person testPerson=new Person("William","Fransson");
    Person[]expected={testPerson};

        assertTrue(testobject.findAll().length==0); // why
        Person[]actual=testobject.addNewPersonToArray(testPerson);
        assertArrayEquuals(expected,actual);
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
    Assert.assertNull(People.findById(2));

    }
}