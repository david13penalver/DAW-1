package com.fpmislata.examendavidpenalver.controller;

import com.fpmislata.examendavidpenalver.common.container.MusicIoC;
import com.fpmislata.examendavidpenalver.domain.service.MusicService;
import com.fpmislata.examendavidpenalver.domain.service.impl.MusicServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/songs")
public class MusicController {

    MusicService musicService;

    public MusicController() {
        this.musicService = MusicIoC.getMusicService();
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("musicList", musicService.findAll());
        return "musicList";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id, Model model) {
        model.addAttribute("musicDetail", musicService.findById(id));
        return "musicDetail";
    }
}
