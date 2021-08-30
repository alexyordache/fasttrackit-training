package org.fasttrackit.springdemo.repository;

import org.fasttrackit.springdemo.model.Human;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository<T extends Human> {

    private final List<T> humansInMemory = new ArrayList<>();

    public List<T> getAll() {
        return new ArrayList<>(humansInMemory);
    }

    public void add(T toAdd) {
        this.humansInMemory.add(toAdd);
    }
}
