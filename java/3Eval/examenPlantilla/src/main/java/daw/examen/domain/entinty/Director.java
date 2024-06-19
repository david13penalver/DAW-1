package daw.examen.domain.entinty;

import java.util.Objects;

public class Director {

    private Integer id;
    private String name;
    private String biography;

    public Director() {
    }

    public Director(Integer id, String name, String biography) {
        this.id = id;
        this.name = name;
        this.biography = biography;
    }

    public Director(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return Objects.equals(id, director.id) && Objects.equals(name, director.name) && Objects.equals(biography, director.biography);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, biography);
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", biography='" + biography + '\'' +
                '}';
    }
}
