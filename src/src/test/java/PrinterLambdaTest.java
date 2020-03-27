import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PrinterLambdaTest {

    @Test
    public void printPersonTest(){
        Person person = new Person("john",50, Person.Sex.MALE,"derp\n");
        Person person2 = new Person("joon",19, Person.Sex.MALE,"herp\n");
        Person person3 = new Person("tom",15, Person.Sex.MALE,"lerp\n");
        Person person4 = new Person("ron",11, Person.Sex.MALE,"asd\n");
        Person person5 = new Person("johnny",32, Person.Sex.MALE,null);
        ArrayList<Person> list = new ArrayList<>();

        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        PrinterLambda lamd = new PrinterLambda();





        Integer expectedSize = 3;
        Integer actualSize =  lamd.printPerson(list, lamd.lamdaGreaterThan16());

        Assert.assertEquals(expectedSize,actualSize);
    }
}
