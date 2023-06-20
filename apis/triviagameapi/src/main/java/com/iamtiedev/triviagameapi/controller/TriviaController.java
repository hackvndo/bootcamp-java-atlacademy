package com.iamtiedev.triviagameapi.controller;

import com.iamtiedev.triviagameapi.models.Category;
import com.iamtiedev.triviagameapi.models.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {

    @GetMapping("/question/{category}")
    public Question getQuestion(@PathVariable String category) {
        Question question = new Question();
        question.setCategory("Ciencia");
        question.setQuestion("¿Cuál es la fórmula química del agua?");
        question.setAnswer(0);
        question.setExplanation("La fórmula química del agua es H2O, lo cual indica que está compuesta por dos átomos de hidrógeno (H) y uno de oxígeno (O).");
        
        List<String> options = new ArrayList<>();
        options.add("H20");
        options.add("C02");
        options.add("NaCl");

        return question;



//        return "[\n" +
//                "  {\n" +
//                "    \"category\": \"Deportes\",\n" +
//                "    \"question\": \"¿Cuál es el deporte más popular en el mundo?\",\n" +
//                "    \"options\": [\"Fútbol\", \"Baloncesto\", \"Tenis\"],\n" +
//                "    \"answer\": 0,\n" +
//                "    \"explanation\": \"El fútbol es considerado el deporte más popular en el mundo, con miles de millones de seguidores en todos los continentes.\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"category\": \"Tecnología\",\n" +
//                "    \"question\": \"¿Qué es un SSD?\",\n" +
//                "    \"options\": [\"Solid State Drive\", \"Super Speed Data\", \"System Storage Device\"],\n" +
//                "    \"answer\": 1,\n" +
//                "    \"explanation\": \"Un SSD (Solid State Drive) es un dispositivo de almacenamiento de datos que utiliza memoria flash para almacenar información de manera permanente, ofreciendo mayor velocidad y fiabilidad que los discos duros tradicionales.\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"category\": \"Ciencia\",\n" +
//                "    \"question\": \"¿Cuál es la fórmula química del agua?\",\n" +
//                "    \"options\": [\"H2O\", \"CO2\", \"NaCl\"],\n" +
//                "    \"answer\": 0,\n" +
//                "    \"explanation\": \"La fórmula química del agua es H2O, lo cual indica que está compuesta por dos átomos de hidrógeno (H) y uno de oxígeno (O).\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"category\": \"Historia\",\n" +
//                "    \"question\": \"¿En qué año ocurrió la Revolución Francesa?\",\n" +
//                "    \"options\": [\"1789\", \"1812\", \"1836\"],\n" +
//                "    \"answer\": 2,\n" +
//                "    \"explanation\": \"La Revolución Francesa tuvo lugar en el año 1789, marcando un importante acontecimiento en la historia de Francia y sentando las bases para la posterior expansión de ideas revolucionarias en Europa.\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"category\": \"Gastronomía\",\n" +
//                "    \"question\": \"¿Cuál es el ingrediente principal de la paella?\",\n" +
//                "    \"options\": [\"Arroz\", \"Pasta\", \"Papa\"],\n" +
//                "    \"answer\": 1,\n" +
//                "    \"explanation\": \"El ingrediente principal de la paella es el arroz. Este plato tradicional español se caracteriza por su preparación en una paellera y su combinación de arroz con diversos ingredientes como carnes, mariscos y verduras.\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"category\": \"Arte\",\n" +
//                "    \"question\": \"¿Quién pintó la Mona Lisa?\",\n" +
//                "    \"options\": [\"Leonardo da Vinci\", \"Pablo Picasso\", \"Vincent van Gogh\"],\n" +
//                "    \"answer\": 0,\n" +
//                "    \"explanation\": \"La Mona Lisa fue pintada por Leonardo da Vinci, uno de los artistas más destacados del Renacimiento italiano. Esta icónica obra maestra se encuentra en el Museo del Louvre en París y es conocida por su enigmática sonrisa.\"\n" +
//                "  }\n" +
//                "]";
    }

    @GetMapping("/categories")
    public Category[] getCategories() {

        Category categoryOne = new Category();
        categoryOne.setCategory("Arte");
        categoryOne.setDescription("Preguntas relacionadas con obras de arte, artistas famosos y movimientos artísticos.");

        Category categoryTwo = new Category();
        categoryTwo.setCategory("Deportes");
        categoryTwo.setDescription("Preguntas sobre diferentes disciplinas deportivas, atletas y eventos deportivos.");

        Category[] categories = {categoryOne, categoryTwo};
        return categories;


//        return "[\n" +
//                "  {\n" +
//                "    \"category\": \"Deportes\",\n" +
//                "    \"description\": \"Preguntas sobre diferentes disciplinas deportivas, atletas y eventos deportivos.\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"category\": \"Tecnología\",\n" +
//                "    \"description\": \"Preguntas acerca de dispositivos, avances y conceptos relacionados con la tecnología.\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"category\": \"Ciencia\",\n" +
//                "    \"description\": \"Preguntas sobre descubrimientos, teorías y conceptos científicos en diversas áreas del conocimiento.\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"category\": \"Historia\",\n" +
//                "    \"description\": \"Preguntas sobre eventos históricos, personajes influyentes y períodos significativos de la historia.\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"category\": \"Gastronomia\",\n" +
//                "    \"description\": \"Preguntas relacionadas con gastronomia.\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"category\": \"Arte\",\n" +
//                "    \"description\": \"Preguntas relacionadas con obras de arte, artistas famosos y movimientos artísticos.\"\n" +
//                "  }\n" +
//                "]";
    }


}
