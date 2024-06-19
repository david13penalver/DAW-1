package com.fpmislata.examen.controller;

import com.fpmislata.examen.common.container.MovieIoC;
import com.fpmislata.examen.domain.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/movies")
public class MovieController {
    private MovieService movieService;
    public MovieController() {
        this.movieService = MovieIoC.getMovieService();
    }

    @GetMapping()
    public String findAll(Model model) {
        model.addAttribute("movieList", this.movieService.findAll());
        return "movieList";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @RequestParam int id) {
        model.addAttribute("movie", this.movieService.findById(id));
        return "movieDetail";
    }
}
