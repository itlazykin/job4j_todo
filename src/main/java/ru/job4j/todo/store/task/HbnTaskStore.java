package ru.job4j.todo.store.task;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ru.job4j.todo.model.Task;
import ru.job4j.todo.store.CrudStore;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class HbnTaskStore implements TaskStore {
    private final CrudStore crudStore;
    private final Logger logger = LoggerFactory.getLogger(HbnTaskStore.class);

    @Override
    public Task create(Task task) {
        try {
            crudStore.run(session -> session.persist(task));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return task;
    }

    @Override
    public Optional<Task> findById(int id) {
        try {
            return crudStore.optional(
                    "FROM Task WHERE id = :fId", Task.class,
                    Map.of("fId", id));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return Optional.empty();
    }

    @Override
    public List<Task> findAll() {
        return crudStore.query(
                "FROM Task f JOIN FETCH f.priority LEFT JOIN FETCH f.categories",
                Task.class
        );
    }

    @Override
    public List<Task> findCompleted() {
        return crudStore.query(
                "FROM Task f JOIN FETCH f.priority LEFT JOIN FETCH f.categories WHERE done = true",
                Task.class
        );
    }

    @Override
    public List<Task> findNew() {
        return crudStore.query(
                "FROM Task f JOIN FETCH f.priority LEFT JOIN FETCH f.categories WHERE done = false",
                Task.class
        );
    }

    @Override
    public boolean update(Task task) {
        return crudStore.query("UPDATE Task SET title = :title, description = :description WHERE id = :fId",
                Map.of("fId", task.getId(),
                        "title", task.getTitle(),
                        "description", task.getDescription()));
    }

    @Override
    public boolean deleteById(int id) {
        return crudStore.query("DELETE Task WHERE id = :fId",
                Map.of("fId", id));
    }

    @Override
    public boolean completedTask(int id) {
        return crudStore.query("UPDATE Task SET done = :done WHERE id = :fId",
                Map.of("fId", id,
                        "done", true));
    }
}
