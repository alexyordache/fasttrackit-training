package ro.fasttrackit.course9;

import ro.fasttrackit.course10.EntityNotFoundException;
import ro.fasttrackit.course10.ValidationException;
import ro.fasttrackit.course5.*;

/**
 * 3. Create a HumanService class, having 2 HumanRepository fields:
 * HumanRepository<Student> studentRepository
 * HumanRepository<Professor> professorRepository
 * Have a main method in the HumanService where you:
 * 3.1. Add 4 objects inside each repository
 * 3.2. Print all to System console
 * 3.3. Modify 2 objects inside each repository
 * 3.3. Print all to System console again, to show modified values
 * 3.4. Delete 2 objects inside each repository (1 that was modified, 1 that wasn’t)
 * 3.5. Print all to System console again
 * 3.6. Print a single element from each repository, retrieved by its name field (show getAllByName works)
 */

public class HumanService {
    private final static HumanRepository<Student> studentRepository = new HumanRepository<>();
    private final static HumanRepository<Professor> professorRepository = new HumanRepository<>();

    public static void main(String[] args) throws ValidationException, EntityNotFoundException {
        studentRepository.add(new Student("20", "Traian"));
        studentRepository.add(new Student("01", "Michael", "Jordan", "12.12.1999", "01.09.2020", "UTCN", "Math", StudentType.BACHELOR));
        studentRepository.add(new Student("02", "John", "Doe", "12.12.1995", "01.09.2021", "UBB", "Chemistry", StudentType.PHD));
        studentRepository.add(new Student("03", "Mihai", "Froid", "12.12.1996", "01.09.2023", "RRR", "Biology", StudentType.MASTERS));
        professorRepository.add(new Professor("04", "Mihai", "Eminescu", "12.10.1999", "20.10.2019", "Info", ProfessorType.PROFESSOR));
        System.out.println(studentRepository.getAll());
        System.out.println(professorRepository.getAll());

        studentRepository.updateById("01", new Student("12", "Vladimir", "Igor", "12.12.1993", "01.09.1999", "UTCN", "Math", StudentType.BACHELOR));
        studentRepository.updateById("02", new Student("13", "James", "Bond", "12.12.1907", "01.09.1999", "UBB", "Math", StudentType.BACHELOR));
        System.out.println(studentRepository.getAll());

        studentRepository.deleteById("03");
        studentRepository.deleteById("13");
        System.out.println("After deleteByID" + studentRepository.getAll());

        System.out.println(studentRepository.getById("12"));

        System.out.println(studentRepository.getAllByName("Vladimir"));
    }
}
