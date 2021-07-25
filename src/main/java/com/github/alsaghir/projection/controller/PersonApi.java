package com.github.alsaghir.projection.controller;

import com.github.alsaghir.projection.entity.FirstNameOnly;
import com.github.alsaghir.projection.entity.LastNameOnly;
import com.github.alsaghir.projection.entity.Person;
import com.github.alsaghir.projection.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonApi {

    private final PersonService personService;

    @Autowired
    public PersonApi(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<Person> getPersons() {

        return personService.getPersons();

    }

    @GetMapping("/persons/first-name")
    public List<FirstNameOnly> getPersonsFirstName() {
        return personService.getPersonsFirstName();
    }

    @GetMapping("/persons/last-name")
    public List<LastNameOnly> getPersonsLastName() {
        return personService.getPersonsLastName();
    }

    @GetMapping("/persons/last-name-custom")
    public List<LastNameOnly> getPersonsLastNameCustom() {
        return personService.getPersonsLastNameCustom();
    }

}
