package java.agnieszkadanuta;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise from
 * https://docs.oracle.com/javase/tutorial/collections/streams/QandE/questions.html
 *
 * Write the following enhanced for statement as a pipeline with lambda expressions.
 * Hint: Use the filter intermediate operation and the forEach terminal operation.
 */
public class ExerciseOne {

    //JAVA 7

    public static void main(String[] args) {
        List<Person> roster = createRoster();
    }


        public static List<String> createMaleNameList7(List<Person> roster) {
            List<String> names = new ArrayList<>();

            for (Person p : roster) {
                if (p.getGender() == Person.Sex.MALE) {
                    names.add(p.getName());
                }
            }

            return names;
        }

        public static List<String> createMaleNameList8(List<Person> roster) {
            return roster.stream()
                    .filter(person -> person.getGender() == Person.Sex.MALE)
                    .map(person -> person.getName()).collect(Collectors.toList());
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
