package java.mate.academy.spring.service;

import mate.academy.spring.model.User;

import java.util.Optional;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}