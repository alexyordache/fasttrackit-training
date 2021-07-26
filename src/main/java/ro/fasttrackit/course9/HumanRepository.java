package ro.fasttrackit.course9;

import ro.fasttrackit.course5.Human;

import java.util.ArrayList;
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
        humans.add(toAdd);
    }

    public List<T> getAll() {
        return humans;
    }

    public void deleteById(int id) {
        humans.remove(id);
    }

    public void updateById(int id, T human) {
        humans.set(id, human);
    }

    public void getById(int id) {
        System.out.println(humans.get(id));
    }

    public List<T> getAllByName(String name) {
        return humans.stream().filter(t -> t.getFirstName().startsWith(name)).collect(Collectors.toList());
    }
}
