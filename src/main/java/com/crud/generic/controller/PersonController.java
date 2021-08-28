package com.crud.generic.controller;

import com.crud.generic.controller.generic.ControllerGeneric;
import com.crud.generic.entity.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface PersonController extends ControllerGeneric<Person> {


    public String test();

}
