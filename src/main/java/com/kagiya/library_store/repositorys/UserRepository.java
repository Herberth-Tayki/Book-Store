package com.kagiya.library_store.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.kagiya.library_store.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByFirstName(String firstName);
}
