package com.fpmislata.examen2.controller;

import com.fpmislata.examen2.common.container.MovieIoC;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.domain.service.MovieService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController() {
        this.movieService = MovieIoC.getMovieService();
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("movieList", movieService.findAll());
        return "movieList";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id, Model model) {
        model.addAttribute("movie", movieService.findById(id));
        return "movieDetail";
    }

}
