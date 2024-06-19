package daw.examen.domain.entinty;

import java.util.List;
import java.util.Objects;

public class Game {

    private Integer id;
    private String game_code;
    private String title;
    private Integer year;
    private String description;
    private Director director;
    private List<Actor> actorList;

    public Game() {
    }

    public Game(Integer id, String game_code, String title, Integer year, String description, Director director, List<Actor> actorList) {
        this.id = id;
        this.game_code = game_code;
        this.title = title;
        this.year = year;
        this.description = description;
        this.director = director;
        this.actorList = actorList;
    }

    public Game(String game_code, String title, Integer year, String description) {
        this.game_code = game_code;
        this.title = title;
        this.year = year;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGame_code() {
        return game_code;
    }

    public void setGame_code(String game_code) {
        this.game_code = game_code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id) && Objects.equals(game_code, game.game_code) && Objects.equals(title, game.title) && Objects.equals(year, game.year) && Objects.equals(description, game.description) && Objects.equals(director, game.director) && Objects.equals(actorList, game.actorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, game_code, title, year, description, director, actorList);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", game_code=" + game_code +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", actorList=" + actorList +
                '}';
    }
}
