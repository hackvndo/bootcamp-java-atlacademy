package com.iamtiedev.service.person.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/persons")
public class PersonController {

    static List<String> persons = new ArrayList<>(List.of("Facundo Tiede", "John Doe", "Jane Smith", "Michael Johnson",
            "Emily Davis"));

    @GetMapping("/search")
    public List<String> getAllPersons() {
        return persons;
    }

    @GetMapping("/search/{name}")
    public List<String> searchPersonByName(@PathVariable String name) {
        return persons.stream()
                .filter(person -> person.toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    @GetMapping("/add/{name}")
    public List<String> addPerson(@PathVariable String name) {
        persons.add(name);
        return persons;
    }

    @GetMapping("/delete/{name}")
    public String deletePerson(@PathVariable String name) {
        persons.removeIf(person -> person.equalsIgnoreCase(name));
        return "Deleted Name";
    }

}
