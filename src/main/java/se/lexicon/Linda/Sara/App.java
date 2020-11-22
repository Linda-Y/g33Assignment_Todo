package se.lexicon.Linda.Sara ;

//creat new package Model with classes(Person,todo).
//creat another package Data with classes(PersonSequancer,TodoSequancer,People,Todoitems).

import se.lexicon.Linda.Sara.Model.Person;
import se.lexicon.Linda.Sara.Model.Todo;


public class App
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");

        Person[]person=new Person[3];
        person[0]= new Person(20, "Adam", "Ryan");
        person[1]= new Person(20, "Linda", "Yousif");
        person[2]= new Person(20, "Sara", "IranShahi");
        person[3]= new Person(20, "Carl","Göran");




        Person Adam_Ryan = new Person(20, "Adam", "Ryan");
        Person Linda_Yousif = new Person(20, "Linda", "Yousif");
        Person Sara_iranshahi = new Person(20, "Sara", "IranShahi");
        Todo Homework=new Todo("Homwork");

        System.out.println(Adam_Ryan.toString());
        System.out.println(Homework.toString());
    }
}
