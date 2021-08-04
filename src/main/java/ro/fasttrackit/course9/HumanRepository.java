package ro.fasttrackit.course9;

import ro.fasttrackit.course10.EntityNotFoundException;
import ro.fasttrackit.course10.ValidationException;
import ro.fasttrackit.course5.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 1. Create a HumanRepository<T> where T extends Human class which contains an instance field List<T> humans.
 * (use the classes in the homework with Human, Student & Professor)
 * 2. Create the following methods in the human repository. Use stream() where necessary:
 * 2.1. A method add(T toAdd) to add a human T to the list.
 * 2.2. A method getAll() to read all humans inside the list.
 * 2.3. A method deleteById(String id)  to delete a human based on an ID.
 * 2.4. A method updateById(String id, T human) to modify a human based on its given ID.
 * 2.5. A method getById(String id) to read a human based on its given ID.
 * 2.6. A method getAllByName(String name) to read all humans by name.
 */
public class HumanRepository<T extends Human> {
    List<T> humans = new ArrayList<>();

    public void add(T maybeToAdd) throws ValidationException {
        System.out.println("--------------------add--------------------");
        T toAdd = Optional.ofNullable(maybeToAdd).orElseThrow(() -> new ValidationException("ToAdd object should not be null"));
        humans.add(toAdd);
    }

    public List<T> getAll() {
        System.out.println("--------------------getAll--------------------");
        return Collections.unmodifiableList(humans);
    }

    public void deleteById(String id) throws EntityNotFoundException {
        System.out.println("--------------------deleteById--------------------");
        T exists = humans.stream()
                .filter(t -> (t.getId().equals(id)))
                .findFirst().orElseThrow(() -> new EntityNotFoundException("Human does not exist"));
        humans.remove(exists);
    }

    public void updateById(String id, T maybeHuman) throws EntityNotFoundException, ValidationException {
        System.out.println("--------------------updateById--------------------");
        T human = Optional.ofNullable(maybeHuman).orElseThrow(() -> new ValidationException("Human should not be null"));
        T exists = humans.stream()
                .filter(t -> (t.getId().equals(id)))
                .findFirst().orElseThrow(() -> new EntityNotFoundException("Human does not exist"));
        humans.remove(exists);
        humans.add(human);
    }

    public String getById(String maybeId) throws ValidationException {
        System.out.println("--------------------getById--------------------");
        String id = Optional.ofNullable(maybeId).orElseThrow(() -> new ValidationException("Id should not be null"));
        return humans.stream()
                .filter(t -> (t.getId().equals(id)))
                .collect(Collectors.toList())
                .toString();
    }

    public List<T> getAllByName(String maybeName) throws ValidationException {
        System.out.println("--------------------getAllByName--------------------");
        String name = Optional.ofNullable(maybeName).orElseThrow(() -> new ValidationException("GetAllByName should not be called with a null \"name\" String"));
        return humans.stream()
                .filter(t -> t.getFirstName().startsWith(name))
                .collect(Collectors.toList());
    }
}
