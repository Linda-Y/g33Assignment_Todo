package se.lexicon.Linda.Sara.Data;
import se.lexicon.Linda.Sara.Model.Person;
import se.lexicon.Linda.Sara.Model.Todo;

import java.util.Arrays;

public class TodoItems
{
    // return the length of the array.
    // declared  an empty array (not null)

    private static Todo[] todoing = new Todo[0];


    //return the length of the array.

    public int size()
    {
        return this.todoing.length;
    }


    // return the Todo array
    public Todo[] findAll()
    {

        return this.todoing;

    }

     // return the todo that has a mathing todoId

    public Todo[] findById(int todoId) {

        int n = -1;

        for (int i = 0; i < todoing.length; i++) {
            n = i;
        }

        if (n == -1) {
            return null;
        }

        return this.todoing;
    }


    /* method to create and add new Person to Person array.
     * 1-we need to declare a new array that is larger than the old array*/

    public Todo[] addNewDoingToArray(Todo[] todoing, Todo doingToAdd)
    {

      // 2-and copy the elements from the old array to the newly created array.'

        Todo[] newDoingArray = Arrays.copyOf(todoing, todoing.length + 1);

     // 3- we can append the new person to this newly created array.

        newDoingArray[newDoingArray.length - 1] = doingToAdd;

        return newDoingArray;
    }


    public void clear()
    {
        todoing = new Todo[0];
    }

    public Todo[] find;


    //Returns array with objects that has a matching done status.

    public Todo[] findByDoneStatus(boolean doneStatus)
    {
        Todo[] foundByStatus=new Todo[0];

        int n=0;

        for ( int i=0; i<todoing.length;i++) {

            if (todoing[i].isDone() == doneStatus) {
                foundByStatus = Arrays.copyOf(foundByStatus, foundByStatus.length + 1);

                foundByStatus[n] = todoing[i];

                n++;
            }
        }
        return foundByStatus;
    }


  // Returns array with objects that has an assignee with a personId matching.

   public Todo[]findByAssignee(int personId)
   {
       Todo[]foundByPersonId=new Todo[0];

       int n=0;

       for (int i=0; i<foundByPersonId.length;i++)
       {
           if (todoing[i].getAssignee() != null)
           {
               if (todoing[i].getAssignee().getPersonId() == personId)
               {
                   foundByPersonId= Arrays.copyOf(foundByPersonId, foundByPersonId.length + 1);

                   foundByPersonId[n] = todoing[i];

                   n++;
               }
           }
       }

       return foundByPersonId;

   }

  //  Returns array with objects that has sent in Person.


        public Todo[] findByAssignee(Person assignee)

           {

              Todo[]foundByPerson= new Todo[0];

              int n=0;

              for (int i=0; i<foundByPerson.length;i++)

                {

                    if (todoing[i].getAssignee() == assignee )

                   {
                    foundByPerson= Arrays.copyOf(foundByPerson, foundByPerson.length + 1);

                    foundByPerson[n] = todoing[i];

                     n++;
                   }
                }

              return foundByPerson;

          }


     //  Returns an array of objects that does not have an assignee set

       public Todo[] finfUnassignedTodoItems()
        {

            Todo[] unassigned = new Todo[0];

            int n = 0;

            for (int i = 0; i < unassigned.length; i++)
            {

                if (todoing[i].getAssignee() == null)
                {
                    unassigned = Arrays.copyOf(unassigned, unassigned.length + 1);


                    unassigned[n] = todoing[i];

                    n++;
                }
            }

            return unassigned;

        }

        /* founction to remove object from array
          *  - find the correct array index of the object
          *  - excluding the object on found index */

      public Todo[] removeObjectFromArray (int todoId)
       {
           int n = 0;

            for (int i = 0; i < todoing.length; i++)
            {

               if (todoing[i].getTodoId() == todoId)
               {
                todoing = Arrays.copyOf(todoing, todoing.length - 1);
               }
               else if (todoing[n] != todoing[i]) {

                n++; }
            }
            return todoing;
       }

    /*@Override
    public String toString() {
        return "TodoItems{" +
                "find=" + Arrays.toString(find) +
                '}';
    }*/
}













