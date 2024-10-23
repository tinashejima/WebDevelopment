package org.crudapp;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository

public interface Apprepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}


