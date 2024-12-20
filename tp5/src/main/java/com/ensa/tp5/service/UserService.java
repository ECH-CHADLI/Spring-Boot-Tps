package com.ensa.tp5.service;

import java.util.List;

import com.ensa.tp5.model.User;

public interface UserService {
    User save(User user);
    User findByUsername(String username);
    List<User> findAll();
    void deleteById(Long id);
    User update(User user);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}