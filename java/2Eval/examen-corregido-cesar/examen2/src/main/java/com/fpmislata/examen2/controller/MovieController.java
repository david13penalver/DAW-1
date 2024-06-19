package com.fpmislata.examen2.controller;

import com.fpmislata.examen2.common.container.MovieIoC;
import com.fpmislata.examen2.domain.service.MovieService;
import com.fpmislata.examen2.domain.service.impl.MovieServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(MovieController.URL)
public class MovieController {
    public static final String URL = "/movies";

    private MovieService movieService;

    public MovieController() {
        this.movieService = MovieIoC.getMovieService();
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("movieList", movieService.findAll());
        return "movieList";
    }

    @GetMapping("/{id}")
    public String findById(@RequestParam int id, Model model) {
        model.addAttribute("movie", movieService.findById(id));
        return "movieDetail";
    }
}
