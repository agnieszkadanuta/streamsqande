package java.agnieszkadanuta;

public class Person {

    public enum Sex {
        MALE,
        FEMALE,
    }

    private String name;
    private Sex gender;

    public Person(String name, Sex gender) {
        this.name = name;
        this.gender = gender;
    }

    public Sex getGender() {
        return gender;
    }


    public String getName() {
        return name;
    }

}
