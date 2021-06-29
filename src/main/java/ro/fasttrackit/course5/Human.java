package ro.fasttrackit.course5;

public interface Human {
    void eat();
    String isHappyToday(boolean answer);
    String saySomethingAboutYou();

    String getFirstName();
    void setFirstName(String firstName);
    String getLastName();
    void setLastName(String lastName);
    String getDateOfBirth();
    void setDateOfBirth(String dateOfBirth);
    String getSpecializationName();
    void setSpecializationName(String specializationName);
    ScholarType getType();


}
