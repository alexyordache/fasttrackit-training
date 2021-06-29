package ro.fasttrackit.course5;

public enum StudentType implements ScholarType {
    BACHELOR ("Student type is Bachelor"),
    MASTERS ("Student type is Master"),
    PHD ("Student type is PHD");

    private String description;
    StudentType(String description) {
        this.description = description;
    }

    @Override
    public String getYourScholarType() {
        return description;
    }
}
