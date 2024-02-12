import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private int sizeInCm;

    public Person(String firstName, String lastName, LocalDate dob, int sizeInCm) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.sizeInCm = sizeInCm;
    }

    public Person(String firstName, String lastName, String date, int sizeInCm) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sizeInCm = sizeInCm;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", sizeInCm=" + sizeInCm +
                '}';
    }
}
