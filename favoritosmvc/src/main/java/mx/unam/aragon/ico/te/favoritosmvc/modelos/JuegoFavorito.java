package mx.unam.aragon.ico.te.favoritosmvc.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "juegos")
public class JuegoFavorito extends ItemFavorito {
    private String desarrollador;

    // Constructores
    public JuegoFavorito() {
        // Requerido por JPA
    }

    public JuegoFavorito(String nombre, String genero, Integer anio, String imagen, String desarrollador) {
        super(null, nombre, genero, anio, imagen);
        this.desarrollador = desarrollador;
    }

    public JuegoFavorito(Long id, String nombre, String genero, Integer anio, String imagen, String desarrollador) {
        super(id, nombre, genero, anio, imagen);
        this.desarrollador = desarrollador;
    }

    // Getters y Setters
    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    // Equals/HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JuegoFavorito)) return false;
        if (!super.equals(o)) return false;
        JuegoFavorito that = (JuegoFavorito) o;
        return Objects.equals(desarrollador, that.desarrollador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), desarrollador);
    }

    // ToString
    @Override
    public String toString() {
        return "JuegoFavorito{" +
                super.toString() +
                ", desarrollador='" + desarrollador + '\'' +
                '}';
    }
}