package guru.springframework.spring5_jokes_app_v2.controllers;

import guru.springframework.spring5_jokes_app_v2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 07/05/2025 by Jesse H.
 * Package: Controllers; Class: JokeController
 * Model View Controller for Joke App
 */

@Controller
public class JokeController {

    // DI for JokeService
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    } // End JokeController()

    @RequestMapping("/")
    public String getJoke(Model model) {

        // Adds joke attribute to the model
        model.addAttribute("joke", jokeService.sayJoke());

        return "index"; // Returns the view
    } // End getJoke()
} // End JokeController Class
