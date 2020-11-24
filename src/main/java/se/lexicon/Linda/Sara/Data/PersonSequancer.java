package se.lexicon.Linda.Sara.Data;

public class PersonSequancer {

    private static int personId;

    public static int getnextPersonId()
    {
        personId=personId+1;

        return PersonSequancer.personId;
    }
    //the value personId will trnsfer till Class Person

}
