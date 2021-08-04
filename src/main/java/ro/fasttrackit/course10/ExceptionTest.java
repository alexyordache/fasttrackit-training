package ro.fasttrackit.course10;

import ro.fasttrackit.course5.Student;
import ro.fasttrackit.course5.StudentType;
import ro.fasttrackit.course9.HumanRepository;

public class ExceptionTest {
    public static void main(String[] args) {
        HumanRepository<Student> studentRepository = new HumanRepository<>();
        try {
            studentRepository.add(new Student("02", "John", "Doe", "12.12.1995"
                    , "01.09.2021", "UBB", "Chemistry", StudentType.PHD));
            studentRepository.deleteById(null);
            System.exit(1);
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ValidationException e) {
            System.exit(1);
        }

        try {
            studentRepository.add(null);
            System.exit(1);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            studentRepository.updateById("5", null);
        } catch (EntityNotFoundException e) {
            System.exit(1);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            studentRepository.updateById("5", new Student("4", "John"));
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ValidationException e) {
            System.exit(1);
        }

        try {
            studentRepository.getById(null);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            studentRepository.getAllByName(null);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
