package ro.fasttrackit.course5;

import java.util.Objects;
import java.util.UUID;

public class Professor implements Human {
    private UUID id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateOfHiring;
    private String specializationName;
    private ProfessorType type;

    public Professor() {

    }

    public Professor(UUID id, String firstName, String lastName, String dateOfBirth, String dateOfHiring, String specializationName, ProfessorType type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.specializationName = specializationName;
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("The professor eats pasta.");
    }

    @Override
    public String isHappyToday(boolean answer) {
        if (answer == true) {
            return "The Professor is happy";
        } else {
            return "The Professor is not happy";
        }
    }

    @Override
    public String saySomethingAboutYou() {
        return "I'm a professor and I'm always doing my best to teach my students.";
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    public ProfessorType getType() {
        return type;
    }

    public void setType(ProfessorType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", specializationName='" + specializationName + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(firstName, professor.firstName)
                && Objects.equals(lastName, professor.lastName)
                && Objects.equals(dateOfBirth, professor.dateOfBirth)
                && Objects.equals(dateOfHiring, professor.dateOfHiring)
                && Objects.equals(specializationName, professor.specializationName)
                && type == professor.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfHiring, specializationName, type);
    }
}
