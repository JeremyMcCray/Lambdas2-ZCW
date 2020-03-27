import java.util.List;

public class PrinterAnon {

    CheckPerson ageTest = new CheckPerson() {
        @Override
        public boolean test(Person person) {
            return person.getBirthday()>18;
        }
    };

    public Integer printPerson(List<Person> roster, CheckPerson tester){
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
