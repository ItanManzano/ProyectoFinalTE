package fes.aragon.mx.TE.favoritos.SelectorFavoritos.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "favoritos")
public class Favorito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 20)
    private String categoria;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @Column(length = 255)
    private String url;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreacion;

    @Column(length = 255)
    private String tags;

    public Favorito() {
        this.fechaCreacion = LocalDate.now();
    }

    public Favorito(Integer id, String nombre, String categoria, String descripcion, String url, LocalDate fechaCreacion, String tags) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.url = url;
        this.fechaCreacion = fechaCreacion;
        this.tags = tags;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Favorito favorito = (Favorito) o;
        return Objects.equals(id, favorito.id) && Objects.equals(nombre, favorito.nombre) && Objects.equals(categoria, favorito.categoria) && Objects.equals(descripcion, favorito.descripcion) && Objects.equals(url, favorito.url) && Objects.equals(fechaCreacion, favorito.fechaCreacion) && Objects.equals(tags, favorito.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, categoria, descripcion, url, fechaCreacion, tags);
    }

    @Override
    public String toString() {
        return "favorito{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", url='" + url + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", tags='" + tags + '\'' +
                '}';
    }
}
