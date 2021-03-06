package ru.geekbrains.lesson_2.homework.authentication;

import ru.geekbrains.lesson_2.homework.entity.User;

import java.util.Optional;

public interface AuthenticationService {
    Optional<User> doAuthentication(String login, String password);
}
