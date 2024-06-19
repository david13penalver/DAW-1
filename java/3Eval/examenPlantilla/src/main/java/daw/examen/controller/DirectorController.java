package daw.examen.controller;

import daw.examen.common.IoC.GameIoC;
import daw.examen.domain.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directors")
public class DirectorController {

    private final GameService gameService = GameIoC.getGameService();

    @GetMapping("/{id}/games")
    public String findById(Model model, @PathVariable Integer id) {
        model.addAttribute("gameList", gameService.findByDirectorId(id));
        return "games";
    }
}
