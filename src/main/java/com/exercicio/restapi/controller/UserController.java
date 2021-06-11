package com.exercicio.restapi.controller;

import com.exercicio.restapi.model.UserModel;
import com.exercicio.restapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/user/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id){
        return repository.findAllById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/user/salvar")
    public UserModel salvar(@RequestBody UserModel user){
        return repository.save(user);
    }
}
