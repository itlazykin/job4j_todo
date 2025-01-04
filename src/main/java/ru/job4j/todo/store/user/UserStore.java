package ru.job4j.todo.store.user;

import ru.job4j.todo.model.User;

import java.util.Optional;

public interface UserStore {
    Optional<User> create(User user);

    Optional<User> getByLoginAndPassword(String login, String password);
}