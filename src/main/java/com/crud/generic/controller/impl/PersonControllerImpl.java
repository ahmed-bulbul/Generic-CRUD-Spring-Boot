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
    public ResponseEntity<Object> save(Person entity) {
        return super.save(entity);
    }

    @Override
    public ResponseEntity<Person> findAll() {
        return super.findAll();
    }

    @Override
    public ResponseEntity<Person> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public ResponseEntity<String> delete(Long id) {
        return super.delete(id);
    }
}
