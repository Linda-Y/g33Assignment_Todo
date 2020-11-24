package se.lexicon.Linda.Sara.Model;


import se.lexicon.Linda.Sara.Data.PersonSequancer;

public class Person {

    // create fields personId , firstName and lastName .
    private String firstName;
    private String lastName;
    private final int personId;



    public Person(String firstName, String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.personId= PersonSequancer.getnextPersonId();

    }

    // getters & setters

    public String getFirstName() {  return firstName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getPersonId() {
        return personId;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personId=" + personId +
                '}';
    }
}


