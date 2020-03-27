import java.util.List;

public class PrinterLambda {

    public CheckPerson lamdaGreaterThan16(){
        return person -> person.getBirthday() > 16;
    }

    public Integer printPerson(List<Person> roster,CheckPerson tester){
        int counter = 0;
        for (Person p: roster) {
            if(tester.test(p)){
                p.printPerson();
                counter++;
            }
        }
        return counter;
    }

}
