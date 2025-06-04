package mx.unam.aragon.ico.te.favoritosmvc.modelos;
import jakarta.persistence.*;

import java.util.Objects;

@MappedSuperclass
public abstract class ItemFavorito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String genero;
    private Integer anio;
    private String imagen;

    public ItemFavorito() {
    }

    public ItemFavorito(Long id, String nombre, String genero, Integer anio, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItemFavorito that = (ItemFavorito) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre) && Objects.equals(genero, that.genero) && Objects.equals(anio, that.anio) && Objects.equals(imagen, that.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, genero, anio, imagen);
    }

    @Override
    public String toString() {
        return "ItemFavorito{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", anio=" + anio +
                ", imagen='" + imagen + '\'' +
                '}';
    }

}