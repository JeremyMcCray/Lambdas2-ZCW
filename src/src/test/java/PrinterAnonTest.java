import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PrinterAnonTest {

    @Test
    public void printPersonTest() {
        Person person = new Person("john", 19, Person.Sex.MALE, "derp\n");
        Person person2 = new Person("joon", 21, Person.Sex.MALE, "herp\n");
        Person person3 = new Person("tom", 101, Person.Sex.MALE, "lerp\n");
        Person person4 = new Person("ron", 15, Person.Sex.MALE, "asd\n");
        Person person5 = new Person("johnny", 90, Person.Sex.MALE, null);
        ArrayList<Person> list = new ArrayList<>();

        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        PrinterAnon anon = new PrinterAnon();



        Integer expected = 4;
        Integer actual =  anon.printPerson(list,anon.ageTest);

        Assert.assertEquals(expected,actual);
    }
}
