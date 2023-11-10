package com.fag.flavio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fag.flavio.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
