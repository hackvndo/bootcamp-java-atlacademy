package com.iamtiedev.triviagameapi.controllers;
import com.iamtiedev.triviagameapi.services.ChatGptClient;
import com.iamtiedev.triviagameapi.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    @GetMapping("/question/{category}")
    public String getQuestion(@PathVariable String category) {

        ChatGptClient chatGpt = new ChatGptClient();
        String answerInJson = chatGpt.getQuestion("Estoy armando una trivia, necesito que me des una pregunta de la " +
                "categoria " + category + ", con la siguiente estructura de JSON. LA respuesta de la pregunta no siempre tiene que ser la primera, tiene que variar:\n" +
                "\n" +
                "{\n" +
                "  \"category\": \"aca va el nombre de la categoria\",\n" +
                "  \"question\": \"aca va la pregunta\",\n" +
                "  \"options\": [\n" +
                "    \"aca va la opcion 1\",\n" +
                "    \"aca va la opcion 2\",\n" +
                "    \"aca va la opcion 3\"\n" +
                "  ],\n" +
                "  \"answer\": aqui va la respuesta correcta en caso de ser la primera es el numero 0 en caso de ser la segunda es el 1 y en caso de ser la tercera es el 2,\n" +
                "  \"explanation\": \"aca tienes que poner una explicacion diciendo porque es la respuesta correcta\"\n" +
                "}");
        return answerInJson;

//        ObjectMapper converter = new ObjectMapper();
//        Question ques = converter.convertValue(answerInJson, Question.class);
//        return ques;
    }

    @GetMapping("/categories")
    public Category[] getCategories() {

        Category categoryOne = new Category();
        categoryOne.setCategory("Arte");
        categoryOne.setDescription("Preguntas relacionadas con obras de arte, artistas famosos y movimientos artísticos.");

        Category categoryTwo = new Category();
        categoryTwo.setCategory("Deportes");
        categoryTwo.setDescription("Preguntas sobre diferentes disciplinas deportivas, atletas y eventos deportivos.");

        Category[] categories = new Category[2];
        categories[0] = categoryOne;
        categories[1] = categoryTwo;
        return categories;
    }

}
