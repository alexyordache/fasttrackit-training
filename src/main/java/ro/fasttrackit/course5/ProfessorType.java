package ro.fasttrackit.course5;

public enum ProfessorType implements ScholarType {
    ASSISTANT("Professor type is assistant"),
    ASSOCIATE("Professor type is associate"),
    PROFESSOR("Professor type is professor");

    private String description;
    ProfessorType(String description) {
        this.description = description;
    }

    @Override
    public String getYourScholarType() {
        return description;
    }
}
