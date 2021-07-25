package com.github.alsaghir.projection.service;

import com.github.alsaghir.projection.entity.FirstNameOnly;
import com.github.alsaghir.projection.entity.LastNameOnly;
import com.github.alsaghir.projection.entity.Person;
import com.github.alsaghir.projection.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    public List<FirstNameOnly> getPersonsFirstName() {
        return personRepository.getAllBy();
    }

    public List<LastNameOnly> getPersonsLastName() {
        return personRepository.findAllBy();
    }

    public List<LastNameOnly> getPersonsLastNameCustom() {
        return personRepository.findCustom();
    }
}
