package daw.examen.controller;

import daw.examen.common.IoC.ActorIoC;
import daw.examen.common.IoC.DirectorIoC;
import daw.examen.common.IoC.GameIoC;
import daw.examen.domain.entinty.Director;
import daw.examen.domain.entinty.Game;
import daw.examen.domain.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/games")
public class GameController {
    private final GameService gameService = GameIoC.getGameService();
    //private final DirectorService directorService = DirectorIoC.getDirectorService();
    //private final ActorService actorService = ActorIoC.getActorService();

    @GetMapping()
    public String findAll(Model model) {
        model.addAttribute("gameList", gameService.findAll());
        return "games";
    }

    @GetMapping("/{game_code}")
    public String findById(@PathVariable String game_code, Model model) {
        model.addAttribute("game", gameService.findById(game_code));
        return "gameDetail";
    }

    @PostMapping()
    public String createGame(@RequestParam String game_code, @RequestParam String title, @RequestParam Integer year, @RequestParam String description, @RequestParam Director director, @RequestParam List<String> actorNameList, Model model) {
        Game game = new Game(game_code, title, year, description);
        model.addAttribute("game", gameService.create(game));

        return "redirect:/games";
    }

//    @PostMapping()
//    public String createGame(@RequestParam String game_code, @RequestParam String title, @RequestParam Integer year,
//                             @RequestParam String directorName, @RequestParam List<String> actorNameList) {
//
//        gameService.create(game_code, title, year, directorName, actorNameList);
//
//        return "redirect:/games";
//    }

}
