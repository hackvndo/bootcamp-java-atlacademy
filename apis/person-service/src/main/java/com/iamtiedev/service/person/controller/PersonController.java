package com.iamtiedev.service.person.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private List<String> persons = new ArrayList<>();

    public PersonController() {
        persons.add("John Doe");
        persons.add("Jane Smith");
        persons.add("Michael Johnson");
        persons.add("Emily Davis");
        persons.add("David Brown");
        persons.add("Olivia Taylor");
        persons.add("William Miller");
        persons.add("Sophia");
        persons.add("Joseph Anderson");
        persons.add("Mia Martinez");
    }

    @GetMapping("/search")
    public List<String> getAllPersons() {
        return persons;
    }

    @GetMapping("/search/{name}")
    public List<String> searchPersonByName(@PathVariable String name) {
        List<String> matchingPersons = new ArrayList<>();
        for (String person : persons) {
            if (person.toLowerCase().contains(name.toLowerCase())) {
                matchingPersons.add(person);
            }
        }
        return matchingPersons;
    }

    @PostMapping("/update/{name}")
    public void addPerson(@PathVariable String name) {
        persons.add(name);
    }

    @DeleteMapping("/delete/{name}")
    public void deletePerson(@PathVariable String name) {
        for (String person : persons) {
            if (person.equalsIgnoreCase(name)) {
                persons.remove(person);
                break;
            }
        }
    }
}
