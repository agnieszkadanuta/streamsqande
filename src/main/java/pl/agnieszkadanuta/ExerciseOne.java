package pl.agnieszkadanuta;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise from
 * https://docs.oracle.com/javase/tutorial/collections/streams/QandE/questions.html
 *
 * Write the following enhanced for statement as a pipeline with lambda expressions.
 * Hint: Use the filter intermediate operation and the forEach terminal operation.
 */
public class ExerciseOne {

    public static void main(String[] args) {

        List<Person> roster = createRoster();
        for (Person p : roster) {
            if (p.getGender() == Person.Sex.MALE) {
                System.out.println(p.getName());
            }
        }
        //JAVA 8

        roster.stream()
                .filter(person -> person.getGender() == Person.Sex.MALE)
                .forEach(person -> System.out.println(person.getName()));
        
    }

    private static List<Person> createRoster(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Marek", Person.Sex.MALE));
        list.add(new Person("Kinga", Person.Sex.FEMALE));
        list.add(new Person("Magda", Person.Sex.FEMALE));
        list.add(new Person("Karol", Person.Sex.MALE));
        list.add(new Person("Jan", Person.Sex.MALE));
        list.add(new Person("Gabriela", Person.Sex.FEMALE));
        list.add(new Person("Hubert", Person.Sex.MALE));
        list.add(new Person("Jola", Person.Sex.FEMALE));
        list.add(new Person("Czeslaw", Person.Sex.MALE));
        list.add(new Person("Damian", Person.Sex.MALE));

        return list;
    }
}
