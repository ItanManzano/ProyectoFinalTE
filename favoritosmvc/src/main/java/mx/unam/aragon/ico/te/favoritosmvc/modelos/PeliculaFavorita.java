package mx.unam.aragon.ico.te.favoritosmvc.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "peliculas")
public class PeliculaFavorita extends ItemFavorito {
    private String director;

    // Constructores
    public PeliculaFavorita() {
        // Requerido por JPA
    }

    public PeliculaFavorita(String nombre, String genero, Integer anio, String imagen, String director) {
        super(null, nombre, genero, anio, imagen);
        this.director = director;
    }

    public PeliculaFavorita(Long id, String nombre, String genero, Integer anio, String imagen, String director) {
        super(id, nombre, genero, anio, imagen);
        this.director = director;
    }

    // Getters y Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Equals/HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PeliculaFavorita)) return false;
        if (!super.equals(o)) return false;
        PeliculaFavorita that = (PeliculaFavorita) o;
        return Objects.equals(director, that.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), director);
    }

    // ToString
    @Override
    public String toString() {
        return "PeliculaFavorita{" +
                super.toString() +
                ", director='" + director + '\'' +
                '}';
    }
}