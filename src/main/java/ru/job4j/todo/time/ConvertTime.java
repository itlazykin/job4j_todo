package ru.job4j.todo.time;

import ru.job4j.todo.model.Task;
import ru.job4j.todo.model.User;

import java.time.ZoneId;
import java.util.List;

public class ConvertTime {
    public static List<Task> convertTime(List<Task> tasks, User user) {
        for (Task task : tasks) {
            task.getCreated()
                    .atZone(ZoneId.of("UTC"))
                    .withZoneSameLocal(ZoneId.of(user.getTimezone()))
                    .toLocalDateTime();
        }
        return tasks;
    }
}
