import org.junit.Assert;
    import org.junit.Test;

import java.util.ArrayList;

public class PrinterInnerTest {

    @Test
    public void printPersonTest(){
        Person person = new Person("john",10, Person.Sex.MALE,"derp\n");
        Person person2 = new Person("joon",10, Person.Sex.MALE,"herp\n");
        Person person3 = new Person("tom",10, Person.Sex.MALE,"lerp\n");
        Person person4 = new Person("ron",10, Person.Sex.MALE,"asd\n");
        Person person5 = new Person("johnny",10, Person.Sex.MALE,null);
        PrinterInner.emailChecker asd = new PrinterInner.emailChecker();
        ArrayList<Person> list = new ArrayList<>();

        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);


        PrinterInner printerInner = new PrinterInner();


        Integer expectedSize = 4;
        Integer actualSize = printerInner.printPerson(list,asd);

        Assert.assertEquals(expectedSize,actualSize);
    }
}
