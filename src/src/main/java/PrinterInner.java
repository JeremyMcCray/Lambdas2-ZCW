import java.util.List;

public class PrinterInner {
    static class emailChecker implements CheckPerson{

        @Override
        public  boolean test(Person person) {
            return person.getEmailAddress() != null;
        }
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
