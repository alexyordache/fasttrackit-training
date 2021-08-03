package ro.fasttrackit.course5;

import java.util.Objects;

public class Student implements Human {
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateOfEnrollment;
    private String facultyName;
    private String specializationName;
    private StudentType type;

    public Student() {
    }

    public Student(String id, String firstName, String lastName, String dateOfBirth, String dateOfEnrollment, String facultyName, String specializationName, StudentType type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEnrollment = dateOfEnrollment;
        this.facultyName = facultyName;
        this.specializationName = specializationName;
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("The student eats a pizza");
    }

    @Override
    public String isHappyToday(boolean answer) {
        if (answer == true) {
            return "The Student is happy";
        } else {
            return "The Student is not happy";
        }
    }

    @Override
    public String saySomethingAboutYou() {
        return "I'm a student and I always like to learn new things.";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    public StudentType getType() {
        return type;
    }

    public void setType(StudentType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfEnrollment='" + dateOfEnrollment + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", specializationName='" + specializationName + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id)
                && Objects.equals(firstName, student.firstName)
                && Objects.equals(lastName, student.lastName)
                && Objects.equals(dateOfBirth, student.dateOfBirth)
                && Objects.equals(dateOfEnrollment, student.dateOfEnrollment)
                && Objects.equals(facultyName, student.facultyName)
                && Objects.equals(specializationName, student.specializationName)
                && type == student.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, dateOfBirth, dateOfEnrollment, facultyName, specializationName, type);
    }
}
