package mx.unam.aragon.ico.te.favoritosmvc.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "albumes")
public class AlbumFavorito extends ItemFavorito {
    private String artista;

    // Constructor vacío (requerido por JPA)
    public AlbumFavorito() {
    }

    // Constructor con parámetros (versión mejorada)
    public AlbumFavorito(String nombre, String genero, Integer anio, String imagen, String artista) {
        super(null, nombre, genero, anio, imagen); // El ID lo genera automáticamente la BD
        this.artista = artista;
    }
    // Constructor con ID (para casos especiales)
    public AlbumFavorito(Long id, String nombre, String genero, Integer anio, String imagen, String artista) {
        super(id, nombre, genero, anio, imagen);
        this.artista = artista;
    }

    // Getter y Setter
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    // Métodos adicionales
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlbumFavorito)) return false;
        if (!super.equals(o)) return false;
        AlbumFavorito that = (AlbumFavorito) o;
        return Objects.equals(artista, that.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), artista);
    }

    // toString() completo (incluye campos heredados)
    @Override
    public String toString() {
        return "AlbumFavorito{" +
                super.toString() + // Campos de ItemFavorito
                ", artista='" + artista + '\'' +
                '}';
    }
}