package daw.examen.domain.entinty;

import java.util.Objects;

public class Actor {

    private Integer id;
    private String name;
    private String role;
    private String description;

    public Actor() {
    }

    public Actor(Integer id, String name, String role, String description) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.description = description;
    }

    public Actor(Integer id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public Actor(String name, String role) {
        this.name = name;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(id, actor.id) && Objects.equals(name, actor.name) && Objects.equals(role, actor.role) && Objects.equals(description, actor.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, description);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
