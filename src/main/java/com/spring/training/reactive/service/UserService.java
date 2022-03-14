package com.spring.training.reactive.service;

import com.spring.training.reactive.model.User;
import com.spring.training.reactive.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> getUsers() {
        return repository.findAll();
    }

    public Optional<User> getUser(String id) {
        return repository.findById(id);
    }

}