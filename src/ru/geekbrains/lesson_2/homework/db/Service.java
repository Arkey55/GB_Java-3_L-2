package ru.geekbrains.lesson_2.homework.db;


import ru.geekbrains.lesson_2.homework.entity.User;

import java.util.Collection;
import java.util.List;

public interface Service<T> {
    T getUserByEmailAndPassword(String email, String password);
    List<T> findAll();
    int saveInDB(T obj);
    int doChangeNickname(int id, String newName);
}
