package ru.job4j.todo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.todo.model.Task;
import ru.job4j.todo.store.task.TaskStore;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SimpleTaskService implements TaskService {
    private final TaskStore taskStore;

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
