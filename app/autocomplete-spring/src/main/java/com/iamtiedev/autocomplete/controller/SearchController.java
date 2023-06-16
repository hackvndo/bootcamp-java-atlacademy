package com.iamtiedev.autocomplete.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SearchController {

    @GetMapping(value = "/user-search/{search}")
    public String[] getAutocompleteWords(@PathVariable String search) {

        System.out.println("Ingrese su busqueda");

        String[] searchPhrases = {
                "java spring framework tutorial",
                "java spring boot examples",
                "java spring mvc architecture",
                "java spring rest api development",
                "java spring security configuration",
                "java spring data jpa tutorial",
                "java spring dependency injection",
                "java spring bean scopes explained",
                "java spring aop (aspect-oriented programming) tutorial",
                "java spring integration testing with junit"
        };

        String[] searchResult = new String[10];
        int counter = 0;

        for (String phrase : searchPhrases) {
            if (phrase.toLowerCase().contains(search.toLowerCase())) {
                searchResult[0] = phrase;
                counter++;
            }
        }
        return searchResult;
    }
}