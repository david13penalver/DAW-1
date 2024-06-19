package com.fpmislata.examen.controller;

import com.fpmislata.examen.domain.entity.Music;
import com.fpmislata.examen.domain.service.MusicService;
import com.fpmislata.examen.domain.service.impl.MusicServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/songs")
public class MusicController {

    MusicService musicService = new MusicServiceImpl();

    @GetMapping
    public String findAll(Model model) {
        List<Music> musicList = musicService.findAll();
        model.addAttribute("musicList", musicList);
        return "songList";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id, Model model) {
        Music music = musicService.findById(id);
        model.addAttribute("music", music);
        return "songDetails";
    }

    @GetMapping("/new")
    public String addBook() {
        return "form";
    }

    @PostMapping
    public String bookAdded(@RequestParam("title") String name, @RequestParam("id") Integer id, @RequestParam("author") String author) {
        Music music = new Music (id, name, author);
        musicService.insert(music);
        return "redirect: songList";
    }
}
