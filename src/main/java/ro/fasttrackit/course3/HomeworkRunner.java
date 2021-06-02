package ro.fasttrackit.course3;

public class HomeworkRunner {
    public static void main(String[] args) {
        Professor firstProfessor = new Professor();
        Professor secondProfessor = new Professor("John", "Doe", "1989/10/12", "12/10/2008", "john.doe@yahoo.com", true);

        System.out.println(firstProfessor.toString());
        System.out.println(secondProfessor.toString());
    }
}
