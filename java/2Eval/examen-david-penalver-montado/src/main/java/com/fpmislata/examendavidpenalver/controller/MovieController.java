package com.fpmislata.examendavidpenalver.controller;

import com.fpmislata.examendavidpenalver.common.container.MovieIoC;
import com.fpmislata.examendavidpenalver.domain.service.MovieService;
import com.fpmislata.examendavidpenalver.domain.service.impl.MovieServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController() {
        this.movieService = MovieIoC.getMovieService();
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("movieList", movieService.findAll());
        return "movieList";
    }

}
