package ro.fasttrackit.course9;

import ro.fasttrackit.course5.*;

import java.util.UUID;

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

    public static void main(String[] args) {
        HumanRepository<Student> studentRepository = new HumanRepository<>();
        HumanRepository<Professor> professorRepository = new HumanRepository<>();

        studentRepository.add(new Student(UUID.randomUUID(), "Michael", "Jordan", "12.12.1999", "01.09.2020", "UTCN", "Math", StudentType.BACHELOR));
        studentRepository.add(new Student(UUID.randomUUID(), "John", "Doe", "12.12.1995", "01.09.2021", "UBB", "Chemistry", StudentType.PHD));
        studentRepository.add(new Student(UUID.randomUUID(), "Mihai", "Froid", "12.12.1996", "01.09.2023", "RRR", "Biology", StudentType.MASTERS));
        professorRepository.add(new Professor(UUID.randomUUID(), "Mihai", "Eminescu", "12.10.1999", "20.10.2019", "Info", ProfessorType.PROFESSOR));
        System.out.println(studentRepository.getAll());

        studentRepository.updateById(0, new Student(UUID.randomUUID(), "Vladimir", "Igor", "12.12.1993", "01.09.1999", "UTCN", "Math", StudentType.BACHELOR));
        studentRepository.updateById(2, new Student(UUID.randomUUID(), "James", "Bond", "12.12.1907", "01.09.1999", "UBB", "Math", StudentType.BACHELOR));
        System.out.println(studentRepository.getAll());

        studentRepository.deleteById(0);
        studentRepository.deleteById(1);
        System.out.println(studentRepository.getAll());

        studentRepository.getById(0);

        System.out.println(studentRepository.getAllByName("John"));

    }
}
