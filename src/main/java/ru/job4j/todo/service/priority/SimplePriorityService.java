package ru.job4j.todo.service.priority;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.todo.model.Priority;
import ru.job4j.todo.store.priority.PriorityStore;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SimplePriorityService implements PriorityService {
    private final PriorityStore priorityStore;

    @Override
    public Optional<Priority> findById(int id) {
        return priorityStore.findById(id);
    }

    @Override
    public List<Priority> findAll() {
        return priorityStore.findAll();
    }
}
