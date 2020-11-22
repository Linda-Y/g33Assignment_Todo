package se.lexicon.Linda.Sara.Data;

import se.lexicon.Linda.Sara.Model.Person;
import se.lexicon.Linda.Sara.Model.Todo;

import java.util.Arrays;


public class People {


    // creat static Person array declared as empty but not null

    private static Person[]person = new Person[0];

    /* methods
   * method to return the length of the array .
  */

    public int size()
    {
       return  this.person.length;

    }
 //method to  return the person array.

    public Person[] findAll()
    {
        return this.person;

    }

    //method to return the person that has a matching personId .

    public Person findById(int personId)
    {
       int n=-1;

       for (int i=0;i<person.length;i++)

       { n =i; }

       if (n==-1)

       { return null;}

        return this.person[n];
    }


    /* method to create and add new Person to Person array.
    * 1-we need to declare a new array that is larger than the old array*/

    public Person[]addNewPersonToArray(Person[]person, Person personToAdd)

    {
      // 2-and copy the elements from the old array to the newly created array.

        Person[]newPersonArray=Arrays.copyOf(person,person.length+1);


     // 3- we can append the new person to this newly created array.

        newPersonArray[newPersonArray.length-1]= personToAdd ;

        return newPersonArray;

            }

    //clears all Person objects from the Person array.

    public void clear()

    {
    person=new Person[0];
    }

    /* founction to remove object from array
     *  - find the correct array index of the object
     *  - excluding the object on found index */

    public Person[] removeObjectFromArray (int personId)
    {
        int n = 0;

        for (int i = 0; i < person.length; i++)
        {

            if (person[i].getPersonId() == personId)
            {
                person = Arrays.copyOf(person, person.length - 1);
            }
            else if (person[n] !=person[i]) {

                n++; }

        }
        return person;
    }




}






