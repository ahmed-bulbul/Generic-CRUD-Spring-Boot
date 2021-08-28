package com.crud.generic.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.crud.generic.controller.PersonController;
import com.crud.generic.controller.generic.impl.ControllerGenericImpl;
import com.crud.generic.entity.Person;

@RestController
@RequestMapping(path = "/person")
public class PersonControllerImpl extends ControllerGenericImpl<Person> implements PersonController{


    @Override
    @GetMapping("/hello")
    public String test() {
        return "Hello";
    }

    @Override
    @PostMapping("/create")
    public ResponseEntity<Object> save(Person entity) {
        return super.save(entity);
    }

    @Override
    @GetMapping("/fetchAll")
    public ResponseEntity<Person> findAll() {
        return super.findAll();
    }

    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(Long id) {
        return super.delete(id);
    }
}
