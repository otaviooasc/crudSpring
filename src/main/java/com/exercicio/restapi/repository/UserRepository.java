package com.exercicio.restapi.repository;

import com.exercicio.restapi.model.UserModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
    Optional<Object> findAllById(Integer id);
}
