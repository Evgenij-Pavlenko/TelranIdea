public class Person {

    public static final String FEEDING_TYPE = "Milk";

    String firstName;
    String lastName;

    private Person(String firstName, String lasttName) {
        this.firstName = firstName;
        this.lastName = lasttName;
    }

    public static Person createPerson(String firstNameAndLastName){
        String[] split = firstNameAndLastName.split(";");
        return new Person(split[0], split[1]);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lasttName='" + lastName + '\'' +
                '}';
    }
}
