package se.lexicon.Linda.Sara.Data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import se.lexicon.Linda.Sara.Data.TodoItems;
import se.lexicon.Linda.Sara.Data.TodoSequancer;
import se.lexicon.Linda.Sara.Model.Todo;

/// not finshed


public class TodoItemsTest {

    TodoItems testbroject;


    @Before
    public void setUp()  {

        testbroject=new TodoItems();
    }

    @Test
    public void sizetest() {
        int expected=0;
        Todo.clear();
        Assert.assertEquals(expected,People.size());
    }

    @Test
    public void findAlltest() {

    }

    @Test
    public void findByIdtest() {
        int expected=1;
        Assert.assertEquals(expected,Todo.findAll().length);

    }

    @Test
    public void addNewDoingToArraytest() {
    }



    @Test
    public void findByDoneStatustest() {
    }

    @Test
    public void findByAssigneetest() {
    }

    @Test
    public void testFindByAssigneetest() {
    }

    @Test
    public void findUnassignedTodoItemstest() {
    }

    @Test
    public void removeObjectFromArraytest() {
    }
    int expected=0;
    Todo.removeObjectFromArray(1);
    Assert.assertequals(expected,Todo.sizetest());
    Assert.assertNull(Todo.findByIdtest(2));

}