package ro.fasttrackit.course5;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("01","John", "Doe", "12.10.1999", "20.10.2019", "Info", ProfessorType.PROFESSOR);
        prof1.eat();
        System.out.println(prof1.isHappyToday(true));
        System.out.println(prof1.saySomethingAboutYou());
        System.out.println(prof1);
        System.out.println(prof1.getType());
        prof1.setType(ProfessorType.ASSISTANT);
        System.out.println(prof1.getType());
        System.out.println(prof1);

        Professor prof2 = new Professor("012", "Madeira");
        prof2.setType(ProfessorType.PROFESSOR);
        System.out.println("--------------" + prof2.getType().getYourScholarType());

        Student stud1 = new Student("01", "Michael", "Jordan", "12.12.1995", "01.09.2020", "UTCN", "Math", StudentType.BACHELOR);
        System.out.println(stud1);
        System.out.println(stud1.isHappyToday(false));

        Student stud2 = new Student("012", "Triumf");
        System.out.println(stud2);
        stud2.setFirstName("Will");
        stud2.setLastName("Smith");
        System.out.println(stud2);
        stud2.setType(StudentType.MASTERS);
        System.out.println("--------------" + stud2.getType().getYourScholarType());
    }
}
