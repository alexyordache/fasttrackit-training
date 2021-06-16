package ro.fasttrackit.course3;


public class Professor {
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String dateOfHiring;
    private String emailAddress;
    private boolean isPHD;

    public Professor() {
    }

    public Professor(String lastName, String firstName, String dateOfBirth, String dateOfHiring, String emailAddress, boolean isPHD) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.emailAddress = emailAddress;
        this.isPHD = isPHD;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isPHD() {
        return isPHD;
    }

    public void setPHD(boolean PHD) {
        isPHD = PHD;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", isPHD=" + isPHD +
                '}';
    }
}
