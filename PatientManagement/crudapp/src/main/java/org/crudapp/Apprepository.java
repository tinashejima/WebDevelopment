package org.crudapp;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


// UserRepository.java
@Repository
// UserRepository.java
public interface apprepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}


