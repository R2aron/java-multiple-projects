package streams;

public class PersonFromStreams {
    private String firstName;
    private String lastName;
    private int age;

    public PersonFromStreams(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static boolean isOldEnough(PersonFromStreams p)
    {
        return p.getAge()>=18;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonFromStreams{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
