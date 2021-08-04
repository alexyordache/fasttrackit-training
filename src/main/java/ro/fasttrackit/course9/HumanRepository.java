package ro.fasttrackit.course9;

import ro.fasttrackit.course5.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    public void add(T toAdd) {
        System.out.println("--------------------add--------------------");
        humans.add(toAdd);
    }

    public List<T> getAll() {
        System.out.println("--------------------getAll--------------------");
        return Collections.unmodifiableList(humans);
    }

    public void deleteById(String id) {
        System.out.println("--------------------deleteById--------------------");
        T exists = humans.stream()
                .filter(t -> (t.getId().equals(id)))
                .findFirst().orElseThrow(() -> new RuntimeException("Human does not exist"));
        humans.remove(exists);
    }

    public void updateById(String id, T human) {
        System.out.println("--------------------updateById--------------------");
        T exists = humans.stream()
                .filter(t -> (t.getId().equals(id)))
                .findFirst().orElseThrow(() -> new RuntimeException("Human does not exist"));
        humans.remove(exists);
        humans.add(human);
    }

    public String getById(String id) {
        System.out.println("--------------------getById--------------------");
        return humans.stream()
                .filter(t -> (t.getId().equals(id)))
                .collect(Collectors.toList())
                .toString();
    }

    public List<T> getAllByName(String name) {
        System.out.println("--------------------getAllByName--------------------");
        return humans.stream()
                .filter(t -> t.getFirstName().startsWith(name))
                .collect(Collectors.toList());
    }
}
