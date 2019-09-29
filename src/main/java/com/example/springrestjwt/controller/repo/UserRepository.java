package com.example.springrestjwt.controller.repo;

import com.example.springrestjwt.controller.entity.Users;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Users, Long> {

    Optional<Users> findOneByUsername(String username);
}
