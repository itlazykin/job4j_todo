package ru.job4j.todo.service;

import ru.job4j.todo.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task create(Task task);

    Optional<Task> findById(int id);

    List<Task> findAll();

    List<Task> findCompleted();

    List<Task> findNew();

    boolean update(Task task);

    void deleteById(int id);
}
