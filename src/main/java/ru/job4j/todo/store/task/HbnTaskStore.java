package ru.job4j.todo.store.task;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.job4j.todo.model.Task;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class HbnTaskStore implements TaskStore {
    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Optional<Task> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAll() {
        return List.of();
    }

    @Override
    public List<Task> findCompleted() {
        return List.of();
    }

    @Override
    public List<Task> findNew() {
        return List.of();
    }

    @Override
    public boolean update(Task task) {
        return false;
    }

    @Override
    public void deleteById(int id) {

    }
}
