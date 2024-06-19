package com.fpmislata.examen2.controller;

import com.fpmislata.examen2.common.container.MovieIoC;
import com.fpmislata.examen2.domain.entity.Movie;
import com.fpmislata.examen2.domain.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/movies")
public class MovieController {

    MovieService movieService;
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
        model.addAttribute("movieDetail", movieService.findById(id));
        return "movieDetail";
    }




    @GetMapping("/new")
    public String addMovie() {
        return "register";
    }

    @PostMapping
    public String result(@RequestParam String title, @RequestParam int year, Model model) {
        Movie movie = new Movie(100, title, year);
        movieService.insert(movie);
        return "redirect:/movies";

    }

}
